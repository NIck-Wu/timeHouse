package com.utils;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

import com.beust.jcommander.internal.Lists;
import com.domain.dto.CapsulesDto;
import com.domain.dto.UserDto;
import com.google.common.collect.Maps;
import com.service.CapsulesService;
import com.service.UserService;
import com.utils.redis.RedisUtil;
import com.xys.common.util.DateUtils;
import com.xys.common.util.StringUtils;

public class SpringTakeUtils {

	@Autowired
	private CapsulesService capsulesService;
	@Autowired
	private UserService userService;
	@Resource
	RedisUtil redis;

	/**
	 * 查询所有7天内即将过期的Capsules
	 * 
	 * @throws ParseException
	 * 
	 */
	@Async
	@Scheduled(cron = "0/1 * * * * *")
	public void queryAllExpireList() throws ParseException {

		List<CapsulesDto> list = Lists.newArrayList();
		list = capsulesService.getAll7DaysExpriseList(null);
		if (StringUtils.isEmptyObject(list)) {
			return;
		}

		Map<String, String> map = Maps.newHashMap();
		for (CapsulesDto capsulesDto : list) {
			// 计算过期时间距离当前时间的秒数
			Date expriseDate = capsulesDto.getCapsuleExpireTime();
			String exproseDateStr = DateUtils.format(expriseDate);
			String nowDateStr = DateUtils.format(new Date());
			Long secod = (DateUtils.getMinutesBetweenFloorDays(nowDateStr, exproseDateStr)) * 60;
			map.put("key", capsulesDto.getCapsuleNum());
			map.put("val", exproseDateStr);
			map.put("secod", String.valueOf(secod));
		}
	}

	/**
	 * 推送消息
	 */
	public void pushInfo() {

		// 监听过期的key进行推送
		String expriseKey = "";
		UserDto user = new UserDto();
		user.setCapsulesNum(expriseKey);
		userService.pushCapsule(user);

	}

	/**
	 * 循环将即将过期的数据存入redis
	 * 
	 * @param map
	 */
	@Async
	private void saveToRedis(HashMap<String, String> map) {
		map.forEach((key, value) -> {
			redis.set(key, value);
			System.out.println("key=" + key + ",value=" + value);
		});
	}
}