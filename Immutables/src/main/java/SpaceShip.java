import java.util.Objects;

public final class SpaceShip {
    private final String name;
    private final Destination destination;

    public SpaceShip(String name, Destination destination) {
        this.name = name;
        this.destination = new Destination(destination);
        //this.destination = destination;    Bad, the Mutable Object can be modified and then also SpaceShip is modified
    }

    public String getName() {
        return name;
    }

    public Destination getDestination() {
        //return destination;      Bad, the Mutable Object could be modified
        return new Destination(destination);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SpaceShip)) return false;
        SpaceShip spaceShip = (SpaceShip) o;
        return Objects.equals(name, spaceShip.name) &&
                Objects.equals(destination, spaceShip.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, destination);
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", destination=" + destination +
                '}';
    }
}
