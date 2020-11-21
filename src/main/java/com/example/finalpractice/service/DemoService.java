package com.example.finalpractice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.finalpractice.repository.DemoRepository;

@Service
public class DemoService {

	@Autowired
	DemoRepository demoRepo;
}
