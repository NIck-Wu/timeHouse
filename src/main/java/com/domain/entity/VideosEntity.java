package com.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author NIck
 * @date 2019-10-22 11:15:47
 */
public class VideosEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	private Integer id;
	/**
	 * 视频名称
	 */
	private String videoName;
	/**
	 * 视频编号
	 */
	private String videoNum;
	/**
	 * 视频播放地址
	 */
	private String videoUrl;
	/**
	 * 视频状态  1：有效 2：无效
	 */
	private String videoStatus;
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
	 * 设置：视频名称
	 */
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	/**
	 * 获取：视频名称
	 */
	public String getVideoName() {
		return videoName;
	}
	/**
	 * 设置：视频编号
	 */
	public void setVideoNum(String videoNum) {
		this.videoNum = videoNum;
	}
	/**
	 * 获取：视频编号
	 */
	public String getVideoNum() {
		return videoNum;
	}
	/**
	 * 设置：视频播放地址
	 */
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	/**
	 * 获取：视频播放地址
	 */
	public String getVideoUrl() {
		return videoUrl;
	}
	/**
	 * 设置：视频状态  1：有效 2：无效
	 */
	public void setVideoStatus(String videoStatus) {
		this.videoStatus = videoStatus;
	}
	/**
	 * 获取：视频状态  1：有效 2：无效
	 */
	public String getVideoStatus() {
		return videoStatus;
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
