package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Set<T> Demo01
public class ProgramSeven {

	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<>();//Extremamente rapido mas Nao garante a ordem dos objetos
		//Set<String> set = new TreeSet<>();//Ordena os objetos em ordem alfabetica
		Set<String> set = new LinkedHashSet<>();//Mantem a ordem em que os objetos foram inseridos
		
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));
		for (String p : set) {
			System.out.println(p);
		}
		System.out.println();
		
		//set.remove("Tablet");
		//set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for (String c : set) {
			System.out.println(c);
		}

	}

}
