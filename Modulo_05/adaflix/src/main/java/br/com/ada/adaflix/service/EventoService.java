package br.com.ada.adaflix.service;

import br.com.ada.adaflix.model.Evento;
import br.com.ada.adaflix.repository.EventoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {
    private final EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository) {

        this.eventoRepository = eventoRepository;
    }

    public Evento salvar(Evento evento) {
        // Realizar validações...
        return eventoRepository.save(evento);
    }

    public List<Evento> listar() {
        System.out.println(eventoRepository.findAll());
        return (List<Evento>) eventoRepository.findAll();
    }

    public Evento buscarPorId(Long id) {
        System.out.println(eventoRepository.findById(id).orElse(null));
        return eventoRepository.findById(id).orElse(null);
    }
}