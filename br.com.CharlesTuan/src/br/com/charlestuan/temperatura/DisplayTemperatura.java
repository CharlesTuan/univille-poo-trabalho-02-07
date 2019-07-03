package br.com.charlestuan.temperatura;

import br.com.charlestuan.Display;
import br.com.charlestuan.Format;

public class DisplayTemperatura extends Display<Temperatura> {
	private Temperatura temperatura;
	private Format<Temperatura> temperaturaFormatter;
	
	public DisplayTemperatura(Temperatura temperatura, Format<Temperatura> temperaturaFormat){
		this.temperatura = temperatura;
		this.temperaturaFormatter = temperaturaFormat;
	}
	@Override
	public void show() {
		System.out.println(temperaturaFormatter.formatter(temperatura));
	}
}
