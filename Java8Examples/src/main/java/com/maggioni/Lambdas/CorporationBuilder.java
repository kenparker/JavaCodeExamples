package com.maggioni.Lambdas;

import java.util.Set;

public class CorporationBuilder {
    private Set<Department> departments;

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
}