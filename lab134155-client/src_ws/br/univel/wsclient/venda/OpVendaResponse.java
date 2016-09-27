
package br.univel.wsclient.venda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de opVendaResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="opVendaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultVenda" type="{http://webservices/}venda" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "opVendaResponse", propOrder = {
    "resultVenda"
})
public class OpVendaResponse {

    protected Venda resultVenda;

    /**
     * Obtém o valor da propriedade resultVenda.
     * 
     * @return
     *     possible object is
     *     {@link Venda }
     *     
     */
    public Venda getResultVenda() {
        return resultVenda;
    }

    /**
     * Define o valor da propriedade resultVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link Venda }
     *     
     */
    public void setResultVenda(Venda value) {
        this.resultVenda = value;
    }

}
