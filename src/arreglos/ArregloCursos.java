package arreglos;

//Importe_de_un_arraylist
import java.util.ArrayList;
//importarCurso
import clases.Curso;

public class ArregloCursos {
	
	//Objeto_de_arrayList
	private ArrayList<Curso> curso;
	
	//constructor: AdicionarCursos
	public ArregloCursos(){
		curso=new ArrayList<Curso>();
		curso.add(new Curso(1,"Matemáticas", 1, 01, 6)); //0
		curso.add(new Curso(2,"Ciencias", 2, 03, 6));    //1
		curso.add(new Curso(1,"Informática", 3, 01, 6)); //3
		curso.add(new Curso(2,"Algoritmos", 4, 03, 6));  //4
		curso.add(new Curso(3,"Inglés", 5, 02, 6));      //5
	}
	
	public void adicionar(Curso x) {
		curso.add(x);
		//grabarCursos();
	}
	
	public void eliminar(Curso x) {
		curso.add(x);
		//grabarCursos();
	}
	
	public int tamanio() {
		return curso.size();
	}
	
	public Curso obtener(int i) {
		return curso.get(i);
	}
	
	public Curso buscar(int codigo) {
		//bucle_for
		for(int i=0; i<curso.size(); i++) {
			if(curso.get(i).getCodCurso()==codigo)
				return curso.get(i);
		}
		return null;
	}
	
	public int codigoCorrelativo() {
		if(curso.size()==0)
			return 1;
		return curso.get(curso.size()-1).getCodCurso()+1;
	}

}
