package br.com.diogocesar.financialplan.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.diogocesar.financialplan.entities.Product;
import br.com.diogocesar.financialplan.repositories.ProductRepository;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/product")
    public void saveProduct(@RequestBody Product product){
        this.productRepository.save(product);
    }

    @GetMapping("/product")
    @RolesAllowed("ADMIN")
    public List<Product> getProducts(){
       return (List<Product>) productRepository.findAll();
    }

    @DeleteMapping("/product/{id}")
    @RolesAllowed("ROLE_ADMIN")
    public void delete(@PathVariable Long id){
      this.productRepository.deleteById(id);
    }

}