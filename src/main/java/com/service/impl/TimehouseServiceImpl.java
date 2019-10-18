package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xys.common.base.PageQueryBean;
import com.dao.TimehouseDao;
import com.domain.dto.TimehouseDto;
import com.service.TimehouseService;


/**
 *
 * 表服务实现
 *
 * @author
 * @version 1.0
 * @date 2019-10-18 16:51:23
 */
@Service
@Transactional
public class TimehouseServiceImpl implements TimehouseService {

    @Autowired
    private TimehouseDao timehouseDao;

    /**
     * 根据主键查询表信息
     *
     * @param timehouse
     * @return
     */
    @Override
    public TimehouseDto findById(TimehouseDto timehouse){
        return timehouseDao.findById(timehouse);
    }

    /**
     * 根据对象查询表信息
     *
     * @param timehouse
     * @return
     */
    @Override
    public TimehouseDto find(TimehouseDto timehouse){
        return timehouseDao.find(timehouse);
    }

    /**
     * 保存表信息
     *
     * @param timehouse
     * @return
     */
    @Override
    public void save(TimehouseDto timehouse){
        timehouseDao.save(timehouse);
    }

    /**
     * 根据主键删除表信息
     *
     * @param timehouse
     */
    @Override
    public void delete(TimehouseDto timehouse){
        timehouseDao.deleteById(timehouse);
    }

    /**
     * 根据主键修改表信息
     *
     * @param timehouse
     */
    @Override
    public void update(TimehouseDto timehouse){
        timehouseDao.editById(timehouse);
    }

    /**
     * 查询所有表列表
     *
     * @param timehouse
     * @return
     */
    @Override
    public List<TimehouseDto> list(TimehouseDto timehouse){
        return timehouseDao.list(timehouse);
    }

    /**
     * 分页查询表信息
     *
     * @param timehouse
     */
    @Override
    public PageQueryBean<TimehouseDto> showPageQuery(PageQueryBean<TimehouseDto> page){
        return timehouseDao.page(page);
    }

}
