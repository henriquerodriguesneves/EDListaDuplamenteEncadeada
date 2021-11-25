package view;

import java.util.LinkedList;
import java.util.List;

import controller.ListaController;

public class Principal {

	public static void main(String[] args) {
		
		ListaController controller = new ListaController();
		List<Integer> lista1 = new LinkedList<Integer>();
		List<Integer> lista2 = new LinkedList<Integer>();
		
		for(int i = 0; i < 6; i++){
			int numX = (int)((Math.random() * 200) + 1);
			lista1.add(numX);
			
			int numY = (int)((Math.random() * 200) + 1);
			lista2.add(numY);
		}
		
		controller.concat(lista1, lista2);
		controller.split(lista1, 2);

	}

}
