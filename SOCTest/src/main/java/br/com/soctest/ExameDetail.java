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
 * <p>Classe Java de ExameDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ExameDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="protocolo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nome_medico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="data_exame" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="tipo_exame" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExameDetail", propOrder = {
    "id",
    "protocolo",
    "nomeMedico",
    "dataExame",
    "tipoExame"
})
public class ExameDetail {

    protected int id;
    @XmlElement(required = true)
    protected String protocolo;
    @XmlElement(name = "nome_medico", required = true)
    protected String nomeMedico;
    @XmlElement(name = "data_exame", required = true)
    @XmlSchemaType(name = "date")
    protected java.util.Date dataExame;
    @XmlElement(name = "tipo_exame")
    protected int tipoExame;

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
     * Obtém o valor da propriedade protocolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolo() {
        return protocolo;
    }

    /**
     * Define o valor da propriedade protocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolo(String value) {
        this.protocolo = value;
    }

    /**
     * Obtém o valor da propriedade nomeMedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMedico() {
        return nomeMedico;
    }

    /**
     * Define o valor da propriedade nomeMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMedico(String value) {
        this.nomeMedico = value;
    }

    /**
     * Obtém o valor da propriedade dataExame.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public java.util.Date getDataExame() {
        return dataExame;
    }

    /**
     * Define o valor da propriedade dataExame.
     * 
     * @param date
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataExame(java.util.Date date) {
        this.dataExame = date;
    }

    /**
     * Obtém o valor da propriedade tipoExame.
     * 
     */
    public int getTipoExame() {
        return tipoExame;
    }

    /**
     * Define o valor da propriedade tipoExame.
     * 
     */
    public void setTipoExame(int value) {
        this.tipoExame = value;
    }

}
