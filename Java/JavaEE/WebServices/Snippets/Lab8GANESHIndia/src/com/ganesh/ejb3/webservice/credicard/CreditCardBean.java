package com.ganesh.ejb3.webservice.credicard;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "CreditCardBean", targetNamespace = "http://ejb3.ganesh.com/")
public interface CreditCardBean {

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "deductAmout", targetNamespace = "http://ejb3.ganesh.com/", className = "com.ganesh.ejb3.webservice.credicard.DeductAmout")
	@ResponseWrapper(localName = "deductAmoutResponse", targetNamespace = "http://ejb3.ganesh.com/", className = "com.ganesh.ejb3.webservice.credicard.DeductAmoutResponse")
	public void deductAmout(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") double arg1);

}
