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
 * <p>Classe Java de InsertPacienteExameDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="InsertPacienteExameDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_paciente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_exame" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertPacienteExameDetail", propOrder = {
    "id",
    "idPaciente",
    "idExame"
})
public class InsertPacienteExameDetail {

    protected int id;
    @XmlElement(name = "id_paciente")
    protected int idPaciente;
    @XmlElement(name = "id_exame")
    protected int idExame;

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

}
