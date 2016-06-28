package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List<Remote> remotes = new ArrayList<>();
        remotes.add(new Sony("Sony"));
        remotes.add(new Panasonic("Panasonic"));
        remotes.add(new Samsung("Samsung"));

    for (Remote remote : remotes) {
        System.out.println(remote.numberButtonPressed(5));
        remote.channel1Up();
        remote.channel1Down();
        remote.volumeUp();
        remote.volumeDown();
        System.out.println("Is Rechargeable: " + remote.isRechargeable());
        System.out.println("Is Waterproof: " + remote.isWaterProof());
    }


    }
}
