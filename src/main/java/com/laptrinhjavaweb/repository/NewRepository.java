package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.NewEntity;

//@Repository: Không cần vì "JpaRepository" đã có rồi
public interface NewRepository extends JpaRepository<NewEntity, Long> {

}
