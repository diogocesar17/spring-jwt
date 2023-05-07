package br.com.diogocesar.financialplan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.diogocesar.financialplan.entities.Categories;
import br.com.diogocesar.financialplan.repositories.CategoriesRepository;

@Service
public class CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    public List<Categories> findAllCategories() {
        return categoriesRepository.findAll();
    }

    public Categories newCategory(Categories category) {
        return categoriesRepository.save(category);
    }

    public void delete(Long id) {
        categoriesRepository.deleteById(id);
    }
    
}
