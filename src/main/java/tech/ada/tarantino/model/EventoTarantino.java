package tech.ada.tarantino.model;

import tech.ada.tarantino.dto.EventoDTO;

import java.time.LocalTime;

public class EventoTarantino {

    String movie;
    String eventType;
    String cursingWord;
    LocalTime minutesInMovie;

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

    public LocalTime getMinutesInMovie() {
        return minutesInMovie;
    }

    public void setMinutesInMovie(String minutesInMovie) {
        this.minutesInMovie = convertToTime(minutesInMovie);
    }

    public EventoTarantino convertToEventoTarantino(EventoDTO eventoDTO) {
        EventoTarantino evento = new EventoTarantino();
        evento.setMovie(eventoDTO.movie());
        evento.setEventType(eventoDTO.eventType());
        evento.setCursingWord(eventoDTO.cursingWord());
        evento.setMinutesInMovie(eventoDTO.minutesInMovie());
        return evento;
    }

    private static LocalTime convertToTime(String timeString) {
        String[] parts = timeString.split("\\.");
        int hoursInMinutes = Integer.parseInt(parts[0]);
        int hours;
        int minutes;
        if (hoursInMinutes >= 120) {
            hours = 2;
            minutes = hoursInMinutes - 120;
        } else if (hoursInMinutes >= 60) {
            hours = 1;
            minutes = hoursInMinutes - 60;
        } else {
            hours = hoursInMinutes / 60;
            minutes = hoursInMinutes;
        }
        int secondsInDecimal = Integer.parseInt(parts[1]);
        int seconds = (int) (secondsInDecimal * 0.6);
        return LocalTime.of(hours, minutes, seconds);
    }
}