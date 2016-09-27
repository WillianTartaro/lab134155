
package br.univel.wsclient.crudproduto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de alterarProduto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="alterarProduto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="produto" type="{http://webservices/}produto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alterarProduto", propOrder = {
    "produto"
})
public class AlterarProduto {

    protected Produto produto;

    /**
     * Obtém o valor da propriedade produto.
     * 
     * @return
     *     possible object is
     *     {@link Produto }
     *     
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * Define o valor da propriedade produto.
     * 
     * @param value
     *     allowed object is
     *     {@link Produto }
     *     
     */
    public void setProduto(Produto value) {
        this.produto = value;
    }

}
