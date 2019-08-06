package com.ishare.demo.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.ishare.demo.model.User;

public interface UserClassRepository extends PagingAndSortingRepository<User, Long>{

	@Query(nativeQuery = true, 
			value = "select a.*,b.class_name from user a,class b ,user_class_rela c where a.id=c.user_id and c.class_id=b.class_id and a.id=:user",
			countQuery ="select count(*) from user a,class b ,user_class_rela c where a.id=c.user_id and c.class_id=b.class_id and a.id=:user" )
    public Page<Object> findUserClassList(@Param("user") Integer user,Pageable pageable);
}
