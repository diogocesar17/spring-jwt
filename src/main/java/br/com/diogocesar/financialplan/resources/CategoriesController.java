package br.com.diogocesar.financialplan.resources;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.diogocesar.financialplan.entities.Categories;
import br.com.diogocesar.financialplan.entities.Products;
import br.com.diogocesar.financialplan.services.CategoriesService;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

    @Autowired
    private CategoriesService categoriesService;

    @GetMapping("/findAll")
    @RolesAllowed("ADMIN")
    public List<Categories> findAll() {
        return categoriesService.findAllCategories();
    }
    
}
