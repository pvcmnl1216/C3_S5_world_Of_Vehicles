/*
 * Author Name: Philip Meshach
 * Date: 31-08-2022
 * Praise The Lord
 */
package com.transmission;

public class TransmissionImpl {
    public static void main(String[] args) {
        transmission md6 = new ManualTransmission("Manual", "MD6", 6, 3.640, 2.150, 1.360, 1.000, 0.750, 0.630);
        md6.showSpecs();
        transmission amtd5 = new AmtTransmission("AMT", "AMTD5", 5, 2.950, 1.940, 1.340, 1.000, 1.063);
        amtd5.showSpecs();
        transmission cvt6 = new AutomaticCvtTransmission("Automatic-CVT", "CVT6", 6, 2.63, 1.440, 1.165, 0.906, 0.680, 0.499);
        cvt6.showSpecs();
        transmission dct8 = new AutomaticDctTransmission("Automatic-DCT", "DCT8", 8, 4.714, 3.143, 2.106, 1.667, 1.285, 1.000, 0.839, 0.667);
        dct8.showSpecs();
    }
}

