package com.company;

/**
 * Created by stacyzolnikov on 6/28/16.
 */
public class Sony extends Remote {

    public Sony (String name) {
        super(true, true, name);
    }
    public Sony(boolean NeedsBatteries, boolean supportsUSB, String name) {
        super(NeedsBatteries, supportsUSB, name);
    }


    @Override
    public void channel1Up() {

    }

    @Override
    public void channel1Down() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }

    @Override
    public boolean isRechargeable() {
        return true;
    }

    @Override
    public void supportsBrands() {

    }

    @Override
    public boolean isWaterProof() {
        return false;
    }
}
