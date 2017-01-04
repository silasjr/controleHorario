package br.com.silasjr.controlehorario.model;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.PeriodFormat;
import org.joda.time.format.PeriodFormatterBuilder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by silasjr on 03/01/17.
 */

public class Ponto {

    private Calendar dia = Calendar.getInstance();
    private int qtdHorasAlmoco = 1;
    private long qtdMinutosTrabalhoDia = 8 * 60;

    private List<Evento> eventos = new ArrayList<>();


    public void registrar(Evento evento) {
        this.eventos.add(evento);
    }

    public String tempoRestante() {

        DateTime entrada = new DateTime(2017, 1, 3, 8, 0, 0, 0);
        DateTime saida = new DateTime(2017, 1, 3, 12, 37, 0, 0);

        DateTime previsaoSaida = entrada.plusHours(9);
        System.out.println(previsaoSaida.toString(new DateTimeFormatterBuilder().appendClockhourOfDay(2).appendLiteral(":").appendMinuteOfDay(2).toFormatter()));

        Period period = new Period(entrada, saida);

        return period.toString(new PeriodFormatterBuilder().printZeroAlways()
                .minimumPrintedDigits(2)
                .appendHours().appendSeparator(":").appendMinutes().toFormatter());
    }

    public static void main(String... args) {
        Ponto ponto = new Ponto();
        String tempoRestante = ponto.tempoRestante();
        System.out.println(tempoRestante);
    }

}
