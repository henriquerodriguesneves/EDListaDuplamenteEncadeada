package controller;

import java.util.LinkedList;
import java.util.List;

public class ListaController {
	
	public ListaController(){
		super();
	}
	
	public List<Integer> concat(List<Integer> lista1, List<Integer> lista2){
		List<Integer> concatList = new LinkedList<Integer>();
		
		for (int i = 0; i < lista1.size(); i++){
			concatList.add(lista1.get(i));
			concatList.add(lista2.get(i));
		}
		
		return concatList;
	}
	
	public List<List<Integer>> split(List<Integer> list, int splitBy){
		List<List<Integer>> particoes = new LinkedList<List<Integer>>();
		int tamanhoLista = list.size();
		
		if(tamanhoLista / splitBy < 1){
			throw new Error("Não é possível dividir a lista por " + splitBy);
		}
		
		for (int i = 0; i < tamanhoLista; i++){
			particoes.add(new LinkedList<Integer>(list.subList(i, Math.min(tamanhoLista, i + splitBy))));
		}
		
		return particoes;
	}

}
