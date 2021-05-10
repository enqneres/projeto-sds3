package com.devsuperior.dsvendas.Service;

import com.devsuperior.dsvendas.Dto.SaleDTO;
import com.devsuperior.dsvendas.Dto.SaleSucessDTO;
import com.devsuperior.dsvendas.Dto.SaleSumDTO;
import com.devsuperior.dsvendas.Entities.Sale;
import com.devsuperior.dsvendas.Entities.Seller;
import com.devsuperior.dsvendas.Repositories.SaleRepository;
import com.devsuperior.dsvendas.Repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;


    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller() {
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSucessDTO> sucessGroupedBySeller() {
        return repository.sucessGroupedBySeller();
    }
}
