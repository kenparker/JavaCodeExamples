import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SpaceShipTest {

    private Destination mars = new Destination("Mars");
    private Destination jupiter = new Destination("Jupiter");

    @org.junit.Test
    public void test1() {

        SpaceShip ship1 = new SpaceShip("Enterprise", mars);
        System.out.println(ship1);

        Destination localDestination = ship1.getDestination();
        localDestination.setName("newMars");

        System.out.println(ship1);
    }

    @Test
    public void test2() {
        SpaceShip ship1 = new SpaceShip("Enterprise", mars);
        System.out.println(ship1);
        System.out.println(mars);
        mars.setName("Marsx2");
        System.out.println(mars);
        System.out.println(ship1);
    }
}