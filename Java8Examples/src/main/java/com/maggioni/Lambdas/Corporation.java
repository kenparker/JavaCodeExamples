package com.maggioni.Lambdas;

import java.util.Set;

public class Corporation {
    private Set<Department> departments;

    public Corporation(Set<Department> departments) {
        this.departments = departments;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    @Override
    public String toString() {
        return "Corporation{" +
                "departments=" + departments +
                '}';
    }
}
