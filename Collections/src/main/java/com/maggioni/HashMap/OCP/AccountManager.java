package com.maggioni.HashMap.OCP;

import java.util.HashMap;
import java.util.Map;

public class AccountManager {

    private Map<String, Integer> accountTotals = new HashMap();
    private int retirementFund;
    
    public int getBalance(String accountName) {
        return accountTotals.get(accountName);
    }

}
