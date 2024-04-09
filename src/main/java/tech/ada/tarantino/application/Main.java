package tech.ada.tarantino.application;

import tech.ada.tarantino.model.EventoTarantino;
import tech.ada.tarantino.repository.ParticipanteRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String caminho = "resources/tarantino.csv";
        List<EventoTarantino> eventos = ParticipanteRepository.carregarBaseDeDados(caminho);
        System.out.println(eventos.size());
    }
}