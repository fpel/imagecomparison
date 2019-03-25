package br.com.pellegrini.imagecomparison.dao;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import br.com.pellegrini.imagecomparison.main.Application;
import br.com.pellegrini.imagecomparison.properties.ApplicationProperties;

public class ArquivoDao implements FilenameFilter {

//	private static final int QNT_CELULAS_ARQUIVO = 16;
//	private static final String FINAL_DE_LINHA = "\n";
//	private static final String TIPO_RODAPE = "FT";
//	private static final String TIPO_CABECALHO = "FH";
//	private static final String TIPO_DETALHE = "DR";
	static Logger logger = Logger.getLogger(Application.class);
	private File diretorioInput;
	private List<String> extFilter;
	
	public ArquivoDao() {
		carregarExtensoesArquivos();
	}
	
	
	
	private void carregarExtensoesArquivos() {
		String prop = ApplicationProperties.getValue("dir.extension");
		if (prop != null) {
			String[] extTemp = prop.split(",");
			extFilter = Arrays.asList(extTemp);
		}
	}



	/*
	 * Carrega a lista de arquivos do diretorio input
	 */
	public List<String> carregarListaArquivosInput() {
		logger.info("Carregando a lista de arquivos do diretorio: " + ApplicationProperties.getValue("dir.input"));
		validaDiretorio(ApplicationProperties.getValue("dir.input"));
		diretorioInput = new File(ApplicationProperties.getValue("dir.input"));
		List<String> lstRetorno = Arrays.asList(diretorioInput.list(this));
		logger.info("Arquivos carregados com sucesso.");
		return lstRetorno;
	}
	
	
	
	/*
	 * Salva os dados do objeto em arquivo texto
	 */
//	public void gerarArquivoPayware(Arquivo arquivo, String nomeArquivo) {
//		logger.info("Iniciando a geracao do arquivo do payware...");
//		validaDiretorio(ApplicationProperties.getValue("dir.output"));
//		
//		File arquivoFinal = new File(ApplicationProperties.getValue("dir.output") + "/" + nomeArquivo);
//		
//		StringBuilder conteudo = converterObjetoEmText(arquivo);
//		gravarDadosNoArquivo(conteudo, arquivoFinal);
//		
//		logger.info("Arquivo [" + nomeArquivo + "] gerado com sucesso.");
//	}
	
	
	
	
//	private void gravarDadosNoArquivo(StringBuilder conteudo, File arquivoFinal) {
//		try {
//			FileUtils.writeStringToFile(arquivoFinal, conteudo.toString());
//		} catch (IOException e) {
//			e.printStackTrace();
//			logger.error(Mensagens.ERRO_GRAVACAO_ARQUIVO_TEXTO + " - " + arquivoFinal.getName());
//			throw new RuntimeException(e);
//		}
//	}



//	private StringBuilder converterObjetoEmText(Arquivo arquivo) {
//		StringBuilder retorno = new StringBuilder();
//		
//		//Cabecalho
//		retorno.append(arquivo.getCabecalho().getTipo());
//		retorno.append(arquivo.getCabecalho().getData());
//		retorno.append(arquivo.getCabecalho().getHora());
//		retorno.append(arquivo.getCabecalho().getLote());
//		retorno.append(arquivo.getCabecalho().getFiller());
//		retorno.append(FINAL_DE_LINHA);
//
//		//Detalhes
//		for (Detalhe d : arquivo.getLstDetalhe()) {
//			retorno.append(d.getTipo());
//			retorno.append(d.getAcquirerId());
//			retorno.append(d.getProduto());
//			retorno.append(d.getComercio());
//			retorno.append(d.getSucursal());
//			retorno.append(d.getDepartamento());
//			retorno.append(d.getFechaMovimento());
//			retorno.append(d.getRubro());
//			retorno.append(d.getCodigoOperacion());
//			retorno.append(d.getCodigoMoneda());
//			retorno.append(d.getImporte());
//			retorno.append(d.getFechaProcesso());
//			retorno.append(d.getResponsable());
//			retorno.append(d.getObservacion());
//			retorno.append(d.getTipoSolicitud());
//			retorno.append(d.getNroSolicitud());
//			retorno.append(d.getMotivoAjuste());
//			retorno.append(d.getAreaAjuste());
//			retorno.append(d.getErrorCode());
//			retorno.append(d.getFiller());
//			retorno.append(FINAL_DE_LINHA);
//		}
//		
//		//Rodape			
//		retorno.append(arquivo.getRodape().getTipo());
//		retorno.append(arquivo.getRodape().getQntRegistros());
//		retorno.append(arquivo.getRodape().getValorTotal());
//		retorno.append(arquivo.getRodape().getFiller());
//		retorno.append(FINAL_DE_LINHA);
//
//		return retorno;
//	}



