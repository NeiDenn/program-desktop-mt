package arreglos;

//importeNumero 1
import java.util.ArrayList;
//importeNumero 2
import clases.Alumno;

public class ArregloAlumnos {
	//declararArreglo deObjetos deClase ArrayList
	private ArrayList<Alumno> lista;
	
	//constructor : crearYadicionar dosAlumnos
	public ArregloAlumnos() {
		lista=new ArrayList<Alumno>();
		//----------------------------REGISTRADO---------------------------------------
		lista.add(new Alumno(100,"Luis","Reyes Vargas","434353453",21,915934345,0));
		lista.add(new Alumno(101,"Neiser","Mamani Mamani","434353454",19,915934345,0));
		lista.add(new Alumno(102,"Yeni","Mariela Guitierrez","434353455",26,915934345,0)); 
		lista.add(new Alumno(103,"Willian","Luna Iniesta","434353433",25,915934345,0));
		lista.add(new Alumno(104,"Julio","Venavides Mendoza","434353453",23,977934345,0)); 
		//----------------------------MATRICULADO---------------------------------------
		lista.add(new Alumno(105,"Ronald","Sotomayor Luque","434353453",21,945934345,1)); 
		lista.add(new Alumno(106,"Yovana","Mendoza Calcina","434353499",22,945934345,1)); 
		lista.add(new Alumno(107,"Cristhian","Mamani Pari","434353477",24,945934345,1)); 
		lista.add(new Alumno(108,"Brigitte","Tello Solar","434353466",20,945934345,1)); 
		lista.add(new Alumno(109,"Franduck","Castell Benites","434353466",20,945934345,1));
		//------------------------------RETIRADO------------------------------------------
		lista.add(new Alumno(110,"Boris","Lopez Velasquez","434353466",20,945934345,2)); 
		lista.add(new Alumno(111,"Mayli","Estrella Oustes","434353466",20,945934345,2)); 
		lista.add(new Alumno(112,"Orión","Pardo Andromeda","434353466",20,945934345,2)); 
		lista.add(new Alumno(113,"Tom","Nestas Velarco","434353466",20,945934345,2)); 
		lista.add(new Alumno(115,"Hina","Luna Vasquez","434353466",20,945934345,2)); 
	}

	//adicionar
	//direccion de memoria o objeto
	public void adicionar(Alumno a) {
		lista.add(a);
	}
	
	//tamanio
	public int tamanio() {
		return lista.size();
	}
	
	//obtener
	public Alumno obtener(int i) {
		return lista.get(i);
	}
	
	//buscar
	public Alumno buscar(int cod) {
		//BucleFor
		for(int i = 0; i<tamanio(); i++){
			if(lista.get(i).getCodAlumno()==cod) //soloNosInteresaElCodigo
				return lista.get(i);
		}
		return null;
	}
	
	//eliminar
	public void eliminar(Alumno a) {
		lista.remove(a);
	}
	
	//buscarPorDni
		public Alumno buscarDNI(String dni) {
			//BucleFor
			for(int i = 0; i<tamanio(); i++){
				if(lista.get(i).getDni().equals(dni)) //soloNosInteresaElDni
					return lista.get(i);
			}
			return null;
		}
		
		//GenerarCodigo + 1
		public int generarCodigo() {
			return lista.get(tamanio()-1).getCodAlumno()+1;
		}
}
