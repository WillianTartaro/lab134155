package br.univel.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;


@Entity
@Table
public class Log implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Version
	@Column(name = "version")
	private int version;

	@Column(nullable = false)
	private String mdb;

	@Column(nullable = false)
	private String data;

	@Column(nullable = false)
	private String hora;

	@Column(nullable = false)
	private String informacoes;

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(final int version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Log)) {
			return false;
		}
		Log other = (Log) obj;
		if (id != null) {
			if (!id.equals(other.id)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public String getMdb() {
		return mdb;
	}

	public void setMdb(String mdb) {
		this.mdb = mdb;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (mdb != null && !mdb.trim().isEmpty())
			result += "mdb: " + mdb;
		if (data != null && !data.trim().isEmpty())
			result += ", data: " + data;
		if (hora != null && !hora.trim().isEmpty())
			result += ", hora: " + hora;
		if (informacoes != null && !informacoes.trim().isEmpty())
			result += ", informacoes: " + informacoes;
		return result;
	}
}