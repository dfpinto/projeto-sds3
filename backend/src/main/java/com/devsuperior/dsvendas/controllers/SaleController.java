package com.devsuperior.dsvendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devsuperior.dsvendas.dtos.SaleDTO;
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
}
