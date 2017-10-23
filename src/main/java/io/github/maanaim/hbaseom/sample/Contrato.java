package io.github.maanaim.hbaseom.sample;

import java.math.BigDecimal;
import java.util.Date;

import io.github.maanaim.hbaseom.annotation.HBaseColumn;
import io.github.maanaim.hbaseom.annotation.HBaseRowKey;
import io.github.maanaim.hbaseom.annotation.HBaseTable;
import io.github.maanaim.hbaseom.mapper.HBaseFormat;

@HBaseTable(name = "VISAO360.CONSOLIDADO_CONTRATO")
public class Contrato {

  @HBaseRowKey
  private String id;

  @HBaseColumn(family = "0", qualifier = "NUM_CONTRATO")
  private String numContrato;

  @HBaseColumn(family = "0", qualifier = "IND_CONTRATO")
  private Integer indContrato;

  @HBaseColumn(family = "0", qualifier = "COD_CPF_CNPJ")
  private String codCpfCnpj;

  @HBaseColumn(family = "0", qualifier = "TIPO_RELACIONAMENTO")
  private String tipoRelacionamento;

  @HBaseColumn(family = "0", qualifier = "SISTEMA")
  private String sistema;

  @HBaseColumn(family = "0", qualifier = "NUM_BILHETE")
  private Long numBilhete;

  @HBaseColumn(family = "0", qualifier = "NUM_RAMO_EMISSOR")
  private Integer numRamoEmissor;

  @HBaseColumn(family = "0", qualifier = "NUM_APOLICE")
  private Long numApolice;

  @HBaseColumn(family = "0", qualifier = "NUM_ITEM")
  private Integer numItem;

  @HBaseColumn(family = "0", qualifier = "NUM_ENDOSSO")
  private Integer numEndosso;

  @HBaseColumn(family = "0", qualifier = "NUM_CERTIFICADO")
  private Long numCertificado;

  @HBaseColumn(family = "0", qualifier = "NUM_RISCO")
  private Integer numRisco;

  @HBaseColumn(family = "0", qualifier = "NUM_CONTRATO_TERC")
  private Long numContratoTerc;

  @HBaseColumn(family = "0", qualifier = "NUM_PLANO")
  private Integer numPlano;

  @HBaseColumn(family = "0", qualifier = "NUM_SERIE")
  private Integer numSerie;

  @HBaseColumn(family = "0", qualifier = "NUM_TITULO")
  private Integer numTitulo;

  @HBaseColumn(family = "0", qualifier = "NUM_MOD_PLANO")
  private Integer numModPlano;

  @HBaseColumn(family = "0", qualifier = "COD_GRUPO")
  private Integer codGrupo;

  @HBaseColumn(family = "0", qualifier = "COD_COTA")
  private Integer codCota;

  @HBaseColumn(family = "0", qualifier = "NUM_VERSAO")
  private Integer numVersao;

  @HBaseColumn(family = "0", qualifier = "NUM_CONTRATO_VINC")
  private Long numContratoVinc;

  @HBaseColumn(family = "0", qualifier = "NUM_PROPOSTA")
  private Long numProposta;

  @HBaseColumn(family = "0", qualifier = "COD_PRODUTO")
  private Long codProduto;

  @HBaseColumn(family = "0", qualifier = "COD_PRODUTO_BU")
  private Long codProdutoBu;

  @HBaseColumn(family = "0", qualifier = "TIPO_CONTRATO")
  private String tipoContrato;

  @HBaseColumn(family = "0", qualifier = "COD_SUBGRUPO")
  private Integer codSubgrupo;

  @HBaseColumn(family = "0", qualifier = "NUM_APOLICE_ANT")
  private Long numApoliceAnt;

  @HBaseColumn(family = "0", qualifier = "NUM_CERTIFICADO_ANT")
  private Long numCertificadoAnt;

  @HBaseColumn(family = "0", qualifier = "NUM_BILHETE_ANT")
  private Long numBilheteAnt;

  @HBaseColumn(family = "0", qualifier = "NUM_CONTRATO_ANT")
  private String numContratoAnt;

  @HBaseColumn(family = "0", qualifier = "NUM_PLANO_ANT")
  private Integer numPlanoAnt;

  @HBaseColumn(family = "0", qualifier = "NUM_SERIE_ANT")
  private Integer numSerieAnt;

  @HBaseColumn(family = "0", qualifier = "NUM_TITULO_ANT")
  private Integer numTituloAnt;

