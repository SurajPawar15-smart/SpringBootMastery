package com.suraj.bookapp;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {

	@Override
	public List<String> getAll() {
		// TODO Auto-generated method stub
		return List.of("Java","Spring","Microservices");
	}

}
