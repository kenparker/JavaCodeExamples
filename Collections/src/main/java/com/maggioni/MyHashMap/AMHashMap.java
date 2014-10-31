package com.maggioni.MyHashMap;

/**
 *
 * http://tekmarathon.com/2013/03/11/creating-our-own-hashmap-in-java/
 */
public class AMHashMap {
    
    private static final int SIZE = 16;
    private Entry table[] = new Entry[SIZE];
    
    
    class Entry {
        final String key;
        String value;
        Entry next;

        public Entry(String k, String v) {
            this.key = k;
            this.value = v;
        }
        
        public String getValue() {
            return this.value;
        }
        
        public String getKey() {
            return this.key;
        }          
    }
    
    public Entry get(String k) {
        int hash = k.hashCode() % SIZE;
        Entry e = table[hash];
        // if bucket found then traverse through the linked list
        while (e != null) {
            if (e.key.equals(k)) {
                return e;
            }
            e = e.next;
        }
        return null;
    }

    public void put(String k, String v) {
        // the hascode is sometime negative leading to indexoutofbound error
        int hash = k.hashCode() % SIZE; 

        Entry e = table[hash];
        if (e != null) {
            // It means we are trying to insert duplicate value pair,
            // hence override the current pair
            if (e.key.equals(k)) {
                e.value = v;
            } else {
                // Traverse to the ende of the list
                while (e.next != null) {
                    e = e.next;
                }                    
                Entry entryInOldBucket = new Entry(k, v);
                e.next = entryInOldBucket;
                }
        } else {
            // new element in the map
            Entry entryInNewBucket = new Entry(k, v);
            table[hash] = entryInNewBucket;
        }
    }
    
    public static void main(String[] args) {
        
        AMHashMap amhm = new AMHashMap();
        
        amhm.put("Niranjan", "maggioni");
        amhm.put("maria", "olgiati");
        amhm.put("Niranjan", "pallo");
        
        Entry e = amhm.get("Niranjan");
        
        System.out.println("e : " + e.value);
    }
}
