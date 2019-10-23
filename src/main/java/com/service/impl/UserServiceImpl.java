package com.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.domain.dto.UserDto;
import com.service.UserService;
import com.utils.beans.TemplateParam;
import com.utils.beans.WxUserBean;
import com.utils.beans.XcxTemplateMsg;
import com.xys.common.base.PageQueryBean;
import com.xys.common.helper.ServiceConfigHelper;
import com.xys.common.util.DateUtils;
import com.xys.common.util.HttpConnectionUtil;
import com.xys.common.util.StringUtils;

/**
 *
 * 表服务实现
 *
 * @author NIck
 * @version 1.0
 * @date 2019-10-22 11:15:47
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private UserDao userDao;

	/**
	 * 根据主键查询表信息
	 *
	 * @param user
	 * @return
	 */
	@Override
	public UserDto findById(UserDto user) {
		return userDao.findById(user);
	}

	/**
	 * 根据对象查询表信息
	 *
	 * @param user
	 * @return
	 */
	@Override
	public UserDto find(UserDto user) {
		return userDao.find(user);
	}

	/**
	 * 保存表信息
	 *
	 * @param user
	 * @return
	 */
	@Override
	public void save(UserDto user) {
		userDao.save(user);
	}

	/**
	 * 根据主键删除表信息
	 *
	 * @param user
	 */
	@Override
	public void delete(UserDto user) {
		userDao.deleteById(user);
	}

	/**
	 * 根据主键修改表信息
	 *
	 * @param user
	 */
	@Override
	public void update(UserDto user) {
		userDao.editById(user);
	}

	/**
	 * 查询所有表列表
	 *
	 * @param user
	 * @return
	 */
	@Override
	public List<UserDto> list(UserDto user) {
		return userDao.list(user);
	}

	/**
	 * 分页查询表信息
	 *
	 * @param user
	 */
	@Override
	public PageQueryBean<UserDto> showPageQuery(PageQueryBean<UserDto> page) {
		return userDao.page(page);
	}

	/**
	 * 微信小程序登录
	 */
	@Override
	public UserDto wxLogin(UserDto user) {
		if (StringUtils.isEmptyStr(user.getWxCode())) {

		}
		String url = "https://api.weixin.qq.com/sns/jscode2session";
		Map<String, String> map = new HashMap<String, String>();
		map.put("appid", ServiceConfigHelper.getServiceConfigValue("wx.mini.app_id"));
		map.put("secret", ServiceConfigHelper.getServiceConfigValue("wx.mini.secret"));
		map.put("js_code", user.getWxCode());
		map.put("grant_type", ServiceConfigHelper.getServiceConfigValue("wx.mimi.grant_type"));
		LOGGER.info("wechatLoginParms ={}", map.toString());

		String wxLoginResult = null;
		try {
			wxLoginResult = HttpConnectionUtil.doGet(url, map.toString());
		} catch (Exception e) {
			LOGGER.error("wechatLoginWrong ={}", e);
			e.printStackTrace();
		}
		// ErrorCode成功码 0 ;
		WxUserBean wxUserBean = WxUserBean.fromJson(wxLoginResult);
		return null;
	}

	/**
	 * 推送到期消息
	 */
	@Override
	public void pushCapsule(UserDto user) {
		XcxTemplateMsg templateMsg = new XcxTemplateMsg();
		// 设置要发送的人
		templateMsg.setToUser(user.getWxOpenID());
		// 设置模板id
		templateMsg.setTemplateId("");
		// 设置跳转的页面
		//templateMsg.setPage(TemplateConstant.GROUP_ORDER_DETAIL + "&fromTemplate=true&orderStatus=SUCCESS&goodsOrderID=" + input.getGoodsOrderID());
		String formId = "1232141";
		// 设置表单id或预支付id
		templateMsg.setFormId(formId);
		// 模板消息内容
		List<TemplateParam> paras = new ArrayList<TemplateParam>();
		// 标题
		paras.add(new TemplateParam("keyword1", user.getCapsulesTitle(), ""));
		// 编号
		paras.add(new TemplateParam("keyword2", user.getCapsulesNum(), ""));
		// 到期时间
		paras.add(new TemplateParam("keyword3", DateUtils.format(user.getCapsulesExpriseTime()), ""));
		// 温馨提示
//		paras.add(new TemplateParam("keyword6", "请在提货时间内及时前往门店提货", ""));
		templateMsg.setTemplateParamList(paras);
		// 发送小程序模板消息

		String result = null;
		LOGGER.info("【通过微信网关发送小程序模板消息，参数】：{}", templateMsg.toJSON());
		try {
			String url = "https://api.weixin.qq.com/cgi-bin/message/wxopen/template/send?access_token=$ACCESS_TOKEN";
			result = HttpConnectionUtil.doPost(url, templateMsg.toJSON());
			LOGGER.info("【微信返回数据	】" + result);
		} catch (Exception e) {
			LOGGER.info("【发送小程序模板消息失败，参数】：{}", templateMsg.toJSON());
		}
	}

}
