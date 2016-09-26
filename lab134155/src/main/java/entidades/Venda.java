package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Venda implements Serializable {

	private int id;
	private List<String> itens;
	private BigDecimal valor;
	
	
	
	public Venda(int id, List<String> itens, BigDecimal valor) {
		super();
		this.id = id;
		this.itens = itens;
		this.valor = valor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getItens() {
		return itens;
	}
	public void setItens(List<String> itens) {
		this.itens = itens;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	

	
	
	
}
