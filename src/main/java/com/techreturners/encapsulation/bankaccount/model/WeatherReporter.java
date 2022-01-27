package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WeatherReporter {

    public String location;
    public double temperature;
    public Map<String,String> weatherMap = new HashMap();
    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;

        weatherMap.put("London","🌦");
        weatherMap.put("California","🌅");
        weatherMap.put("Cape Town","🌤");
        weatherMap.put("default","🔆");
    }

    public String printTempInFahrenheit() {

        double newTemp = (9.0 / 5.0) * temperature + 32;
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, checkLocationWeatherSymbol(), checkTemp(), newTemp);

    }

    public String checkLocationWeatherSymbol() {
        if(weatherMap.containsKey(location)) {

            return weatherMap.get(location);

        }

        return weatherMap.get("default");
    }

    public String checkTemp() {
        if (temperature > 30) {

            return "It's too hot 🥵!";

        } else if (temperature < 10) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }



}
