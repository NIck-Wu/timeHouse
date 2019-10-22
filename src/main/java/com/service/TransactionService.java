package com.service;

import java.util.List;
import com.xys.common.base.PageQueryBean;
import com.domain.dto.TransactionDto;

/**
 * 
 *
 * @author
 * @version 1.0
 * @date 2019-10-22 11:15:47
 */
public interface TransactionService {


    /**
	 * 根据主键查询表信息
	 *
	 * @param transaction
	 * @return
	 */
    public TransactionDto findById(TransactionDto transaction);

    /**
	 * 根据对象查询表信息
	 *
	 * @param transaction
	 * @return
	 */
    public TransactionDto find(TransactionDto transaction);

    /**
	 * 保存表信息
	 *
	 * @param transaction
	 * @return
	 */
    public void save(TransactionDto transaction);

    /**
	 * 根据主键删除表信息
	 *
	 * @param transaction
	 */
    public void delete(TransactionDto transaction);

    /**
	 * 根据主键修改表信息
	 *
	 * @param transaction
	 */
    public void update(TransactionDto transaction);

    /**
	 * 查询所有表列表
	 *
	 * @param transaction
	 * @return
	 */
    public List<TransactionDto> list(TransactionDto transaction);

    /**
     * 分页查询表信息
     *
     * @param transaction
     */
    public PageQueryBean<TransactionDto> showPageQuery(PageQueryBean<TransactionDto> page);
}

