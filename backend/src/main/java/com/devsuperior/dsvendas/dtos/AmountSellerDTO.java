package com.devsuperior.dsvendas.dtos;

import com.devsuperior.dsvendas.entities.Seller;

public class AmountSellerDTO {

	private String sellerName;
	private Double amount;
	
	public AmountSellerDTO() {
	}
	
	public AmountSellerDTO(Seller seller, Double amount) {
		this.sellerName = seller.getName();
		this.amount = amount;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
