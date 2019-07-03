package br.com.charlestuan.temperatura;

import br.com.charlestuan.Format;

public class TemperaturaFormat implements Format<Temperatura>{

	@Override
	public String formatter(Temperatura value) {
		String temperatura = new String();
		temperatura = value.temperatura + "°" + value.celsius;
		return temperatura;
	}

}