  @HBaseColumn(family = "0", qualifier = "NUM_MOD_PLANO_ANT")
  private Integer numModPlanoAnt;

  @HBaseColumn(family = "0", qualifier = "NUM_PROPOSTA_ANT")
  private Long numPropostaAnt;

  @HBaseColumn(family = "0", qualifier = "COD_AGENCIA_VENDA")
  private Integer codAgenciaVenda;

  @HBaseColumn(family = "0", qualifier = "COD_AGENCIA_COBRANCA")
  private Integer codAgenciaCobranca;

  @HBaseColumn(family = "0", qualifier = "CANAL_VENDA")
  private String canalVenda;

  @HBaseColumn(family = "0", qualifier = "SITUACAO_CONTRATO")
  private String situacaoContrato;

  @HBaseColumn(family = "0", qualifier = "DTH_EMISSAO_PROPOSTA", format = HBaseFormat.DATE)
  private Date dataHoraEmissaoProposta;

  @HBaseColumn(family = "0", qualifier = "DTH_EMISSAO_CONTRATO", format = HBaseFormat.DATE)
  private Date dataHoraEmissaoContrato;

  @HBaseColumn(family = "0", qualifier = "NOM_PRODUTO")
  private String nomeProduto;

  @HBaseColumn(family = "0", qualifier = "NOM_PRODUTO_BU")
  private String nomeProdutoBu;

  @HBaseColumn(family = "0", qualifier = "SEGMENTO_PRODUTO")
  private String segmentoProduto;

  @HBaseColumn(family = "0", qualifier = "OPCAO_PAGAMENTO")
  private String opcaoPagamento;

  @HBaseColumn(family = "0", qualifier = "FORMA_PAGAMENTO")
  private String formaPagamento;

  @HBaseColumn(family = "0", qualifier = "NUM_PARC_CONTRATADAS")
  private Integer numParcContratadas;

  @HBaseColumn(family = "0", qualifier = "NUM_MATRI_VENDEDOR")
  private String numMatriVendedor;

  @HBaseColumn(family = "0", qualifier = "QTD_VIDA_SEGURADA")
  private Integer qtdVidaSegurada;

  @HBaseColumn(family = "0", qualifier = "VLR_IOF")
  private BigDecimal valorIof;

  @HBaseColumn(family = "0", qualifier = "DTH_QUITACAO", format = HBaseFormat.DATE)
  private Date dataHoraQuitacao;

  @HBaseColumn(family = "0", qualifier = "DTH_CANCELAMENTO", format = HBaseFormat.DATE)
  private Date dataHoraCancelamento;

  @HBaseColumn(family = "0", qualifier = "DTH_VENC_PARCELA", format = HBaseFormat.DATE)
  private Date dataHoraVencParcela;

  @HBaseColumn(family = "0", qualifier = "DTH_DECLINIO", format = HBaseFormat.DATE)
  private Date dataHoraDeclinio;

  @HBaseColumn(family = "0", qualifier = "DTH_ASSINATURA", format = HBaseFormat.DATE)
  private Date dataHoraAssinatura;

  @HBaseColumn(family = "0", qualifier = "DTH_AVERBACAO", format = HBaseFormat.DATE)
  private Date dataHoraAverbacao;

  @HBaseColumn(family = "0", qualifier = "DTH_EFETIVACAO", format = HBaseFormat.DATE)
  private Date dataHoraEfetivacao;

  @HBaseColumn(family = "0", qualifier = "DTH_INI_AMORTIZ", format = HBaseFormat.DATE)
  private Date dataHoraIniAmortiz;

  @HBaseColumn(family = "0", qualifier = "DTH_REJEICAO_PROP", format = HBaseFormat.DATE)
  private Date dataHoraRejeicaoProp;

  @HBaseColumn(family = "0", qualifier = "DTH_INI_VIGENCIA", format = HBaseFormat.DATE)
  private Date dataHoraIniVigencia;

  @HBaseColumn(family = "0", qualifier = "DTH_FIM_VIGENCIA", format = HBaseFormat.DATE)
  private Date dataHoraFimVigencia;

  @HBaseColumn(family = "0", qualifier = "VLR_PREMIO_MIP")
  private BigDecimal valorPremioMip;

  @HBaseColumn(family = "0", qualifier = "VLR_PREMIO_DFI")
  private BigDecimal valorPremioDfi;

  @HBaseColumn(family = "0", qualifier = "VLR_IS_MIP")
  private BigDecimal valorIsMip;

