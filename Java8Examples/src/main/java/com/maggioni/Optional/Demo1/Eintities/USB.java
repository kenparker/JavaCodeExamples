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

    public USB(String version) {
        this.version = Optional.ofNullable(version);
    }
    
    public String getVersion() {
        return version.get();
    }
    
    public Optional<String> getVersionOptional() {
        return version;
    }

    public void setVersion(String version) {
        this.version = Optional.ofNullable(version);
    }
    
    
        
}
