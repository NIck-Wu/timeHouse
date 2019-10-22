package com.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author NIck
 * @date 2019-10-22 11:15:47
 */
public class TransactionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	private Integer id;
	/**
	 * 交易编号
	 */
	private String transactionNO;
	/**
	 * 订单编号
	 */
	private String ordersNO;
	/**
	 * 交易类型 1：支付
	 */
	private String payType;
	/**
	 * 创建时间
	 */
	private Date creatTime;
	/**
	 * 最后更新时间
	 */
	private Date lastUpdateTime;

	/**
	 * 设置：ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：ID
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：交易编号
	 */
	public void setTransactionNO(String transactionNO) {
		this.transactionNO = transactionNO;
	}
	/**
	 * 获取：交易编号
	 */
	public String getTransactionNO() {
		return transactionNO;
	}
	/**
	 * 设置：订单编号
	 */
	public void setOrdersNO(String ordersNO) {
		this.ordersNO = ordersNO;
	}
	/**
	 * 获取：订单编号
	 */
	public String getOrdersNO() {
		return ordersNO;
	}
	/**
	 * 设置：交易类型 1：支付
	 */
	public void setPayType(String payType) {
		this.payType = payType;
	}
	/**
	 * 获取：交易类型 1：支付
	 */
	public String getPayType() {
		return payType;
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
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	/**
	 * 获取：最后更新时间
	 */
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
}