  @HBaseColumn(family = "0", qualifier = "VLR_IS_DFI")
  private BigDecimal valorIsDfi;

  @HBaseColumn(family = "0", qualifier = "VLR_BEM")
  private BigDecimal valorBem;

  @HBaseColumn(family = "0", qualifier = "VLR_IMP_SEGURADA")
  private BigDecimal valorImpSegurada;

  @HBaseColumn(family = "0", qualifier = "VLR_PARCELA")
  private BigDecimal valorParcela;

  @HBaseColumn(family = "0", qualifier = "DTH_VENDA", format = HBaseFormat.DATE)
  private Date dataHoraVenda;

  @HBaseColumn(family = "0", qualifier = "ITEM_SEGURADO")
  private String itemSegurado;

  @HBaseColumn(family = "0", qualifier = "VLR_PROPOSTA")
  private BigDecimal valorProposta;

  @HBaseColumn(family = "0", qualifier = "VLR_FRANQUIA")
  private BigDecimal valorFranquia;

  @HBaseColumn(family = "0", qualifier = "VLR_PREMIO_BRUTO")
  private BigDecimal valorPremioBruto;

  @HBaseColumn(family = "0", qualifier = "VLR_PREMIO_LIQUIDO")
  private BigDecimal valorPremioLiquido;

  @HBaseColumn(family = "0", qualifier = "VLR_SALDO_DEVEDOR")
  private BigDecimal valorSaldoDevedor;

  @HBaseColumn(family = "0", qualifier = "COBERTURAS_CONTRATADAS")
  private String coberturasContratadas;

  @HBaseColumn(family = "0", qualifier = "ASSISTENCIAS_UTILIZADAS")
  private String assistenciasUtilizadas;

  @HBaseColumn(family = "0", qualifier = "STA_CONTRATO_LEGADO")
  private String staContratoLegado;

  @HBaseColumn(family = "0", qualifier = "DTH_REFERENCIA", format = HBaseFormat.DATETIME)
  private Date dataHoraReferencia;

  @HBaseColumn(family = "0", qualifier = "DTH_ATUALIZACAO", format = HBaseFormat.DATETIME)
  private Date dataHoraAtualizacao;

  @HBaseColumn(family = "0", qualifier = "EMAIL")
  private String email;

  @HBaseColumn(family = "0", qualifier = "TELEFONE")
  private String telefone;

  @HBaseColumn(family = "0", qualifier = "ENDERECO")
  private String endereco;

  @HBaseColumn(family = "0", qualifier = "BAIRRO")
  private String bairro;

  @HBaseColumn(family = "0", qualifier = "UF")
  private String uf;

  @HBaseColumn(family = "0", qualifier = "CIDADE")
  private String cidade;

  @HBaseColumn(family = "0", qualifier = "CEP")
  private String cep;

  @HBaseColumn(family = "0", qualifier = "NOM_PESSOA")
  private String nomePessoa;

  @HBaseColumn(family = "0", qualifier = "DES_SEGMENTO")
  private String desSegmento;

  @HBaseColumn(family = "0", qualifier = "DES_DIRETORIA")
  private String desDiretoria;

  @HBaseColumn(family = "0", qualifier = "DES_GRUPO")
  private String desGrupo;

  @HBaseColumn(family = "0", qualifier = "COD_OPER_CONTRATO")
  private String codOperContrato;

  @HBaseColumn(family = "0", qualifier = "DES_OPER_CONTRATO")
  private String desOperContrato;

  @HBaseColumn(family = "0", qualifier = "TIPO_PESSOA")
  private String tipoPessoa;

  @HBaseColumn(family = "0", qualifier = "COD_TIPO_RELACIONAMENTO")
  private Integer codTipoRelacionamento;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNumContrato() {
    return numContrato;
  }

  public void setNumContrato(String numeroContrato) {
    this.numContrato = numeroContrato;
  }

  public Integer getIndContrato() {
    return indContrato;
  }

  public void setIndContrato(Integer indContrato) {
    this.indContrato = indContrato;
  }

  public String getCodCpfCnpj() {
    return codCpfCnpj;
  }

  public void setCodCpfCnpj(String codigoCpfCnpj) {
    this.codCpfCnpj = codigoCpfCnpj;
  }

  public String getTipoRelacionamento() {
    return tipoRelacionamento;
  }

  public void setTipoRelacionamento(String tipoRelacionamento) {
    this.tipoRelacionamento = tipoRelacionamento;
  }

