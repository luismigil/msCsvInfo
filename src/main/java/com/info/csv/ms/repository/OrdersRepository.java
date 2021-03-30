package com.info.csv.ms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info.csv.ms.model.Orders;


public interface OrdersRepository extends JpaRepository<Orders, Long>{
	
	List<Object[]> getRegionsCount();
	List<Object[]> getCountriesCount();
	List<Object[]> getItemTypesCount();
	List<Object[]> getSalesChannelsCount();
	List<Object[]> getOrderPrioritiesCount();
}
