package com.company;

/**
 * Created by stacyzolnikov on 6/28/16.
 */
public abstract class Remote implements WaterProof, Rechargeable, Universal{
    private boolean mNeedsBatteries;
    private boolean mSupportsUSB;
    String mName;

    public Remote (boolean NeedsBatteries, boolean supportsUSB, String name){
        mNeedsBatteries = NeedsBatteries;
        mSupportsUSB = supportsUSB;
        mName = name;
    }

    public boolean getNeedsBatteries (){
        return mNeedsBatteries;
    }

    public void setNeedsBatteries(boolean NeedBatteries) {
        mNeedsBatteries = NeedBatteries;
    }
    public abstract void channel1Up ();
    public abstract void channel1Down ();
    public abstract void volumeUp ();
    public abstract void volumeDown ();

    public void powerButtonPressed () {
        System.out.println("Button was pressed");
    }
    public int numberButtonPressed (int button) {
        System.out.println("Changing channel to " + button);
        return button;
    }


}
