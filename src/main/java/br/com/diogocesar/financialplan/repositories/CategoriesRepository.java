package br.com.diogocesar.financialplan.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.diogocesar.financialplan.entities.Categories;
import br.com.diogocesar.financialplan.entities.Products;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Long> {
}
