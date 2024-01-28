package entities;

import java.util.ArrayList;
import java.util.List;

public class Time implements Comparable<Time> {
	private Integer id;
	private String name;
	private static int qtd = 0;
	private List<Jogador> jogadores = new ArrayList<>();
	private Jogador capitao;
	private Estadio estadioSede;
	private Integer saldoVitorias;
	private Integer saldoGols;

	public Time() {
	}

	public Time(String name, Estadio estadioSede) {
		this.id = ++qtd;
		this.name = name;
		this.estadioSede = estadioSede;
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

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void addJogador(Jogador jogador) {
		jogadores.add(jogador);
	}

	public void removeJogador(Jogador jogador) {
		jogadores.remove(jogador);
	}

	public Jogador getCapitao() {
		return capitao;
	}

	public void setCapitao(Jogador capitao) {
		this.capitao = capitao;
	}

	public Estadio getEstadioSede() {
		return estadioSede;
	}

	public void setEstadioSede(Estadio estadioSede) {
		this.estadioSede = estadioSede;
	}

	public Integer getSaldoVitorias() {
		return saldoVitorias == null? 0 : saldoVitorias;
	}

	public void setSaldoVitorias(Integer saldoVitorias) {
		this.saldoVitorias = saldoVitorias;
	}

	public Integer getSaldoGols() {
		return saldoGols == null ? 0 : saldoGols;
	}
	
	private Integer gols = 0;
	public void setSaldoGols(Integer saldoGols) {
		gols += saldoGols;
		this.saldoGols = gols;
	}
	/*
	@Override
	public String toString() {
		return "Time [id: " + id + ", name: " + name + ", jogadores: " + getJogadores() + ", capitao: " + capitao.getName()
				+ ", estadioSede=" + estadioSede + "]";
	}
*/
	@Override
	public int compareTo(Time other) {
		int cmpVitorias = this.saldoVitorias.compareTo(other.getSaldoVitorias());
		if(cmpVitorias > 0 || cmpVitorias < 0)
			return -cmpVitorias;
		return -this.saldoGols.compareTo(other.getSaldoGols());
	}

}
