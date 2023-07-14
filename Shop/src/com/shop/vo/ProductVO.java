package com.shop.vo;

public class ProductVO {
	
	private int prodNo;
	private String prodName;
	private int Price;
	private int Stock;
	private String company;
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public int getProdNo() {
		return prodNo;
	}
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int Price) {
		this.Price = Price;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int Stock) {
		this.Stock = Stock;
	}
	
	

	@Override
	public String toString() {
		return prodNo +","+ prodName +","+ Stock +","+ Price +","+ company;
	}
	
	
	
	
}
