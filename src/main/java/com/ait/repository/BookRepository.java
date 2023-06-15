package com.ait.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ait.entity.Books;

public interface BookRepository extends JpaRepository<Books,Integer> {
	

}
