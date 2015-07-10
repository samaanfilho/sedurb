package br.gov.se.seplag.correioscep;

import br.gov.se.seplag.commons.v1.CabecalhoSeplag;
import br.gov.se.seplag.commons.v1.ObjectFactory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebService(wsdlLocation="http://osb02.itconsulting.com.br:8011/V1/CorreiosCEP?WSDL",
  targetNamespace="http://www.seplag.se.gov.br/CorreiosCEP", name="CorreiosCEP_PortType")
@XmlSeeAlso(
  { ObjectFactory.class, br.gov.se.seplag.ebo.v1.ObjectFactory.class, br.gov.se.seplag.correioscep.ObjectFactory.class })
@SOAPBinding(style=Style.DOCUMENT, parameterStyle=ParameterStyle.BARE)
public interface CorreiosCEP_PortType
{
  @WebMethod(operationName="ConsultarEnderecoPorCEP", action="http://www.seplag.se.gov.br/CorreiosCEP/ConsultarEnderecoPorCEP")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://www.seplag.se.gov.br/CorreiosCEP/ConsultarEnderecoPorCEP", fault =
      { @FaultAction(value="http://www.seplag.se.gov.br/CorreiosCEP/CorreiosCEP_PortType/ConsultarEnderecoPorCEP/Fault/TechnicalFault",
          className=br.gov.se.seplag.correioscep.ErroInfoMessage.class),
        @FaultAction(value="http://www.seplag.se.gov.br/CorreiosCEP/CorreiosCEP_PortType/ConsultarEnderecoPorCEP/Fault/TechnicalFault",
          className=br.gov.se.seplag.correioscep.ErroInfoMessage.class),
        @FaultAction(value="http://www.seplag.se.gov.br/CorreiosCEP/CorreiosCEP_PortType/ConsultarEnderecoPorCEP/Fault/TechnicalFault",
          className=br.gov.se.seplag.correioscep.ErroInfoMessage.class) },
    output="http://www.seplag.se.gov.br/CorreiosCEP/CorreiosCEP_PortType/ConsultarEnderecoPorCEPResponse")
  @WebResult(targetNamespace="http://www.seplag.se.gov.br/CorreiosCEP",
    partName="parameters", name="ResultadoConsultarEnderecoPorCEP")
  public br.gov.se.seplag.correioscep.ResultadoConsultarEnderecoPorCEP consultarEnderecoPorCEP(@WebParam(targetNamespace="http://www.seplag.se.gov.br/CorreiosCEP",
      partName="parameters", name="ParametroConsultarEnderecoPorCEP")
    br.gov.se.seplag.correioscep.ParametroConsultarEnderecoPorCEP parameters,
    @WebParam(targetNamespace="http://www.seplag.se.gov.br/commons/v1",
      partName="Cabecalho", name="cabecalhoSeplag", header=true)
    CabecalhoSeplag Cabecalho)
    throws br.gov.se.seplag.correioscep.ErroInfoMessage, br.gov.se.seplag.correioscep.ErroInfoMessage, br.gov.se.seplag.correioscep.ErroInfoMessage;
}
