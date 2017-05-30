package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Eintities.Soundcard;
import java.util.Optional;

public class DoSomethingWithSoundcardIfValueIsPresent {

    private Soundcard soundcard;

    public void setSoundcard(Soundcard soundcard) {
        this.soundcard = soundcard;
    }
     
    public Boolean checkSoundcardJava8() {
 
        Optional<Soundcard> soundcardOptional = Optional.ofNullable(soundcard);       
        soundcardOptional.ifPresent(DoSomethingWithSoundcardIfValueIsPresent::doSomething);
        return soundcardOptional.isPresent();       
    }
    
    public Boolean checkSoundcardOldStyle() {
        
        if (soundcard != null) {
            doSomething(soundcard);
            return true;
        }
        return false;       
    }
    
   private static void  doSomething(Soundcard soundCard) {
        System.out.println("do something with " + soundCard);
    }
}
