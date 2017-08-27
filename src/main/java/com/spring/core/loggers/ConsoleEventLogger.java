package com.spring.core.loggers;


import com.spring.core.beans.Event;
import com.spring.core.loggers.EventLogger;
import org.springframework.stereotype.Component;

@Component
public class ConsoleEventLogger implements EventLogger {

    @Override
    public void logEvent(Event event){
        System.out.println(event.toString());
    }
}
