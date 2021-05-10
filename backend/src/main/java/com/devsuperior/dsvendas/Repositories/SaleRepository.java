package com.devsuperior.dsvendas.Repositories;

import com.devsuperior.dsvendas.Dto.SaleSucessDTO;
import com.devsuperior.dsvendas.Dto.SaleSumDTO;
import com.devsuperior.dsvendas.Entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.devsuperior.dsvendas.Dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
            + "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.devsuperior.dsvendas.Dto.SaleSucessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
            + "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSucessDTO> sucessGroupedBySeller();
}


