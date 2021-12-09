
public class Tipo {
	static boolean esEquilatero(Triangulo t) {
		double e1e3 = Coordenada.distancia(t.getEsquina1(), t.getEsquina3());
		double e1e2 = Coordenada.distancia(t.getEsquina1(), t.getEsquina2());
		double e2e3 = Coordenada.distancia(t.getEsquina2(), t.getEsquina3());
		
		if ((e1e3==e1e2) && (e1e3==e2e3) && (e1e2==e2e3)) //todos lados iguales
			return true;
		else 
			return false;
	}
	
	static boolean esIsosceles(Triangulo t) {
		double e1e3 = Coordenada.distancia(t.getEsquina1(), t.getEsquina3());
		double e1e2 = Coordenada.distancia(t.getEsquina1(), t.getEsquina2());
		double e2e3 = Coordenada.distancia(t.getEsquina2(), t.getEsquina3());
		
		if ((e1e3==e1e2) && (e1e3!=e2e3) && (e1e2!=e2e3)) //dos lados iguales el otro distinto
			return true;
		else if ((e1e3==e2e3) && (e1e3!=e1e2) && (e2e3!=e1e2))
			return true;
		else if ((e1e2==e2e3) && (e1e2!=e1e3) && (e2e3!=e1e3))
			return true;
		else 
			return false;
	}
	
	
	static boolean esEscaleno(Triangulo t) {
		double e1e3 = Coordenada.distancia(t.getEsquina1(), t.getEsquina3()); 
		double e1e2 = Coordenada.distancia(t.getEsquina1(), t.getEsquina2());
		double e2e3 = Coordenada.distancia(t.getEsquina2(), t.getEsquina3());
		
		if ((e1e3!=e1e2) && (e1e3!=e2e3) && (e1e2!=e2e3))//lados distintos
			return true;
		else 
			return false;
	}

}
