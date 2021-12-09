
public class Verificador {
	static boolean esSobrePos(Rectangulo r1, Rectangulo r2){
		Coordenada a1= r1.getEsquina1();
		Coordenada b1= r1.getEsquina2();
		Coordenada a2= r2.getEsquina1();
		Coordenada b2= r2.getEsquina2();
		double r1xmi,r1xma,r2xmi,r2xma;
		double r1ymi,r1yma,r2ymi,r2yma;
		
		if(a1.getX() < b1.getX()) { //el x min y max de rectangulo 1 
			r1xmi=a1.getX();
			r1xma=b1.getX();}	
		else {
			r1xmi=b1.getX();
			r1xma=a1.getX();}
		
		if(a2.getX() < b2.getX()) { //el x min y max de rectangulo 2 
			r2xmi=a2.getX();
			r2xma=b2.getX();}	
		else {
			r2xmi=b2.getX();
			r2xma=a2.getX();}
		
		if(a1.getY() < b1.getY()) { //el y min y max de rectangulo 1 
			r1ymi=a1.getY();
			r1yma=b1.getY();}	
		else {
			r1ymi=b1.getY();
			r1yma=a1.getY();}
		
		if(a2.getY() < b2.getY()) { //el y min y max de rectangulo 2 
			r2ymi=a2.getY();
			r2yma=b2.getY();}	
		else {
			r2ymi=b2.getY();
			r2yma=a2.getY();}
			
		if (((r1xmi<r2xma) && (r1xma>r2xmi)) || ((r1ymi<r2yma) && (r1yma>r2ymi))) {
			if ((r1xmi<r2xmi) && (r1xma>r2xma)) // relaciones en x
				return true;
			else if ((r1xmi==r2xmi) && (r1xma>r2xma))
				return true;
			else if ((r1xmi>r2xmi) && (r1xma==r2xma))
				return true;
			else if ((r1xmi==r2xmi) && (r1xma==r2xma))
				return true;
			else if ((r1xmi>r2xmi) && (r1xma<r2xma))
				return true;
			else if ((r1xmi==r2xmi) && (r1xma<r2xma))
				return true;
			else if ((r1xmi<r2xmi) && (r1xma<r2xma))
				return true;
			else if ((r1xmi<r2xmi) && (r1xma==r2xma))
				return true;
			
			else if ((r1ymi<r2ymi) && (r1yma>r2yma)) // relaciones en y
				return true;
			else if ((r1ymi==r2ymi) && (r1yma>r2yma))
				return true;
			else if ((r1ymi>r2ymi) && (r1yma==r2yma))
				return true;
			else if ((r1ymi==r2ymi) && (r1yma==r2yma))
				return true;
			else if ((r1ymi>r2ymi) && (r1yma<r2yma))
				return true;
			else if ((r1ymi==r2ymi) && (r1yma<r2yma))
				return true;
			else if ((r1ymi<r2ymi) && (r1yma<r2yma))
				return true;
			else if ((r1ymi<r2ymi) && (r1yma==r2yma))
				return true; 
			else return false;
		}
		else
			return false;	
			
	}
	
	static boolean esJunto(Rectangulo r1, Rectangulo r2){
		Coordenada a1= r1.getEsquina1();
		Coordenada b1= r1.getEsquina2();
		Coordenada a2= r2.getEsquina1();
		Coordenada b2= r2.getEsquina2();
		//si son juntos coinciden en algún punto x o y
		
		if ((a1.getX()==a2.getX()) || (a1.getX()==b2.getX())) //si una esquina x de r1 coincide con las esquinas x de r2
			return true;
		else if ((b1.getX()==a2.getX()) || (b1.getX()==b2.getX()))
			return true;
		else if ((a1.getY()==a2.getY()) || (a1.getY()==b2.getY())) //si una esquina y de r1 coincide con las esquinas y de r2
			return true;
		else if ((b1.getY()==a2.getY()) || (b1.getY()==b2.getY()))
			return true;
		else
			return false;
	}
	
	static boolean esDistinto(Rectangulo r1, Rectangulo r2){
		return true; //se valida antes si esta sobrepuesto o junto, sino son disjuntos
	}

}
