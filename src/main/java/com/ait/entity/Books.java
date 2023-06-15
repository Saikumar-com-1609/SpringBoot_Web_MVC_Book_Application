package com.ait.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "book_tbl")
public class Books {

	@Id
	private Integer bookId;

	private String bookName;

	private Double bookPrice;

}
