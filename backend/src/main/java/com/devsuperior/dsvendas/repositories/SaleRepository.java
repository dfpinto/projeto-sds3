package com.devsuperior.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsvendas.dtos.AmountSellerDTO;
import com.devsuperior.dsvendas.dtos.SuccessTaxSellerDTO;
import com.devsuperior.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long>{

	//@Query("SELECT obj FROM Sale obj JOIN FETCH obj.seller")
	//Page<Sale> findSales(Pageable pageable);
	
	@Query("SELECT new com.devsuperior.dsvendas.dtos.AmountSellerDTO(obj.seller, SUM(obj.amount)) FROM Sale obj GROUP BY obj.seller")
	List<AmountSellerDTO> amountGroupBySeller();

	@Query("SELECT new com.devsuperior.dsvendas.dtos.SuccessTaxSellerDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) FROM Sale obj GROUP BY obj.seller")
	List<SuccessTaxSellerDTO> successTaxGroupBySeller();
}
