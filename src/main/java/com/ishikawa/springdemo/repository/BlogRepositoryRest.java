package com.ishikawa.springdemo.repository;

import java.util.List;

import com.ishikawa.springdemo.model.BlogEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Shpak on 18.06.2017.
 */
@RepositoryRestResource(/*collectionResourceRel = "blog", */path = "blogs")
public interface BlogRepositoryRest extends PagingAndSortingRepository<BlogEntity, Integer> {

    List<BlogEntity> findAll();

}