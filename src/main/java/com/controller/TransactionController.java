package com.controller;

import java.util.List;

import com.xys.common.base.PageQueryBean;
import com.xys.common.base.ResponseResult;
import com.domain.dto.TransactionDto;
import com.service.TransactionService;
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
@RequestMapping("/api/transaction/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;




    /**
     * 查询对象
     *
     * @param transaction
     * @return
     */
    @RequestMapping(value = "find",method = RequestMethod.POST)
    public ResponseResult<TransactionDto> find(@RequestBody TransactionDto transaction){

        TransactionDto result = transactionService.find(transaction);

        return new ResponseResult<TransactionDto>(result);
    }

    /**
	 * 保存对象
	 *
	 * @param transaction
	 */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseResult<TransactionDto> save(@RequestBody TransactionDto transaction) {

        transactionService.save(transaction);

        return new ResponseResult<TransactionDto>(transaction);
    }

    /**
     * 根据主键删除对象
     *
     * @param transaction
     */
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public ResponseResult<TransactionDto> delete(@RequestBody TransactionDto transaction) {

        transactionService.delete(transaction);

        return new ResponseResult<TransactionDto>();
    }


    /**
     * 根据主键修改
     *
     * @param transaction
     * @return
     */
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public ResponseResult<TransactionDto> pageQuery(@RequestBody TransactionDto transaction){

            transactionService.update(transaction);

        return new ResponseResult<TransactionDto>();
    }

    /**
     * 查询列表
     *
     * @param transaction
     * @return
     */
    @RequestMapping(value = "list",method = RequestMethod.POST)
    public ResponseResult<List<TransactionDto>> list(@RequestBody TransactionDto transaction){

        List<TransactionDto> result = transactionService.list(transaction);

        return new ResponseResult<List<TransactionDto>>(result);
    }

    /**
     * 分页查询
     *
     * @param transactionPage
     * @return
    */
    @RequestMapping(value = "showPageQuery",method = RequestMethod.POST)
    public ResponseResult<PageQueryBean<TransactionDto>> showPageQuery(@RequestBody PageQueryBean<TransactionDto> transactionPage){

        PageQueryBean<TransactionDto> result = transactionService.showPageQuery(transactionPage);

        return new ResponseResult<PageQueryBean<TransactionDto>>(result);
    }

}
