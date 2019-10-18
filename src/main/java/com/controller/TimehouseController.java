package com.controller;

import java.util.List;

import com.xys.common.base.PageQueryBean;
import com.xys.common.base.ResponseResult;
import com.domain.dto.TimehouseDto;
import com.service.TimehouseService;
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
 * @date 2019-10-18 16:51:23
 */
@RestController
@RequestMapping("/api/timehouse/timehouse")
public class TimehouseController {

    @Autowired
    private TimehouseService timehouseService;




    /**
     * 查询对象
     *
     * @param timehouse
     * @return
     */
    @RequestMapping(value = "find",method = RequestMethod.POST)
    public ResponseResult<TimehouseDto> find(@RequestBody TimehouseDto timehouse){

        TimehouseDto result = timehouseService.find(timehouse);

        return new ResponseResult<TimehouseDto>(result);
    }

    /**
	 * 保存对象
	 *
	 * @param timehouse
	 */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseResult<TimehouseDto> save(@RequestBody TimehouseDto timehouse) {

        timehouseService.save(timehouse);

        return new ResponseResult<TimehouseDto>(timehouse);
    }

    /**
     * 根据主键删除对象
     *
     * @param timehouse
     */
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public ResponseResult<TimehouseDto> delete(@RequestBody TimehouseDto timehouse) {

        timehouseService.delete(timehouse);

        return new ResponseResult<TimehouseDto>();
    }


    /**
     * 根据主键修改
     *
     * @param timehouse
     * @return
     */
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public ResponseResult<TimehouseDto> pageQuery(@RequestBody TimehouseDto timehouse){

            timehouseService.update(timehouse);

        return new ResponseResult<TimehouseDto>();
    }

    /**
     * 查询列表
     *
     * @param timehouse
     * @return
     */
    @RequestMapping(value = "list",method = RequestMethod.POST)
    public ResponseResult<List<TimehouseDto>> list(@RequestBody TimehouseDto timehouse){

        List<TimehouseDto> result = timehouseService.list(timehouse);

        return new ResponseResult<List<TimehouseDto>>(result);
    }

    /**
     * 分页查询
     *
     * @param timehousePage
     * @return
    */
    @RequestMapping(value = "showPageQuery",method = RequestMethod.POST)
    public ResponseResult<PageQueryBean<TimehouseDto>> showPageQuery(@RequestBody PageQueryBean<TimehouseDto> timehousePage){

        PageQueryBean<TimehouseDto> result = timehouseService.showPageQuery(timehousePage);

        return new ResponseResult<PageQueryBean<TimehouseDto>>(result);
    }

}
