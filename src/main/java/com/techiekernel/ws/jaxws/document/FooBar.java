package com.techiekernel.ws.jaxws.document;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
/**
 * Service end point interface
 * @author satish
 *
 */
@WebService
//@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public interface FooBar {
	@WebMethod
	String callFooBar(String name);
	
	@WebMethod
	Server getServerDetail(String client);
}
