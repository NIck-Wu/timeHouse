package com.service;

import java.util.List;
import com.xys.common.base.PageQueryBean;
import com.domain.dto.VideosDto;

/**
 * 
 *
 * @author
 * @version 1.0
 * @date 2019-10-18 16:51:23
 */
public interface VideosService {


    /**
	 * 根据主键查询表信息
	 *
	 * @param videos
	 * @return
	 */
    public VideosDto findById(VideosDto videos);

    /**
	 * 根据对象查询表信息
	 *
	 * @param videos
	 * @return
	 */
    public VideosDto find(VideosDto videos);

    /**
	 * 保存表信息
	 *
	 * @param videos
	 * @return
	 */
    public void save(VideosDto videos);

    /**
	 * 根据主键删除表信息
	 *
	 * @param videos
	 */
    public void delete(VideosDto videos);

    /**
	 * 根据主键修改表信息
	 *
	 * @param videos
	 */
    public void update(VideosDto videos);

    /**
	 * 查询所有表列表
	 *
	 * @param videos
	 * @return
	 */
    public List<VideosDto> list(VideosDto videos);

    /**
     * 分页查询表信息
     *
     * @param videos
     */
    public PageQueryBean<VideosDto> showPageQuery(PageQueryBean<VideosDto> page);
}

