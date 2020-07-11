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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PacienteDetail" type="{http://soctest.com.br}PacienteDetail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pacienteDetail"
})
@XmlRootElement(name = "GetPacienteByIdResponse")
public class GetPacienteByIdResponse {

    @XmlElement(name = "PacienteDetail", required = true)
    protected PacienteDetail pacienteDetail;

    /**
     * Obtém o valor da propriedade pacienteDetail.
     * 
     * @return
     *     possible object is
     *     {@link PacienteDetail }
     *     
     */
    public PacienteDetail getPacienteDetail() {
        return pacienteDetail;
    }

    /**
     * Define o valor da propriedade pacienteDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link PacienteDetail }
     *     
     */
    public void setPacienteDetail(PacienteDetail value) {
        this.pacienteDetail = value;
    }

}
