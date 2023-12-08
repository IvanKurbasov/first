package org.example;

import org.example.Fan;

public class FanTest {
    public static void main(String[] args) {
        Fan modelEkonom = new Fan(7, 3, 4);
//        modelEkonom.bladeCount = 7;
//        modelEkonom.maxMode = 3;
//        modelEkonom.energy = 4;


        Fan modelStandart = new Fan(15,5,10);
//        modelStandart.bladeCount = 15;
//        modelStandart.maxMode = 5;
//        modelStandart.energy = 10;

        printFanInfo(modelEkonom);
    }
    public static void printFanInfo(Fan fan){
        System.out.println("Количество оборотов: " + fan.oborot + "     " + "мод: " + fan.mode);
    }
}
