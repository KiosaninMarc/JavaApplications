package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Lesson> list = new ArrayList<Lesson>();
		
		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();
		
		System.out.print("===========================");
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Dados da "+ i +"ª aula:");
			System.out.print("Conteudo ou tarefa (c/t)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Titulo: ");
			String ttl = sc.nextLine();
			if (ch == 'c') {
				System.out.print("Url do video: ");
				String url = sc.nextLine();
				System.out.print("Duracao em segundos: ");
				Integer duration = sc.nextInt();
				list.add(new Video(ttl, url, duration));
			}else {
				System.out.print("Descricao: ");
				String desc = sc.nextLine();
				System.out.print("Quantidade de questoes: ");
				Integer qtd = sc.nextInt();
				list.add(new Task(ttl, desc, qtd));
			}	
		}
		
		System.out.println();
		System.out.println("===========================");
		Integer count = 0;
		for(Lesson ls : list) {
			count += ls.duration();
		}
		
		System.out.println("DURAÇÃO TOTAL DO CURSO = " + count + " segundos");
		sc.close();
	}

}
