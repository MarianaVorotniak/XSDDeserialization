
package com.homeaway.invoice.br.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Ddii - Consulta Suministro Inmediato de Declaraciones Informativas. 
 * 
 * <p>Java class for ConsultaDI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultaDI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cabecera" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ddii/enol/ws/DeclaracionInformativa.xsd}CabeceraConsultaDI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaDI", propOrder = {
    "cabecera"
})
public class ConsultaDI {

    @XmlElement(name = "Cabecera", required = true)
    protected CabeceraConsultaDI cabecera;

    /**
     * Gets the value of the cabecera property.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraConsultaDI }
     *     
     */
    public CabeceraConsultaDI getCabecera() {
        return cabecera;
    }

    /**
     * Sets the value of the cabecera property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraConsultaDI }
     *     
     */
    public void setCabecera(CabeceraConsultaDI value) {
        this.cabecera = value;
    }

}
