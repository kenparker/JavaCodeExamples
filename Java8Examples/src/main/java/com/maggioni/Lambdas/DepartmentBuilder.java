package com.maggioni.Lambdas;

import java.util.HashSet;
import java.util.Set;

public class DepartmentBuilder {
    private Department.Kind kind;
    private String name;
    private Manager manager;
    private Set<Employee> employees = new HashSet<>();

    public DepartmentBuilder setKind(Department.Kind kind) {
        this.kind = kind;
        return this;
    }

    public DepartmentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DepartmentBuilder setManager(Manager manager) {
        this.manager = manager;
        return this;
    }

    public DepartmentBuilder setEmployees(Set<Employee> employees) {
        this.employees = employees;
        return this;
    }

    public DepartmentBuilder addEmployee(Employee employee) {
        this.employees.add(employee);
        return this;
    }

    public Department build() {
        return new Department(kind, name, manager, employees);
    }
}