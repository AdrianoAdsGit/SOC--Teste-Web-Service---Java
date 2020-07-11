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
 * <p>Classe Java de PacienteExameDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PacienteExameDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_exame" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="desc_exame" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id_paciente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nome_paciente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PacienteExameDetail", propOrder = {
    "id",
    "idExame",
    "descExame",
    "idPaciente",
    "nomePaciente"
})
public class PacienteExameDetail {

    protected int id;
    @XmlElement(name = "id_exame")
    protected int idExame;
    @XmlElement(name = "desc_exame", required = true)
    protected String descExame;
    @XmlElement(name = "id_paciente")
    protected int idPaciente;
    @XmlElement(name = "nome_paciente", required = true)
    protected String nomePaciente;

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
     * Obtém o valor da propriedade idExame.
     * 
     */
    public int getIdExame() {
        return idExame;
    }

    /**
     * Define o valor da propriedade idExame.
     * 
     */
    public void setIdExame(int value) {
        this.idExame = value;
    }

    /**
     * Obtém o valor da propriedade descExame.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescExame() {
        return descExame;
    }

    /**
     * Define o valor da propriedade descExame.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescExame(String value) {
        this.descExame = value;
    }

    /**
     * Obtém o valor da propriedade idPaciente.
     * 
     */
    public int getIdPaciente() {
        return idPaciente;
    }

    /**
     * Define o valor da propriedade idPaciente.
     * 
     */
    public void setIdPaciente(int value) {
        this.idPaciente = value;
    }

    /**
     * Obtém o valor da propriedade nomePaciente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePaciente() {
        return nomePaciente;
    }

    /**
     * Define o valor da propriedade nomePaciente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePaciente(String value) {
        this.nomePaciente = value;
    }

}
