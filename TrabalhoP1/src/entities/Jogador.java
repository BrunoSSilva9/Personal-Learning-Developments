package entities;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.LocalDate;

public class Jogador {
	private Integer id;
	private String name;
	private LocalDate nascimento;
	private String genero;
	private Double altura;
	private static int qtd = 0;
	
	public Jogador() {
	}

	public Jogador(String name, LocalDate nascimento, String genero, Double altura) {
		this.id = ++qtd;
		this.name = name;
		this.nascimento = nascimento;
		this.genero = genero;
		this.altura = altura;
	}
	public Jogador(String name, LocalDate nascimento, String genero) {
		this.id = ++qtd;
		this.name = name;
		this.nascimento = nascimento;
		this.genero = genero;
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

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	static int idJog = 1;
	public static void EntradasJogador(Jogador j) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n-----Insira as informações do Jogador " + idJog++ +  ": -----\n");
		
		System.out.println("Informe o nome do jogador: ");
		String nome = sc.nextLine();
		j.setName(nome);
		
		System.out.println("Informe a data de nascimento: ");
		String tempNas = sc.nextLine();
		
		LocalDate nascimento = null;
		try {
			nascimento = LocalDate.parse(tempNas);
		}catch (Exception e) {
			System.out.println("Formato de nascimento invalido."
					         + " Formato correto: yyyy-MM-dd");
			return;
		}
		j.setNascimento(nascimento);
		
		System.out.println("Digite o gênero do jogador");
		String genero = sc.nextLine();
		j.setGenero(genero);
		
		System.out.println("Digite a altura do jogador");
		Double altura = sc.nextDouble();
		j.setAltura(altura);
		
		Jogador jog = new Jogador();
	}

	@Override
	public String toString() {
		return "Jogador [id: " + id + ", name: " + name + ", nascimento: " + nascimento + ", genero: " + genero
				+ ", altura: " + altura + "]";
	}
	
	

}
