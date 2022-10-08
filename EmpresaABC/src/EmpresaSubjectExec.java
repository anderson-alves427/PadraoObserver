
public class EmpresaSubjectExec {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		
		AgenciaX agenciaX = new AgenciaX(empresa);
		AgenciaY agenciaY = new AgenciaY(empresa);
		AgenciaZ agenciaZ = new AgenciaZ(empresa);
		
		empresa.registrarMudancas(20, 40);
		System.out.println("\n");
		
		empresa.registrarMudancas(5, 10);
		

	}

}
