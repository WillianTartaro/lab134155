package vendas;

import java.io.Serializable;
import java.util.List;

public class Vendas implements Serializable {

	private int id;
	private String nomeComprador;
	private int valor;
	private List<String> itens;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeComprador() {
		return nomeComprador;
	}
	public void setNomeComprador(String nomeComprador) {
		this.nomeComprador = nomeComprador;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public List<String> getItens() {
		return itens;
	}
	public void setItens(List<String> itens) {
		this.itens = itens;
	}
	
	
}
