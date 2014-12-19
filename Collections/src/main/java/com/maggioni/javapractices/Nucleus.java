package com.maggioni.javapractices;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * http://www.javapractices.com/topic/TopicAction.do?Id=26
 */
public class Nucleus {

    public static void main(String... arguments) {
        Nucleus lithium = new Nucleus(3, 4);
        //note the generic Map reference is used here, not LinkedHashMap
        Map<String, Integer> quarks = lithium.getQuarkSummary();
        log("Number of up quarks in lithium nucleus: " + quarks.get("Up"));
        log("Number of down quarks in lithium nucleus: " + quarks.get("Down"));
    }

    public Nucleus(int aNumProtons, int aNumNeutrons) {
        fNumProtons = aNumProtons;
        fNumNeutrons = aNumNeutrons;
    }

    /**
     * Note get method is final.
     */
    public final int getNumProtons() {
        return fNumProtons;
    }

    /**
     * Note get method is final.
     */
    public final int getNumNeutrons() {
        return fNumNeutrons;
    }

    /**
     * This method returns a Map which summarizes how many quarks of each
     * flavour are in the nucleus.
     *
     * @return a generic Map reference, instead of a LinkedHashMap; the user
     * will be protected from the detail of what implementation of Map has been
     * selected here.
     */
    public final Map<String, Integer> getQuarkSummary() {
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        int numUp
                = fNumProtons * fUP_QUARKS_PER_PROTON
                + fNumNeutrons * fUP_QUARKS_PER_NEUTRON;
        int numDown
                = fNumProtons * fDOWN_QUARKS_PER_PROTON
                + fNumNeutrons * fDOWN_QUARKS_PER_NEUTRON;
        //this makes use of auto-boxing of ints into Integers:
        result.put("Up", numUp);
        result.put("Down", numDown);
        return result;
    }

    //PRIVATE 
    private final int fNumProtons;
    private final int fNumNeutrons;

    private static final int fUP_QUARKS_PER_PROTON = 2;
    private static final int fDOWN_QUARKS_PER_PROTON = 1;

    private static final int fUP_QUARKS_PER_NEUTRON = 1;
    private static final int fDOWN_QUARKS_PER_NEUTRON = 2;

    private static void log(String aMessage) {
        System.out.println(aMessage);
    }
}
