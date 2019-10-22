package com.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author NIck
 * @date 2019-10-22 11:15:47
 */
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	private Integer id;
	/**
	 * 用户昵称
	 */
	private String userName;
	/**
	 * 用户微信openid
	 */
	private String wxOpenID;
	/**
	 * 年龄
	 */
	private Integer age;
	/**
	 * 微信头像
	 */
	private String headImg;
	/**
	 * 专业
	 */
	private String major;
	/**
	 * 用户状态 1:正常  2:禁用
	 */
	private String userStatus;
	/**
	 * 创建时间
	 */
	private Date ceartTime;
	/**
	 * 最后更新时间
	 */
	private Date lastUpdate;

	/**
	 * 设置：主键ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：主键ID
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：用户昵称
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取：用户昵称
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置：用户微信openid
	 */
	public void setWxOpenID(String wxOpenID) {
		this.wxOpenID = wxOpenID;
	}
	/**
	 * 获取：用户微信openid
	 */
	public String getWxOpenID() {
		return wxOpenID;
	}
	/**
	 * 设置：年龄
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * 设置：微信头像
	 */
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}
	/**
	 * 获取：微信头像
	 */
	public String getHeadImg() {
		return headImg;
	}
	/**
	 * 设置：专业
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	/**
	 * 获取：专业
	 */
	public String getMajor() {
		return major;
	}
	/**
	 * 设置：用户状态 1:正常  2:禁用
	 */
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	/**
	 * 获取：用户状态 1:正常  2:禁用
	 */
	public String getUserStatus() {
		return userStatus;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCeartTime(Date ceartTime) {
		this.ceartTime = ceartTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCeartTime() {
		return ceartTime;
	}
	/**
	 * 设置：最后更新时间
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	/**
	 * 获取：最后更新时间
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}
}
