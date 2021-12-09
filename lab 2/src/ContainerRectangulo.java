
public class ContainerRectangulo {
	private Rectangulo [] rect;
	private double [] dist;
	private double [] area;
	private int numRec,n;

	public ContainerRectangulo() {
		numRec=0;
		n=0;
	}
		
	public void addRectagulo(int numRec) {
		Rectangulo [] rect= new Rectangulo [numRec];
		double [] dist= new double [numRec];
		double [] area= new double [numRec];
		
		for (int i=0; i<numRec; i++){
			Coordenada co1=new Coordenada(0,0);
			Coordenada co2=new Coordenada(0,0);
			rect[i]=new Rectangulo(co1,co2);
			System.out.println("Rectangulo "+(i+1));
			System.out.println("Ingrese Coordenadas: ");
			co1.setX(0); co1.setY(0);
			co2.setX(0); co2.setY(0);
			area[i]=rect[i].calculoArea(co1, co2);
			dist[i]=Coordenada.distancia(co1,co2);
		}
		System.out.println("Rectangulo           Coordenadas                Distancia      Area ");
		for (int i=0; i<numRec; i++)
			System.out.println("    "+(i+1)+"         "+rect[i].toString()+"      "+dist[i]+"        "+area[i]);
	}
		
	public String toString() {
		return "   "+(n+1)+"         "+rect[n].toString()+"      "+dist[n]+"        "+area[n];
	}
}
