package com.devsuperior.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dtos.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repositorySeller;
	
	public List<SellerDTO> findAll(){
		List<Seller> rsSeller = repositorySeller.findAll();
		return rsSeller.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}

