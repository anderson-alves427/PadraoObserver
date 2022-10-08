package interfaces;

public interface Subject {

	public void registrarAgencias(Observer o);
	
	public void removerAgencia(Observer o);
	
	public void notificarAgencias();
	
}
