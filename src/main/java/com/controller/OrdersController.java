package com.controller;

import java.util.List;

import com.xys.common.base.PageQueryBean;
import com.xys.common.base.ResponseResult;
import com.domain.dto.OrdersDto;
import com.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 
 *
 * @author
 * @version 1.0
 * @date 2019-10-22 11:15:47
 */
@RestController
@RequestMapping("/api/orders/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;




    /**
     * 查询对象
     *
     * @param orders
     * @return
     */
    @RequestMapping(value = "find",method = RequestMethod.POST)
    public ResponseResult<OrdersDto> find(@RequestBody OrdersDto orders){

        OrdersDto result = ordersService.find(orders);

        return new ResponseResult<OrdersDto>(result);
    }

    /**
	 * 保存对象
	 *
	 * @param orders
	 */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseResult<OrdersDto> save(@RequestBody OrdersDto orders) {

        ordersService.save(orders);

        return new ResponseResult<OrdersDto>(orders);
    }

    /**
     * 根据主键删除对象
     *
     * @param orders
     */
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public ResponseResult<OrdersDto> delete(@RequestBody OrdersDto orders) {

        ordersService.delete(orders);

        return new ResponseResult<OrdersDto>();
    }


    /**
     * 根据主键修改
     *
     * @param orders
     * @return
     */
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public ResponseResult<OrdersDto> pageQuery(@RequestBody OrdersDto orders){

            ordersService.update(orders);

        return new ResponseResult<OrdersDto>();
    }

    /**
     * 查询列表
     *
     * @param orders
     * @return
     */
    @RequestMapping(value = "list",method = RequestMethod.POST)
    public ResponseResult<List<OrdersDto>> list(@RequestBody OrdersDto orders){

        List<OrdersDto> result = ordersService.list(orders);

        return new ResponseResult<List<OrdersDto>>(result);
    }

    /**
     * 分页查询
     *
     * @param ordersPage
     * @return
    */
    @RequestMapping(value = "showPageQuery",method = RequestMethod.POST)
    public ResponseResult<PageQueryBean<OrdersDto>> showPageQuery(@RequestBody PageQueryBean<OrdersDto> ordersPage){

        PageQueryBean<OrdersDto> result = ordersService.showPageQuery(ordersPage);

        return new ResponseResult<PageQueryBean<OrdersDto>>(result);
    }

}
