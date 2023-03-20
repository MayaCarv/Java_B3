package br.com.ada.adaflix.service;

import br.com.ada.adaflix.model.Empresa;
import br.com.ada.adaflix.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {

        this.empresaRepository = empresaRepository;
    }

    public Empresa salvar(Empresa empresa) {
        //Implementar regras de validação...
        return empresaRepository.save(empresa);
    }

    public List<Empresa> listar() {
        System.out.println(empresaRepository.findAll());
        return (List<Empresa>) empresaRepository.findAll();
    }
}
