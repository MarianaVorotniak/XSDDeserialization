
package com.homeaway.invoice.br.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Ddii - Baja Suministro Inmediato de Declaraciones Informativas. 
 * 
 * <p>Java class for BajaDI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BajaDI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cabecera" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ddii/enol/ws/DeclaracionInformativa.xsd}CabeceraConsultaDI"/&gt;
 *         &lt;element name="Declarado" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ddii/enol/ws/DeclaracionInformativa.xsd}DeclaradoType2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BajaDI", propOrder = {
    "cabecera",
    "declarado"
})
public class BajaDI {

    @XmlElement(name = "Cabecera", required = true)
    protected CabeceraConsultaDI cabecera;
    @XmlElement(name = "Declarado", required = true)
    protected DeclaradoType2 declarado;

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

    /**
     * Gets the value of the declarado property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaradoType2 }
     *     
     */
    public DeclaradoType2 getDeclarado() {
        return declarado;
    }

    /**
     * Sets the value of the declarado property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaradoType2 }
     *     
     */
    public void setDeclarado(DeclaradoType2 value) {
        this.declarado = value;
    }

}
