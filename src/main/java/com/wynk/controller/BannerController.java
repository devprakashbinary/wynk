package com.wynk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.wynk.entities.Banner;
import com.wynk.exceptions.WynkServiceException;
import com.wynk.services.BannerSerivice;
import com.wynk.views.BannerView.BannerBasicView;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
@Api(value ="Banner CRUD Operation")
public class BannerController {

	@Autowired
	BannerSerivice bannerService;
	
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Banner successfully registered"),
	        @ApiResponse(code = 401, message = "You are not authorized to add banner"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
	        @ApiResponse(code = 400, message = "Bad Request")
		}
	)
	
	@ApiOperation(value = "Add Music banner")
	@PostMapping(value = "/banners")
	@JsonView(BannerBasicView.class)
	public Banner addBanner(@RequestBody Banner banner) {
		return bannerService.addBanner(banner);
	}
	
	
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully get all Banners"),
	        @ApiResponse(code = 401, message = "You are not authorized to get all Agent details"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
	        @ApiResponse(code = 400, message = "Bad Request")
		}
	)
	
	@ApiOperation(value = "get all Music banner")
	@GetMapping(value = "/banners")
	@JsonView(BannerBasicView.class)
	
	public Iterable<Banner> getBanner() {
		return bannerService.getBanners();
	}
	
	
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully get  Banner"),
	        @ApiResponse(code = 401, message = "You are not authorized to get all Agent details"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
	        @ApiResponse(code = 400, message = "Bad Request")
		}
	)
	
	@ApiOperation(value = "get Music banner")
	@GetMapping(value = "/banners/{bannerId}")
	@JsonView(BannerBasicView.class)
	
	public Banner getBanner(@PathVariable(value = "bannerId") Long id) throws WynkServiceException{
		return bannerService.getBanner(id);
	}
	
	
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully updated  Banner"),
	        @ApiResponse(code = 401, message = "You are not authorized to get all Agent details"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
	        @ApiResponse(code = 400, message = "Bad Request")
		}
	)
	
	@ApiOperation(value = "Add Music banner")
	@PutMapping(value = "/banners/{bannerId}")
	@JsonView(BannerBasicView.class)
	
	public Banner updateBanner(@PathVariable(value = "bannerId") Long id, @RequestBody Banner banner) throws WynkServiceException{
		return bannerService.updateBanner(id, banner);
	}
	
	
	
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully updated  Banner"),
	        @ApiResponse(code = 401, message = "You are not authorized to get all Agent details"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
	        @ApiResponse(code = 400, message = "Bad Request")
		}
	)
	
	@ApiOperation(value = "Delete Music banner")
	@DeleteMapping(value = "/banners/{bannerId}")
	public void deleteBanner(@PathVariable(value = "bannerId") Long id) throws WynkServiceException{
		bannerService.deleteBanner(id);
	}
	
	
//	@ApiResponses(value = {
//	        @ApiResponse(code = 200, message = "Successfully get all required  Banner"),
//	        @ApiResponse(code = 401, message = "You are not authorized to get all Agent details"),
//	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
//	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
//	        @ApiResponse(code = 400, message = "Bad Request")
//		}
//	)
//	
//	@ApiOperation(value = "Get all Music banner for selected lang")
//	@GetMapping(value = "/banners")
//	
//	public Iterable<Banner> getBannersForLang( @RequestBody Iterable<Long> langIds) throws WynkServiceException{
//		return bannerService.getBannersForLang(langIds);
//	}
	
}
