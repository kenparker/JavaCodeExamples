package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Eintities.Soundcard;
import java.util.Optional;

public class CheckIfSoundcardIsPresent {

    private Soundcard soundcard;

    public void setSoundcard(Soundcard soundcard) {
        this.soundcard = soundcard;
    }
     
    public Boolean checkSoundcardJava8() {
        Optional<Soundcard> soundcardOptional = Optional.ofNullable(soundcard);
        
        soundcardOptional.ifPresent(System.out::println);
        
        return soundcardOptional.isPresent();
        
    }
    
    public Boolean checkSoundcardOldStyle() {
        
        if (soundcard == null) {
            return false;
        } else {
            System.out.println(soundcard);
            return true;
        }
        
    }
}