  public String getSistema() {
    return sistema;
  }

  public void setSistema(String sistema) {
    this.sistema = sistema;
  }

  public Long getNumBilhete() {
    return numBilhete;
  }

  public void setNumBilhete(Long numeroBilhete) {
    this.numBilhete = numeroBilhete;
  }

  public Integer getNumRamoEmissor() {
    return numRamoEmissor;
  }

  public void setNumRamoEmissor(Integer numeroRamoEmissor) {
    this.numRamoEmissor = numeroRamoEmissor;
  }

  public Long getNumApolice() {
    return numApolice;
  }

  public void setNumApolice(Long numeroApolice) {
    this.numApolice = numeroApolice;
  }

  public Integer getNumItem() {
    return numItem;
  }

  public void setNumItem(Integer numeroItem) {
    this.numItem = numeroItem;
  }

  public Integer getNumEndosso() {
    return numEndosso;
  }

  public void setNumEndosso(Integer numeroEndosso) {
    this.numEndosso = numeroEndosso;
  }

  public Long getNumCertificado() {
    return numCertificado;
  }

  public void setNumCertificado(Long numeroCertificado) {
    this.numCertificado = numeroCertificado;
  }

  public Integer getNumRisco() {
    return numRisco;
  }

  public void setNumRisco(Integer numeroRisco) {
    this.numRisco = numeroRisco;
  }

  public Long getNumContratoTerc() {
    return numContratoTerc;
  }

  public void setNumContratoTerc(Long numeroContratoTerc) {
    this.numContratoTerc = numeroContratoTerc;
  }

  public Integer getNumPlano() {
    return numPlano;
  }

  public void setNumPlano(Integer numeroPlano) {
    this.numPlano = numeroPlano;
  }

  public Integer getNumSerie() {
    return numSerie;
  }

  public void setNumSerie(Integer numeroSerie) {
    this.numSerie = numeroSerie;
  }

  public Integer getNumTitulo() {
    return numTitulo;
  }

  public void setNumTitulo(Integer numeroTitulo) {
    this.numTitulo = numeroTitulo;
  }

  public Integer getNumModPlano() {
    return numModPlano;
  }

  public void setNumModPlano(Integer numeroModPlano) {
    this.numModPlano = numeroModPlano;
  }

  public Integer getCodGrupo() {
    return codGrupo;
  }

  public void setCodGrupo(Integer codigoGrupo) {
    this.codGrupo = codigoGrupo;
  }

  public Integer getCodCota() {
    return codCota;
  }

  public void setCodCota(Integer codigoCota) {
    this.codCota = codigoCota;
  }

  public Integer getNumVersao() {
    return numVersao;
  }

  public void setNumVersao(Integer numeroVersao) {
    this.numVersao = numeroVersao;
  }

  public Long getNumContratoVinc() {
    return numContratoVinc;
  }

  public void setNumContratoVinc(Long numeroContratoVinc) {
    this.numContratoVinc = numeroContratoVinc;
  }

  public Long getNumProposta() {
    return numProposta;
  }

  public void setNumProposta(Long numeroProposta) {
    this.numProposta = numeroProposta;
  }

  public Long getCodProduto() {
    return codProduto;
  }

  public void setCodProduto(Long codigoProduto) {
    this.codProduto = codigoProduto;
  }

  public Long getCodProdutoBu() {
    return codProdutoBu;
  }

  public void setCodProdutoBu(Long codigoProdutoBu) {
    this.codProdutoBu = codigoProdutoBu;
  }

  public String getTipoContrato() {
    return tipoContrato;
  }

  public void setTipoContrato(String tipoContrato) {
    this.tipoContrato = tipoContrato;
  }

  public Integer getCodSubgrupo() {
    return codSubgrupo;
  }

  public void setCodSubgrupo(Integer codigoSubgrupo) {
    this.codSubgrupo = codigoSubgrupo;
  }

  public Long getNumApoliceAnt() {
    return numApoliceAnt;
  }

  public void setNumApoliceAnt(Long numeroApoliceAnt) {
    this.numApoliceAnt = numeroApoliceAnt;
  }

  public Long getNumCertificadoAnt() {
    return numCertificadoAnt;
  }

  public void setNumCertificadoAnt(Long numeroCertificadoAnt) {
    this.numCertificadoAnt = numeroCertificadoAnt;
  }

  public Long getNumBilheteAnt() {
    return numBilheteAnt;
  }

