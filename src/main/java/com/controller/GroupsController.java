package com.controller;

import java.util.List;

import com.xys.common.base.PageQueryBean;
import com.xys.common.base.ResponseResult;
import com.domain.dto.GroupsDto;
import com.service.GroupsService;
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
@RequestMapping("/api/groups/groups")
public class GroupsController {

    @Autowired
    private GroupsService groupsService;




    /**
     * 查询对象
     *
     * @param groups
     * @return
     */
    @RequestMapping(value = "find",method = RequestMethod.POST)
    public ResponseResult<GroupsDto> find(@RequestBody GroupsDto groups){

        GroupsDto result = groupsService.find(groups);

        return new ResponseResult<GroupsDto>(result);
    }

    /**
	 * 保存对象
	 *
	 * @param groups
	 */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ResponseResult<GroupsDto> save(@RequestBody GroupsDto groups) {

        groupsService.save(groups);

        return new ResponseResult<GroupsDto>(groups);
    }

    /**
     * 根据主键删除对象
     *
     * @param groups
     */
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public ResponseResult<GroupsDto> delete(@RequestBody GroupsDto groups) {

        groupsService.delete(groups);

        return new ResponseResult<GroupsDto>();
    }


    /**
     * 根据主键修改
     *
     * @param groups
     * @return
     */
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public ResponseResult<GroupsDto> pageQuery(@RequestBody GroupsDto groups){

            groupsService.update(groups);

        return new ResponseResult<GroupsDto>();
    }

    /**
     * 查询列表
     *
     * @param groups
     * @return
     */
    @RequestMapping(value = "list",method = RequestMethod.POST)
    public ResponseResult<List<GroupsDto>> list(@RequestBody GroupsDto groups){

        List<GroupsDto> result = groupsService.list(groups);

        return new ResponseResult<List<GroupsDto>>(result);
    }

    /**
     * 分页查询
     *
     * @param groupsPage
     * @return
    */
    @RequestMapping(value = "showPageQuery",method = RequestMethod.POST)
    public ResponseResult<PageQueryBean<GroupsDto>> showPageQuery(@RequestBody PageQueryBean<GroupsDto> groupsPage){

        PageQueryBean<GroupsDto> result = groupsService.showPageQuery(groupsPage);

        return new ResponseResult<PageQueryBean<GroupsDto>>(result);
    }

}
