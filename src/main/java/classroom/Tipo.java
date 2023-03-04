package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	private int codigo;
	private String nombre;


	//Porque debe ser privada?
	private Tipo(int codigo) {
		this.codigo = codigo;
		this.nombre = "";
	}

	private Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
