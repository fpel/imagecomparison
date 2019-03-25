package br.com.pellegrini.imagecomparison.entity;

public class Rodape {
	private String tipo;
	private String qntRegistros;
	private String valorTotal;
	private String filler;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getQntRegistros() {
		return qntRegistros;
	}
	public void setQntRegistros(String qntRegistros) {
		this.qntRegistros = qntRegistros;
	}
	public String getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getFiller() {
		return filler;
	}
	public void setFiller(String filler) {
		this.filler = filler;
	}
	@Override
	public String toString() {
		return "Rodape [tipo=" + tipo + ", qntRegistros=" + qntRegistros + ", valorTotal=" + valorTotal + ", filler="
				+ filler + "]";
	}
}