	/*
	 * Move o arquivo passado por parametro para o diretorio de backup
	 */
	public boolean moveArquivoBackup(String arq) {
		logger.info("Movendo o arquivo " + arq + " para o backup");
		validaDiretorio(ApplicationProperties.getValue("dir.backup"));
		File original = new File(ApplicationProperties.getValue("dir.input") + "/" + arq);
		return original.renameTo(new File(ApplicationProperties.getValue("dir.output") + "/" + arq));
	}
	
	
	private void validaDiretorio(String dir) {
		logger.debug("Verificando se o diretorio [" + dir + "] existe.");
		File diretorioTemp = new File(dir);
		if (!diretorioTemp.exists() || !diretorioTemp.isDirectory()) {
			logger.debug("Diretorio inexistente. Criando.");
			diretorioTemp.mkdir();
		}
	}

	
	
//	public Arquivo lerDadosDoArquivo(String nomeArquivo) {
//		logger.info("Iniciando carga do arquivo " + nomeArquivo);
//		Arquivo retorno = null;
//		
//		try {
//			FileInputStream arqEntrada = new FileInputStream(new File(ApplicationProperties.getValue("dir.input") + "/" + nomeArquivo));
//
//			Sheet sheet = null;
//			if (nomeArquivo.toUpperCase().endsWith(".XLS")) {
//				//Converte XLS
//				Workbook workbook = new HSSFWorkbook(arqEntrada);
//				sheet = workbook.getSheetAt(0);
//			} else if (nomeArquivo.toUpperCase().endsWith(".XLSX")) {
//				//Converte XLSX
//				Workbook workbook = new XSSFWorkbook(arqEntrada);
//				sheet = (XSSFSheet) workbook.getSheetAt(0);
//			}
//			retorno = converterArquivoEmObjeto(sheet);
//			
//		} catch (IOException e ) {
//			e.printStackTrace();
//			logger.error(Mensagens.ERRO_ABERTURA_ARQUIVO + " " + nomeArquivo);
//			throw new RuntimeException(e);
//		}
//		logger.info("Arquivo " + nomeArquivo + " carregado com sucesso.");
//		return retorno;
//	}

	
//	private Arquivo converterArquivoEmObjeto(Sheet sheet) {
//		if (sheet==null) return null;
//		Arquivo retorno = new Arquivo();
//		logger.debug("Convertendo o arquivo em objeto.");
//		List<Detalhe> lstDetalhe = new ArrayList<>();
//		int qntRegistros = 0;
//		BigDecimal valorTotal = new BigDecimal(0);
//		
//		//Iterage na linha
//		Iterator<Row> rowIterator = sheet.iterator();
//		while (rowIterator.hasNext()) {
//			Row row = rowIterator.next();
//			Detalhe detalhe = null;
//			try {
//				detalhe = setDadosDetalhe(row);
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}
//			
//			if (detalhe!=null) {
//				valorTotal = valorTotal.add(new BigDecimal(detalhe.getImporte()));
//				lstDetalhe.add(detalhe);
//			}
//			qntRegistros++;
//		}
//		retorno.setLstDetalhe(lstDetalhe);
//		retorno.setCabecalho(setDadosCabecalho());
//		retorno.setRodape(setDadosRodape(qntRegistros, valorTotal));
//		
//		return retorno;
//	}


	@Override
	public boolean accept(File dir, String name) {
		boolean ret = false;
		if (name!=null) {
			for (String ext : extFilter) {
				ret = name.toUpperCase().endsWith("." + ext.toUpperCase());
				if (ret) {
					break;
				}
			}
		}
		return ret;
	}



}
