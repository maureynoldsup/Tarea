package jason2;

public class Persona {
	public int carnet;
	public String nombre;
	public String apellido;
	public String direccion;
	public int telefono;
	
	public Persona(){
		carnet=0;
		nombre="";
		apellido="";
		direccion="";
		telefono=0;
	}
	public void llenado(int car, String nom, String ape, String dir, int telf){
		this.carnet=car;
		this.nombre=nom;
		this.apellido=ape;
		this.direccion=dir;
		this.telefono=telf;
	}

}
