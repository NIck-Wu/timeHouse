package com.utils.beans;

import java.io.Serializable;

import com.google.gson.GsonBuilder;

/**
 * 微信用户信息.
 *
 */
public class WxUserBean implements Serializable {
	private static final long serialVersionUID = 5788154322646488738L;

	private Boolean subscribe;
	private String openId;
	private String nickname;
	/**
	 * 性别描述信息：男、女、未知等.
	 */
	private String sexDesc;
	/**
	 * 性别表示：1，2等数字.
	 */
	private Integer sex;
	private String language;
	private String city;
	private String province;
	private String country;
	private String headImgUrl;
	private Long subscribeTime;
	private String unionId;
	private String remark;
	private Integer groupId;
	private Long[] tagIds;
	/**
	 * 用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）.
	 */
	private String[] privileges;

	public Boolean getSubscribe() {
		return subscribe;
	}

	public void setSubscribe(Boolean subscribe) {
		this.subscribe = subscribe;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSexDesc() {
		return sexDesc;
	}

	public void setSexDesc(String sexDesc) {
		this.sexDesc = sexDesc;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHeadImgUrl() {
		return headImgUrl;
	}

	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}

	public Long getSubscribeTime() {
		return subscribeTime;
	}

	public void setSubscribeTime(Long subscribeTime) {
		this.subscribeTime = subscribeTime;
	}

	public String getUnionId() {
		return unionId;
	}

	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Long[] getTagIds() {
		return tagIds;
	}

	public void setTagIds(Long[] tagIds) {
		this.tagIds = tagIds;
	}

	public String[] getPrivileges() {
		return privileges;
	}

	public void setPrivileges(String[] privileges) {
		this.privileges = privileges;
	}

	public static final GsonBuilder INSTANCE = new GsonBuilder();

	public static WxUserBean fromJson(String json) {
		return INSTANCE.create().fromJson(json, WxUserBean.class);
	}
}
