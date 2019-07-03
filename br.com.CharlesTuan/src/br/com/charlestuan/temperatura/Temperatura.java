package br.com.charlestuan.temperatura;

public class Temperatura {
	protected float temperatura;
	protected String celsius;

	public String getEscala() {
		return celsius;
	}

	public void setEscala(String escala) {
		this.celsius = escala;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	
	
}
