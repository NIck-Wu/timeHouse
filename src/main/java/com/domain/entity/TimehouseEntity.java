package com.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author NIck
 * @date 2019-10-18 16:51:23
 */
public class TimehouseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 
	 */
	private Integer userID;
	/**
	 * 
	 */
	private Integer videoID;
	/**
	 * 视频状态 1：可查看 2：已锁定 3：已到期
	 */
	private String videoStatus;
	/**
	 * 
	 */
	private Date creatTime;
	/**
	 * 
	 */
	private Date lastUpdate;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	/**
	 * 获取：
	 */
	public Integer getUserID() {
		return userID;
	}
	/**
	 * 设置：
	 */
	public void setVideoID(Integer videoID) {
		this.videoID = videoID;
	}
	/**
	 * 获取：
	 */
	public Integer getVideoID() {
		return videoID;
	}
	/**
	 * 设置：视频状态 1：可查看 2：已锁定 3：已到期
	 */
	public void setVideoStatus(String videoStatus) {
		this.videoStatus = videoStatus;
	}
	/**
	 * 获取：视频状态 1：可查看 2：已锁定 3：已到期
	 */
	public String getVideoStatus() {
		return videoStatus;
	}
	/**
	 * 设置：
	 */
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreatTime() {
		return creatTime;
	}
	/**
	 * 设置：
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	/**
	 * 获取：
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}
}
