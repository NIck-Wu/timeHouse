package com.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.domain.dto.UserDto;
import com.service.UserService;
import com.xys.common.base.PageQueryBean;

/**
 *
 * 表服务实现
 *
 * @author
 * @version 1.0
 * @date 2019-10-18 16:51:23
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory
			.getLogger(UserServiceImpl.class);

	@Autowired
	private UserDao userDao;

	/**
	 * 根据主键查询表信息
	 *
	 * @param user
	 * @return
	 */
	@Override
	public UserDto findById(UserDto user) {
		return userDao.findById(user);
	}

	/**
	 * 根据对象查询表信息
	 *
	 * @param user
	 * @return
	 */
	@Override
	public UserDto find(UserDto user) {
		return userDao.find(user);
	}

	/**
	 * 保存表信息
	 *
	 * @param user
	 * @return
	 */
	@Override
	public void save(UserDto user) {
		userDao.save(user);
	}

	/**
	 * 根据主键删除表信息
	 *
	 * @param user
	 */
	@Override
	public void delete(UserDto user) {
		userDao.deleteById(user);
	}

	/**
	 * 根据主键修改表信息
	 *
	 * @param user
	 */
	@Override
	public void update(UserDto user) {
		userDao.editById(user);
	}

	/**
	 * 查询所有表列表
	 *
	 * @param user
	 * @return
	 */
	@Override
	public List<UserDto> list(UserDto user) {
		return userDao.list(user);
	}

	/**
	 * 分页查询表信息
	 *
	 * @param user
	 */
	@Override
	public PageQueryBean<UserDto> showPageQuery(PageQueryBean<UserDto> page) {
		return userDao.page(page);
	}

	/**
	 * 用户微信登录
	 */
	@Override
	public UserDto wxLogin(UserDto userDto) {

		return userDto;

	}

	/**
	 * 获取用户openid
	 * 
	 * @param code
	 * @return
	 */
	// public String getUserOpenID(String code) {
	// WxMpOAuth2AccessToken wxMpOAuth2AccessToken = new
	// WxMpOAuth2AccessToken();
	// try {
	// // 获取access_token
	// wxMpOAuth2AccessToken = wxOpenService.oauth2getAccessToken(code);
	// } catch (WxErrorException e) {
	// logger.error("【微信网页授权】{}", e);
	// throw new BusinessException(ErrorCodeEnum.SYS_WX_MP_ERROR.getCode(),
	// ErrorCodeEnum.SYS_WX_MP_ERROR.getDesc());
	// }
	// logger.info("wxMpOAuth2AccessToken={}", wxMpOAuth2AccessToken);
	// // 获取unionid
	// return wxMpOAuth2AccessToken.getOpenId();
	// }

	/**
	 * 获取微信用户信息
	 * 
	 * @param code
	 * @return
	 */
	// public WxMpUser getUserInfo(String code) {

	// WxMpOAuth2AccessToken wxMpOAuth2AccessToken = new
	// WxMpOAuth2AccessToken();
	// WxMpUser oauth2getUserInfo = new WxMpUser();
	// try {
	// // 获取access_token
	// wxMpOAuth2AccessToken = wxOpenService.oauth2getAccessToken(code);
	// oauth2getUserInfo =
	// wxOpenService.oauth2getUserInfo(wxMpOAuth2AccessToken, "zh_CN");
	// } catch (WxErrorException e) {
	// logger.error("【微信网页授权】{}", e);
	// throw new BusinessException(ErrorCodeEnum.SYS_WX_MP_ERROR.getCode(),
	// ErrorCodeEnum.SYS_WX_MP_ERROR.getDesc());
	// }
	// logger.info("wxMpOAuth2AccessToken={}", wxMpOAuth2AccessToken);
	// return oauth2getUserInfo;
	// }
}
