package br.gov.se.seplag.agendamentoatendimento;

import javax.xml.ws.WebServiceRef;
// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

public class AgendamentoAtendimentoSOAP_PortClient
{
  @WebServiceRef
  private static AgendamentoAtendimento agendamentoAtendimento;

  public static void main(String [] args)
  {
    agendamentoAtendimento = new AgendamentoAtendimento();
    AgendamentoAtendimento_PortType agendamentoAtendimento_PortType = agendamentoAtendimento.getAgendamentoAtendimentoSOAP_Port();
    // Add your code to call the desired methods.
  }
}
