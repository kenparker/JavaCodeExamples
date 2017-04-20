package com.maggioni.Optional;

import java.util.Optional;

public class ApplicationType {

    String typeDirName;

    public ApplicationType(String typeDirName) {
        this.typeDirName = typeDirName;
    }
    
    public String getTypeDirName(){
        return typeDirName;
    }

    Optional<String> getTypeDirNameOptional() {
        return Optional.ofNullable(typeDirName);
    }
}
