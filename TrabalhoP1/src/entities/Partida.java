package entities;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Partida {
	private Integer id;
	private LocalDate date;
	private Time mandante;
	private Time visitante;
	private Integer pontuacaoMandante;
	private Integer pontuacaoVisitante;
	private static int qtd = 0;

	public Partida() {
	}

	public Partida(LocalDate date, Time mandante, Time visitante) {
		this.id = ++qtd;
		this.date = date;
		this.mandante = mandante;
		this.visitante = visitante;
	}

	public Integer getId() {
		return id;
	}
	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Time getMandante() {
		return mandante;
	}

	public void setMandante(Time mandante) {
		this.mandante = mandante;
	}

	public Time getVisitante() {
		return visitante;
	}

	public void setVisitante(Time visitante) {
		this.visitante = visitante;
	}

	public Integer getPontuacaoMandante() {
		return pontuacaoMandante == null? 0 : pontuacaoMandante ;
	}

	public void setPontuacaoMandante(Integer pontuacaoMandante) {
		this.pontuacaoMandante = pontuacaoMandante;
	}

	public Integer getPontuacaoVisitante() {
		return pontuacaoVisitante == null ? 0 : pontuacaoVisitante;
	}

	public void setPontuacaoVisitante(Integer pontuacaoVisitante) {
		this.pontuacaoVisitante = pontuacaoVisitante;
	}
	
	public PrintStream Status() {
		if (date.isBefore(LocalDate.now())){
			return System.out.printf("\nA patida já ocorreu.");
		}else {
			return System.out.printf("\nA patida ainda não ocorreu.");
		}
		
	}
	
	public boolean ocorreuPartida() {
		return date.isBefore(LocalDate.now());
		
	}

	@Override
	public String toString() {
		return "[Partida id: " + id + ", Data: " + date + ", Time Mandante:" + mandante.getName() + ", Time Visitante:" + visitante.getName()
				+ ", Pontuação Mandante:" + pontuacaoMandante + ", Pontuação Visitante:" + pontuacaoVisitante + "]";
	}

	
	
	
	
	

}	