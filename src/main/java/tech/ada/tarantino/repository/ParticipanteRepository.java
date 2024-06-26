package tech.ada.tarantino.repository;

import tech.ada.tarantino.dto.EventoDTO;
import tech.ada.tarantino.model.EventoTarantino;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static tech.ada.tarantino.dto.EventoDTO.converterEmDTO;

public class ParticipanteRepository {
    String caminho;

    public ParticipanteRepository(String caminho) {
        this.caminho = caminho;
    }

    public static List<EventoTarantino> carregarBaseDeDados(String caminho) {
        List<EventoTarantino> eventos = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(caminho);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;
            // Criar participante para cada linha do arquivo
            while ((linha = bufferedReader.readLine()) != null) {
                EventoDTO eventoDTO = converterEmDTO(linha);
                EventoTarantino evento = new EventoTarantino().convertToEventoTarantino(eventoDTO);
                eventos.add(evento);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            // Tratar exceções de leitura de arquivo (??)
            e.printStackTrace();
        }

        return eventos;
    }

}
