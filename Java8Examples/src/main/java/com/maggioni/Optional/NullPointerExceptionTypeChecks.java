package com.maggioni.Optional;

import java.util.Optional;

public class NullPointerExceptionTypeChecks {
    
    Project project;
    
    public NullPointerExceptionTypeChecks(Project project) {
        this.project = project;
    }
    
    public String oldWaysTypeChecks() {
        if (project != null) {
            ApplicationType applicationType = project.getApplicationType();
            if (applicationType != null) {
                String typeDirName = applicationType.getTypeDirName();
                if (typeDirName != null) {
                    return typeDirName;
                }
            }
        }
        return null;
    }
    
    public Boolean theJava8WayWithOptional() {
        
        Optional<Project> optionalProject = Optional.ofNullable(project);
        
        Optional<String> optionalTypeDirName = optionalProject
                .flatMap(project -> project.getApplicationTypeOptional())
                .flatMap(applicationType -> applicationType.getTypeDirNameOptional());
        
        optionalTypeDirName.ifPresent(System.out::println);
        
        return optionalTypeDirName.isPresent();
    }
    
    public Boolean theJava8WayWithOptionalTightWay() {
        
        Optional<Project> optionalProject = Optional.ofNullable(project);
        
        return optionalProject
                .map(Project::getApplicationType) // if I know that getApplicationType will never return null
                .flatMap(ApplicationType::getTypeDirNameOptional)
                .isPresent();
    }
}
