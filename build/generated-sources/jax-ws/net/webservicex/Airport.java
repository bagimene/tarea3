
package net.webservicex;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "airport", targetNamespace = "http://www.webserviceX.NET", wsdlLocation = "file:/C:/Users/benjamin/Desktop/Taller%20Integraci\u00f3n/tarea3/tarea3/src/conf/xml-resources/web-services/airport/wsdl/airport.asmx.wsdl")
public class Airport
    extends Service
{

    private final static URL AIRPORT_WSDL_LOCATION;
    private final static WebServiceException AIRPORT_EXCEPTION;
    private final static QName AIRPORT_QNAME = new QName("http://www.webserviceX.NET", "airport");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/benjamin/Desktop/Taller%20Integraci\u00f3n/tarea3/tarea3/src/conf/xml-resources/web-services/airport/wsdl/airport.asmx.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AIRPORT_WSDL_LOCATION = url;
        AIRPORT_EXCEPTION = e;
    }

    public Airport() {
        super(__getWsdlLocation(), AIRPORT_QNAME);
    }

    public Airport(WebServiceFeature... features) {
        super(__getWsdlLocation(), AIRPORT_QNAME, features);
    }

    public Airport(URL wsdlLocation) {
        super(wsdlLocation, AIRPORT_QNAME);
    }

    public Airport(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AIRPORT_QNAME, features);
    }

    public Airport(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Airport(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AirportSoap
     */
    @WebEndpoint(name = "airportSoap")
    public AirportSoap getAirportSoap() {
        return super.getPort(new QName("http://www.webserviceX.NET", "airportSoap"), AirportSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirportSoap
     */
    @WebEndpoint(name = "airportSoap")
    public AirportSoap getAirportSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "airportSoap"), AirportSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns AirportSoap
     */
    @WebEndpoint(name = "airportSoap12")
    public AirportSoap getAirportSoap12() {
        return super.getPort(new QName("http://www.webserviceX.NET", "airportSoap12"), AirportSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirportSoap
     */
    @WebEndpoint(name = "airportSoap12")
    public AirportSoap getAirportSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "airportSoap12"), AirportSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns AirportHttpGet
     */
    @WebEndpoint(name = "airportHttpGet")
    public AirportHttpGet getAirportHttpGet() {
        return super.getPort(new QName("http://www.webserviceX.NET", "airportHttpGet"), AirportHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirportHttpGet
     */
    @WebEndpoint(name = "airportHttpGet")
    public AirportHttpGet getAirportHttpGet(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "airportHttpGet"), AirportHttpGet.class, features);
    }

    /**
     * 
     * @return
     *     returns AirportHttpPost
     */
    @WebEndpoint(name = "airportHttpPost")
    public AirportHttpPost getAirportHttpPost() {
        return super.getPort(new QName("http://www.webserviceX.NET", "airportHttpPost"), AirportHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirportHttpPost
     */
    @WebEndpoint(name = "airportHttpPost")
    public AirportHttpPost getAirportHttpPost(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "airportHttpPost"), AirportHttpPost.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AIRPORT_EXCEPTION!= null) {
            throw AIRPORT_EXCEPTION;
        }
        return AIRPORT_WSDL_LOCATION;
    }

}
