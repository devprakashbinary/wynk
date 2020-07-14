package com.wynk.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.BooleanOperation;
import com.wynk.entities.Banner;
import com.wynk.entities.QBanner;
import com.wynk.exceptions.WynkServiceException;
import com.wynk.repositories.BannerRepository;



@Service
public class BannerServiceImpl implements BannerSerivice{
	
	@Autowired
	BannerRepository bannerRepository;
	
	@Autowired
	MessageByLocaleService messageByLocaleService;

	@Override
	public Banner addBanner(Banner banner){
		// TODO Auto-generated method stub
		return bannerRepository.save(banner);
	}

	@Override
	public Banner getBanner(Long id)  throws WynkServiceException{
		// TODO Auto-generated method stub
		BooleanExpression expression = QBanner.banner.id.eq(id);
		return bannerRepository.findOne(expression)
				.orElseThrow(()-> new com.wynk.exceptions.EntityNotFoundException(messageByLocaleService.getMessage("err.banner.notmatch", String.valueOf(id))));
	}

	@Override
	public Iterable<Banner> getBanners() {
		// TODO Auto-generated method stub
		BooleanOperation expression = (BooleanOperation)QBanner.banner.isDeleted.eq(false);
		return bannerRepository.findAll(expression);
	}

	@Override
	public Banner updateBanner(Long id, Banner banner)  throws WynkServiceException{
		banner.setId(id);
		// TODO Auto-generated method stub
		return bannerRepository.save(banner);
	}

	@Override
	public void deleteBanner(Long id) throws WynkServiceException {
		// TODO Auto-generated method stub
		Banner dbBanner = getBanner(id);
		dbBanner.setIsDeleted(true);;
		// TODO Auto-generated method stub
		 bannerRepository.save(dbBanner);
		
	}

	@Override
	public Iterable<Banner> getBannersForLang(Iterable<Long> langIds) throws WynkServiceException {
		// TODO Auto-generated method stub
		List<Banner> banners = new ArrayList<Banner>();  
		langIds.forEach((Long landId) -> {
			Banner dbBanner = bannerRepository.findOne(QBanner.banner.langId.eq(landId))
					.orElseThrow(()-> new com.wynk.exceptions.EntityNotFoundException(messageByLocaleService.getMessage("err.banner.notmatch", String.valueOf(landId))));
			banners.add(dbBanner);
		});
		return banners;
	}

}
