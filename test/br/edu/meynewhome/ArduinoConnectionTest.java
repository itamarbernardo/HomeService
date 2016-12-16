/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.meynewhome;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ANAFLAVIA
 */
public class ArduinoConnectionTest {
    
    public ArduinoConnectionTest() {
    }

    @Test
    public void testGetSensorAnswer() {
        SensorAnswer sa = new SensorAnswer();
        ArduinoConnection ac = new ArduinoConnection(1);
        Assert.assertEquals(sa, ac.getSensorAnswer());
        
    }

    @Test
    public void testGetIdConnection() {
    }

    @Test
    public void testSetIdConnection() {
    }
    
}
