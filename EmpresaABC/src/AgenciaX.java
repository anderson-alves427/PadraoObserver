import interfaces.DisplayAgencia;
import interfaces.Observer;

public class AgenciaX implements Observer, DisplayAgencia{
	
	private double tarifaAdulto;
	private double tarifaInfantil;
	static double desconto = 0.05;
	private Empresa empresa;
	
	 public AgenciaX(Empresa empresa){
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

		System.out.println("-----Agencia X-----");
		System.out.println("Desconto de 5% sobre tarifas");
		System.out.println("Tarifa Adulto: " + (tarifaAdulto - tarifaAdulto*desconto));
		System.out.println("Tarifa Infantil: " + (tarifaInfantil - tarifaInfantil*desconto));
		System.out.println("\n");
		
	}
	
}
