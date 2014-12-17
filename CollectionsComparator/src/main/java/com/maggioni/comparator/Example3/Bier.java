package com.maggioni.comparator.Example3;

public class Bier {

    private String name;
    private String herkunft;
    private float inhalt;

    public Bier() {
    }

    public Bier(String name, String herkunft, float inhalt) {

        this.name = name;
        this.herkunft = herkunft;
        this.inhalt = inhalt;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHerkunft() {
        return this.herkunft;
    }

    public void setHerkunft(String herkunft) {
        this.herkunft = herkunft;
    }

    public float getInhalt() {
        return this.inhalt;
    }

    public void setInhalt(float inhalt) {
        this.inhalt = inhalt;
    }

    public String toString() {
        return this.name + " aus " + this.herkunft + " mit " + this.inhalt + " Litern";
    }
}
