package com.controller;

import java.util.List;

import com.xys.common.base.PageQueryBean;
import com.xys.common.base.ResponseResult;
import com.xys.common.helper.ValidateHelper;
import com.domain.dto.UserDto;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author NIck
 * @version 1.0
 * @date 2019-10-22 11:15:47
 */
@RestController
@RequestMapping("/api/user/user")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 查询对象
	 *
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "find", method = RequestMethod.POST)
	public ResponseResult<UserDto> find(@RequestBody UserDto user) {

		UserDto result = userService.find(user);

		return new ResponseResult<UserDto>(result);
	}

	/**
	 * 保存对象
	 *
	 * @param user
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ResponseResult<UserDto> save(@RequestBody UserDto user) {

		userService.save(user);

		return new ResponseResult<UserDto>(user);
	}

	/**
	 * 根据主键删除对象
	 *
	 * @param user
	 */
	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public ResponseResult<UserDto> delete(@RequestBody UserDto user) {

		userService.delete(user);

		return new ResponseResult<UserDto>();
	}

	/**
	 * 根据主键修改
	 *
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ResponseResult<UserDto> pageQuery(@RequestBody UserDto user) {

		userService.update(user);

		return new ResponseResult<UserDto>();
	}

	/**
	 * 查询列表
	 *
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public ResponseResult<List<UserDto>> list(@RequestBody UserDto user) {

		List<UserDto> result = userService.list(user);

		return new ResponseResult<List<UserDto>>(result);
	}

	/**
	 * 分页查询
	 *
	 * @param userPage
	 * @return
	 */
	@RequestMapping(value = "showPageQuery", method = RequestMethod.POST)
	public ResponseResult<PageQueryBean<UserDto>> showPageQuery(@RequestBody PageQueryBean<UserDto> userPage) {

		PageQueryBean<UserDto> result = userService.showPageQuery(userPage);

		return new ResponseResult<PageQueryBean<UserDto>>(result);
	}

	/**
	 * 微信小程序登录
	 * 
	 * @param userDto
	 * @return
	 */
	@RequestMapping(value = "wxLogin", method = RequestMethod.POST)
	public ResponseResult<UserDto> wxLogin(@RequestBody UserDto userDto) {

		ValidateHelper.validateNull(userDto, new String[] { "wxCode" });

		UserDto result = userService.wxLogin(userDto);

		return new ResponseResult<UserDto>(result);
	}
}
