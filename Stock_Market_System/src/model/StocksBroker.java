/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apoorvakulkarni
 */
public class StocksBroker {
    
    
    public Map<String, List<Integer>> UserStockHistory;
    
    
    public void StocksBroker() {
        this.UserStockHistory = new HashMap<>();
    }

    public Map<String, List<Integer>> getUserStockHistory() {
        return UserStockHistory;
    }

    public void setUserStockHistory(Map<String, List<Integer>> UserStockHistory) {
        this.UserStockHistory = UserStockHistory;
    }
    
    
    
}
