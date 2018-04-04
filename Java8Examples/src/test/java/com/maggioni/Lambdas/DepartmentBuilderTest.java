package com.maggioni.Lambdas;

import org.junit.Test;

import static com.maggioni.Lambdas.Manager.*;

public class DepartmentBuilderTest {

    Department departmentJava;
    Department departmentScala;

    Employee marco = Employee.builder()
                        .age(20)
                        .salary(2500)
                        .gender(PersonInterface.Gender.MALE)
                        .name("Marco")
                        .build();

    Employee sandro = Employee.builder()
                        .age(55)
                        .salary(5000)
                        .gender(PersonInterface.Gender.MALE)
                        .name("Sandro")
                        .build();

    Employee giovanni = Employee.builder()
                        .age(61)
                        .salary(4550)
                        .gender(PersonInterface.Gender.MALE)
                        .name("Giovanni")
                        .build();

    private Manager.Builder<Manager, ?> managerBuilder;


    public Manager createManagerSusi() {
        managerBuilder = Manager.builder();
        return managerBuilder
                .age(30)
                .salary(15000)
                .name("Susi")
                .gender(Gender.FEMALE)
                .build();
    }

    public Manager createManagerPeter() {
        managerBuilder = Manager.builder();
        return managerBuilder
                .age(25)
                .salary(25000)
                .name("Peter")
                .gender(Gender.MALE)
                .build();
    }

    @Test
    public void createDepartmentJavaDev() {
        departmentJava = new DepartmentBuilder()
                .setKind(Department.Kind.DEVELOPMENT)
                .addEmployee(marco)
                .addEmployee(sandro)
                .setName("Java Development")
                .setManager(createManagerPeter())
                .build();
        System.out.println(departmentJava);
    }

    @Test
    public void createDepartmentScalaDev() {
        departmentScala = new DepartmentBuilder()
                .setKind(Department.Kind.DEVELOPMENT)
                .addEmployee(giovanni)
                .setName("Scala Development")
                .setManager(createManagerPeter())
                .build();
        System.out.println(departmentScala);
    }



}