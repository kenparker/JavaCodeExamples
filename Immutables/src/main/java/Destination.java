public final class Destination {

    private String name;

    public Destination(String name) {
        this.name = name;
    }

    public Destination(Destination destination) {
        this.name = destination.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "name='" + name + '\'' +
                '}';
    }
}
