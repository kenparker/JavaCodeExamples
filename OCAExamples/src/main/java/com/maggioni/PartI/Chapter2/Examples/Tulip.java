package com.maggioni.PartI.Chapter2.Examples;
class Plant {
    String getName() {return "plant";}
    Plant getType() {return this;}
}
class Flower extends Plant {

    @Override
    Tulip getType() {return new Tulip();}
      
}
public class Tulip extends Flower{
    
}
