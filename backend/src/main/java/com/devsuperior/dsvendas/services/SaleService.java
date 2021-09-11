package com.devsuperior.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.dtos.AmountSellerDTO;
import com.devsuperior.dsvendas.dtos.SaleDTO;
import com.devsuperior.dsvendas.dtos.SuccessTaxSellerDTO;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repositorySale;

	@Autowired
	private SellerRepository repositorySeller;
	
	@Transactional(readOnly = true) // o cache abaixo só funciona com essa anotação
	public Page<SaleDTO> findAll(Pageable pageable){
		repositorySeller.findAll(); // Joga os vendedores pro cache do hibernate. Fiz isso pelo número reduzido de vendedores. 
		return repositorySale.findAll(pageable).map(x -> new SaleDTO(x));
	}

	@Transactional(readOnly = true)
	public List<AmountSellerDTO> amountGroupBySeller(){
		return repositorySale.amountGroupBySeller();
	}

	@Transactional(readOnly = true)
	public List<SuccessTaxSellerDTO> successTaxGroupBySeller(){
		return repositorySale.successTaxGroupBySeller();
	}
}

