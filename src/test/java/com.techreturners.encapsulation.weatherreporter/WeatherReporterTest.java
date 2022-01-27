package com.techreturners.encapsulation.weatherreporter;

import com.techreturners.encapsulation.bankaccount.model.WeatherReporter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeatherReporterTest {
    @Test
    public void checkLondon(){
        WeatherReporter weatherReporterObj1 = new WeatherReporter("London", 4);
        assertEquals("🌦",weatherReporterObj1.checkLocationWeatherSymbol());
    }
    @Test
    public void checkMaui(){
        WeatherReporter weatherReporterObj1 = new WeatherReporter("Maui", 24);
        assertEquals("🔆",weatherReporterObj1.checkLocationWeatherSymbol());
    }
}
