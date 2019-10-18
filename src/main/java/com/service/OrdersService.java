package com.service;

import java.util.List;
import com.xys.common.base.PageQueryBean;
import com.domain.dto.OrdersDto;

/**
 * 
 *
 * @author
 * @version 1.0
 * @date 2019-10-18 16:51:23
 */
public interface OrdersService {


    /**
	 * 根据主键查询表信息
	 *
	 * @param orders
	 * @return
	 */
    public OrdersDto findById(OrdersDto orders);

    /**
	 * 根据对象查询表信息
	 *
	 * @param orders
	 * @return
	 */
    public OrdersDto find(OrdersDto orders);

    /**
	 * 保存表信息
	 *
	 * @param orders
	 * @return
	 */
    public void save(OrdersDto orders);

    /**
	 * 根据主键删除表信息
	 *
	 * @param orders
	 */
    public void delete(OrdersDto orders);

    /**
	 * 根据主键修改表信息
	 *
	 * @param orders
	 */
    public void update(OrdersDto orders);

    /**
	 * 查询所有表列表
	 *
	 * @param orders
	 * @return
	 */
    public List<OrdersDto> list(OrdersDto orders);

    /**
     * 分页查询表信息
     *
     * @param orders
     */
    public PageQueryBean<OrdersDto> showPageQuery(PageQueryBean<OrdersDto> page);
}

