package com.book.proj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.book.proj.dto.BookDTO.BookDTOBuilder;

//import lombok.Builder;
import lombok.Data;


@Data
@Entity
@Table(name="lib")
public class Book {
	
	@Id
	@Column(name="name")
	private String name;
	
	@Column(name="gu_name")
	private String gu_name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="tel")
	private String tel;

    public static BookDTOBuilder builder() {
        // TODO Auto-generated method stub
        return null;
    }
	
//	@Builder
//	public Book(String name, String gu_name, String address, String tel) {
//		this.name = name;
//		this.gu_name = gu_name;
//		this.address = address;
//		this.tel = tel;
//	}
	
	
}
