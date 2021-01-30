package libroJava;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo!!");
		operaciones multiplicacion = new operaciones();
		System.out.println(multiplicacion.devolverResultado());
		
	}

}

class operaciones {
	int b;
	int r;
	int a;

	operaciones() {
		a = 4;
		b = 5;

	}
	
	public int devolverResultado() {
		return r = a *b;
	}
}