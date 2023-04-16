package br.com.diogocesar.financialplan.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.diogocesar.financialplan.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
