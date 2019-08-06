package com.ishare.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserClassService {
	public Page<Object> getUserClass(Integer userId,Pageable pageable);
}
