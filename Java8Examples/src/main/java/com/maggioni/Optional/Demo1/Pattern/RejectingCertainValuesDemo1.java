package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Eintities.USB;
import java.util.Optional;

public class RejectingCertainValuesDemo1 {

    public String rejectCertainValuesOldWay(USB usb) {
        if (usb != null && usb.getVersion().equals("3.0")) {
            return usb.getVersion();
        }
        return null;
    }
       String myreturn;
    
    public String rejectCertainValuesJava8(USB usb) {
       Optional<USB> usbOptional = Optional.ofNullable(usb);
       usbOptional.filter(a -> !a.equals("3.0"))
               .ifPresent(this::doSomething);
        usb = usbOptional.get();
       return usb.getVersion();
    }
    
    public void doSomething(USB usb) {
        System.out.println(usb);
        usb.setVersion("125");      
    }
    
}
