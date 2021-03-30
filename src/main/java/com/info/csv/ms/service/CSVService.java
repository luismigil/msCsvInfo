package com.info.csv.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.csv.ms.bean.OrdersInfo;
import com.info.csv.ms.helper.CSVOrdersHelper;
import com.info.csv.ms.repository.OrdersRepository;

@Service
public class CSVService {

	@Autowired
	OrdersRepository ordersRepository;
	
	public OrdersInfo getOrdersInfo() throws ClassNotFoundException {
		
		
		OrdersInfo ordersInfo = new OrdersInfo(
				CSVOrdersHelper.parseToInfoField(ordersRepository.getRegionsCount()),
				CSVOrdersHelper.parseToInfoField(ordersRepository.getCountriesCount()),
				CSVOrdersHelper.parseToInfoField(ordersRepository.getItemTypesCount()),
				CSVOrdersHelper.parseToInfoField(ordersRepository.getSalesChannelsCount()),
				CSVOrdersHelper.parseToInfoField(ordersRepository.getOrderPrioritiesCount())
				);
		return ordersInfo;
	}
}
