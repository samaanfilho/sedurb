package br.gov.se.seplag.agendamentoatendimento;

import br.gov.se.seplag.commons.v1.ErroInfo;

import javax.xml.ws.WebFault;

@WebFault(faultBean="br.gov.se.seplag.commons.v1.ErroInfo",
  targetNamespace="http://www.seplag.se.gov.br/commons/v1", name="erroInfo")
public class ErroInfoMessage
  extends Exception
{
  private ErroInfo faultInfo;

  public ErroInfoMessage(String message, ErroInfo faultInfo)
  {
    super(message);
    this.faultInfo = faultInfo;
  }

  public ErroInfoMessage(String message, ErroInfo faultInfo, Throwable t)
  {
    super(message,t);
    this.faultInfo = faultInfo;
  }

  public ErroInfo getFaultInfo()
  {
    return faultInfo;
  }

  public void setFaultInfo(ErroInfo faultInfo)
  {
    this.faultInfo = faultInfo;
  }
}
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)
