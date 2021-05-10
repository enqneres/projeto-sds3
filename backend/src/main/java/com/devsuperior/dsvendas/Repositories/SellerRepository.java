package com.devsuperior.dsvendas.Repositories;

import com.devsuperior.dsvendas.Entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
