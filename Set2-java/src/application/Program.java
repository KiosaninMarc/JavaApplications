package application;
/*Em um portal de cursos online, cada usuário possui um código único, representado por
um número inteiro.
Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
alunos repetidos em mais de um curso.
O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
quantidade total e alunos dele, conforme exemplo.*/
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Student> set = new HashSet<>();
		
		System.out.print("How many students for course A: ");
		int a = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < a; i++) {
			int studentA = sc.nextInt();
			set.add(new Student(studentA));
		}
		
		System.out.print("How many students for course B: ");
		int b = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < b; i++) {
			int studentB = sc.nextInt();
			set.add(new Student(studentB));
		}

		System.out.print("How many students for course C: ");
		int c = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < c; i++) {
			int studentC = sc.nextInt();
			set.add(new Student(studentC));
		}

		System.out.println(set);
		
		System.out.println("===============================");
		
		System.out.println("Total Students: " + set.size());
		
		sc.close();
	}

}
