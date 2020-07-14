package com.wynk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wynk.entities.Banner;

import io.swagger.annotations.Api;

@Transactional
@Repository
@Api(value="Fetch banners")
public interface BannerRepository extends JpaRepository<Banner, Long> , QuerydslPredicateExecutor<Banner>{

}
