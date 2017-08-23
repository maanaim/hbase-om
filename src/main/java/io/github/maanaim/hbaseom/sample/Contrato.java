package io.github.maanaim.hbaseom.sample;

import java.math.BigDecimal;
import java.util.Date;

import io.github.maanaim.hbaseom.annotation.HBaseColumn;
import io.github.maanaim.hbaseom.annotation.HBaseRowKey;
import io.github.maanaim.hbaseom.annotation.HBaseTable;

@HBaseTable(name = "VISAO360.CONSOLIDADO_CONTRATO")
public class Contrato {

  @HBaseRowKey
  private String id;

  @HBaseColumn(family = "0", qualifier = "NUM_CONTRATO")
  private String numeroContrato;

  @HBaseColumn(family = "0", qualifier = "IND_CONTRATO")
  private Integer indContrato;

  @HBaseColumn(family = "0", qualifier = "COD_CPF_CNPJ")
  private String codigoCpfCnpj;

  @HBaseColumn(family = "0", qualifier = "TIPO_RELACIONAMENTO")
  private String tipoRelacionamento;

  @HBaseColumn(family = "0", qualifier = "SISTEMA")
  private String sistema;

  @HBaseColumn(family = "0", qualifier = "NUM_BILHETE")
  private Long numeroBilhete;

  @HBaseColumn(family = "0", qualifier = "NUM_RAMO_EMISSOR")
  private Integer numeroRamoEmissor;

  @HBaseColumn(family = "0", qualifier = "NUM_APOLICE")
  private Long numeroApolice;

  @HBaseColumn(family = "0", qualifier = "NUM_ITEM")
  private Integer numeroItem;

  @HBaseColumn(family = "0", qualifier = "NUM_ENDOSSO")
  private Integer numeroEndosso;

  @HBaseColumn(family = "0", qualifier = "NUM_CERTIFICADO")
  private Long numeroCertificado;

  @HBaseColumn(family = "0", qualifier = "NUM_RISCO")
  private Integer numeroRisco;

  @HBaseColumn(family = "0", qualifier = "NUM_CONTRATO_TERC")
  private Long numeroContratoTerc;

  @HBaseColumn(family = "0", qualifier = "NUM_PLANO")
  private Integer numeroPlano;

  @HBaseColumn(family = "0", qualifier = "NUM_SERIE")
  private Integer numeroSerie;

  @HBaseColumn(family = "0", qualifier = "NUM_TITULO")
  private Integer numeroTitulo;

  @HBaseColumn(family = "0", qualifier = "NUM_MOD_PLANO")
  private Integer numeroModPlano;

  @HBaseColumn(family = "0", qualifier = "COD_GRUPO")
  private Integer codigoGrupo;

  @HBaseColumn(family = "0", qualifier = "COD_COTA")
  private Integer codigoCota;

  @HBaseColumn(family = "0", qualifier = "NUM_VERSAO")
  private Integer numeroVersao;

  @HBaseColumn(family = "0", qualifier = "NUM_CONTRATO_VINC")
  private Long numeroContratoVinc;

  @HBaseColumn(family = "0", qualifier = "NUM_PROPOSTA")
  private Long numeroProposta;

  @HBaseColumn(family = "0", qualifier = "COD_PRODUTO")
  private Long codigoProduto;

  @HBaseColumn(family = "0", qualifier = "COD_PRODUTO_BU")
  private Long codigoProdutoBu;

  @HBaseColumn(family = "0", qualifier = "TIPO_CONTRATO")
  private String tipoContrato;

  @HBaseColumn(family = "0", qualifier = "COD_SUBGRUPO")
  private Integer codigoSubgrupo;

  @HBaseColumn(family = "0", qualifier = "NUM_APOLICE_ANT")
  private Long numeroApoliceAnt;

  @HBaseColumn(family = "0", qualifier = "NUM_CERTIFICADO_ANT")
  private Long numeroCertificadoAnt;

