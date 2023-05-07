package br.com.diogocesar.financialplan.resources;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.diogocesar.financialplan.entities.Products;
import br.com.diogocesar.financialplan.repositories.ProductRepository;
import br.com.diogocesar.financialplan.services.ProductsService;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductsService productsService;

    @GetMapping("/product")
    @RolesAllowed("ADMIN")
    public List<Products> getProducts(){
       return (List<Products>) productRepository.findAll();
    }

    @DeleteMapping("/product/{id}")
    @RolesAllowed("ADMIN")
    public void delete(@PathVariable Long id){
      this.productRepository.deleteById(id);
    }

    
    @GetMapping("/findByCategoryName")
    @RolesAllowed("ADMIN")
    public List<Products> findProductsByCategoryName(String categoryName) {
        return productsService.findByCategoryName(categoryName);
    }

    @PostMapping("/product")
    @RolesAllowed("ADMIN")
    public ResponseEntity<Products> products(@RequestBody Products product) {
      return ResponseEntity.ok(productsService.saveProduct(product));
    }
}