//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.07.11 às 12:43:42 AM BRT 
//


package br.com.soctest;

import java.sql.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de PacienteDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PacienteDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataCadastro" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dataAlteracao" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="convenio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoExame" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anexoPedido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comentarios" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PacienteDetail", propOrder = {
    "id",
    "nome",
    "dataNascimento",
    "cpf",
    "endereco",
    "dataCadastro",
    "dataAlteracao",
    "email",
    "convenio",
    "tipoExame",
    "anexoPedido",
    "comentarios"
})
public class PacienteDetail {

    protected int id;
    @XmlElement(required = true)
    protected String nome;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected java.util.Date dataNascimento;
    @XmlElement(required = true)
    protected String cpf;
    @XmlElement(required = true)
    protected String endereco;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected java.util.Date dataCadastro;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected java.util.Date dataAlteracao;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String convenio;
    @XmlElement(required = true)
    protected String tipoExame;
    @XmlElement(required = true)
    protected String anexoPedido;
    @XmlElement(required = true)
    protected String comentarios;

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade dataNascimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public java.util.Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define o valor da propriedade dataNascimento.
     * 
     * @param date
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNascimento(java.util.Date date) {
        this.dataNascimento = date;
    }

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Obtém o valor da propriedade dataCadastro.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public java.util.Date getDataCadastro() {
        return dataCadastro;
    }

    /**
     * Define o valor da propriedade dataCadastro.
     * 
     * @param date
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCadastro(java.util.Date date) {
        this.dataCadastro = date;
    }

    /**
     * Obtém o valor da propriedade dataAlteracao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public java.util.Date getDataAlteracao() {
        return dataAlteracao;
    }

    /**
     * Define o valor da propriedade dataAlteracao.
     * 
     * @param date
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAlteracao(java.util.Date date) {
        this.dataAlteracao = date;
    }

    /**
     * Obtém o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtém o valor da propriedade convenio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvenio() {
        return convenio;
    }

    /**
     * Define o valor da propriedade convenio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvenio(String value) {
        this.convenio = value;
    }

    /**
     * Obtém o valor da propriedade tipoExame.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoExame() {
        return tipoExame;
    }

    /**
     * Define o valor da propriedade tipoExame.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoExame(String value) {
        this.tipoExame = value;
    }

    /**
     * Obtém o valor da propriedade anexoPedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnexoPedido() {
        return anexoPedido;
    }

    /**
     * Define o valor da propriedade anexoPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnexoPedido(String value) {
        this.anexoPedido = value;
    }

    /**
     * Obtém o valor da propriedade comentarios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * Define o valor da propriedade comentarios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarios(String value) {
        this.comentarios = value;
    }

}
