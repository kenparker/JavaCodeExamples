package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Eintities.USB;
import org.junit.Test;
import static org.junit.Assert.*;

public class RejectingCertainValuesDemo1Test {

    private USB usb;
    private String expectedValue ;
    private RejectingCertainValuesDemo1 rej = new RejectingCertainValuesDemo1();


    @Test
    public void doing_nothing_because_USB_is_20_test() {
        expectedValue = "2.0";
        usb = new USB(expectedValue);
        rej.rejectCertainValuesOldWay(usb);
        assertEquals(expectedValue, usb.getVersion());
        rej.rejectCertainValuesJava8(usb);
        assertEquals(expectedValue, usb.getVersion());
    }

    @Test
    public void doing_something_because_USB_is_30_test() {
        expectedValue = "125";
        usb = new USB("3.0");
        rej.rejectCertainValuesOldWay(usb);
        assertEquals(expectedValue, usb.getVersion());
        usb = new USB("3.0");
        rej.rejectCertainValuesJava8(usb);
        assertEquals(expectedValue, usb.getVersion());
    }
    
    @Test
    public void doing_nothing_with_USB_equal_null_test() {
        usb = null;
        rej.rejectCertainValuesOldWay(usb);
        assertEquals(null, usb);
        rej.rejectCertainValuesJava8(usb);
        assertEquals(null, usb);
    }
}
