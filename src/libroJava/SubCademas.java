package libroJava;

public class SubCademas {

	public SubCademas() {
		// TODO Auto-generated constructor stub
		String cadena = "Busca lo que te haga feliz,\n si no lo encuentras sige buscando";
		System.out.println("La cadena original es: "+ cadena );
		System.out.println( "La sub cadena del 2 al 10 es:" + cadena.substring(0,cadena.length()/2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubCademas subCadenas =new  SubCademas();
		
	}

}
