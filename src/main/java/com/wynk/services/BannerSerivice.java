package com.wynk.services;

import com.wynk.entities.Banner;

public interface BannerSerivice {
	
	Banner addBanner(Banner banner);
	
	Banner getBanner(Long id);
	
	Iterable<Banner> getBanners();
	
	Banner updateBanner(Long id, Banner banner);
	
	void deleteBanner(Long id);
}