  public void setNumBilheteAnt(Long numeroBilheteAnt) {
    this.numBilheteAnt = numeroBilheteAnt;
  }

  public String getNumContratoAnt() {
    return numContratoAnt;
  }

  public void setNumContratoAnt(String numeroContratoAnt) {
    this.numContratoAnt = numeroContratoAnt;
  }

  public Integer getNumPlanoAnt() {
    return numPlanoAnt;
  }

  public void setNumPlanoAnt(Integer numeroPlanoAnt) {
    this.numPlanoAnt = numeroPlanoAnt;
  }

  public Integer getNumSerieAnt() {
    return numSerieAnt;
  }

  public void setNumSerieAnt(Integer numeroSerieAnt) {
    this.numSerieAnt = numeroSerieAnt;
  }

  public Integer getNumTituloAnt() {
    return numTituloAnt;
  }

  public void setNumTituloAnt(Integer numeroTituloAnt) {
    this.numTituloAnt = numeroTituloAnt;
  }

  public Integer getNumModPlanoAnt() {
    return numModPlanoAnt;
  }

  public void setNumModPlanoAnt(Integer numeroModPlanoAnt) {
    this.numModPlanoAnt = numeroModPlanoAnt;
  }

  public Long getNumPropostaAnt() {
    return numPropostaAnt;
  }

  public void setNumPropostaAnt(Long numeroPropostaAnt) {
    this.numPropostaAnt = numeroPropostaAnt;
  }

  public Integer getCodAgenciaVenda() {
    return codAgenciaVenda;
  }

  public void setCodAgenciaVenda(Integer codigoAgenciaVenda) {
    this.codAgenciaVenda = codigoAgenciaVenda;
  }

  public Integer getCodAgenciaCobranca() {
    return codAgenciaCobranca;
  }

  public void setCodAgenciaCobranca(Integer codigoAgenciaCobranca) {
    this.codAgenciaCobranca = codigoAgenciaCobranca;
  }

  public String getCanalVenda() {
    return canalVenda;
  }

  public void setCanalVenda(String canalVenda) {
    this.canalVenda = canalVenda;
  }

  public String getSituacaoContrato() {
    return situacaoContrato;
  }

  public void setSituacaoContrato(String situacaoContrato) {
    this.situacaoContrato = situacaoContrato;
  }

  public Date getDataHoraEmissaoProposta() {
    return dataHoraEmissaoProposta;
  }

  public void setDataHoraEmissaoProposta(Date dataHoraEmissaoProposta) {
    this.dataHoraEmissaoProposta = dataHoraEmissaoProposta;
  }

  public Date getDataHoraEmissaoContrato() {
    return dataHoraEmissaoContrato;
  }

  public void setDataHoraEmissaoContrato(Date dataHoraEmissaoContrato) {
    this.dataHoraEmissaoContrato = dataHoraEmissaoContrato;
  }

