package com.service;

import java.util.List;
import com.xys.common.base.PageQueryBean;
import com.domain.dto.TimehouseDto;

/**
 * 
 *
 * @author
 * @version 1.0
 * @date 2019-10-18 16:51:23
 */
public interface TimehouseService {


    /**
	 * 根据主键查询表信息
	 *
	 * @param timehouse
	 * @return
	 */
    public TimehouseDto findById(TimehouseDto timehouse);

    /**
	 * 根据对象查询表信息
	 *
	 * @param timehouse
	 * @return
	 */
    public TimehouseDto find(TimehouseDto timehouse);

    /**
	 * 保存表信息
	 *
	 * @param timehouse
	 * @return
	 */
    public void save(TimehouseDto timehouse);

    /**
	 * 根据主键删除表信息
	 *
	 * @param timehouse
	 */
    public void delete(TimehouseDto timehouse);

    /**
	 * 根据主键修改表信息
	 *
	 * @param timehouse
	 */
    public void update(TimehouseDto timehouse);

    /**
	 * 查询所有表列表
	 *
	 * @param timehouse
	 * @return
	 */
    public List<TimehouseDto> list(TimehouseDto timehouse);

    /**
     * 分页查询表信息
     *
     * @param timehouse
     */
    public PageQueryBean<TimehouseDto> showPageQuery(PageQueryBean<TimehouseDto> page);
}

