package br.com.pellegrini.imagecomparison.entity;

import java.util.ArrayList;
import java.util.List;

public class Arquivo {
	private Cabecalho cabecalho;
	private List<Detalhe> lstDetalhe;
	private Rodape rodape;
	public Cabecalho getCabecalho() {
		return cabecalho;
	}
	public void setCabecalho(Cabecalho cabecalho) {
		this.cabecalho = cabecalho;
	}
	public List<Detalhe> getLstDetalhe() {
		if (lstDetalhe==null)
			lstDetalhe = new ArrayList<>();
		return lstDetalhe;
	}
	public void setLstDetalhe(List<Detalhe> lstDetalhe) {
		this.lstDetalhe = lstDetalhe;
	}
	public Rodape getRodape() {
		return rodape;
	}
	public void setRodape(Rodape rodape) {
		this.rodape = rodape;
	}
	
}
