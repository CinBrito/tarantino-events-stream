package br.ada.projEstatisticas.app;

import br.ada.projEstatisticas.models.EventoTarantino;
import br.ada.projEstatisticas.repository.ParticipanteRepository;

import java.util.List;


public class App {

    public static void main(String[] args) {

        String caminho = "F:\\Users\\Cintia\\Documents\\FuturoTECH\\SantCoders\\Modulo_04\\projFinal_mod04\\src\\br\\ada\\projEstatisticas\\util\\tarantino.csv";
        List<EventoTarantino> eventos = ParticipanteRepository.carregarBaseDeDados(caminho);
        System.out.println(eventos.size());  }


}
