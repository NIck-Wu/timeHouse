package com.service;

import com.domain.dto.UserDto;

public interface WechatService {

	// 用户微信登陆
	public UserDto wxLogin(UserDto userDto);
}
