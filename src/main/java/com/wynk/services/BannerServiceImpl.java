package com.wynk.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wynk.entities.Banner;
import com.wynk.repositories.BannerRepository;



@Service
public class BannerServiceImpl implements BannerSerivice{
	
	@Autowired
	BannerRepository bannerRepository; 

	@Override
	public Banner addBanner(Banner banner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Banner getBanner(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Banner> getBanners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Banner updateBanner(Long id, Banner banner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBanner(Long id) {
		// TODO Auto-generated method stub
		
	}

}
