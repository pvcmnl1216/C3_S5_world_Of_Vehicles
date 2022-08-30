/*
 * Author Name: Philip Meshach
 * Date: 31-08-2022
 * Praise The Lord
 */
package com.transmission;

public abstract class transmission {
    private String type;
    private String modelNumber;
    public void Transmission(String type, String modelNumber) {
        this.type = type;
        this.modelNumber = modelNumber;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getModelNumber() {
        return modelNumber;
    }
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }
    public abstract void showSpecs();
}

