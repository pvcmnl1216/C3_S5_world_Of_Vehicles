/*
 * Author Name: Philip Meshach
 * Date: 31-08-2022
 * Praise The Lord
 */
package com.transmission;

public class ManualTransmission extends Transmission {
    int forwardGears;
    double firstGearRatio;
    double secondGearRatio;
    double thirdGearRatio;
    double fourthGearRatio;
    double fifthGearRatio;
    double sixthGearRatio;

    public ManualTransmission(String type, String modelNumber, int forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double fourthGearRatio, double fifthGearRatio, double sixthGearRatio) {
        super();
        this.forwardGears = forwardGears;
        this.firstGearRatio = firstGearRatio;
        this.secondGearRatio = secondGearRatio;
        this.thirdGearRatio = thirdGearRatio;
        this.fourthGearRatio = fourthGearRatio;
        this.fifthGearRatio = fifthGearRatio;
        this.sixthGearRatio = sixthGearRatio;
    }

    @Override
    public void showSpecs() {
        System.out.println("Transmission Type: " + getType());
        System.out.println("Transmission Model No: " + getModelNumber());
        System.out.println("Forward Gear: " + forwardGears);
        System.out.println("1st Gear Ratio: " + firstGearRatio);
        System.out.println("2nd Gear Ratio: " + secondGearRatio);
        System.out.println("3rd Gear Ratio: " + thirdGearRatio);
        System.out.println("4th Gear Ratio: " + fourthGearRatio);
        System.out.println("5th Gear Ratio: " + fifthGearRatio);
        System.out.println("6th Gear Ratio: " + sixthGearRatio);
        System.out.println("====================================");
    }
}