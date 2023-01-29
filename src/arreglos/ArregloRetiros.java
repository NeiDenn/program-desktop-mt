package arreglos;

import java.util.ArrayList;
import clases.Retiro;

public class ArregloRetiros {
	
	//objeto_
	private ArrayList<Retiro> retiro;
	
	//AdicionarRetiros
	public ArregloRetiros() {
		retiro =new ArrayList<Retiro>();
		retiro=new ArrayList<Retiro>();
		retiro.add(new Retiro(200001,100001, "01/12/2021", "13:20")); //0
		retiro.add(new Retiro(200002,100002, "01/12/2021", "13:20")); //1
		retiro.add(new Retiro(200003,100003, "01/12/2021", "13:20")); //3
		retiro.add(new Retiro(200004,100004, "01/12/2021", "13:20")); //4
		retiro.add(new Retiro(200005,100005, "01/12/2021", "13:20")); //5
	}
	
	public void adicionar(Retiro x) {
		retiro.add(x);
	}
	
	public void eliminar(Retiro x) {
		retiro.remove(x);
	}
	
	public int tamanio() {
		return retiro.size();
	}
	
	public Retiro obtener(int i) {
		return retiro.get(i);
	}
	
	public Retiro buscar(int codigo) {
		for(int i=0; i<retiro.size(); i++) {
			if(retiro.get(i).getNumRetiro()==codigo)
				return retiro.get(i);
		}
		return null;
	}
	
	public int codigoCorrelativo() {
		if(retiro.size()==0)return 200001;
		return retiro.get(retiro.size()-1).getNumRetiro()+1;
	}
}
