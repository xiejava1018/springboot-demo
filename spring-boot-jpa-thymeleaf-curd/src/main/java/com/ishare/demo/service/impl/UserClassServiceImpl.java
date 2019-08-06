package com.ishare.demo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ishare.demo.repository.UserClassRepository;
import com.ishare.demo.service.UserClassService;

@Service
public class UserClassServiceImpl implements UserClassService{

	@Autowired
	private UserClassRepository userClassRepository;

	public Page<Object> getUserClass(Integer userId,Pageable pageable) {
		Page<Object> result = userClassRepository.findUserClassList(userId,pageable);
		return result;
	}
}
