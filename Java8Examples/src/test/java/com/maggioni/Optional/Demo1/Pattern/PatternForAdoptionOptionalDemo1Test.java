package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Eintities.Computer;
import com.maggioni.Optional.Demo1.Eintities.Soundcard;
import com.maggioni.Optional.Demo1.Eintities.USB;
import java.util.Optional;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PatternForAdoptionOptionalDemo1Test {
    
    PatternForAdoptionOptionalDemo1 patterdemo1 = new PatternForAdoptionOptionalDemo1();
    public PatternForAdoptionOptionalDemo1Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testComputerIsNull() {
        Computer computer = null;
        assertVersionIsUnknown(computer);
        
    }
    
    @Test
    public void testSoundcardIsEmpty() {
        Optional<Soundcard> soundcard = Optional.empty();
        assertVersionIsUnknown(soundcard);
    }

    
    @Test
    public void testSoundcardOfNullable(){
        Optional<Soundcard> soundcard = Optional.ofNullable(new Soundcard());
        assertVersionIsUnknown(soundcard);
    }

    @Test(expected = NullPointerException.class)
    public void testUSBIsNull() {
        Optional<Soundcard> soundcard = Optional.ofNullable(new Soundcard(null));
        assertVersionIsUnknown(soundcard);
    }
    
    @Test
    public void testUSBIsEmpty() {
        Optional<USB> usb = Optional.empty();
        Optional<Soundcard> soundcard = Optional.ofNullable(new Soundcard(usb));
        assertVersionIsUnknown(soundcard);
    } 
    
    private void assertVersionIsUnknown(Optional<Soundcard> soundcard) {
        Computer computer = new Computer(soundcard);
        assertVersionIsUnknown(computer);
    }
   
    private void assertVersionIsUnknown(Computer computer) {
        String version = patterdemo1.getVersion(computer);
        assertEquals("UNKNOWN", version);
    }    
}
