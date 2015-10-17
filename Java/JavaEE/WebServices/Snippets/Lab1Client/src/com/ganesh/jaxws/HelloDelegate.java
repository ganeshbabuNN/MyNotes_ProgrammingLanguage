package com.ganesh.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "HelloDelegate", targetNamespace = "http://jaxws.ganesh.com/")
public interface HelloDelegate {

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getMessage", targetNamespace = "http://jaxws.ganesh.com/", className = "com.ganesh.jaxws.GetMessage")
	@ResponseWrapper(localName = "getMessageResponse", targetNamespace = "http://jaxws.ganesh.com/", className = "com.ganesh.jaxws.GetMessageResponse")
	public String getMessage(
			@WebParam(name = "arg0", targetNamespace = "") String arg0);

}
