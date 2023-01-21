package br.com.ada.business.controller;

import br.com.ada.business.dto.UsuarioRequestDTO;
import br.com.ada.business.model.Usuario;
import br.com.ada.business.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public Usuario salvar(@RequestBody UsuarioRequestDTO usuario) {
        Usuario usuarioSalvo = null;
        try {
            usuarioSalvo = usuarioService.salvar(usuario);
        } catch (IllegalArgumentException | ParseException exception) {
            System.out.println("CFP já existe");
        }
        return usuarioSalvo;
    }

    @GetMapping
    public List<Usuario>listar() {
        return usuarioService.listar();
    }

    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable Long id) {
        return usuarioService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        usuarioService.remover(id);
    }
}
