/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wdsl;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import net.webservicex.Airport;
import net.webservicex.AirportSoap;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;



/**
 *
 * @author benjamin
 */
@WebService(serviceName = "calculadoraSuper")
public class calculadoraSuper {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName = "obtenerCiudades")
    public String[] obtenerCiudades(@WebParam(name = "pais") String pais) {
        GlobalWeather gw = new GlobalWeather();
        GlobalWeatherSoap gwSoap = gw.getGlobalWeatherSoap();       
        
        Airport a = new Airport();
        AirportSoap aSoap = a.getAirportSoap();
        String airports = aSoap.getAirportInformationByCountry(pais);
        String cities = gwSoap.getCitiesByCountry(pais);
        
        String[] respuesta = {airports,cities};
        
        return respuesta;
    }
    
}
