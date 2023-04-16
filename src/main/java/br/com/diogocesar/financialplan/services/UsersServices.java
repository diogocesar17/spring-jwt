package br.com.diogocesar.financialplan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.diogocesar.financialplan.entities.Usuario;
import br.com.diogocesar.financialplan.repositories.UsuarioRepository;

@Service
public class UsersServices {
    
    @Autowired
    private UsuarioRepository repository;

    @Transactional(rollbackFor = Exception.class)
    public String saveUser(Usuario user) {
        // user.setPassword(passwordEncoder.encode(user.getPassword()));
        

        return repository.save(user).getUsername();
    }

    @Transactional(rollbackFor = Exception.class)
    public Usuario findUser(String username) {        
        return repository.findByLogin(username);
    }

}
