
package com.maggioni.Optional;

import java.util.Optional;

public class Project {

    ApplicationType applicationType;

    public Project(ApplicationType applicationType) {
        this.applicationType = applicationType;
    }
    
    public ApplicationType getApplicationType(){
        return applicationType;
    }

    Optional<ApplicationType> getApplicationTypeOptional() {
        return Optional.ofNullable(applicationType);
    }
    
}
