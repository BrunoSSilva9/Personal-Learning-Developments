package program;

import entities.Campeonato;
import entities.Endereço;
import entities.Estadio;
import entities.Jogador;
import entities.Partida;
import entities.Time;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Jogador j1 = new Jogador("Ramon", LocalDate.of(1975, 05, 9), "Masculino", 1.71);
		Jogador j2 = new Jogador("Juninho", LocalDate.of(1977, 02, 19), "Masculino", 1.73);

		Endereço ed1 = new Endereço("Rua Vasco", 13, "Vascão", "Ipanema");
		Estadio e1 = new Estadio("São Januario", ed1);
		Time t1 = new Time("Vasco", e1);
		t1.addJogador(j1);
		t1.addJogador(j2);
		t1.setCapitao(j1);

		Jogador j3 = new Jogador("Alves", LocalDate.of(1998, 03, 19), "Masculino", 1.73);
		Jogador j4 = new Jogador("Everton", LocalDate.of(1998, 8, 9), "Masculino", 1.74);

		Endereço ed2 = new Endereço("Rua Atletico", 14, "MG", "Belo");
		Estadio e2 = new Estadio("Mineirão", ed2);
		Time t2 = new Time("Cruzeiro", e2);
		t2.addJogador(j3);
		t2.addJogador(j4);
		t2.setCapitao(j4);

		Jogador j5 = new Jogador("Davi", LocalDate.of(1996, 7, 20), "Masculino", 1.70);
		Jogador j6 = new Jogador("Breno", LocalDate.of(1998, 4, 22), "Masculino", 1.76);

		Endereço ed3 = new Endereço("Rua Mengão", 20, "RJ", "Pacaembu");
		Estadio e3 = new Estadio("Clube de Regatas", ed3);
		Time t3 = new Time("Flamengo", e3);
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

		c1.StatusPartidas();

		c1.tabelaCampeonato();

	}

}
