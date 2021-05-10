package com.devsuperior.dsvendas.Repositories;

import com.devsuperior.dsvendas.Entities.Sale;
import com.devsuperior.dsvendas.Entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
