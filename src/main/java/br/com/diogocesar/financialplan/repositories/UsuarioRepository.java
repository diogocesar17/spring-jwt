package br.com.diogocesar.financialplan.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.diogocesar.financialplan.entities.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findByLogin(String login);

}
