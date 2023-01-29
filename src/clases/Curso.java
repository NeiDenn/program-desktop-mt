package clases;

public class Curso {
	private int codCurso, ciclo, creditos, horas;
	private String asignatura;
	
	//Using fields
	public Curso(int codCurso, String asignatura, int ciclo, int creditos, int horas) {
		super();
		this.codCurso = codCurso;
		this.ciclo = ciclo;
		this.creditos = creditos;
		this.horas = horas;
		this.asignatura = asignatura;
	}

	//Getter and setters
	public int getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}

	public int getCiclo() {
		return ciclo;
	}

	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
}
