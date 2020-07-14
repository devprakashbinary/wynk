package com.wynk.services;

import com.wynk.entities.Banner;
import com.wynk.exceptions.WynkServiceException;

public interface BannerSerivice {
	
	Banner addBanner(Banner banner);
	
	Banner getBanner(Long id) throws WynkServiceException;
	
	Iterable<Banner> getBanners();
	
	Iterable<Banner> getBannersForLang(Iterable<Long> langIds) throws WynkServiceException;
	
	Banner updateBanner(Long id, Banner banner) throws WynkServiceException;
	
	void deleteBanner(Long id) throws WynkServiceException;
}
