package com.ishare.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ishare.demo.model.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    User findById(long id);

    void deleteById(Long id);
}