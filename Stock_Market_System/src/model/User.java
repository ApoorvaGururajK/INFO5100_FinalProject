/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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

    
    private String name;
    
    StocksBroker brokerStocks;
    MutualFundsBroker brokerMF;
    UserSelectionDetails selections;
    UserRegistrationDetails newUser;
    public Map<String, Map<String, List<Integer>>> StockHistoryWithUserName;
    public Map<String, Map<String, Integer>> MutualFundsHistoryWithUserName;
    
    public User() {
        
    }
    
    public User (UserRegistrationDetails newUser){
        this.newUser = newUser;
        
//        selections.getSelections().stream().filter(user ->(this.name.equals(user.getName())));
            
        
            
//        this.UserStockHistory = brokerStocks.getUserStockHistory();
//        this.UserMutualFundsHistory = brokerMF.getUserMutualFundsHistory();
          
       
        
//        this.sellStocks = new UserSellStocks(this.UserStockHistory, this.newUser);
//        this.buyStocks = new UserBuyStocks(this.UserStockHistory, this.newUser);
//        this.buyMututalFunds = new UserBuyMF(this.UserMutualFundsHistory, this.newUser);
// 
    }   
    
    
}
