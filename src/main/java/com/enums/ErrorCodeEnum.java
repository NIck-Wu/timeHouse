package com.enums;

public enum ErrorCodeEnum {
	
	// 1000-1999 用户相关
	/** 用户信息未找到,请重试 */
	SYS_USER_DATA_NOT_FOUND("sys_user_1001", "用户信息未找到,请重试"),

	/** 此手机号已被其它微信绑定 */
	// 2000-2999 微信模块 (用到其他的模块往下加,错误码不可重复)
	SYS_WX_MP_ERROR("modeule_2000", "微信公众账号方面错误"),
	/** 通过APP端的授权code获取用户的微信信息失败,请重试 */
	SYS_GET_WX_USER_INFO_ERROR("sys_user_2001", "通过APP端的授权code获取用户的微信信息失败,请重试"),
	
	
	
	;
	private String code;

	private String desc;

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	private ErrorCodeEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
}
