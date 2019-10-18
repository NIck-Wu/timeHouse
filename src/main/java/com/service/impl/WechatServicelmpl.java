package com.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.domain.dto.UserDto;
import com.enums.ErrorCodeEnum;
import com.service.UserService;
import com.service.WechatService;
import com.xys.common.exception.BusinessException;
import com.xys.common.util.StringUtils;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import me.chanjar.weixin.mp.bean.result.WxMpUser;

public class WechatServicelmpl implements WechatService {

	private static final Logger logger = LoggerFactory.getLogger(WechatServicelmpl.class);
	@Autowired
	private WxMpService wxOpenService;
	@Autowired
	private UserService userService;

	/**
	 * 用户微信登录
	 */
	@Override
	public UserDto wxLogin(UserDto userDto) {
		/** 通过APP端的授权code获取用户的微信信息 */
		String openid = getUserOpenID(userDto.getWxAPPCode());
		if (StringUtils.isEmptyStr(openid)) {
			throw new BusinessException(ErrorCodeEnum.SYS_GET_WX_USER_INFO_ERROR.getCode(),
					ErrorCodeEnum.SYS_GET_WX_USER_INFO_ERROR.getDesc());// 获取微信登录的用户信息失败
		}

		/** 查看该unionId是否在数据库存在,如果存在就直接登录,不存在就新注册 */
		UserDto userDto2 = new UserDto();
		userDto2.setWxOpenID(openid);
		UserDto userResult = userService.find(userDto2);
		if (StringUtils.isEmptyObject(userResult)) {
			WxMpUser oauth2getUserInfo = getUserInfo(userDto.getWxAPPCode());
			if (StringUtils.isEmptyObject(oauth2getUserInfo)) {
				throw new BusinessException(ErrorCodeEnum.SYS_GET_WX_USER_INFO_ERROR.getCode(),
						ErrorCodeEnum.SYS_GET_WX_USER_INFO_ERROR.getDesc());// 获取微信登录的用户信息失败
			}
			UserDto userNew = new UserDto();
			userNew.setWxOpenID(openid);
			userNew.setUserName(oauth2getUserInfo.getNickname());
			userNew.setHeadImg(oauth2getUserInfo.getHeadImgUrl());
			userNew.setUserStatus("1");
			userService.save(userNew);
			return userNew;
		}
		return userResult;
	}

	/**
	 * 获取用户openid
	 * 
	 * @param code
	 * @return
	 */
	private String getUserOpenID(String code) {
		WxMpOAuth2AccessToken wxMpOAuth2AccessToken = new WxMpOAuth2AccessToken();
		try {
			// 获取access_token
			wxMpOAuth2AccessToken = wxOpenService.oauth2getAccessToken(code);
		} catch (WxErrorException e) {
			logger.error("【微信网页授权】{}", e);
			throw new BusinessException(ErrorCodeEnum.SYS_WX_MP_ERROR.getCode(), ErrorCodeEnum.SYS_WX_MP_ERROR.getDesc());
		}
		logger.info("wxMpOAuth2AccessToken={}", wxMpOAuth2AccessToken);
		// 获取unionid
		return wxMpOAuth2AccessToken.getOpenId();
	}

	/**
	 * 获取微信用户信息
	 * 
	 * @param code
	 * @return
	 */
	private WxMpUser getUserInfo(String code) {

		WxMpOAuth2AccessToken wxMpOAuth2AccessToken = new WxMpOAuth2AccessToken();
		WxMpUser oauth2getUserInfo = new WxMpUser();
		try {
			// 获取access_token
			wxMpOAuth2AccessToken = wxOpenService.oauth2getAccessToken(code);
			oauth2getUserInfo = wxOpenService.oauth2getUserInfo(wxMpOAuth2AccessToken, "zh_CN");
		} catch (WxErrorException e) {
			logger.error("【微信网页授权】{}", e);
			throw new BusinessException(ErrorCodeEnum.SYS_WX_MP_ERROR.getCode(),
					ErrorCodeEnum.SYS_WX_MP_ERROR.getDesc());
		}
		logger.info("wxMpOAuth2AccessToken={}", wxMpOAuth2AccessToken);
		return oauth2getUserInfo;
	}
}
