package com.domain.dto;

import java.io.Serializable;

import com.domain.entity.UserEntity;

/**
 * 数据传输对象
 *
 * @author
 * @version 1.0
 * @date 2019-10-18 16:51:23
 */
public class UserDto extends UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String wxAPPCode;

	public String getWxAPPCode() {
		return wxAPPCode;
	}

	public void setWxAPPCode(String wxAPPCode) {
		this.wxAPPCode = wxAPPCode;
	}
}
