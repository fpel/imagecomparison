package br.com.pellegrini.imagecomparison.entity;

public class Cabecalho {
	private String tipo;
	private String data;
	private String hora;
	private String lote;
	private String filler;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public String getFiller() {
		return filler;
	}
	public void setFiller(String filler) {
		this.filler = filler;
	}
	@Override
	public String toString() {
		return "Cabecalho [tipo=" + tipo + ", data=" + data + ", hora=" + hora + ", lote=" + lote + ", filler=" + filler
				+ "]";
	}
	
}
