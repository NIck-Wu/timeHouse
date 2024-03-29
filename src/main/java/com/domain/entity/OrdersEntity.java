package com.domain.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author NIck
 * @date 2019-10-22 11:15:47
 */
public class OrdersEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	private Integer id;
	/**
	 * 订单编号
	 */
	private String orderNum;
	/**
	 * 胶囊ID
	 */
	private String capsuleNum;
	/**
	 * 用户ID
	 */
	private Integer userID;
	/**
	 * 订单金额
	 */
	private BigDecimal orderAmount;
	/**
	 * 支付过期时间
	 */
	private Date expireTime;
	/**
	 * 支付完成时间
	 */
	private Date payFinishTime;
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
	 * 设置：订单编号
	 */
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	/**
	 * 获取：订单编号
	 */
	public String getOrderNum() {
		return orderNum;
	}
	/**
	 * 设置：胶囊ID
	 */
	public void setCapsuleNum(String capsuleNum) {
		this.capsuleNum = capsuleNum;
	}
	/**
	 * 获取：胶囊ID
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
	 * 设置：订单金额
	 */
	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}
	/**
	 * 获取：订单金额
	 */
	public BigDecimal getOrderAmount() {
		return orderAmount;
	}
	/**
	 * 设置：支付过期时间
	 */
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	/**
	 * 获取：支付过期时间
	 */
	public Date getExpireTime() {
		return expireTime;
	}
	/**
	 * 设置：支付完成时间
	 */
	public void setPayFinishTime(Date payFinishTime) {
		this.payFinishTime = payFinishTime;
	}
	/**
	 * 获取：支付完成时间
	 */
	public Date getPayFinishTime() {
		return payFinishTime;
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
