import interfaces.DisplayAgencia;
import interfaces.Observer;

public class AgenciaZ implements Observer, DisplayAgencia{
	
	private double tarifaAdulto;
	private double tarifaInfantil;
	static double desconto = 0.1;
	private Empresa empresa;
	
	public AgenciaZ(Empresa empresa){
        this.empresa = empresa;
        empresa.registrarAgencias(this);
	}
	
	@Override
	public void update(double tarifaAdulto, double tarifaInfantil) {
		
		this.tarifaAdulto = tarifaAdulto;
		this.tarifaInfantil = tarifaInfantil;
		this.display();
		
	}
	
	@Override
	public void display() {
		
		System.out.println("-----Agencia Z-----");
		System.out.println("Desconto de 10% sobre tarifas");
		System.out.println("Tarifa Adulto: " + (tarifaAdulto - tarifaAdulto*desconto));
		System.out.println("Tarifa Infantil: " + (tarifaInfantil - tarifaInfantil*desconto));
		System.out.println("\n");
		
	}
	
}
