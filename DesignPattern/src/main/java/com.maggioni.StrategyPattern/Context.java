package com.maggioni;

class Context {

    private final Strategy strategy;
    
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void arrange(int [] numbers) {
        strategy.sort(numbers);
    }
    
}
