package com.controller;

import java.util.List;

import com.xys.common.base.PageQueryBean;
import com.xys.common.base.ResponseResult;
import com.domain.dto.VideosDto;
import com.service.VideosService;
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
@RequestMapping("/api/videos/videos")
public class VideosController {

    @Autowired
    private VideosService videosService;




    /**
     * 查询对象
     *
     * @param videos
     * @return
     */
    @RequestMapping(value = "find",method = RequestMethod.POST)
    public ResponseResult<VideosDto> find(@RequestBody VideosDto videos){

        VideosDto result = videosService.find(videos);

        return new ResponseResult<VideosDto>(result);
    }

    /**
	 * 保存对象
	 *
	 * @param videos
	 */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseResult<VideosDto> save(@RequestBody VideosDto videos) {

        videosService.save(videos);

        return new ResponseResult<VideosDto>(videos);
    }

    /**
     * 根据主键删除对象
     *
     * @param videos
     */
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public ResponseResult<VideosDto> delete(@RequestBody VideosDto videos) {

        videosService.delete(videos);

        return new ResponseResult<VideosDto>();
    }


    /**
     * 根据主键修改
     *
     * @param videos
     * @return
     */
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public ResponseResult<VideosDto> pageQuery(@RequestBody VideosDto videos){

            videosService.update(videos);

        return new ResponseResult<VideosDto>();
    }

    /**
     * 查询列表
     *
     * @param videos
     * @return
     */
    @RequestMapping(value = "list",method = RequestMethod.POST)
    public ResponseResult<List<VideosDto>> list(@RequestBody VideosDto videos){

        List<VideosDto> result = videosService.list(videos);

        return new ResponseResult<List<VideosDto>>(result);
    }

    /**
     * 分页查询
     *
     * @param videosPage
     * @return
    */
    @RequestMapping(value = "showPageQuery",method = RequestMethod.POST)
    public ResponseResult<PageQueryBean<VideosDto>> showPageQuery(@RequestBody PageQueryBean<VideosDto> videosPage){

        PageQueryBean<VideosDto> result = videosService.showPageQuery(videosPage);

        return new ResponseResult<PageQueryBean<VideosDto>>(result);
    }

}
