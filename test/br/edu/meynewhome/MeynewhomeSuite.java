/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.meynewhome;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author ANAFLAVIA
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({br.edu.meynewhome.RestServerTest.class, br.edu.meynewhome.ArduinoConnectionTest.class, br.edu.meynewhome.SensorAnswerTest.class, br.edu.meynewhome.ApplicationConfigTest.class, br.edu.meynewhome.SensorControllerTest.class})
public class MeynewhomeSuite {
    
}
