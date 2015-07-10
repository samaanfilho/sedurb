package br.gov.se.seplag.cicsergipe;

import br.gov.se.seplag.RequestFixo;
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

@WebService(wsdlLocation=RequestFixo.WSDL_LOCATION + "V1/CICSergipe?wsdl",
  targetNamespace="http://www.seplag.se.gov.br/CICSergipe", name="CICSergipe_PortType")
@XmlSeeAlso(
  { ObjectFactory.class, br.gov.se.seplag.ebo.v1.ObjectFactory.class, br.gov.se.seplag.cicsergipe.ObjectFactory.class })
@SOAPBinding(style=Style.DOCUMENT, parameterStyle=ParameterStyle.BARE)
public interface CICSergipe_PortType
{
  @WebMethod(operationName="ObterCidadao", action="http://www.seplag.se.gov.br/CICSergipe/ObterCidadao")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://www.seplag.se.gov.br/CICSergipe/ObterCidadao", fault =
      { @FaultAction(value="http://www.seplag.se.gov.br/CICSergipe/CICSergipe_PortType/ObterCidadao/Fault/CidadaoNaoEncontradoFault",
          className = ErroInfoMessage.class), @FaultAction(value="http://www.seplag.se.gov.br/CICSergipe/CICSergipe_PortType/ObterCidadao/Fault/CidadaoNaoEncontradoFault",
          className = ErroInfoMessage.class), @FaultAction(value="http://www.seplag.se.gov.br/CICSergipe/CICSergipe_PortType/ObterCidadao/Fault/CidadaoNaoEncontradoFault",
          className = ErroInfoMessage.class) }, output="http://www.seplag.se.gov.br/CICSergipe/CICSergipe_PortType/ObterCidadaoResponse")
  @WebResult(targetNamespace="http://www.seplag.se.gov.br/CICSergipe",
    partName="parameters", name="ResultadoObterCidadao")
  public ResultadoObterCidadao obterCidadao(@WebParam(targetNamespace="http://www.seplag.se.gov.br/CICSergipe",
      partName="parameters", name="ParametroObterCidadao")
    ParametroObterCidadao parameters, @WebParam(targetNamespace="http://www.seplag.se.gov.br/commons/v1",
      partName="Cabecalho", name="cabecalhoSeplag", header=true)
    CabecalhoSeplag Cabecalho)
    throws ErroInfoMessage, ErroInfoMessage, ErroInfoMessage;

  @WebMethod(operationName="RegistrarCidadao", action="http://www.seplag.se.gov.br/CICSergipe/RegistrarCidadao")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://www.seplag.se.gov.br/CICSergipe/RegistrarCidadao", fault =
      { @FaultAction(value="http://www.seplag.se.gov.br/CICSergipe/CICSergipe_PortType/RegistrarCidadao/Fault/CidadaoNaoEncontradoFault",
          className = ErroInfoMessage.class), @FaultAction(value="http://www.seplag.se.gov.br/CICSergipe/CICSergipe_PortType/RegistrarCidadao/Fault/CidadaoNaoEncontradoFault",
          className = ErroInfoMessage.class) }, output="http://www.seplag.se.gov.br/CICSergipe/CICSergipe_PortType/RegistrarCidadaoResponse")
  @WebResult(targetNamespace="http://www.seplag.se.gov.br/CICSergipe",
    partName="parameters", name="ResultadoRegistrarCidadao")
  public ResultadoRegistrarCidadao registrarCidadao(@WebParam(targetNamespace="http://www.seplag.se.gov.br/CICSergipe",
      partName="parameters", name="ParametroRegistrarCidadao")
    ParametroRegistrarCidadao parameters, @WebParam(targetNamespace="http://www.seplag.se.gov.br/commons/v1",
      partName="Cabecalho", name="cabecalhoSeplag", header=true)
    CabecalhoSeplag Cabecalho)
    throws ErroInfoMessage, ErroInfoMessage;

  @WebMethod(operationName="ValidarInformacaoCidadao", action="http://www.seplag.se.gov.br/CICSergipe/ValidarInformacaoCidadao")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://www.seplag.se.gov.br/CICSergipe/ValidarInformacaoCidadao", fault =
      { @FaultAction(value="http://www.seplag.se.gov.br/CICSergipe/CICSergipe_PortType/ValidarInformacaoCidadao/Fault/CidadaoNaoEncontradoFault",
          className = ErroInfoMessage.class), @FaultAction(value="http://www.seplag.se.gov.br/CICSergipe/CICSergipe_PortType/ValidarInformacaoCidadao/Fault/CidadaoNaoEncontradoFault",
          className = ErroInfoMessage.class) }, output="http://www.seplag.se.gov.br/CICSergipe/CICSergipe_PortType/ValidarInformacaoCidadaoResponse")
  @WebResult(targetNamespace="http://www.seplag.se.gov.br/CICSergipe",
    partName="parameters", name="ResultadoValidarInformacaoCidadao")
  public ResultadoValidarInformacaoCidadao validarInformacaoCidadao(@WebParam(targetNamespace="http://www.seplag.se.gov.br/CICSergipe",
      partName="parameters", name="ParametroValidarInformacaoCidadao")
    ParametroValidarInformacaoCidadao parameters,
    @WebParam(targetNamespace="http://www.seplag.se.gov.br/commons/v1",
      partName="Cabecalho", name="cabecalhoSeplag", header=true)
    CabecalhoSeplag Cabecalho)
    throws ErroInfoMessage, ErroInfoMessage;
}