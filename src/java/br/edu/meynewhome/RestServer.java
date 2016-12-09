package br.edu.meynewhome;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("sensor")
public class RestServer {	
	
     @GET
     @Produces(MediaType.APPLICATION_JSON)
     public SensorAnswer getUser(@QueryParam("sensorId") int sensorId) {
         
         ArduinoConnection aCon= SensorController.getInstance().getArduinoConnection(sensorId);	
		   
		   SensorAnswer sa = aCon.getSensorAnswer();
		   
           return sa;
     }
	
}
