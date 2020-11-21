package com.example.finalpractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.finalpractice.service.DemoService;

@RestController
public class DemoController {

	@Autowired
	DemoService demoService;
}
