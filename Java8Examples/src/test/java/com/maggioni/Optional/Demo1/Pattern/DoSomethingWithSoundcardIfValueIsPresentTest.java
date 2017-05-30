package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Eintities.Soundcard;
import org.junit.Test;
import static org.junit.Assert.*;

public class DoSomethingWithSoundcardIfValueIsPresentTest {
        
    DoSomethingWithSoundcardIfValueIsPresent checkIfSoundcardIsPresent = new DoSomethingWithSoundcardIfValueIsPresent();
    
    @Test
    public void testSoundcardIsEmpty() {
        Soundcard soundcard = null;
        checkIfSoundcardIsPresent.setSoundcard(soundcard);
        Boolean checkSoundcardJava8 = checkIfSoundcardIsPresent.checkSoundcardJava8();
        Boolean checkSoundcardOldStyle = checkIfSoundcardIsPresent.checkSoundcardOldStyle();
     
        assertFalse(checkSoundcardJava8);      
        assertFalse(checkSoundcardOldStyle);      
    }
    
    @Test
    public void testSoundcardIsPresent() {
        Soundcard soundcard = new Soundcard();
        checkIfSoundcardIsPresent.setSoundcard(soundcard);
        Boolean checkSoundcard = checkIfSoundcardIsPresent.checkSoundcardJava8();
        Boolean checkSoundcardOldStyle = checkIfSoundcardIsPresent.checkSoundcardOldStyle();
     
        assertTrue(checkSoundcard);      
        assertTrue(checkSoundcardOldStyle);      
    }
}
