package br.com.charlestuan;

import br.com.charlestuan.calendario.Calendario;
import br.com.charlestuan.calendario.CalendarioFormatter;
import br.com.charlestuan.calendario.DisplayCalendario;
import br.com.charlestuan.radio.DisplayRadio;
import br.com.charlestuan.temperatura.DisplayTemperatura;
import br.com.charlestuan.relogio.DisplayTime;
import br.com.charlestuan.relogio.Horario;
import br.com.charlestuan.radio.Radio;
import br.com.charlestuan.radio.RadioFormat;
import br.com.charlestuan.temperatura.Temperatura;
import br.com.charlestuan.temperatura.TemperaturaFormat;
import br.com.charlestuan.relogio.TimeFormat;

public class Index {

	public static void main(String[] args) {	
		//Radio FM
		System.out.println("Rádio FM: Estação sintonizada.");
		Radio radio = new Radio();
		radio.setEstacao((float)89.1);
		radio.setFrequenca("AM");
		Format<Radio> radioFormat = new RadioFormat();
		Display<Radio> radioDisplay = new DisplayRadio(radio, radioFormat);
		radioDisplay.show();
		//
                
		//Relógio
		System.out.println("\nRádio relógio: Hora em formato 24 horas.");
		Horario hora = new Horario();
		hora.setHora(22);
		hora.setMinuto(20);
		Format<Horario> time = new TimeFormat();
		Display<Horario> relogio = new DisplayTime(hora, time);
		relogio.show();
		//
                
		//Termômetro
		System.out.println("\nTemperatura: Em graus Celsius");
		Temperatura temperatura = new Temperatura();
		temperatura.setTemperatura((float)18.0);
		temperatura.setEscala("C");
		Format<Temperatura> temperaturaFormat = new TemperaturaFormat();
		Display<Temperatura> temperaturaDisplay = new DisplayTemperatura(temperatura, temperaturaFormat);
		temperaturaDisplay.show();
		//
	
		//Calendário
		System.out.println("\nCalendário: Dia, mês e ano.");
		Calendario data = new Calendario();
                
                data.setDia(13);
		data.setMes(10);
		data.setAno(2019);

		Format<Calendario> calendario = new CalendarioFormatter();
		Display<Calendario> display = new DisplayCalendario(data, calendario);
		display.show();
	}
}
