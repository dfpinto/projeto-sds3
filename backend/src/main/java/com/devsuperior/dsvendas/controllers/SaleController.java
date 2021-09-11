package com.devsuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devsuperior.dsvendas.dtos.AmountSellerDTO;
import com.devsuperior.dsvendas.dtos.SaleDTO;
import com.devsuperior.dsvendas.dtos.SuccessTaxSellerDTO;
import com.devsuperior.dsvendas.services.SaleService;

@Controller
@RequestMapping("/sales")
public class SaleController {
	
	@Autowired
	private SaleService serviceSale;

	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> rsSeller = serviceSale.findAll(pageable);
		return ResponseEntity.ok(rsSeller);
	}

	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<AmountSellerDTO>> amountGroupBySeller(){
		return ResponseEntity.ok(serviceSale.amountGroupBySeller());
	}

	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SuccessTaxSellerDTO>> successTaxGroupBySeller(){
		return ResponseEntity.ok(serviceSale.successTaxGroupBySeller());
	}
}
