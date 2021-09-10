package com.devsuperior.dsvendas.dtos;

import java.io.Serializable;
import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Sale;

public class SaleDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	private SellerDTO seller;
	
	public SaleDTO() {
	}

	public SaleDTO(Sale sale) {
		this.id = sale.getId();
	    this.name = sale.getName();
		this.visited = sale.getVisited();
		this.deals = sale.getDeals();
		this.amount = sale.getAmount();
		this.date = sale.getDate();
		this.seller = new SellerDTO(sale.getSeller());
	}
	
	public SellerDTO getSeller() {
		return seller;
	}

	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
