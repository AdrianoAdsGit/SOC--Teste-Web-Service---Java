package br.com.soctest.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CUSTOM, customFaultCode = "{http://soctest.com.br}001_Exame_Not_found")
public class PessoaExameNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PessoaExameNotFoundException(String message) {
		super(message);
		
	}

}
