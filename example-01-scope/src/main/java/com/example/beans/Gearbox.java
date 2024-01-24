package com.example.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Gearbox {
    void putIntoDrivePosition() {
        System.out.println("Putting Gearbox into Drive Position");
    }
}
