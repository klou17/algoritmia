
public class Cliente {
    int codCli; //PK
    String nomCli;
    String dirCli;
    int dni;
    int telCli;
    
    public Cliente(int codCli, String nomCli, String dirCli, int dni, int telCli){
        this.codCli = codCli;
        this.nomCli = nomCli;
        this.dirCli = dirCli;
        this.dni = dni;
        this.telCli = telCli;
    }
    
    public  Cliente(int codCli){ this (0, "", "", 0, 0); }

	public int getCodCli() { return codCli; }
	public void setCodCli(int codCli) { this.codCli = codCli; }
	public String getNomCli() { return nomCli; }
	public void setNomCli(String nomCli) { this.nomCli = nomCli; }
	public String getDirCli() { return dirCli; }
	public void setDirCli(String dirCli) { this.dirCli = dirCli; }
	public int getDni() { return dni; }
	public void setDni(int dni) { this.dni = dni; }
	public int getTelCli() { return telCli; }
	public void setTelCli(int telCli) { this.telCli = telCli; } 
}
