package com.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author NIck
 * @date 2019-10-22 11:15:47
 */
public class GroupsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	private Integer id;
	/**
	 * 组编号
	 */
	private String groupNum;
	/**
	 * 组名称
	 */
	private String groupName;
	/**
	 * 胶囊编号
	 */
	private String capsuleNum;
	/**
	 * 用户ID
	 */
	private Integer userID;
	/**
	 * 用户状态 1：开启  2：加入
	 */
	private String userStatus;
	/**
	 * 组状态  1：未过期  2：过期
	 */
	private String groupStatus;
	/**
	 * 创建时间
	 */
	private Date creatTime;
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
	 * 设置：组编号
	 */
	public void setGroupNum(String groupNum) {
		this.groupNum = groupNum;
	}
	/**
	 * 获取：组编号
	 */
	public String getGroupNum() {
		return groupNum;
	}
	/**
	 * 设置：组名称
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * 获取：组名称
	 */
	public String getGroupName() {
		return groupName;
	}
	/**
	 * 设置：胶囊编号
	 */
	public void setCapsuleNum(String capsuleNum) {
		this.capsuleNum = capsuleNum;
	}
	/**
	 * 获取：胶囊编号
	 */
	public String getCapsuleNum() {
		return capsuleNum;
	}
	/**
	 * 设置：用户ID
	 */
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	/**
	 * 获取：用户ID
	 */
	public Integer getUserID() {
		return userID;
	}
	/**
	 * 设置：用户状态 1：开启  2：加入
	 */
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	/**
	 * 获取：用户状态 1：开启  2：加入
	 */
	public String getUserStatus() {
		return userStatus;
	}
	/**
	 * 设置：组状态  1：未过期  2：过期
	 */
	public void setGroupStatus(String groupStatus) {
		this.groupStatus = groupStatus;
	}
	/**
	 * 获取：组状态  1：未过期  2：过期
	 */
	public String getGroupStatus() {
		return groupStatus;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreatTime() {
		return creatTime;
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
