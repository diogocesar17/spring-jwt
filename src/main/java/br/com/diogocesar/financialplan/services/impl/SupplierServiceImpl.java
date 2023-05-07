package br.com.diogocesar.financialplan.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.diogocesar.financialplan.entities.Supplier;
import br.com.diogocesar.financialplan.repositories.SupplierRepository;
import br.com.diogocesar.financialplan.services.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository SupplierRepository;

    @Override
    public List<Supplier> findAll() {
        return SupplierRepository.findAll();
    }
    
}