  @HBaseColumn(family = "0", qualifier = "NUM_BILHETE_ANT")
  private Long numeroBilheteAnt;

  @HBaseColumn(family = "0", qualifier = "NUM_CONTRATO_ANT")
  private String numeroContratoAnt;

  @HBaseColumn(family = "0", qualifier = "NUM_PLANO_ANT")
  private Integer numeroPlanoAnt;

  @HBaseColumn(family = "0", qualifier = "NUM_SERIE_ANT")
  private Integer numeroSerieAnt;

  @HBaseColumn(family = "0", qualifier = "NUM_TITULO_ANT")
  private Integer numeroTituloAnt;

  @HBaseColumn(family = "0", qualifier = "NUM_MOD_PLANO_ANT")
  private Integer numeroModPlanoAnt;

  @HBaseColumn(family = "0", qualifier = "NUM_PROPOSTA_ANT")
  private Long numeroPropostaAnt;

  @HBaseColumn(family = "0", qualifier = "COD_AGENCIA_VENDA")
  private Integer codigoAgenciaVenda;

  @HBaseColumn(family = "0", qualifier = "COD_AGENCIA_COBRANCA")
  private Integer codigoAgenciaCobranca;

  @HBaseColumn(family = "0", qualifier = "CANAL_VENDA")
  private String canalVenda;

  @HBaseColumn(family = "0", qualifier = "SITUACAO_CONTRATO")
  private String situacaoContrato;

  @HBaseColumn(family = "0", qualifier = "DTH_EMISSAO_PROPOSTA")
  private Date dataHoraEmissaoProposta;

  @HBaseColumn(family = "0", qualifier = "DTH_EMISSAO_CONTRATO")
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
  private Integer numeroParcContratadas;

  @HBaseColumn(family = "0", qualifier = "NUM_MATRI_VENDEDOR")
  private String numeroMatriVendedor;

  @HBaseColumn(family = "0", qualifier = "QTD_VIDA_SEGURADA")
  private Integer qtdVidaSegurada;

  @HBaseColumn(family = "0", qualifier = "VLR_IOF")
  private BigDecimal valorIof;

  @HBaseColumn(family = "0", qualifier = "DTH_QUITACAO")
  private Date dataHoraQuitacao;

  @HBaseColumn(family = "0", qualifier = "DTH_CANCELAMENTO")
  private Date dataHoraCancelamento;

  @HBaseColumn(family = "0", qualifier = "DTH_VENC_PARCELA")
  private Date dataHoraVencParcela;

  @HBaseColumn(family = "0", qualifier = "DTH_DECLINIO")
  private Date dataHoraDeclinio;

  @HBaseColumn(family = "0", qualifier = "DTH_ASSINATURA")
  private Date dataHoraAssinatura;

  @HBaseColumn(family = "0", qualifier = "DTH_AVERBACAO")
  private Date dataHoraAverbacao;

  @HBaseColumn(family = "0", qualifier = "DTH_EFETIVACAO")
  private Date dataHoraEfetivacao;

  @HBaseColumn(family = "0", qualifier = "DTH_INI_AMORTIZ")
  private Date dataHoraIniAmortiz;

  @HBaseColumn(family = "0", qualifier = "DTH_REJEICAO_PROP")
  private Date dataHoraRejeicaoProp;

  @HBaseColumn(family = "0", qualifier = "DTH_INI_VIGENCIA")
  private Date dataHoraIniVigencia;

  @HBaseColumn(family = "0", qualifier = "DTH_FIM_VIGENCIA")
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

  @HBaseColumn(family = "0", qualifier = "DTH_VENDA")
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

  @HBaseColumn(family = "0", qualifier = "DTH_REFERENCIA")
  private Date dataHoraReferencia;

  @HBaseColumn(family = "0", qualifier = "DTH_ATUALIZACAO")
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
  private String codigoOperContrato;

  @HBaseColumn(family = "0", qualifier = "DES_OPER_CONTRATO")
  private String desOperContrato;

