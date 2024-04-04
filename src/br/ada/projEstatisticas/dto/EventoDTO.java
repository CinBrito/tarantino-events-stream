package br.ada.projEstatisticas.dto;

import java.time.LocalTime;

public record EventoDTO(String movie, String eventType, String cursingWord, String minutesInMovie) {

    public static EventoDTO converterEmDTO(String linha) {
        String[] campos = linha.split(",");
        EventoDTO eventoDTO = new EventoDTO(campos[0], campos[1], campos[2], campos[3]);
        return eventoDTO;
    }
}