  public String getNomeProduto() {
    return nomeProduto;
  }

  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }

  public String getNomeProdutoBu() {
    return nomeProdutoBu;
  }

  public void setNomeProdutoBu(String nomeProdutoBu) {
    this.nomeProdutoBu = nomeProdutoBu;
  }

  public String getSegmentoProduto() {
    return segmentoProduto;
  }

  public void setSegmentoProduto(String segmentoProduto) {
    this.segmentoProduto = segmentoProduto;
  }

  public String getOpcaoPagamento() {
    return opcaoPagamento;
  }

  public void setOpcaoPagamento(String opcaoPagamento) {
    this.opcaoPagamento = opcaoPagamento;
  }

  public String getFormaPagamento() {
    return formaPagamento;
  }

  public void setFormaPagamento(String formaPagamento) {
    this.formaPagamento = formaPagamento;
  }

  public Integer getNumParcContratadas() {
    return numParcContratadas;
  }

  public void setNumParcContratadas(Integer numeroParcContratadas) {
    this.numParcContratadas = numeroParcContratadas;
  }

  public String getNumMatriVendedor() {
    return numMatriVendedor;
  }

  public void setNumMatriVendedor(String numeroMatriVendedor) {
    this.numMatriVendedor = numeroMatriVendedor;
  }

  public Integer getQtdVidaSegurada() {
    return qtdVidaSegurada;
  }

  public void setQtdVidaSegurada(Integer qtdVidaSegurada) {
    this.qtdVidaSegurada = qtdVidaSegurada;
  }

  public BigDecimal getValorIof() {
    return valorIof;
  }

  public void setValorIof(BigDecimal valorIof) {
    this.valorIof = valorIof;
  }

  public Date getDataHoraQuitacao() {
    return dataHoraQuitacao;
  }

  public void setDataHoraQuitacao(Date dataHoraQuitacao) {
    this.dataHoraQuitacao = dataHoraQuitacao;
  }

  public Date getDataHoraCancelamento() {
    return dataHoraCancelamento;
  }

  public void setDataHoraCancelamento(Date dataHoraCancelamento) {
    this.dataHoraCancelamento = dataHoraCancelamento;
  }

  public Date getDataHoraVencParcela() {
    return dataHoraVencParcela;
  }

  public void setDataHoraVencParcela(Date dataHoraVencParcela) {
    this.dataHoraVencParcela = dataHoraVencParcela;
  }

  public Date getDataHoraDeclinio() {
    return dataHoraDeclinio;
  }

  public void setDataHoraDeclinio(Date dataHoraDeclinio) {
    this.dataHoraDeclinio = dataHoraDeclinio;
  }

  public Date getDataHoraAssinatura() {
    return dataHoraAssinatura;
  }

  public void setDataHoraAssinatura(Date dataHoraAssinatura) {
    this.dataHoraAssinatura = dataHoraAssinatura;
  }

  public Date getDataHoraAverbacao() {
    return dataHoraAverbacao;
  }

  public void setDataHoraAverbacao(Date dataHoraAverbacao) {
    this.dataHoraAverbacao = dataHoraAverbacao;
  }

  public Date getDataHoraEfetivacao() {
    return dataHoraEfetivacao;
  }

  public void setDataHoraEfetivacao(Date dataHoraEfetivacao) {
    this.dataHoraEfetivacao = dataHoraEfetivacao;
  }

  public Date getDataHoraIniAmortiz() {
    return dataHoraIniAmortiz;
  }

  public void setDataHoraIniAmortiz(Date dataHoraIniAmortiz) {
    this.dataHoraIniAmortiz = dataHoraIniAmortiz;
  }

  public Date getDataHoraRejeicaoProp() {
    return dataHoraRejeicaoProp;
  }

  public void setDataHoraRejeicaoProp(Date dataHoraRejeicaoProp) {
    this.dataHoraRejeicaoProp = dataHoraRejeicaoProp;
  }

  public Date getDataHoraIniVigencia() {
    return dataHoraIniVigencia;
  }

  public void setDataHoraIniVigencia(Date dataHoraIniVigencia) {
    this.dataHoraIniVigencia = dataHoraIniVigencia;
  }

  public Date getDataHoraFimVigencia() {
    return dataHoraFimVigencia;
  }

  public void setDataHoraFimVigencia(Date dataHoraFimVigencia) {
    this.dataHoraFimVigencia = dataHoraFimVigencia;
  }

  public BigDecimal getValorPremioMip() {
    return valorPremioMip;
  }

  public void setValorPremioMip(BigDecimal valorPremioMip) {
    this.valorPremioMip = valorPremioMip;
  }

  public BigDecimal getValorPremioDfi() {
    return valorPremioDfi;
  }

  public void setValorPremioDfi(BigDecimal valorPremioDfi) {
    this.valorPremioDfi = valorPremioDfi;
  }

  public BigDecimal getValorIsMip() {
    return valorIsMip;
  }

  public void setValorIsMip(BigDecimal valorIsMip) {
    this.valorIsMip = valorIsMip;
  }

  public BigDecimal getValorIsDfi() {
    return valorIsDfi;
  }

  public void setValorIsDfi(BigDecimal valorIsDfi) {
    this.valorIsDfi = valorIsDfi;
  }

  public BigDecimal getValorBem() {
    return valorBem;
  }

  public void setValorBem(BigDecimal valorBem) {
    this.valorBem = valorBem;
  }

  public BigDecimal getValorImpSegurada() {
    return valorImpSegurada;
  }

  public void setValorImpSegurada(BigDecimal valorImpSegurada) {
    this.valorImpSegurada = valorImpSegurada;
  }

  public BigDecimal getValorParcela() {
    return valorParcela;
  }

  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  public Date getDataHoraVenda() {
    return dataHoraVenda;
  }

  public void setDataHoraVenda(Date dataHoraVenda) {
    this.dataHoraVenda = dataHoraVenda;
  }

  public String getItemSegurado() {
    return itemSegurado;
  }

  public void setItemSegurado(String itemSegurado) {
    this.itemSegurado = itemSegurado;
  }

  public BigDecimal getValorProposta() {
    return valorProposta;
  }

  public void setValorProposta(BigDecimal valorProposta) {
    this.valorProposta = valorProposta;
  }

  public BigDecimal getValorFranquia() {
    return valorFranquia;
  }

  public void setValorFranquia(BigDecimal valorFranquia) {
    this.valorFranquia = valorFranquia;
  }

  public BigDecimal getValorPremioBruto() {
    return valorPremioBruto;
  }

  public void setValorPremioBruto(BigDecimal valorPremioBruto) {
    this.valorPremioBruto = valorPremioBruto;
  }

  public BigDecimal getValorPremioLiquido() {
    return valorPremioLiquido;
  }

  public void setValorPremioLiquido(BigDecimal valorPremioLiquido) {
    this.valorPremioLiquido = valorPremioLiquido;
  }

  public BigDecimal getValorSaldoDevedor() {
    return valorSaldoDevedor;
  }

  public void setValorSaldoDevedor(BigDecimal valorSaldoDevedor) {
    this.valorSaldoDevedor = valorSaldoDevedor;
  }

  public String getCoberturasContratadas() {
    return coberturasContratadas;
  }

  public void setCoberturasContratadas(String coberturasContratadas) {
    this.coberturasContratadas = coberturasContratadas;
  }

  public String getAssistenciasUtilizadas() {
    return assistenciasUtilizadas;
  }

  public void setAssistenciasUtilizadas(String assistenciasUtilizadas) {
    this.assistenciasUtilizadas = assistenciasUtilizadas;
  }

  public String getStaContratoLegado() {
    return staContratoLegado;
  }

  public void setStaContratoLegado(String staContratoLegado) {
    this.staContratoLegado = staContratoLegado;
  }

  public Date getDataHoraReferencia() {
    return dataHoraReferencia;
  }

  public void setDataHoraReferencia(Date dataHoraReferencia) {
    this.dataHoraReferencia = dataHoraReferencia;
  }

  public Date getDataHoraAtualizacao() {
    return dataHoraAtualizacao;
  }

  public void setDataHoraAtualizacao(Date dataHoraAtualizacao) {
    this.dataHoraAtualizacao = dataHoraAtualizacao;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getUf() {
    return uf;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getNomePessoa() {
    return nomePessoa;
  }

  public void setNomePessoa(String nomePessoa) {
    this.nomePessoa = nomePessoa;
  }

  public String getDesSegmento() {
    return desSegmento;
  }

  public void setDesSegmento(String desSegmento) {
    this.desSegmento = desSegmento;
  }

  public String getDesDiretoria() {
    return desDiretoria;
  }

  public void setDesDiretoria(String desDiretoria) {
    this.desDiretoria = desDiretoria;
  }

  public String getDesGrupo() {
    return desGrupo;
  }

  public void setDesGrupo(String desGrupo) {
    this.desGrupo = desGrupo;
  }

  public String getCodOperContrato() {
    return codOperContrato;
  }

  public void setCodOperContrato(String codigoOperContrato) {
    this.codOperContrato = codigoOperContrato;
  }

  public String getDesOperContrato() {
    return desOperContrato;
  }

  public void setDesOperContrato(String desOperContrato) {
    this.desOperContrato = desOperContrato;
  }

  public String getTipoPessoa() {
    return tipoPessoa;
  }

  public void setTipoPessoa(String tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
  }

  public Integer getCodTipoRelacionamento() {
    return codTipoRelacionamento;
  }

  public void setCodTipoRelacionamento(Integer codigoTipoRelacionamento) {
    this.codTipoRelacionamento = codigoTipoRelacionamento;
  }

  @Override
  public String toString() {
    return "Contrato [id=" + id + ", numeroContrato=" + numContrato + ", indContrato=" + indContrato
        + ", codigoCpfCnpj=" + codCpfCnpj + ", tipoRelacionamento=" + tipoRelacionamento + ", sistema=" + sistema
        + ", numeroBilhete=" + numBilhete + ", numeroRamoEmissor=" + numRamoEmissor + ", numeroApolice="
        + numApolice + ", numeroItem=" + numItem + ", numeroEndosso=" + numEndosso + ", numeroCertificado="
        + numCertificado + ", numeroRisco=" + numRisco + ", numeroContratoTerc=" + numContratoTerc
        + ", numeroPlano=" + numPlano + ", numeroSerie=" + numSerie + ", numeroTitulo=" + numTitulo
        + ", numeroModPlano=" + numModPlano + ", codigoGrupo=" + codGrupo + ", codigoCota=" + codCota
        + ", numeroVersao=" + numVersao + ", numeroContratoVinc=" + numContratoVinc + ", numeroProposta="
        + numProposta + ", codigoProduto=" + codProduto + ", codigoProdutoBu=" + codProdutoBu
        + ", tipoContrato=" + tipoContrato + ", codigoSubgrupo=" + codSubgrupo + ", numeroApoliceAnt="
        + numApoliceAnt + ", numeroCertificadoAnt=" + numCertificadoAnt + ", numeroBilheteAnt=" + numBilheteAnt
        + ", numeroContratoAnt=" + numContratoAnt + ", numeroPlanoAnt=" + numPlanoAnt + ", numeroSerieAnt="
        + numSerieAnt + ", numeroTituloAnt=" + numTituloAnt + ", numeroModPlanoAnt=" + numModPlanoAnt
        + ", numeroPropostaAnt=" + numPropostaAnt + ", codigoAgenciaVenda=" + codAgenciaVenda
        + ", codigoAgenciaCobranca=" + codAgenciaCobranca + ", canalVenda=" + canalVenda + ", situacaoContrato="
        + situacaoContrato + ", dataHoraEmissaoProposta=" + dataHoraEmissaoProposta + ", dataHoraEmissaoContrato="
        + dataHoraEmissaoContrato + ", nomeProduto=" + nomeProduto + ", nomeProdutoBu=" + nomeProdutoBu
        + ", segmentoProduto=" + segmentoProduto + ", opcaoPagamento=" + opcaoPagamento + ", formaPagamento="
        + formaPagamento + ", numeroParcContratadas=" + numParcContratadas + ", numeroMatriVendedor="
        + numMatriVendedor + ", qtdVidaSegurada=" + qtdVidaSegurada + ", valorIof=" + valorIof
        + ", dataHoraQuitacao=" + dataHoraQuitacao + ", dataHoraCancelamento=" + dataHoraCancelamento
        + ", dataHoraVencParcela=" + dataHoraVencParcela + ", dataHoraDeclinio=" + dataHoraDeclinio
        + ", dataHoraAssinatura=" + dataHoraAssinatura + ", dataHoraAverbacao=" + dataHoraAverbacao
        + ", dataHoraEfetivacao=" + dataHoraEfetivacao + ", dataHoraIniAmortiz=" + dataHoraIniAmortiz
        + ", dataHoraRejeicaoProp=" + dataHoraRejeicaoProp + ", dataHoraIniVigencia=" + dataHoraIniVigencia
        + ", dataHoraFimVigencia=" + dataHoraFimVigencia + ", valorPremioMip=" + valorPremioMip + ", valorPremioDfi="
        + valorPremioDfi + ", valorIsMip=" + valorIsMip + ", valorIsDfi=" + valorIsDfi + ", valorBem=" + valorBem
        + ", valorImpSegurada=" + valorImpSegurada + ", valorParcela=" + valorParcela + ", dataHoraVenda="
        + dataHoraVenda + ", itemSegurado=" + itemSegurado + ", valorProposta=" + valorProposta + ", valorFranquia="
        + valorFranquia + ", valorPremioBruto=" + valorPremioBruto + ", valorPremioLiquido=" + valorPremioLiquido
        + ", valorSaldoDevedor=" + valorSaldoDevedor + ", coberturasContratadas=" + coberturasContratadas
        + ", assistenciasUtilizadas=" + assistenciasUtilizadas + ", staContratoLegado=" + staContratoLegado
        + ", dataHoraReferencia=" + dataHoraReferencia + ", dataHoraAtualizacao=" + dataHoraAtualizacao + ", email="
        + email + ", telefone=" + telefone + ", endereco=" + endereco + ", bairro=" + bairro + ", uf=" + uf
        + ", cidade=" + cidade + ", cep=" + cep + ", nomePessoa=" + nomePessoa + ", desSegmento=" + desSegmento
        + ", desDiretoria=" + desDiretoria + ", desGrupo=" + desGrupo + ", codigoOperContrato=" + codOperContrato
        + ", desOperContrato=" + desOperContrato + ", tipoPessoa=" + tipoPessoa + ", codigoTipoRelacionamento="
        + codTipoRelacionamento + "]";
  }

}
