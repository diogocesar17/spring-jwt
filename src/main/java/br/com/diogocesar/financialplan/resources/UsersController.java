package br.com.diogocesar.financialplan.resources;

import javax.annotation.security.RolesAllowed;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.diogocesar.financialplan.entities.Usuario;
import br.com.diogocesar.financialplan.services.UsersServices;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UsersController {
    

    private final UsersServices uServices;


    @PostMapping("/user")
    public ResponseEntity<?> postUser(@RequestBody Usuario user){

        uServices.saveUser(user);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/findUser")
    public ResponseEntity<Usuario> getUser(String username){

        Usuario user = uServices.findUser(username);
        return ResponseEntity.ok(user);
    }

}
