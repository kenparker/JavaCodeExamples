package com.maggioni.Optional.Demo1.Eintities;

import java.util.Optional;

public class USB {

    private Optional<String> version;

    public USB() {
        version = Optional.empty();
    }

    public USB(Optional<String> version) {
        this.version = version;
    }

    public String getVersion() {
        return version.get();
    }
    
    public Optional<String> getVersionOptional() {
        return version;
    }
        
}
