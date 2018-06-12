package FunctionalProgrammingInJavaBook_Chapter_2;

import org.junit.Test;

import java.util.Objects;

import static org.assertj.core.api.Assertions.*;

public class SwitchingArgumentsDemo2 {

    public class Tax {
        private Double tax;

        public Tax(Double tax) {
            this.tax = tax;
        }

        public Double getTax() {
            return tax;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Tax)) return false;
            Tax tax1 = (Tax) o;
            return Objects.equals(getTax(), tax1.getTax());
        }

        @Override
        public int hashCode() {

            return Objects.hash(getTax());
        }

        @Override
        public String toString() {
            return "Tax{" +
                    "tax=" + tax +
                    '}';
        }
    }

    public class Amount {
        private Double amount;

        public Amount(Double amount) {
            this.amount = amount;
        }

        public Double getAmount() {
            return amount;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Amount)) return false;
            Amount amount1 = (Amount) o;
            return Objects.equals(getAmount(), amount1.getAmount());
        }

        @Override
        public int hashCode() {

            return Objects.hash(getAmount());
        }

        @Override
        public String toString() {
            return "Amount{" +
                    "amount=" + amount +
                    '}';
        }
    }

    MyFunction<Amount, MyFunction<Tax,Double>> addTax = amount -> tax -> amount.getAmount() + amount.getAmount() / 100 * tax.getTax();

    static <T, U, V> MyFunction<T, MyFunction<U,V>> reverse(MyFunction<U, MyFunction<T,V>> f) {
        return t -> u -> f.apply(u).apply(t);
    }

    Tax tax = new Tax(9.0);
    Amount amount = new Amount(1500.22);

    @Test
    public void given_when_then() {
        Double resultAddTax = addTax.apply(amount).apply(tax);
        Double resultReverse = reverse(addTax).apply(tax).apply(amount);

        assertThat(resultAddTax).isEqualTo(resultReverse);
    }
}
