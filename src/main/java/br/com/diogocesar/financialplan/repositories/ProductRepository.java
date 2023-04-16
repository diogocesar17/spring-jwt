package br.com.diogocesar.financialplan.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.diogocesar.financialplan.entities.Products;

@Repository
public interface ProductRepository extends CrudRepository<Products, Long> {
    
    List<Products> findByCategories_Name(@Param("categoryName") String categoryName);

}
