
package br.gov.se.seplag.ebo.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaAgendamentoAtendimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaAgendamentoAtendimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agendamentoAtendimento" type="{http://www.seplag.se.gov.br/EBO/v1}AgendamentoAtendimento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaAgendamentoAtendimento", propOrder = {
    "agendamentoAtendimento"
})
public class ListaAgendamentoAtendimento {

    protected List<AgendamentoAtendimento> agendamentoAtendimento;

    /**
     * Gets the value of the agendamentoAtendimento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agendamentoAtendimento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgendamentoAtendimento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgendamentoAtendimento }
     * 
     * 
     */
    public List<AgendamentoAtendimento> getAgendamentoAtendimento() {
        if (agendamentoAtendimento == null) {
            agendamentoAtendimento = new ArrayList<AgendamentoAtendimento>();
        }
        return this.agendamentoAtendimento;
    }

}