  @HBaseColumn(family = "0", qualifier = "TIPO_PESSOA")
  private String tipoPessoa;

  @HBaseColumn(family = "0", qualifier = "COD_TIPO_RELACIONAMENTO")
  private Integer codigoTipoRelacionamento;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNumeroContrato() {
    return numeroContrato;
  }

  public void setNumeroContrato(String numeroContrato) {
    this.numeroContrato = numeroContrato;
  }

  public Integer getIndContrato() {
    return indContrato;
  }

  public void setIndContrato(Integer indContrato) {
    this.indContrato = indContrato;
  }

  public String getCodigoCpfCnpj() {
    return codigoCpfCnpj;
  }

  public void setCodigoCpfCnpj(String codigoCpfCnpj) {
    this.codigoCpfCnpj = codigoCpfCnpj;
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

  public Long getNumeroBilhete() {
    return numeroBilhete;
  }

  public void setNumeroBilhete(Long numeroBilhete) {
    this.numeroBilhete = numeroBilhete;
  }

  public Integer getNumeroRamoEmissor() {
    return numeroRamoEmissor;
  }

  public void setNumeroRamoEmissor(Integer numeroRamoEmissor) {
    this.numeroRamoEmissor = numeroRamoEmissor;
  }

  public Long getNumeroApolice() {
    return numeroApolice;
  }

  public void setNumeroApolice(Long numeroApolice) {
    this.numeroApolice = numeroApolice;
  }

  public Integer getNumeroItem() {
    return numeroItem;
  }

  public void setNumeroItem(Integer numeroItem) {
    this.numeroItem = numeroItem;
  }

  public Integer getNumeroEndosso() {
    return numeroEndosso;
  }

  public void setNumeroEndosso(Integer numeroEndosso) {
    this.numeroEndosso = numeroEndosso;
  }

  public Long getNumeroCertificado() {
    return numeroCertificado;
  }

  public void setNumeroCertificado(Long numeroCertificado) {
    this.numeroCertificado = numeroCertificado;
  }

  public Integer getNumeroRisco() {
    return numeroRisco;
  }

  public void setNumeroRisco(Integer numeroRisco) {
    this.numeroRisco = numeroRisco;
  }

  public Long getNumeroContratoTerc() {
    return numeroContratoTerc;
  }

  public void setNumeroContratoTerc(Long numeroContratoTerc) {
    this.numeroContratoTerc = numeroContratoTerc;
  }

  public Integer getNumeroPlano() {
    return numeroPlano;
  }

  public void setNumeroPlano(Integer numeroPlano) {
    this.numeroPlano = numeroPlano;
  }

  public Integer getNumeroSerie() {
    return numeroSerie;
  }

  public void setNumeroSerie(Integer numeroSerie) {
    this.numeroSerie = numeroSerie;
  }

  public Integer getNumeroTitulo() {
    return numeroTitulo;
  }

  public void setNumeroTitulo(Integer numeroTitulo) {
    this.numeroTitulo = numeroTitulo;
  }

  public Integer getNumeroModPlano() {
    return numeroModPlano;
  }

  public void setNumeroModPlano(Integer numeroModPlano) {
    this.numeroModPlano = numeroModPlano;
  }

  public Integer getCodigoGrupo() {
    return codigoGrupo;
  }

  public void setCodigoGrupo(Integer codigoGrupo) {
    this.codigoGrupo = codigoGrupo;
  }

  public Integer getCodigoCota() {
    return codigoCota;
  }

  public void setCodigoCota(Integer codigoCota) {
    this.codigoCota = codigoCota;
  }

  public Integer getNumeroVersao() {
    return numeroVersao;
  }

  public void setNumeroVersao(Integer numeroVersao) {
    this.numeroVersao = numeroVersao;
  }

  public Long getNumeroContratoVinc() {
    return numeroContratoVinc;
  }

  public void setNumeroContratoVinc(Long numeroContratoVinc) {
    this.numeroContratoVinc = numeroContratoVinc;
  }

  public Long getNumeroProposta() {
    return numeroProposta;
  }

  public void setNumeroProposta(Long numeroProposta) {
    this.numeroProposta = numeroProposta;
  }

  public Long getCodigoProduto() {
    return codigoProduto;
  }

  public void setCodigoProduto(Long codigoProduto) {
    this.codigoProduto = codigoProduto;
  }

  public Long getCodigoProdutoBu() {
    return codigoProdutoBu;
  }

  public void setCodigoProdutoBu(Long codigoProdutoBu) {
    this.codigoProdutoBu = codigoProdutoBu;
  }

  public String getTipoContrato() {
    return tipoContrato;
  }

  public void setTipoContrato(String tipoContrato) {
    this.tipoContrato = tipoContrato;
  }

  public Integer getCodigoSubgrupo() {
    return codigoSubgrupo;
  }

  public void setCodigoSubgrupo(Integer codigoSubgrupo) {
    this.codigoSubgrupo = codigoSubgrupo;
  }

  public Long getNumeroApoliceAnt() {
    return numeroApoliceAnt;
  }

  public void setNumeroApoliceAnt(Long numeroApoliceAnt) {
    this.numeroApoliceAnt = numeroApoliceAnt;
  }

  public Long getNumeroCertificadoAnt() {
    return numeroCertificadoAnt;
  }

  public void setNumeroCertificadoAnt(Long numeroCertificadoAnt) {
    this.numeroCertificadoAnt = numeroCertificadoAnt;
  }

  public Long getNumeroBilheteAnt() {
    return numeroBilheteAnt;
  }

  public void setNumeroBilheteAnt(Long numeroBilheteAnt) {
    this.numeroBilheteAnt = numeroBilheteAnt;
  }

  public String getNumeroContratoAnt() {
    return numeroContratoAnt;
  }

  public void setNumeroContratoAnt(String numeroContratoAnt) {
    this.numeroContratoAnt = numeroContratoAnt;
  }

  public Integer getNumeroPlanoAnt() {
    return numeroPlanoAnt;
  }

  public void setNumeroPlanoAnt(Integer numeroPlanoAnt) {
    this.numeroPlanoAnt = numeroPlanoAnt;
  }

  public Integer getNumeroSerieAnt() {
    return numeroSerieAnt;
  }

  public void setNumeroSerieAnt(Integer numeroSerieAnt) {
    this.numeroSerieAnt = numeroSerieAnt;
  }

  public Integer getNumeroTituloAnt() {
    return numeroTituloAnt;
  }

  public void setNumeroTituloAnt(Integer numeroTituloAnt) {
    this.numeroTituloAnt = numeroTituloAnt;
  }

  public Integer getNumeroModPlanoAnt() {
    return numeroModPlanoAnt;
  }

  public void setNumeroModPlanoAnt(Integer numeroModPlanoAnt) {
    this.numeroModPlanoAnt = numeroModPlanoAnt;
  }

  public Long getNumeroPropostaAnt() {
    return numeroPropostaAnt;
  }

  public void setNumeroPropostaAnt(Long numeroPropostaAnt) {
    this.numeroPropostaAnt = numeroPropostaAnt;
  }

  public Integer getCodigoAgenciaVenda() {
    return codigoAgenciaVenda;
  }

  public void setCodigoAgenciaVenda(Integer codigoAgenciaVenda) {
    this.codigoAgenciaVenda = codigoAgenciaVenda;
  }

  public Integer getCodigoAgenciaCobranca() {
    return codigoAgenciaCobranca;
  }

  public void setCodigoAgenciaCobranca(Integer codigoAgenciaCobranca) {
    this.codigoAgenciaCobranca = codigoAgenciaCobranca;
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

  public Integer getNumeroParcContratadas() {
    return numeroParcContratadas;
  }

  public void setNumeroParcContratadas(Integer numeroParcContratadas) {
    this.numeroParcContratadas = numeroParcContratadas;
  }

  public String getNumeroMatriVendedor() {
    return numeroMatriVendedor;
  }

  public void setNumeroMatriVendedor(String numeroMatriVendedor) {
    this.numeroMatriVendedor = numeroMatriVendedor;
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

  public String getCodigoOperContrato() {
    return codigoOperContrato;
  }

  public void setCodigoOperContrato(String codigoOperContrato) {
    this.codigoOperContrato = codigoOperContrato;
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

  public Integer getCodigoTipoRelacionamento() {
    return codigoTipoRelacionamento;
  }

  public void setCodigoTipoRelacionamento(Integer codigoTipoRelacionamento) {
    this.codigoTipoRelacionamento = codigoTipoRelacionamento;
  }

  @Override
  public String toString() {
    return "Contrato [id=" + id + ", numeroContrato=" + numeroContrato + ", indContrato=" + indContrato
        + ", codigoCpfCnpj=" + codigoCpfCnpj + ", tipoRelacionamento=" + tipoRelacionamento + ", sistema=" + sistema
        + ", numeroBilhete=" + numeroBilhete + ", numeroRamoEmissor=" + numeroRamoEmissor + ", numeroApolice="
        + numeroApolice + ", numeroItem=" + numeroItem + ", numeroEndosso=" + numeroEndosso + ", numeroCertificado="
        + numeroCertificado + ", numeroRisco=" + numeroRisco + ", numeroContratoTerc=" + numeroContratoTerc
        + ", numeroPlano=" + numeroPlano + ", numeroSerie=" + numeroSerie + ", numeroTitulo=" + numeroTitulo
        + ", numeroModPlano=" + numeroModPlano + ", codigoGrupo=" + codigoGrupo + ", codigoCota=" + codigoCota
        + ", numeroVersao=" + numeroVersao + ", numeroContratoVinc=" + numeroContratoVinc + ", numeroProposta="
        + numeroProposta + ", codigoProduto=" + codigoProduto + ", codigoProdutoBu=" + codigoProdutoBu
        + ", tipoContrato=" + tipoContrato + ", codigoSubgrupo=" + codigoSubgrupo + ", numeroApoliceAnt="
        + numeroApoliceAnt + ", numeroCertificadoAnt=" + numeroCertificadoAnt + ", numeroBilheteAnt=" + numeroBilheteAnt
        + ", numeroContratoAnt=" + numeroContratoAnt + ", numeroPlanoAnt=" + numeroPlanoAnt + ", numeroSerieAnt="
        + numeroSerieAnt + ", numeroTituloAnt=" + numeroTituloAnt + ", numeroModPlanoAnt=" + numeroModPlanoAnt
        + ", numeroPropostaAnt=" + numeroPropostaAnt + ", codigoAgenciaVenda=" + codigoAgenciaVenda
        + ", codigoAgenciaCobranca=" + codigoAgenciaCobranca + ", canalVenda=" + canalVenda + ", situacaoContrato="
        + situacaoContrato + ", dataHoraEmissaoProposta=" + dataHoraEmissaoProposta + ", dataHoraEmissaoContrato="
        + dataHoraEmissaoContrato + ", nomeProduto=" + nomeProduto + ", nomeProdutoBu=" + nomeProdutoBu
        + ", segmentoProduto=" + segmentoProduto + ", opcaoPagamento=" + opcaoPagamento + ", formaPagamento="
        + formaPagamento + ", numeroParcContratadas=" + numeroParcContratadas + ", numeroMatriVendedor="
        + numeroMatriVendedor + ", qtdVidaSegurada=" + qtdVidaSegurada + ", valorIof=" + valorIof
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
        + ", desDiretoria=" + desDiretoria + ", desGrupo=" + desGrupo + ", codigoOperContrato=" + codigoOperContrato
        + ", desOperContrato=" + desOperContrato + ", tipoPessoa=" + tipoPessoa + ", codigoTipoRelacionamento="
        + codigoTipoRelacionamento + "]";
  }

}
