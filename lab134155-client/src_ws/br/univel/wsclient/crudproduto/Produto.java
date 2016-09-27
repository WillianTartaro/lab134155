
package br.univel.wsclient.crudproduto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de produto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="produto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoBarra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="preco" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produto", propOrder = {
    "codigoBarra",
    "descricao",
    "id",
    "preco",
    "version"
})
public class Produto {

    protected String codigoBarra;
    protected String descricao;
    protected Long id;
    protected float preco;
    protected int version;

    /**
     * Obtém o valor da propriedade codigoBarra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBarra() {
        return codigoBarra;
    }

    /**
     * Define o valor da propriedade codigoBarra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBarra(String value) {
        this.codigoBarra = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade id.
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
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade preco.
     * 
     */
    public float getPreco() {
        return preco;
    }

    /**
     * Define o valor da propriedade preco.
     * 
     */
    public void setPreco(float value) {
        this.preco = value;
    }

    /**
     * Obtém o valor da propriedade version.
     * 
     */
    public int getVersion() {
        return version;
    }

    /**
     * Define o valor da propriedade version.
     * 
     */
    public void setVersion(int value) {
        this.version = value;
    }

}
