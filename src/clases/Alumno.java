package clases;

public class Alumno {
	private int codAlumno, edad, celular, estado;
	private String nombres, apellidos, dni;
	
	//source/g.c.using field
	public Alumno(int codAlumno, String nombres, String apellidos, String dni, int edad, int celular, int estado) {
		super();
		this.codAlumno = codAlumno;
		this.edad = edad;
		this.celular = celular;
		this.estado = estado;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	//ConstructorEnBlanco
	//ConstructorSinParametros
	public Alumno() {
		
	}
	
	
	//source/g.getter and setters
	public int getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(int codAlumno) {
		this.codAlumno = codAlumno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}	
	
	//operacion
	public String nombreEstado() {
		if(estado==0)
			return "Registrado";
		else if(estado==1)
			return "Matriculado";
		else
			return "retirado";
	}
	

}
