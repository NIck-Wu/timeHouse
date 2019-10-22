package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xys.common.base.PageQueryBean;
import com.dao.CapsulesDao;
import com.domain.dto.CapsulesDto;
import com.service.CapsulesService;


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
public class CapsulesServiceImpl implements CapsulesService {

    @Autowired
    private CapsulesDao capsulesDao;

    /**
     * 根据主键查询表信息
     *
     * @param capsules
     * @return
     */
    @Override
    public CapsulesDto findById(CapsulesDto capsules){
        return capsulesDao.findById(capsules);
    }

    /**
     * 根据对象查询表信息
     *
     * @param capsules
     * @return
     */
    @Override
    public CapsulesDto find(CapsulesDto capsules){
        return capsulesDao.find(capsules);
    }

    /**
     * 保存表信息
     *
     * @param capsules
     * @return
     */
    @Override
    public void save(CapsulesDto capsules){
        capsulesDao.save(capsules);
    }

    /**
     * 根据主键删除表信息
     *
     * @param capsules
     */
    @Override
    public void delete(CapsulesDto capsules){
        capsulesDao.deleteById(capsules);
    }

    /**
     * 根据主键修改表信息
     *
     * @param capsules
     */
    @Override
    public void update(CapsulesDto capsules){
        capsulesDao.editById(capsules);
    }

    /**
     * 查询所有表列表
     *
     * @param capsules
     * @return
     */
    @Override
    public List<CapsulesDto> list(CapsulesDto capsules){
        return capsulesDao.list(capsules);
    }

    /**
     * 分页查询表信息
     *
     * @param capsules
     */
    @Override
    public PageQueryBean<CapsulesDto> showPageQuery(PageQueryBean<CapsulesDto> page){
        return capsulesDao.page(page);
    }

}
