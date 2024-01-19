package PACKAGE_TERMOMETRO_2;

public class Start {

	public static void main(String [] args) {
	Termometro t = new Termometro();
	t.rellenarTemperaturas(1);
	t.rellenarTemperaturas(1);
	t.rellenarTemperaturas(1);
	t.rellenarTemperaturas(1);
	t.rellenarTemperaturas(1);
	t.rellenarTemperaturas(1);
	t.rellenarTemperaturas(1);
	t.rellenarTemperaturas(3);
	t.rellenarTemperaturas(2);
	t.rellenarTemperaturas(2);
t.rellenarTemperaturas(3);
t.cambiarT(4.4f, 'X');	
System.out.println(t);
	System.out.println("La temperatura del dia deseado es de "+t.getT('L'));
	System.out.println(t.buscarT(3f));
	}
	
	
	
}
