package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xys.common.base.PageQueryBean;
import com.dao.VideosDao;
import com.domain.dto.VideosDto;
import com.service.VideosService;


/**
 *
 * 表服务实现
 *
 * @author
 * @version 1.0
 * @date 2019-10-18 16:51:23
 */
@Service
@Transactional
public class VideosServiceImpl implements VideosService {

    @Autowired
    private VideosDao videosDao;

    /**
     * 根据主键查询表信息
     *
     * @param videos
     * @return
     */
    @Override
    public VideosDto findById(VideosDto videos){
        return videosDao.findById(videos);
    }

    /**
     * 根据对象查询表信息
     *
     * @param videos
     * @return
     */
    @Override
    public VideosDto find(VideosDto videos){
        return videosDao.find(videos);
    }

    /**
     * 保存表信息
     *
     * @param videos
     * @return
     */
    @Override
    public void save(VideosDto videos){
        videosDao.save(videos);
    }

    /**
     * 根据主键删除表信息
     *
     * @param videos
     */
    @Override
    public void delete(VideosDto videos){
        videosDao.deleteById(videos);
    }

    /**
     * 根据主键修改表信息
     *
     * @param videos
     */
    @Override
    public void update(VideosDto videos){
        videosDao.editById(videos);
    }

    /**
     * 查询所有表列表
     *
     * @param videos
     * @return
     */
    @Override
    public List<VideosDto> list(VideosDto videos){
        return videosDao.list(videos);
    }

    /**
     * 分页查询表信息
     *
     * @param videos
     */
    @Override
    public PageQueryBean<VideosDto> showPageQuery(PageQueryBean<VideosDto> page){
        return videosDao.page(page);
    }

}
