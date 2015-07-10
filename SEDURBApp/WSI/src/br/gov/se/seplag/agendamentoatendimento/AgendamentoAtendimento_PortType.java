package br.gov.se.seplag.agendamentoatendimento;

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

@WebService(wsdlLocation=RequestFixo.WSDL_LOCATION + "V1/AgendamentoAtendimento?wsdl",
  targetNamespace="http://www.seplag.se.gov.br/AgendamentoAtendimento",
  name="AgendamentoAtendimento_PortType")
@XmlSeeAlso(
  { ObjectFactory.class, br.gov.se.seplag.agendamentoatendimento.ObjectFactory.class, br.gov.se.seplag.ebo.v1.ObjectFactory.class })
@SOAPBinding(style=Style.DOCUMENT, parameterStyle=ParameterStyle.BARE)
public interface AgendamentoAtendimento_PortType
{
  @WebMethod(operationName="ListarAgendamentosPorCPF", action="http://www.seplag.se.gov.br/AgendamentoAtendimento/ListarAgendamentosPorCPF")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://www.seplag.se.gov.br/AgendamentoAtendimento/ListarAgendamentosPorCPF", fault =
      { @FaultAction(value="http://www.seplag.se.gov.br/AgendamentoAtendimento/AgendamentoAtendimento_PortType/ListarAgendamentosPorCPF/Fault/erroInfo",
          className = ErroInfoMessage.class) }, output="http://www.seplag.se.gov.br/AgendamentoAtendimento/AgendamentoAtendimento_PortType/ListarAgendamentosPorCPFResponse")
  @WebResult(targetNamespace="http://www.seplag.se.gov.br/AgendamentoAtendimento",
    partName="parameters", name="ResultadoListarAgendamentosPorCPF")
  public ResultadoListarAgendamentosPorCPF listarAgendamentosPorCPF(@WebParam(targetNamespace="http://www.seplag.se.gov.br/AgendamentoAtendimento",
      partName="parameters", name="ParametroListarAgendamentosPorCPF")
    ParametroListarAgendamentosPorCPF parameters,
    @WebParam(targetNamespace="http://www.seplag.se.gov.br/commons/v1",
      partName="cabecalho", name="cabecalhoSeplag", header=true)
    CabecalhoSeplag cabecalho)
    throws ErroInfoMessage;

  @WebMethod(operationName="ListarHorariosDisponiveisAgendamento", action="http://www.seplag.se.gov.br/AgendamentoAtendimento/ListarHorariosDisponiveisAgendamento")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://www.seplag.se.gov.br/AgendamentoAtendimento/ListarHorariosDisponiveisAgendamento", fault =
      { @FaultAction(value="http://www.seplag.se.gov.br/AgendamentoAtendimento/AgendamentoAtendimento_PortType/ListarHorariosDisponiveisAgendamento/Fault/erroInfo",
          className = ErroInfoMessage.class) }, output="http://www.seplag.se.gov.br/AgendamentoAtendimento/AgendamentoAtendimento_PortType/ListarHorariosDisponiveisAgendamentoResponse")
  @WebResult(targetNamespace="http://www.seplag.se.gov.br/AgendamentoAtendimento",
    partName="parameters", name="ResultadoListarHorariosDisponiveisAgendamento")
  public ResultadoListarHorariosDisponiveisAgendamento listarHorariosDisponiveisAgendamento(@WebParam(targetNamespace="http://www.seplag.se.gov.br/AgendamentoAtendimento",
      partName="parameters", name="ParametroListarHorariosDisponiveisAgendamento")
    ParametroListarHorariosDisponiveisAgendamento parameters,
    @WebParam(targetNamespace="http://www.seplag.se.gov.br/commons/v1",
      partName="cabecalho", name="cabecalhoSeplag", header=true)
    CabecalhoSeplag cabecalho)
    throws ErroInfoMessage;

  @WebMethod(operationName="RealizarAgendamentoAtendimento", action="http://www.seplag.se.gov.br/AgendamentoAtendimento/RealizarAgendamentoAtendimento")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://www.seplag.se.gov.br/AgendamentoAtendimento/RealizarAgendamentoAtendimento", fault =
      { @FaultAction(value="http://www.seplag.se.gov.br/AgendamentoAtendimento/AgendamentoAtendimento_PortType/RealizarAgendamentoAtendimento/Fault/erroInfo",
          className = ErroInfoMessage.class) }, output="http://www.seplag.se.gov.br/AgendamentoAtendimento/AgendamentoAtendimento_PortType/RealizarAgendamentoAtendimentoResponse")
  @WebResult(targetNamespace="http://www.seplag.se.gov.br/AgendamentoAtendimento",
    partName="parameters", name="ResultadoRealizarAgendamentoAtendimento")
  public ResultadoRealizarAgendamentoAtendimento realizarAgendamentoAtendimento(@WebParam(targetNamespace="http://www.seplag.se.gov.br/AgendamentoAtendimento",
      partName="parameters", name="ParametroRealizarAgendamentoAtendimento")
    ParametroRealizarAgendamentoAtendimento parameters,
    @WebParam(targetNamespace="http://www.seplag.se.gov.br/commons/v1",
      partName="cabecalho", name="cabecalhoSeplag", header=true)
    CabecalhoSeplag cabecalho)
    throws ErroInfoMessage;
}
