package br.com.pellegrini.imagecomparison.entity;

public class Detalhe {
	private String tipo;
	private String acquirerId;
	private String produto;
	private String comercio;
	private String sucursal;
	private String departamento;
	private String fechaMovimento;
	private String rubro;
	private String codigoOperacion;
	private String codigoMoneda;
	private String importe;
	private String fechaProcesso;
	private String responsable;
	private String observacion;
	private String tipoSolicitud;
	private String nroSolicitud;
	private String motivoAjuste;
	private String areaAjuste;
	private String errorCode;
	private String filler;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getAcquirerId() {
		return acquirerId;
	}
	public void setAcquirerId(String acquirerId) {
		this.acquirerId = acquirerId;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getComercio() {
		return comercio;
	}
	public void setComercio(String comercio) {
		this.comercio = comercio;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getFechaMovimento() {
		return fechaMovimento;
	}
	public void setFechaMovimento(String fechaMovimento) {
		this.fechaMovimento = fechaMovimento;
	}
	public String getRubro() {
		return rubro;
	}
	public void setRubro(String rubro) {
		this.rubro = rubro;
	}
	public String getCodigoOperacion() {
		return codigoOperacion;
	}
	public void setCodigoOperacion(String codigoOperacion) {
		this.codigoOperacion = codigoOperacion;
	}
	public String getCodigoMoneda() {
		return codigoMoneda;
	}
	public void setCodigoMoneda(String codigoMoneda) {
		this.codigoMoneda = codigoMoneda;
	}
	public String getImporte() {
		return importe;
	}
	public void setImporte(String importe) {
		this.importe = importe;
	}
	public String getFechaProcesso() {
		return fechaProcesso;
	}
	public void setFechaProcesso(String fechaProcesso) {
		this.fechaProcesso = fechaProcesso;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getTipoSolicitud() {
		return tipoSolicitud;
	}
	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}
	public String getNroSolicitud() {
		return nroSolicitud;
	}
	public void setNroSolicitud(String nroSolicitud) {
		this.nroSolicitud = nroSolicitud;
	}
	public String getMotivoAjuste() {
		return motivoAjuste;
	}
	public void setMotivoAjuste(String motivoAjuste) {
		this.motivoAjuste = motivoAjuste;
	}
	public String getAreaAjuste() {
		return areaAjuste;
	}
	public void setAreaAjuste(String areaAjuste) {
		this.areaAjuste = areaAjuste;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getFiller() {
		return filler;
	}
	public void setFiller(String filler) {
		this.filler = filler;
	}
	@Override
	public String toString() {
		return "Detalhe [tipo=" + tipo + ", acquirerId=" + acquirerId + ", produto=" + produto + ", comercio="
				+ comercio + ", sucursal=" + sucursal + ", departamento=" + departamento + ", fechaMovimento="
				+ fechaMovimento + ", rubro=" + rubro + ", codigoOperacion=" + codigoOperacion + ", codigoMoneda="
				+ codigoMoneda + ", importe=" + importe + ", fechaProcesso=" + fechaProcesso + ", responsable="
				+ responsable + ", observacion=" + observacion + ", tipoSolicitud=" + tipoSolicitud + ", nroSolicitud="
				+ nroSolicitud + ", motivoAjuste=" + motivoAjuste + ", areaAjuste=" + areaAjuste + ", errorCode="
				+ errorCode + ", filler=" + filler + "]";
	}
	
}
