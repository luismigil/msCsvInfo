package com.info.csv.ms.bean;

import java.util.List;

public class OrdersInfo {
	
	private List<InfoField> regions;
	private List<InfoField> countries;
	private List<InfoField> itemType;
	private List<InfoField> salesChannel;
	private List<InfoField> orderPriority;

	public OrdersInfo() {
		super();
	}


	public OrdersInfo(List<InfoField> regions, List<InfoField> countries, List<InfoField> itemType,
			List<InfoField> salesChannel, List<InfoField> orderPriotiy) {
		super();
		this.regions = regions;
		this.countries = countries;
		this.itemType = itemType;
		this.salesChannel = salesChannel;
		this.orderPriority = orderPriotiy;
	}


	public List<InfoField> getRegions() {
		return regions;
	}

	public void setRegions(List<InfoField> regions) {
		this.regions = regions;
	}

	public List<InfoField> getCountries() {
		return countries;
	}

	public void setCountries(List<InfoField> countries) {
		this.countries = countries;
	}

	public List<InfoField> getItemType() {
		return itemType;
	}

	public void setItemType(List<InfoField> itemType) {
		this.itemType = itemType;
	}

	public List<InfoField> getSalesChannel() {
		return salesChannel;
	}

	public void setSalesChannel(List<InfoField> salesChannel) {
		this.salesChannel = salesChannel;
	}

	public List<InfoField> getOrderPriotiy() {
		return orderPriority;
	}

	public void setOrderPriotiy(List<InfoField> orderPriotiy) {
		this.orderPriority = orderPriotiy;
	}
}
