package com.maggioni.AdvancedClassDesign;

public class AssociationDemo1 {
    
}

/*
Car HAS-A Engine but in this case we have a composition
*/
class CarComposition {
    private final Engine engine;

    public CarComposition() {
        engine = new Engine(); // lifecycle from engine is bound to Car -> Composition
    }
    
    /*
    no getter or setter for engine
    */
    
}

/*
Car HAS-A Engine but in this case we have a Aggregation
*/
class CarAggregation {
    private Engine engine; // lifecycle from engine is not necessary bound to Car -> Aggregation

    public CarAggregation(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    
}

class Engine {
    
}
