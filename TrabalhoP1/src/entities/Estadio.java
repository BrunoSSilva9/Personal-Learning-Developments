package entities;

import java.util.Scanner;
import entities.Endereço;

public class Estadio {

	private Integer id;
	private String name;
	private Endereço endereco;
	private static int qtd = 0;

	public Estadio() {

	}

	public Estadio(String name, Endereço endereco) {
		this.id = ++qtd;
		this.name = name;
		this.endereco = endereco;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Endereço getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereço endereco) {
		this.endereco = endereco;
	}

	static int idEstadio = 1;
	public static void InfoEstadio(Estadio e) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n-----Insira as informações do estadio " + idEstadio++ + "-----\n");
		
		System.out.print("Digite o nome do estádio: ");
		String nome = sc.nextLine();
		e.setName(nome);
	}
		
	@Override
	public String toString() {
		return "Estadio [id: " + id + ", name: " + name + ", endereco: " + endereco + "]";
	}

}
