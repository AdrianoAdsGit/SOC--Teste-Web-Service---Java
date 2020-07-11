//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.07.11 às 12:43:42 AM BRT 
//


package br.com.soctest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TipoExameDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TipoExameDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoExame" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descricaoExame" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoExameDetail", propOrder = {
    "id",
    "tipoExame",
    "descricaoExame"
})
public class TipoExameDetail {

    protected int id;
    @XmlElement(required = true)
    protected String tipoExame;
    @XmlElement(required = true)
    protected String descricaoExame;

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
     * Obtém o valor da propriedade descricaoExame.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoExame() {
        return descricaoExame;
    }

    /**
     * Define o valor da propriedade descricaoExame.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoExame(String value) {
        this.descricaoExame = value;
    }

}
