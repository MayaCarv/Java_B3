package br.com.ada.business.repository;

import br.com.ada.business.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    Usuario findByCpf(String cpf);
}
