package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Eintities.USB;
import org.junit.Test;
import static org.junit.Assert.*;

public class RejectingCertainValuesDemo1Test {
    
    private USB usb;
    
    private RejectingCertainValuesDemo1 rej = new RejectingCertainValuesDemo1();
    
    
    @Test
    public void testUSBEqual20() {
        usb = new USB("2.0");
        String rejectCertainValues = rej.rejectCertainValuesOldWay(usb);
        assertEquals(null, rejectCertainValues);
    }
    
    @Test
    public void testUSBEqual20Java8() {
        usb = new USB("2.0");
        String rejectCertainValues = rej.rejectCertainValuesJava8(usb);
        assertEquals(null, rejectCertainValues);
    }
    
    @Test
    public void testUSBEqual30() {
        usb = new USB("3.0");
        String rejectCertainValues = rej.rejectCertainValuesOldWay(usb);
        assertEquals("3.0", rejectCertainValues);
    }
    
    @Test
    public void testUSBEqualNull() {
        usb = null;
        String rejectCertainValues = rej.rejectCertainValuesOldWay(usb);
        assertEquals(null, rejectCertainValues);
    }
    
}
