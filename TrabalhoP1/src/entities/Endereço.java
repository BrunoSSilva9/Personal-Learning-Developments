package entities;

public class Endereço {
	private Integer id;
	private String logradouro;
	private Integer numero;
	private String complemento;
	private String bairro;
	private static int qtd = 0;

	public Endereço() {
	}

	public Endereço(String logradouro, Integer numero, String complemento, String bairro) {
		this.id = ++qtd;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
	}

	public Integer getId() {
		return id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public static int getQtd() {
		return qtd;
	}

	public static void setQtd(int qtd) {
		Endereço.qtd = qtd;
	}

	@Override
	public String toString() {
		return "Endereço [id=" + id + ", logradouro=" + logradouro + ", numero=" + numero + ", complemento="
				+ complemento + ", bairro=" + bairro + "]";
	}
	
	

}
