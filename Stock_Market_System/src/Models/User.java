/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import UI.UserBuyMF;
import UI.UserBuyStocks;
import UI.UserSellStocks;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author apoorvakulkarni
 */
public class User {
    
    private UserBuyStocks buyStocks;
    private UserSellStocks sellStocks;
    private UserBuyMF buyMututalFunds;
    public Map<String, List<Integer>> UserStockHistory;
    public Map<String, Integer> UserMutualFundsHistory;
    
    public User (){
        
        this.UserStockHistory = new HashMap<>();
        this.UserMutualFundsHistory = new HashMap<>();
        
        this.sellStocks = new UserSellStocks(this.UserStockHistory);
        this.buyStocks = new UserBuyStocks(this.UserStockHistory);
        this.buyMututalFunds = new UserBuyMF(this.UserMutualFundsHistory);
    }
}
