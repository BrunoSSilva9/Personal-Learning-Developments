package entities;

import java.io.PrintStream;

import entities.Partida;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Campeonato {
	private Integer id;
	private static int qtd = 0;
	private Integer ano;
	private String name;
	private List<Time> times = new ArrayList<>();
	private List<Partida> partidas = new ArrayList<>();

	public Campeonato() {

	}

	public Campeonato(Integer ano, String name) {
		this.id = ++qtd;
		this.ano = ano;
		this.name = name;
		//novo campeonato, zera saldo de vitorias e gols
		for (Time time : times) {
			time.setSaldoVitorias(0);
			time.setSaldoGols(0);
		}
	}

	public Integer getId() {
		return id;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Partida> getPartidas() {
		return partidas;
	}

	public void addPartidas(Partida partida) {
		partidas.add(partida);
	}

	public void removePartidas(Partida partida) {
		partidas.remove(partida);
	}

	public List<Time> getTimes() {
		return times;
	}

	public void addTimes(Time time) {
		times.add(time);
	}

	public void removeTimes(Time time) {
		times.remove(time);
	}
	
	public void StatusPartidas() {
		for (Partida partida : partidas) {
			if (partida.getDate().isBefore(LocalDate.now()))
				 System.out.printf("\nA partida já ocorreu.\n");	
			
			else 
				System.out.printf("\nA partida ainda não ocorreu.\n");
			System.out.println(partida);
			}
		}
	
	
	public void TabelaCampeonato() {
		for (Partida partida : partidas) {
			for (Time time : times) {
				Time mandante = partida.getMandante();
				int saldoMandante = partida.getPontuacaoMandante();
				
				if(mandante.getId() == time.getId())
					time.setSaldoGols(time.getSaldoGols());
			}
		}
	}
	
	public void tabelaCampeonato() {
		// 1 - saldo de vitorias
		// 2 - saldo de gols
		for (Partida partida : partidas) {
			if (partida.ocorreuPartida()) {
				Time mandante = partida.getMandante();
				Time visitante = partida.getVisitante();
				int saldoMandante = partida.getPontuacaoMandante() - partida.getPontuacaoVisitante();
				for (Time time : times) {
					if (mandante.getId() == time.getId()) {
						time.setSaldoGols(time.getSaldoGols() + saldoMandante);
						if (saldoMandante > 0)
							time.setSaldoVitorias(time.getSaldoVitorias() + 1);
						if (saldoMandante < 0)
							time.setSaldoVitorias(time.getSaldoVitorias() - 1);
					}
					if (visitante.getId() == time.getId()) {
						time.setSaldoGols(time.getSaldoGols() - saldoMandante);
						if (saldoMandante > 0)
							time.setSaldoVitorias(time.getSaldoVitorias() - 1);
						if (saldoMandante < 0)
							time.setSaldoVitorias(time.getSaldoVitorias() + 1);
					}
				}
			}
		}
		Collections.sort(times);
		for (Time time : times) {
			System.out.print("Time " + time.getName());
			System.out.print(", Saldo Vitórias: " + time.getSaldoVitorias());
			System.out.println(", Saldo Gols " + time.getSaldoGols());
		}
	}

	public static void menuPrincipal(Campeonato c) {
		Scanner sc = new Scanner(System.in);
		
		int escolha;
		do {
			System.out.println("\n-----Menu Principal-----");
			System.out.println("1. Visualizar Partidas");
            System.out.println("2. Visualizar Tabela do Campeonato");
            System.out.println("3. Criar novo Campeonato");
            System.out.println("4. Sair");
            System.out.print("Escolha a opção desejada: ");
            
            escolha = sc.nextInt();
            
            switch(escolha) {
            	case 1:
            		c.StatusPartidas();
            		break;
            	case 2:
            		c.tabelaCampeonato();
            		break;
            	case 3:
            		sc.nextLine();
            		Campeonato c2 = new Campeonato();
            		System.out.println("Digite o ano do campeonato: ");
            		int ano = sc.nextInt();
            		sc.nextLine();
            		
            		System.out.println("Digite o nome do campeonato: ");
            		String nome = sc.nextLine();
            		
            		c2.setAno(ano);
            		c2.setName(nome);
            		System.out.print("Novo Campeonato criado!\nNome: " + c2.getName() + "\n" + "Ano: " + c2.getAno());
            		break;
            		
            	case 4:
            		System.out.println("Encerrando Programa>>>");
            		break;
            	default:
            		System.out.println("Opção Inválida, escolha uma válida!");
            }
		}while(escolha != 4);
		
		
	}	

}
