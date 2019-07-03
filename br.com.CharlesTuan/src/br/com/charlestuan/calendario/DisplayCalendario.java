package br.com.charlestuan.calendario;

import br.com.charlestuan.Display;
import br.com.charlestuan.Format;
import br.com.charlestuan.Index;

public class DisplayCalendario extends Display<Calendario> {
    	private Format<Calendario> data;
	private Calendario calendario;

	
	public DisplayCalendario(Calendario calendario, Format<Calendario> data){
            	this.data = data;
		this.calendario = calendario;

	}
	
	@Override
	public void show() {
		System.out.println("Dia" + " " + "Mês" + " " + "Ano");
		System.out.println(data.formatter(calendario));
		
	}

}
