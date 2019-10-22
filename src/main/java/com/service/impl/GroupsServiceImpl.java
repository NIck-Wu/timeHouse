package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xys.common.base.PageQueryBean;
import com.dao.GroupsDao;
import com.domain.dto.GroupsDto;
import com.service.GroupsService;


/**
 *
 * 表服务实现
 *
 * @author
 * @version 1.0
 * @date 2019-10-22 11:15:47
 */
@Service
@Transactional
public class GroupsServiceImpl implements GroupsService {

    @Autowired
    private GroupsDao groupsDao;

    /**
     * 根据主键查询表信息
     *
     * @param groups
     * @return
     */
    @Override
    public GroupsDto findById(GroupsDto groups){
        return groupsDao.findById(groups);
    }

    /**
     * 根据对象查询表信息
     *
     * @param groups
     * @return
     */
    @Override
    public GroupsDto find(GroupsDto groups){
        return groupsDao.find(groups);
    }

    /**
     * 保存表信息
     *
     * @param groups
     * @return
     */
    @Override
    public void save(GroupsDto groups){
        groupsDao.save(groups);
    }

    /**
     * 根据主键删除表信息
     *
     * @param groups
     */
    @Override
    public void delete(GroupsDto groups){
        groupsDao.deleteById(groups);
    }

    /**
     * 根据主键修改表信息
     *
     * @param groups
     */
    @Override
    public void update(GroupsDto groups){
        groupsDao.editById(groups);
    }

    /**
     * 查询所有表列表
     *
     * @param groups
     * @return
     */
    @Override
    public List<GroupsDto> list(GroupsDto groups){
        return groupsDao.list(groups);
    }

    /**
     * 分页查询表信息
     *
     * @param groups
     */
    @Override
    public PageQueryBean<GroupsDto> showPageQuery(PageQueryBean<GroupsDto> page){
        return groupsDao.page(page);
    }

}
