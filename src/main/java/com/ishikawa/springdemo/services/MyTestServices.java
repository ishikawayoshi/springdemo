package com.ishikawa.springdemo.services;

import com.ishikawa.springdemo.components.ConsoleOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shpak on 18.06.2017.
 */
@Service
public class MyTestServices {

    ConsoleOutput consoleOutput;

    @Autowired
    public void setConsoleOutput(ConsoleOutput consoleOutput) {
        this.consoleOutput = consoleOutput;
    }

    public String getSomeText() {
        return consoleOutput.superOuputMethod();
    }
}
