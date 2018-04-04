package com.maggioni.Lambdas;

import java.util.HashSet;
import java.util.Set;

public class CorporationBuilder {
    private Set<Department> departments = new HashSet<>();

    public CorporationBuilder setDepartments(Set<Department> departments) {
        this.departments = departments;
        return this;
    }

    public CorporationBuilder addDepartment(Department department) {
        departments.add(department);
        return this;
    }

    public Corporation build() {
        return new Corporation(departments);
    }

    @Override
    public String toString() {
        return "CorporationBuilder{" +
                "departments=" + departments +
                '}';
    }
}