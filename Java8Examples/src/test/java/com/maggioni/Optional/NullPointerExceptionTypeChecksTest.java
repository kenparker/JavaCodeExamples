/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maggioni.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maggioni
 */
public class NullPointerExceptionTypeChecksTest {

    NullPointerExceptionTypeChecks nullPointerExceptionTypeChecks;
    Project project;
    ApplicationType applicationType;
    String typeDirName;
    String oldWaysTypeChecks;
    Boolean theJava9WayWithOptional;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void projectIsNull() {
        project = null;
        baseTest();
    }

    private void baseTest() {
        nullPointerExceptionTypeChecks = new NullPointerExceptionTypeChecks(project);
        oldWaysTypeChecks = nullPointerExceptionTypeChecks.oldWaysTypeChecks();
        assertNull(oldWaysTypeChecks);
        theJava9WayWithOptional = nullPointerExceptionTypeChecks.theJava8WayWithOptional();
        assertFalse(theJava9WayWithOptional);
    }

    @Test
    public void applicationTypeIsNull() {
        applicationType = null;
        project = new Project(applicationType);

        baseTest();
    }

    @Test
    public void typeDirNameIsNull() {
        typeDirName = null;
        applicationType = new ApplicationType(typeDirName);
        project = new Project(applicationType);

        baseTest();
    }
    
    @Test
    public void typeDirNameNotNull() {
        typeDirName = "Hello";
        applicationType = new ApplicationType(typeDirName);
        project = new Project(applicationType);

        nullPointerExceptionTypeChecks = new NullPointerExceptionTypeChecks(project);
        oldWaysTypeChecks = nullPointerExceptionTypeChecks.oldWaysTypeChecks();
        assertEquals("Hello", oldWaysTypeChecks);
        theJava9WayWithOptional = nullPointerExceptionTypeChecks.theJava8WayWithOptional();
        assertTrue(theJava9WayWithOptional);      
        Boolean theJava8WayWithOptionalTightWay = nullPointerExceptionTypeChecks.theJava8WayWithOptionalTightWay();
        assertTrue(theJava8WayWithOptionalTightWay);
    }

}
