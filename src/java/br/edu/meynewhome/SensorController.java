package br.edu.meynewhome;

import java.util.HashMap;
import java.util.Map;

public class SensorController {

    private static SensorController instance;
    private Map<Integer, ArduinoConnection> arduinos;

    private SensorController() {

        this.arduinos = new HashMap<Integer, ArduinoConnection>();

        //criar e adicionar conex�es sensores
        ArduinoConnection ac = new ArduinoConnection(1);
        this.arduinos.put(1, ac);

        ArduinoConnection ac2 = new ArduinoConnection(2);
        this.arduinos.put(2, ac2);

        ArduinoConnection ac3 = new ArduinoConnection(3);
        this.arduinos.put(3, ac3);

        ArduinoConnection ac4 = new ArduinoConnection(4);
        this.arduinos.put(4, ac4);

    }

    public static SensorController getInstance() {
        if (instance == null) {
            instance = new SensorController();
        }
        return instance;
    }

    public ArduinoConnection getArduinoConnection(Integer sensorId) {
        return this.arduinos.get(sensorId);
    }

}
