package br.com.ada.business.service;

import br.com.ada.business.dto.UsuarioRequestDTO;
import br.com.ada.business.model.Usuario;
import br.com.ada.business.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

//    public Usuario salvar(UsuarioRequestDTO usuarioDTO) throws ParseException {
//        Usuario usuarioEncontrado = usuarioRepository.findByCpf(usuarioDTO.getCpf());
//        if (usuarioEncontrado != null) {
//            throw new IllegalArgumentException();
//        }
//        Usuario usuario = new Usuario();
//        usuario.setNome(usuarioDTO.getNome());
//        usuario.setTelefone(usuarioDTO.getTelefone());
//        usuario.setCpf(usuarioDTO.getCpf());
//        usuario.setEmail(usuarioDTO.getEmail());
//        usuario.setCep(usuarioDTO.getCep());
//        usuario.setLogradouro(usuarioDTO.getLogradouro());
//        usuario.setCasa(usuarioDTO.getCasa());
//        usuario.setBairro(usuarioDTO.getBairro());
//        usuario.setCidade(usuarioDTO.getCidade());
//        usuario.setEstado(usuarioDTO.getEstado());
//
//        return usuarioRepository.save(usuario);
//    }

    public Usuario salvar(UsuarioRequestDTO usuarioDTO) throws ParseException {
        Usuario usuarioEncontrado = usuarioRepository.findByCpf(usuarioDTO.getCpf());
        if (usuarioEncontrado != null) {
            throw new IllegalArgumentException();
        }
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioDTO.getNome());
        usuario.setTelefone(usuarioDTO.getTelefone());
        usuario.setCpf(usuarioDTO.getCpf());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setCep(usuarioDTO.getCep());
        usuario.setLogradouro(usuarioDTO.getLogradouro());
        usuario.setCasa(usuarioDTO.getCasa());
        usuario.setBairro(usuarioDTO.getBairro());
        usuario.setCidade(usuarioDTO.getCidade());
        usuario.setEstado(usuarioDTO.getEstado());

        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listar() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public void remover(Long id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
        }
    }
}
