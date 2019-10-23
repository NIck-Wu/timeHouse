package com.service;

import java.util.List;
import com.xys.common.base.PageQueryBean;
import com.domain.dto.CapsulesDto;

/**
 * 
 *
 * @author
 * @version 1.0
 * @date 2019-10-22 11:15:47
 */
public interface CapsulesService {

	/**
	 * 根据主键查询表信息
	 *
	 * @param capsules
	 * @return
	 */
	public CapsulesDto findById(CapsulesDto capsules);

	/**
	 * 根据对象查询表信息
	 *
	 * @param capsules
	 * @return
	 */
	public CapsulesDto find(CapsulesDto capsules);

	/**
	 * 保存表信息
	 *
	 * @param capsules
	 * @return
	 */
	public void save(CapsulesDto capsules);

	/**
	 * 根据主键删除表信息
	 *
	 * @param capsules
	 */
	public void delete(CapsulesDto capsules);

	/**
	 * 根据主键修改表信息
	 *
	 * @param capsules
	 */
	public void update(CapsulesDto capsules);

	/**
	 * 查询所有表列表
	 *
	 * @param capsules
	 * @return
	 */
	public List<CapsulesDto> list(CapsulesDto capsules);

	/**
	 * 分页查询表信息
	 *
	 * @param capsules
	 */
	public PageQueryBean<CapsulesDto> showPageQuery(PageQueryBean<CapsulesDto> page);

	/**
	 * 获取倒计时7天要过期的记录列表
	 * 
	 * @param capsulesDto
	 * @return
	 */
	public List<CapsulesDto> getAll7DaysExpriseList(CapsulesDto capsulesDto);
}
