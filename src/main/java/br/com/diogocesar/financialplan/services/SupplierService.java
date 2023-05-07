package br.com.diogocesar.financialplan.services;

import java.util.List;

import br.com.diogocesar.financialplan.entities.Supplier;

public interface SupplierService {
    
    List<Supplier> findAll();

}
