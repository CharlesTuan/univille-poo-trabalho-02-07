package br.com.charlestuan.radio;

import br.com.charlestuan.Display;
import br.com.charlestuan.Format;
import br.com.charlestuan.Index;

public class DisplayRadio extends Display<Radio>{
	private Radio radio;
	private Format<Radio> radioFormat;
	
	public DisplayRadio(Radio radio, Format<Radio> radioFormat){
		this.radio = radio;
		this.radioFormat = radioFormat;
	}
	
	@Override
	public void show() {
		System.out.println(radioFormat.formatter(radio));
	}

}
