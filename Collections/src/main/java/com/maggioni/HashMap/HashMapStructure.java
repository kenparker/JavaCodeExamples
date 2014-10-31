package com.maggioni.HashMap;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * http://www.javacodegeeks.com/2014/03/how-hashmap-works-in-java.html
 */
public class HashMapStructure {

    
    public static void main(String[] args) {
      
        Country india = new Country("india", 1000);
        Country japan = new Country("japan", 10000);
        Country france = new Country("france", 2000);
        Country russia = new Country("russia", 20000);
        
        HashMap<Country,String> countryCapitalMap = new HashMap<Country,String>();
        countryCapitalMap.put(india, "Delhi");
        System.out.println("hascode for : " + india.getName() + " is : "+ india.hashCode());
        
        countryCapitalMap.put(japan, "Tokyo");
        System.out.println("hascode for : " + japan.getName() + " is : "+ japan.hashCode());
        countryCapitalMap.put(france, "Paris");
        countryCapitalMap.put(russia, "Moscow");
        
        Iterator<Country> countryCapitalIter = countryCapitalMap.keySet().iterator();
        while (countryCapitalIter.hasNext()) {
            Country countryObj = countryCapitalIter.next();
            String capital = countryCapitalMap.get(countryObj);
            System.out.println(countryObj.getName() + "-------------" + capital);
        }
    }
    
}
