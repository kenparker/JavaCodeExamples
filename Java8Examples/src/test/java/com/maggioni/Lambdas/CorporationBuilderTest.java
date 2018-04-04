package com.maggioni.Lambdas;

import org.junit.Test;

public class CorporationBuilderTest extends DepartmentBuilderTest{

    Corporation corporation;

    @Test
    public void createCorporation() {
        createDepartmentJavaDev();
        createDepartmentScalaDev();
        corporation = new CorporationBuilder()
                                .addDepartment(departmentJava)
                                .addDepartment(departmentScala)
                                .build();
        System.out.println(corporation);
    }

}