package br.com.diogocesar.financialplan.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.diogocesar.financialplan.entities.Categories;
import br.com.diogocesar.financialplan.entities.Products;
import br.com.diogocesar.financialplan.repositories.CategoriesRepository;
import br.com.diogocesar.financialplan.repositories.ProductRepository;

@Service
public class ProductsService {
    
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoriesRepository categoriesRepository;

    public List<Products> findByCategoryName(String categoryName) {
        return productRepository.findByCategories_Name(categoryName);
    }

    public Products saveProduct(Products product) {

        Optional<Categories> categoryOptional = categoriesRepository.findById(product.getCategories().getId());

        if(categoryOptional.isPresent()) {
            Categories category = categoryOptional.get();
            product.setCategory(category);
            return productRepository.save(product);
        } else {
            throw new RuntimeException("Category with ID " + product.getCategories().getId() + " not found");
        }
    }
}
