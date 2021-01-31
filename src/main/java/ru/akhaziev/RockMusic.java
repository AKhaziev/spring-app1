package ru.akhaziev;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Component("rockMusic")
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
