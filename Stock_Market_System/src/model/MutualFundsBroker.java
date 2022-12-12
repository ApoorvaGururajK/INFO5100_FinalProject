/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author apoorvakulkarni
 */
public class MutualFundsBroker {
    
    public Map<String, Integer> UserMutualFundsHistory;
    
    public void MutualFundsBroker() {
        this.UserMutualFundsHistory = new HashMap<>();
    }

    public Map<String, Integer> getUserMutualFundsHistory() {
        return UserMutualFundsHistory;
    }

    public void setUserMutualFundsHistory(Map<String, Integer> UserMutualFundsHistory) {
        this.UserMutualFundsHistory = UserMutualFundsHistory;
    }
    
}
