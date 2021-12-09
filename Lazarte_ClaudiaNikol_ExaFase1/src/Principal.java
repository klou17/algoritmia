
public class Principal {

	public static void main(String[] args) {
	
		Bolsa<Jugador> equipo = new Bolsa <Jugador>(5);
		equipo.insertar(new Nacional ("RJ",50,5));
		equipo.insertar(new Internacional ("AB",500,2));
		equipo.insertar(new Nacional ("XY",1000,12));
		equipo.insertar(new Internacional ("LD",800,9));
		
		/*
		 
		Object o []=equipo.extremos();
		
		//estoy casteando al poner (Jugador)
		Jugador min=((Jugador) o[0]);
		Jugador may=((Jugador) o[1]);
		
		System.out.println("Menor: "+min);
		System.out.println("Mayor: "+may);
		
		*/
		System.out.println("Mayor sueldo: \n"+equipo.mayorItem());
		listar(equipo);
	}
	
	//es generica con el T extends, acepta todo tipo de variable
	//si solo quisiera de Jugador seria:   public static void listar(Bolsa <Jugador> b)
	public static <T extends Comparable<T>>  void listar(Bolsa <T> b) {
		System.out.println(b); //se ejecuta el toString de Bolsa
	}

}
