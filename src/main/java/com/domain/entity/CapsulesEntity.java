package com.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author NIck
 * @date 2019-10-22 11:15:47
 */
public class CapsulesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	private Integer id;
	/**
	 * 胶囊编号
	 */
	private String capsuleNum;
	/**
	 * 胶囊标题
	 */
	private String capsuleTitle;
	/**
	 * 介绍
	 */
	private String introduce;
	/**
	 * 视频ID
	 */
	private Integer videoID;
	/**
	 * 过期时间
	 */
	private Date capsuleExpireTime;
	/**
	 * 胶囊状态 1：进行中  2：已过期
	 */
	private String capsuleStatus;
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
	 * 设置：胶囊标题
	 */
	public void setCapsuleTitle(String capsuleTitle) {
		this.capsuleTitle = capsuleTitle;
	}
	/**
	 * 获取：胶囊标题
	 */
	public String getCapsuleTitle() {
		return capsuleTitle;
	}
	/**
	 * 设置：介绍
	 */
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	/**
	 * 获取：介绍
	 */
	public String getIntroduce() {
		return introduce;
	}
	/**
	 * 设置：视频ID
	 */
	public void setVideoID(Integer videoID) {
		this.videoID = videoID;
	}
	/**
	 * 获取：视频ID
	 */
	public Integer getVideoID() {
		return videoID;
	}
	/**
	 * 设置：过期时间
	 */
	public void setCapsuleExpireTime(Date capsuleExpireTime) {
		this.capsuleExpireTime = capsuleExpireTime;
	}
	/**
	 * 获取：过期时间
	 */
	public Date getCapsuleExpireTime() {
		return capsuleExpireTime;
	}
	/**
	 * 设置：胶囊状态 1：进行中  2：已过期
	 */
	public void setCapsuleStatus(String capsuleStatus) {
		this.capsuleStatus = capsuleStatus;
	}
	/**
	 * 获取：胶囊状态 1：进行中  2：已过期
	 */
	public String getCapsuleStatus() {
		return capsuleStatus;
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
