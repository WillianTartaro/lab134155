
package br.univel.wsclient.crudproduto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de deletarProduto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="deletarProduto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="produtoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletarProduto", propOrder = {
    "produtoId"
})
public class DeletarProduto {

    protected Long produtoId;

    /**
     * Obtém o valor da propriedade produtoId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProdutoId() {
        return produtoId;
    }

    /**
     * Define o valor da propriedade produtoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProdutoId(Long value) {
        this.produtoId = value;
    }

}
