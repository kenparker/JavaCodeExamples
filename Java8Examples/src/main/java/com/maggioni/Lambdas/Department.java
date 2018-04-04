package com.maggioni.Lambdas;

import java.util.Set;

public class Department {
    public enum Kind {SALES, DEVELOPMENT,ACCOUNTING, HR}
    private Department.Kind kind;
    private String name;
    private Manager manager;
    private Set<Employee> employees;

    public Department(Kind kind, String name, Manager manager, Set<Employee> employees) {
        this.kind = kind;
        this.name = name;
        this.manager = manager;
        this.employees = employees;
    }

    public Kind getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }

    public Manager getManager() {
        return manager;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "kind=" + kind +
                ", name='" + name + '\'' +
                ", manager=" + manager +
                ", employees=" + employees +
                '}';
    }
}
