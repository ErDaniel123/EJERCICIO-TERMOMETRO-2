package PACKAGE_TERMOMETRO_2;

import java.util.Arrays;

public class Termometro {

	
	private float temperaturas[];
	
	private int posicion;
	private int contador;
	
	public Termometro () {
		
		
		temperaturas=new float[7];
		contador=0;
		
		
	}
	
	public void rellenarTemperaturas(float temperatura) {
		
if(contador==temperaturas.length) {
			
			contador=0;
			
		}

		temperaturas[contador]=temperatura;
		contador++;
		
	
		
	}

	
	public String toString() {
		return "Temperaturas = " + Arrays.toString(temperaturas) + "]";
	}
	
	public void cambiarT(float temperatura,char dia) {
		
		contador=dia;
		
		if(dia=='L') {
			
			contador=0;
			
		}
		
if(dia=='M') {
			
			contador=1;
			
		}

if(dia=='X') {
	
	contador=2;
	
}



if(dia=='J') {
	
	contador=3;
	
}

if(dia=='V') {
	
	contador=4;
	
}



if(dia=='S') {
	
	contador=5;
	
}


if(dia=='D') {
	
	contador=6;
	
}












temperaturas[contador]=temperatura;
	contador++;


		
	}
	
	public int buscarT(float temperatura) {
	  boolean encontrado =false;
		 posicion=-1;
		int i=0;
		
			while(!encontrado & i<temperaturas.length) {
			if(temperaturas[i]==temperatura) {
			
				
			posicion=i;
			encontrado=true;
			}
			i++;
			}
		
		
		return posicion;
	
	
	}
	
	
	
	
	
	
	
	
	
}
