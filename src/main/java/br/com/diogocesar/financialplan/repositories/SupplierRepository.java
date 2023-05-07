package br.com.diogocesar.financialplan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.diogocesar.financialplan.entities.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
