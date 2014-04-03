
package com.cgi.soa.masterclass.sofortzahlen.sampleBank.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BankWebService", targetNamespace = "http://ws.samplebank.masterclass.soa.cgi.com/", wsdlLocation = "file:/C:/Java/workspace/sofortzahlen/src/main/resources/META-INF/BankWebService.wsdl")
public class BankWebService
    extends Service
{

    private final static URL BANKWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException BANKWEBSERVICE_EXCEPTION;
    private final static QName BANKWEBSERVICE_QNAME = new QName("http://ws.samplebank.masterclass.soa.cgi.com/", "BankWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Java/workspace/sofortzahlen/src/main/resources/META-INF/BankWebService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKWEBSERVICE_WSDL_LOCATION = url;
        BANKWEBSERVICE_EXCEPTION = e;
    }

    public BankWebService() {
        super(__getWsdlLocation(), BANKWEBSERVICE_QNAME);
    }

    public BankWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKWEBSERVICE_QNAME, features);
    }

    public BankWebService(URL wsdlLocation) {
        super(wsdlLocation, BANKWEBSERVICE_QNAME);
    }

    public BankWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKWEBSERVICE_QNAME, features);
    }

    public BankWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BankWeb
     */
    @WebEndpoint(name = "BankWebPort")
    public BankWeb getBankWebPort() {
        return super.getPort(new QName("http://ws.samplebank.masterclass.soa.cgi.com/", "BankWebPort"), BankWeb.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankWeb
     */
    @WebEndpoint(name = "BankWebPort")
    public BankWeb getBankWebPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.samplebank.masterclass.soa.cgi.com/", "BankWebPort"), BankWeb.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKWEBSERVICE_EXCEPTION!= null) {
            throw BANKWEBSERVICE_EXCEPTION;
        }
        return BANKWEBSERVICE_WSDL_LOCATION;
    }

}
