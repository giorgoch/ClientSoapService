
package eu.europa.ec.taxud.tin.services.checktin;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import eu.europa.ec.taxud.tin.services.checktin.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "checkTinPortType", targetNamespace = "urn:ec.europa.eu:taxud:tin:services:checkTin")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CheckTinPortType {


    /**
     * 
     * @param countryCode
     * @param requestDate
     * @param validStructure
     * @param validSyntax
     * @param tinNumber
     */
    @WebMethod
    @RequestWrapper(localName = "checkTin", targetNamespace = "urn:ec.europa.eu:taxud:tin:services:checkTin:types", className = "eu.europa.ec.taxud.tin.services.checktin.types.CheckTin")
    @ResponseWrapper(localName = "checkTinResponse", targetNamespace = "urn:ec.europa.eu:taxud:tin:services:checkTin:types", className = "eu.europa.ec.taxud.tin.services.checktin.types.CheckTinResponse")
    public void checkTin(
        @WebParam(name = "countryCode", targetNamespace = "urn:ec.europa.eu:taxud:tin:services:checkTin:types", mode = WebParam.Mode.INOUT)
        Holder<String> countryCode,
        @WebParam(name = "tinNumber", targetNamespace = "urn:ec.europa.eu:taxud:tin:services:checkTin:types", mode = WebParam.Mode.INOUT)
        Holder<String> tinNumber,
        @WebParam(name = "requestDate", targetNamespace = "urn:ec.europa.eu:taxud:tin:services:checkTin:types", mode = WebParam.Mode.OUT)
        Holder<XMLGregorianCalendar> requestDate,
        @WebParam(name = "validStructure", targetNamespace = "urn:ec.europa.eu:taxud:tin:services:checkTin:types", mode = WebParam.Mode.OUT)
        Holder<Boolean> validStructure,
        @WebParam(name = "validSyntax", targetNamespace = "urn:ec.europa.eu:taxud:tin:services:checkTin:types", mode = WebParam.Mode.OUT)
        Holder<Boolean> validSyntax);

}
