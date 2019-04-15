import cyclops.companion.Functions;
import cyclops.data.ImmutableList;
import cyclops.data.Vector;
import cyclops.reactive.Generator;
import org.junit.Test;

import java.util.Objects;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;


public class VectorCreationMethodsTest {

    private String a = "Angel";
    private String b = "Berta";
    private Supplier<Employee> supplier = Employee::new;

    @Test
    public void vectorEmpty_Then_AnEmptyVectorIsCreated() {
        Vector<String> vector = Vector.empty();
        assertThat(vector.size()).isEqualTo(0);
    }

    @Test
    public void vectorOf_When_SomeElementsAreProvided_Then_AVectorWithTheElementsIsCreated() {
        Vector<String> of = Vector.of(a, b);
        assertThat(of).hasSize(2).containsOnly(a,b);
    }

    @Test
    public void vectorFill_When_ObjectAndAMaxNumberIsProvided_Then_AVectorWithNumberOfObjectsIsCreated() {
        Vector<String> fill = Vector.fill(a, 5);
        assertThat(fill).hasSize(5).containsOnly(a);
    }

    @Test
    public void vectorFill_When_SupplierAndAMaxNumberIsProvided_Then_AVectorWithNumberOfSuppliersIsCreated() {
        Vector<Supplier<Employee>> fill = Vector.fill(supplier, 5);
        assertThat(fill).hasSize(5).hasOnlyElementsOfType(Supplier.class);
    }

    @Test
    public void vectorGenerate_When_SupplierAndAMaxNumberIsProvided_Then_AVectorWithNumberOfSupplierResultsIsCreated() {
        Vector<Employee> generate = Vector.generate(supplier, 5);
        assertThat(generate).hasSize(5).hasOnlyElementsOfType(Employee.class);
    }


    @Test
    public void vectorRange_When_RangeIntegerValuesAreProvided_Then_AVectorWithIntegersInTheRangeIsCreated() {
        Vector<Integer> range = Vector.range(1, 5);
        assertThat(range).hasSize(4).containsOnly(1, 2, 3, 4);
    }

}

class Employee {
    private String name;

    @Override
    public String toString() {
        return "Employee{}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}