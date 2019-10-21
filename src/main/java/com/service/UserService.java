package com.service;

import java.util.List;
import com.xys.common.base.PageQueryBean;
import com.domain.dto.UserDto;

/**
 * 
 *
 * @author
 * @version 1.0
 * @date 2019-10-18 16:51:23
 */
public interface UserService {


    /**
	 * 根据主键查询表信息
	 *
	 * @param user
	 * @return
	 */
    public UserDto findById(UserDto user);

    /**
	 * 根据对象查询表信息
	 *
	 * @param user
	 * @return
	 */
    public UserDto find(UserDto user);

    /**
	 * 保存表信息
	 *
	 * @param user
	 * @return
	 */
    public void save(UserDto user);

    /**
	 * 根据主键删除表信息
	 *
	 * @param user
	 */
    public void delete(UserDto user);

    /**
	 * 根据主键修改表信息
	 *
	 * @param user
	 */
    public void update(UserDto user);

    /**
	 * 查询所有表列表
	 *
	 * @param user
	 * @return
	 */
    public List<UserDto> list(UserDto user);

    /**
     * 分页查询表信息
     *
     * @param user
     */
    public PageQueryBean<UserDto> showPageQuery(PageQueryBean<UserDto> page);

	// 用户微信登陆
	public UserDto wxLogin(UserDto userDto);

}

