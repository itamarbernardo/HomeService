package br.edu.meynewhome;

import br.edu.meynewhome.SensorAnswer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArduinoConnection {

    private Integer idConnection;
    private Integer sensorValue;
    private Socket cliente;

    public ArduinoConnection(int id) {
        this.idConnection = id;
    }

    public SensorAnswer getSensorAnswer() {
        SensorAnswer sa = new SensorAnswer();

        String msg = "";
        switch (idConnection) {

            case 1:
                msg = "1";
                break;
            case 2:
                msg = "2";
                break;
            case 3:
                msg = "3";
                break;
            case 4:
                msg = "4";
                break;
        }

        switch (idConnection) {
            case 1:
            case 2:
            case 3:
            case 4:
                try {
                    cliente = new Socket("192.168.0.6", 1000);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                break;
            case 5:
            case 6:
                try {
                    cliente = new Socket("192.168.0.50", 1000);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                break;

            default:
                break;
        }

        try {
            if (cliente != null) {
                DataOutputStream saida = new DataOutputStream(cliente.getOutputStream());
                saida.write(msg.charAt(0));
                saida.flush();
                DataInputStream entrada = new DataInputStream(cliente.getInputStream());
                String m = entrada.readLine();
                this.sensorValue = Integer.parseInt(m);
                saida.close();
                entrada.close();      
                this.cliente.close();
            } 

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        sa.setValue(this.sensorValue);

        return sa;
    }

    public Integer getIdConnection() {
        return idConnection;
    }

    public void setIdConnection(Integer idConnection) {
        this.idConnection = idConnection;
    }
}
