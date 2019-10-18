package com.domain.entity;

import java.io.Serializable;

/**
 * 
 * 
 * @author NIck
 * @date 2019-10-18 16:51:23
 */
public class OrdersEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	private Integer id;

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
}
