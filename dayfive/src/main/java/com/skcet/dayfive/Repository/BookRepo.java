package com.skcet.dayfive.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.dayfive.Model.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

	
}
