package com.company;

/**
 * Created by stacyzolnikov on 6/28/16.
 */
public class Samsung extends Remote {

    public Samsung (String name) {
        super(true, true, name);
    }
    public Samsung(boolean NeedsBatteries, boolean supportsUSB, String name) {
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
