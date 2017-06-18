package com.ishikawa.springdemo.repository;

import com.ishikawa.springdemo.model.BlogEntity;
import com.ishikawa.springdemo.model.UserEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Shpak on 18.06.2017.
 */
@RepositoryRestResource(/*collectionResourceRel = "user", */path = "users")
public interface UserRepositoryRest extends PagingAndSortingRepository<UserEntity, Integer> {

    List<UserEntity> findAll();

}