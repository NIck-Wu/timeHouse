package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xys.common.base.PageQueryBean;
import com.dao.TransactionDao;
import com.domain.dto.TransactionDto;
import com.service.TransactionService;


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
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionDao transactionDao;

    /**
     * 根据主键查询表信息
     *
     * @param transaction
     * @return
     */
    @Override
    public TransactionDto findById(TransactionDto transaction){
        return transactionDao.findById(transaction);
    }

    /**
     * 根据对象查询表信息
     *
     * @param transaction
     * @return
     */
    @Override
    public TransactionDto find(TransactionDto transaction){
        return transactionDao.find(transaction);
    }

    /**
     * 保存表信息
     *
     * @param transaction
     * @return
     */
    @Override
    public void save(TransactionDto transaction){
        transactionDao.save(transaction);
    }

    /**
     * 根据主键删除表信息
     *
     * @param transaction
     */
    @Override
    public void delete(TransactionDto transaction){
        transactionDao.deleteById(transaction);
    }

    /**
     * 根据主键修改表信息
     *
     * @param transaction
     */
    @Override
    public void update(TransactionDto transaction){
        transactionDao.editById(transaction);
    }

    /**
     * 查询所有表列表
     *
     * @param transaction
     * @return
     */
    @Override
    public List<TransactionDto> list(TransactionDto transaction){
        return transactionDao.list(transaction);
    }

    /**
     * 分页查询表信息
     *
     * @param transaction
     */
    @Override
    public PageQueryBean<TransactionDto> showPageQuery(PageQueryBean<TransactionDto> page){
        return transactionDao.page(page);
    }

}
