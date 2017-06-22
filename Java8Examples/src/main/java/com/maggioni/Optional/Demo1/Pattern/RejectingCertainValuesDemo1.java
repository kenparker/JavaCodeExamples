package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Entities.USB;
import java.util.Optional;

public class RejectingCertainValuesDemo1 {

    public void rejectCertainValuesOldWay(USB usb) {
        if (usb != null && usb.getVersion().equals("3.0")) {
            doSomething(usb);
        }
    }
       
    public void rejectCertainValuesJava8(USB usb) {
       Optional<USB> usbOptional = Optional.ofNullable(usb);
       usbOptional.filter(a -> a.getVersion().equals("3.0"))
               .ifPresent(this::doSomething);   
    }
    
    public void doSomething(USB usb) {
        usb.setVersion("125");      
    }
}
