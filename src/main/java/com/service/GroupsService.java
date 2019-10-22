package com.service;

import java.util.List;
import com.xys.common.base.PageQueryBean;
import com.domain.dto.GroupsDto;

/**
 * 
 *
 * @author
 * @version 1.0
 * @date 2019-10-22 11:15:47
 */
public interface GroupsService {


    /**
	 * 根据主键查询表信息
	 *
	 * @param groups
	 * @return
	 */
    public GroupsDto findById(GroupsDto groups);

    /**
	 * 根据对象查询表信息
	 *
	 * @param groups
	 * @return
	 */
    public GroupsDto find(GroupsDto groups);

    /**
	 * 保存表信息
	 *
	 * @param groups
	 * @return
	 */
    public void save(GroupsDto groups);

    /**
	 * 根据主键删除表信息
	 *
	 * @param groups
	 */
    public void delete(GroupsDto groups);

    /**
	 * 根据主键修改表信息
	 *
	 * @param groups
	 */
    public void update(GroupsDto groups);

    /**
	 * 查询所有表列表
	 *
	 * @param groups
	 * @return
	 */
    public List<GroupsDto> list(GroupsDto groups);

    /**
     * 分页查询表信息
     *
     * @param groups
     */
    public PageQueryBean<GroupsDto> showPageQuery(PageQueryBean<GroupsDto> page);
}

