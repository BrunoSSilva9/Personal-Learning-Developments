package program;

import entities.Campeonato;
import entities.Endereço;
import entities.Estadio;
import entities.Jogador;
import entities.Partida;
import entities.Time;

import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		Jogador j1 = new Jogador();
		Jogador.EntradasJogador(j1);

		Jogador j2 = new Jogador();
		Jogador.EntradasJogador(j2);

		Endereço ed1 = new Endereço();
		Endereço.infoEndereco(ed1);
		
		Estadio e1 = new Estadio();
		Estadio.InfoEstadio(e1);
		e1.setEndereco(ed1);
		
		Time t1 = new Time();
		Time.InfoTime(t1);
		t1.setEstadioSede(e1);
		t1.addJogador(j1);
		t1.addJogador(j2);
		t1.setCapitao(j1);
		

		Jogador j3 = new Jogador();
		Jogador.EntradasJogador(j3);
		
		Jogador j4 = new Jogador();
		Jogador.EntradasJogador(j4);

		Endereço ed2 = new Endereço();
		Endereço.infoEndereco(ed2);
		
		Estadio e2 = new Estadio();
		Estadio.InfoEstadio(e2);
		e2.setEndereco(ed2);
		
		Time t2 = new Time();
		Time.InfoTime(t2);
		t2.setEstadioSede(e2);
		t2.addJogador(j3);
		t2.addJogador(j4);
		t2.setCapitao(j4);

		Jogador j5 = new Jogador();
		Jogador.EntradasJogador(j5);
		
		Jogador j6 = new Jogador();
		Jogador.EntradasJogador(j6);

		Endereço ed3 = new Endereço();
		Endereço.infoEndereco(ed3);
		
		Estadio e3 = new Estadio();
		Estadio.InfoEstadio(e3);
		e3.setEndereco(ed3);
		
		Time t3 = new Time();
		Time.InfoTime(t3);
		t3.setEstadioSede(e3);
		t3.addJogador(j5);
		t3.addJogador(j6);
		t3.setCapitao(j6);

		// Criação do Campeonato
		Campeonato c1 = new Campeonato(2023, "Copa do Brasil");

		c1.addTimes(t1);
		c1.addTimes(t2);
		c1.addTimes(t3);

		// Criação das Partidas
		Partida p1 = new Partida(LocalDate.of(2023, 9, 15), t1, t2);
		p1.setPontuacaoMandante(20);
		p1.setPontuacaoVisitante(13);

		Partida p2 = new Partida(LocalDate.of(2023, 10, 13), t3, t2);
		p2.setPontuacaoMandante(27);
		p2.setPontuacaoVisitante(19);

		Partida p3 = new Partida(LocalDate.of(2023, 10, 11), t2, t1);
		p3.setPontuacaoMandante(18);
		p3.setPontuacaoVisitante(10);

		Partida p4 = new Partida(LocalDate.of(2023, 10, 18), t1, t3);
		p4.setPontuacaoMandante(14);
		p4.setPontuacaoVisitante(24);

		Partida p5 = new Partida(LocalDate.of(2023, 10, 25), t2, t3);
		p5.setPontuacaoMandante(22);
		p5.setPontuacaoVisitante(28);

		Partida p6 = new Partida(LocalDate.of(2023, 10, 13), t3, t1);
		p6.setPontuacaoMandante(23);
		p6.setPontuacaoVisitante(26);

		c1.addPartidas(p1);
		c1.addPartidas(p2);
		c1.addPartidas(p3);
		c1.addPartidas(p4);
		c1.addPartidas(p5);
		c1.addPartidas(p6);
		
		Campeonato.menuPrincipal(c1);

	}
	
}
