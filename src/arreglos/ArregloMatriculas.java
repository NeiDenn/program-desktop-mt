package arreglos;

import java.util.ArrayList;
import clases.Matricula;

public class ArregloMatriculas {
	//objeto
	private ArrayList<Matricula> matricula;
	
	//adicionarMatriculas
	public ArregloMatriculas() {
		matricula=new ArrayList<Matricula>();
		matricula.add(new Matricula(100001,100, 1, "01/12/2021", "13:20")); 
		matricula.add(new Matricula(100002,101, 2, "03/24/2021", "14:40")); 
		matricula.add(new Matricula(100003,102, 3, "01/04/2021", "15:30")); 
		matricula.add(new Matricula(100004,103, 4, "03/04/2021", "20:10")); 
		matricula.add(new Matricula(100005,104, 5, "02/04/2021", "22:40")); 
	}
	
	public void adicionar(Matricula x) {
		matricula.add(x);
		//grabarMatriculas();
	}
	
	public void eliminar(Matricula x) {
		matricula.remove(x);
		//grabarMatriculas();
	}
	
	public int tamanio() {
		return matricula.size();
	}
	
	public Matricula obtener(int i) {
		return matricula.get(i);
	}
	
	public Matricula buscar(int codigo) {
		for(int i=0; i<matricula.size(); i++){
			if(matricula.get(i).getNumMatricula()==codigo)
				return matricula.get(i);
		}
		return null;
	}
	
	public Matricula buscarCod(int codigo) {
		for(int i=0; i<matricula.size(); i++){
			if(matricula.get(i).getCodAlumno()==codigo)
				return matricula.get(i);
		}
		return null;
	}
	
	public int codigoCorrelativo() {
		if(matricula.size()==0) return 100001;
		return matricula.get(matricula.size()-1).getNumMatricula()+1;
	}
	
	
}
