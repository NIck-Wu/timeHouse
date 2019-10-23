package com.controller;

import java.util.List;

import com.xys.common.base.PageQueryBean;
import com.xys.common.base.ResponseResult;
import com.domain.dto.BannerDto;
import com.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author NIck
 * @version 1.0
 * @date 2019-10-22 11:15:47
 */
@RestController
@RequestMapping("/api/banner/banner")
public class BannerController {

	@Autowired
	private BannerService bannerService;

	/**
	 * 查询对象
	 *
	 * @param banner
	 * @return
	 */
	@RequestMapping(value = "find", method = RequestMethod.POST)
	public ResponseResult<BannerDto> find(@RequestBody BannerDto banner) {

		BannerDto result = bannerService.find(banner);

		return new ResponseResult<BannerDto>(result);
	}

	/**
	 * 保存对象
	 *
	 * @param banner
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ResponseResult<BannerDto> save(@RequestBody BannerDto banner) {

		bannerService.save(banner);

		return new ResponseResult<BannerDto>(banner);
	}

	/**
	 * 根据主键删除对象
	 *
	 * @param banner
	 */
	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public ResponseResult<BannerDto> delete(@RequestBody BannerDto banner) {

		bannerService.delete(banner);

		return new ResponseResult<BannerDto>();
	}

	/**
	 * 根据主键修改
	 *
	 * @param banner
	 * @return
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ResponseResult<BannerDto> pageQuery(@RequestBody BannerDto banner) {

		bannerService.update(banner);

		return new ResponseResult<BannerDto>();
	}

	/**
	 * 查询列表
	 *
	 * @param banner
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public ResponseResult<List<BannerDto>> list(@RequestBody BannerDto banner) {

		List<BannerDto> result = bannerService.list(banner);

		return new ResponseResult<List<BannerDto>>(result);
	}

	/**
	 * 分页查询
	 *
	 * @param bannerPage
	 * @return
	 */
	@RequestMapping(value = "showPageQuery", method = RequestMethod.POST)
	public ResponseResult<PageQueryBean<BannerDto>> showPageQuery(@RequestBody PageQueryBean<BannerDto> bannerPage) {

		PageQueryBean<BannerDto> result = bannerService.showPageQuery(bannerPage);

		return new ResponseResult<PageQueryBean<BannerDto>>(result);
	}

}
