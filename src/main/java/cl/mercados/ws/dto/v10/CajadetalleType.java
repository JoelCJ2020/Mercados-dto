//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.10.02 a las 05:42:25 PM CLST 
//


package cl.mercados.ws.dto.v10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CajadetalleType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CajadetalleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="caja_id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="productoId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CajadetalleType", propOrder = {
    "cantidad",
    "cajaId",
    "productoId"
})
@XmlSeeAlso({
    OutputCajadetalleObtener.class,
    OutputCajadetalleCrear.class,
    InputCajadetalleActualizar.class,
    InputCajadetalleCrear.class
})
public class CajadetalleType {

    protected int cantidad;
    @XmlElement(name = "caja_id")
    protected long cajaId;
    protected long productoId;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad cajaId.
     * 
     */
    public long getCajaId() {
        return cajaId;
    }

    /**
     * Define el valor de la propiedad cajaId.
     * 
     */
    public void setCajaId(long value) {
        this.cajaId = value;
    }

    /**
     * Obtiene el valor de la propiedad productoId.
     * 
     */
    public long getProductoId() {
        return productoId;
    }

    /**
     * Define el valor de la propiedad productoId.
     * 
     */
    public void setProductoId(long value) {
        this.productoId = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

}
