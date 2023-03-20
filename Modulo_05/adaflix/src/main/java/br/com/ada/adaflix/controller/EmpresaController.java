package br.com.ada.adaflix.controller;

import br.com.ada.adaflix.model.Empresa;
import br.com.ada.adaflix.service.EmpresaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpresaController {
   private final EmpresaService empresaService;

   public EmpresaController(EmpresaService empresaService) {

       this.empresaService = empresaService;
   }

   @PostMapping("/empresas")
    public Empresa salvar(@RequestBody Empresa empresa) {

       return empresaService.salvar(empresa);
   }

    @GetMapping("/empresas")
    public List<Empresa> listar() {
        return empresaService.listar();
    }

}
