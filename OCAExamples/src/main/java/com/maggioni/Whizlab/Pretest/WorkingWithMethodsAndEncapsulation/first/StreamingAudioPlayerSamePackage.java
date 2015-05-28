package com.maggioni.Whizlab.Pretest.WorkingWithMethodsAndEncapsulation.first;

import jdk.nashorn.internal.codegen.CompilerConstants;

public class StreamingAudioPlayerSamePackage extends AudioPlayer{

    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.openSpeaker("String");
        StreamingAudioPlayerSamePackage sap = new StreamingAudioPlayerSamePackage();
        sap.openSpeaker("string");
        
    }

    @Override
    protected boolean openSpeaker(String sp) {
        System.out.println("openSpeaker from StreamingAudioPlayerSamePackage");
        return true;
    }

}
