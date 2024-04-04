package br.ada.projEstatisticas.models;

import br.ada.projEstatisticas.dto.EventoDTO;

import java.time.LocalTime;

public class EventoTarantino {

    String movie;
    String eventType;
    String cursingWord;
    // TODO: Mudar para LocalTime usando o Formatter
    String minutesInMovie;

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getCursingWord() {
        return cursingWord;
    }

    public void setCursingWord(String cursingWord) {
        this.cursingWord = cursingWord;
    }

    public String getMinutesInMovie() {
        return minutesInMovie;
    }

    public void setMinutesInMovie(String minutesInMovie) {
        this.minutesInMovie = minutesInMovie;
    }

    public EventoTarantino convertToEventoTarantino(EventoDTO eventoDTO) {
        EventoTarantino evento = new EventoTarantino();
        evento.setMovie(eventoDTO.movie());
        evento.setEventType(eventoDTO.eventType());
        evento.setCursingWord(eventoDTO.cursingWord());
        evento.setMinutesInMovie(eventoDTO.minutesInMovie());
        return evento;
    }
}