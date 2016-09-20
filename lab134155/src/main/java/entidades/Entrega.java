package entidades;

import java.io.Serializable;

public class Entrega implements Serializable {
	
	private int idEntrega;
	private String endereco;
	
	public Entrega(int idEntrega, String endereco) {
		super();
		this.idEntrega = idEntrega;
		this.endereco = endereco;
	}
	
	public int getIdEntrega() {
		return idEntrega;
	}
	public void setIdEntrega(int idEntrega) {
		this.idEntrega = idEntrega;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	

}
