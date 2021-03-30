package com.info.csv.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.info.csv.ms.bean.OrdersInfo;
import com.info.csv.ms.service.CSVService;

@Controller
@RequestMapping("/")
public class CSVController {
	@Autowired
	CSVService csvService;
	
	@GetMapping
	public ResponseEntity<OrdersInfo> getOrdersInfo() throws ClassNotFoundException{
		return ResponseEntity.status(HttpStatus.OK).body(csvService.getOrdersInfo());
	}
}
