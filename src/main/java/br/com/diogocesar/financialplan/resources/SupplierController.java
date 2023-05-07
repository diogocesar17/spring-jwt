package br.com.diogocesar.financialplan.resources;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.diogocesar.financialplan.entities.Supplier;
import br.com.diogocesar.financialplan.services.SupplierService;

@Controller
@RequestMapping("/suppliers")
public class SupplierController {
    
    @Autowired
    private SupplierService supplierService;

    @GetMapping("/findAll")
    @RolesAllowed("ADMIN")
    public ResponseEntity<List<Supplier>> findAll() {
        return ResponseEntity.ok(supplierService.findAll());
    }
}
