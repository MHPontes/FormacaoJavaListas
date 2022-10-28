package gerenciadordecursos;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
		String curso2 = "Apache Camel";
		String curso3 = "Certificacao Java SE 8 Programmer I";
		
		ArrayList<String> cursos = new ArrayList<>();         // Declarando Array e instanciando como #cursos
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
//		cursos.remove(1);   //Removendo o curso do index 1 ou seja o curso 2
		
		Collections.sort(cursos);    //Ordenando a lista com Collections, para mostar em ordem alfabética.
		
		System.out.println(cursos);    //Chamando a lista
		
		
		
		
		
//        System.out.println("O primeiro curso da lista eh o: " + cursos.get(0)); // como acessar o primeiro valor?
        
//        
//        for (int i = 0; i < cursos.size(); i++) {
//            System.out.println("Aula : " + cursos.get(i));                  //For percorrendo a lista.
//        }


		


	}

}
