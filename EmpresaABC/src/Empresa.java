import java.util.ArrayList;
import java.util.List;

import interfaces.Observer;
import interfaces.Subject;

public class Empresa implements Subject {
	private List<Observer> observers;
	private double tarifaAdulto;
	private double tarifaInfantil;
	
	public Empresa() {
		
		observers = new ArrayList<Observer>();
		
	}

	@Override
	public void registrarAgencias(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removerAgencia(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notificarAgencias() {
		for (Observer item: observers) {
			item.update(tarifaAdulto, tarifaInfantil);
		}
		
	}
	
	public void registrarMudancas(double tarifaInfantil, double tarifaAdulto) {
		this.tarifaInfantil = tarifaInfantil;
		this.tarifaAdulto = tarifaAdulto;
		
		this.notificarAgencias();
	}
	
	
}
