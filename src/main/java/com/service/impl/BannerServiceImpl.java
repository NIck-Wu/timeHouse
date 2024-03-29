package com.service.impl;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xys.common.base.PageQueryBean;
import com.xys.common.exception.BusinessException;
import com.xys.common.util.StringUtils;
import com.beust.jcommander.internal.Lists;
import com.dao.BannerDao;
import com.domain.dto.BannerDto;
import com.enums.ErrorCodeEnum;
import com.service.BannerService;

/**
 *
 * 表服务实现
 *
 * @author NIck
 * @version 1.0
 * @date 2019-10-22 11:15:47
 */
@Service
@Transactional
public class BannerServiceImpl implements BannerService {

	@Autowired
	private BannerDao bannerDao;

	/**
	 * 根据主键查询表信息
	 *
	 * @param banner
	 * @return
	 */
	@Override
	public BannerDto findById(BannerDto banner) {
		return bannerDao.findById(banner);
	}

	/**
	 * 根据对象查询表信息
	 *
	 * @param banner
	 * @return
	 */
	@Override
	public BannerDto find(BannerDto banner) {
		return bannerDao.find(banner);
	}

	/**
	 * 保存表信息
	 *
	 * @param banner
	 * @return
	 */
	@Override
	public void save(BannerDto banner) {

		banner.setCreatTime(new Date());
		banner.setLastUpdate(new Date());
		List<BannerDto> allList = Lists.newArrayList();
		allList = list(null);
		if (StringUtils.isEmptyObject(allList)) {
			throw new BusinessException(ErrorCodeEnum.SYS_BANNER_LIST_DATA_NOT_FOUND.getCode(), ErrorCodeEnum.SYS_BANNER_LIST_DATA_NOT_FOUND.getDesc());
		}
		Collections.sort(allList, (item1, item2) -> item2.getWeight() - item1.getWeight());
		Integer maxWeight = allList.get(0).getWeight();
		Integer nextMaxWeight = maxWeight + 1;
		banner.setWeight(nextMaxWeight);

		bannerDao.save(banner);
	}

	/**
	 * 根据主键删除表信息
	 *
	 * @param banner
	 */
	@Override
	public void delete(BannerDto banner) {
		bannerDao.deleteById(banner);
	}

	/**
	 * 根据主键修改表信息
	 *
	 * @param banner
	 */
	@Override
	public void update(BannerDto banner) {
		bannerDao.editById(banner);
	}

	/**
	 * 查询所有表列表
	 *
	 * @param banner
	 * @return
	 */
	@Override
	public List<BannerDto> list(BannerDto banner) {
		return bannerDao.list(banner);
	}

	/**
	 * 分页查询表信息
	 *
	 * @param banner
	 */
	@Override
	public PageQueryBean<BannerDto> showPageQuery(PageQueryBean<BannerDto> page) {
		return bannerDao.page(page);
	}

}
