package br.com.charlestuan.calendario;

import br.com.charlestuan.Format;

public class CalendarioFormatter implements Format<Calendario>{

	@Override
	public String formatter(Calendario value) {
		String calendario = new String();
		if(value.mes == 0) {
			calendario = "Mês inválido";
			return calendario;
		}else if(value.mes > 10){
			calendario = value.dia + "   "+ value.mes + "  " + value.ano;
			return calendario;
		}else {
			calendario = value.dia + "  " + ""  + value.mes + "  " + value.ano;
			return calendario;
		}
		
	}

}
