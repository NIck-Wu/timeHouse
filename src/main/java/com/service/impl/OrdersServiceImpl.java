package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xys.common.base.PageQueryBean;
import com.dao.OrdersDao;
import com.domain.dto.OrdersDto;
import com.service.OrdersService;


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
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersDao ordersDao;

    /**
     * 根据主键查询表信息
     *
     * @param orders
     * @return
     */
    @Override
    public OrdersDto findById(OrdersDto orders){
        return ordersDao.findById(orders);
    }

    /**
     * 根据对象查询表信息
     *
     * @param orders
     * @return
     */
    @Override
    public OrdersDto find(OrdersDto orders){
        return ordersDao.find(orders);
    }

    /**
     * 保存表信息
     *
     * @param orders
     * @return
     */
    @Override
    public void save(OrdersDto orders){
        ordersDao.save(orders);
    }

    /**
     * 根据主键删除表信息
     *
     * @param orders
     */
    @Override
    public void delete(OrdersDto orders){
        ordersDao.deleteById(orders);
    }

    /**
     * 根据主键修改表信息
     *
     * @param orders
     */
    @Override
    public void update(OrdersDto orders){
        ordersDao.editById(orders);
    }

    /**
     * 查询所有表列表
     *
     * @param orders
     * @return
     */
    @Override
    public List<OrdersDto> list(OrdersDto orders){
        return ordersDao.list(orders);
    }

    /**
     * 分页查询表信息
     *
     * @param orders
     */
    @Override
    public PageQueryBean<OrdersDto> showPageQuery(PageQueryBean<OrdersDto> page){
        return ordersDao.page(page);
    }

}
