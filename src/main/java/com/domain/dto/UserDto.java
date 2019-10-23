package com.domain.dto;

import java.io.Serializable;
import java.util.Date;

import com.domain.entity.UserEntity;

/**
 * 数据传输对象
 *
 * @author
 * @version 1.0
 * @date 2019-10-22 11:15:47
 */
public class UserDto extends UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 微信授权code
	 */
	private String wxCode;
	/**
	 * 胶囊标题
	 */
	private String capsulesTitle;
	/**
	 * 胶囊编号
	 */
	private String capsulesNum;
	/**
	 * 胶囊过期时间
	 */
	private Date capsulesExpriseTime;

	public String getWxCode() {
		return wxCode;
	}

	public void setWxCode(String wxCode) {
		this.wxCode = wxCode;
	}

	public String getCapsulesTitle() {
		return capsulesTitle;
	}

	public void setCapsulesTitle(String capsulesTitle) {
		this.capsulesTitle = capsulesTitle;
	}

	public String getCapsulesNum() {
		return capsulesNum;
	}

	public void setCapsulesNum(String capsulesNum) {
		this.capsulesNum = capsulesNum;
	}

	public Date getCapsulesExpriseTime() {
		return capsulesExpriseTime;
	}

	public void setCapsulesExpriseTime(Date capsulesExpriseTime) {
		this.capsulesExpriseTime = capsulesExpriseTime;
	}

}
