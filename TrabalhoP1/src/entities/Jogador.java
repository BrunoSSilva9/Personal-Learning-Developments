package entities;

import java.time.LocalDateTime;
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

	@Override
	public String toString() {
		return "Jogador [id: " + id + ", name: " + name + ", nascimento: " + nascimento + ", genero: " + genero
				+ ", altura: " + altura + "]";
	}
	
	

}
