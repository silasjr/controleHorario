package br.com.silasjr.controlehorario.model;

import java.util.Calendar;

/**
 * Created by silasjr on 03/01/17.
 */

public class Evento {

    private Long id;

    private int hora;

    private int minuto;

    public Long getId() {
        return id;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
}
