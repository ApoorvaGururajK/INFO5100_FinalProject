/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author apoorvakulkarni
 */
public class UserRegistrationDetails {
    
    private String userID;
    private String name;
    private String dob;
    private String address; 
    private String phone;
    private String email;
    private String occupation;
    private Double tradingAcc;
    private String sbroker;
    private String mfbroker;
    private String password;
    private Integer initialBalance;
    private Integer no_of_stocks;
    private Integer no_of_stocks_sell;
    private Integer no_of_units;
    private String MFIndex_unit_selected;
    private Integer index_unit_value;
    public Map<String, List<Integer>> StockHistory;
    public Map<String, Integer> MutualFundsHistory;

    public String getUserID() {
        return userID;
    }

    public Integer getNo_of_stocks_sell() {
        return no_of_stocks_sell;
    }

    public void setNo_of_stocks_sell(Integer no_of_stocks_sell) {
        this.no_of_stocks_sell = no_of_stocks_sell;
    }

    public String getMFIndex_unit_selected() {
        return MFIndex_unit_selected;
    }

    public Integer getIndex_unit_value() {
        return index_unit_value;
    }

    public void setIndex_unit_value(Integer index_unit_value) {
        this.index_unit_value = index_unit_value;
    }

    public void setMFIndex_unit_selected(String MFIndex_unit_selected) {
        this.MFIndex_unit_selected = MFIndex_unit_selected;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public Integer getNo_of_units() {
        return no_of_units;
    }

    public void setNo_of_units(Integer no_of_units) {
        this.no_of_units = no_of_units;
    }

    public Integer getNo_of_stocks() {
        return no_of_stocks;
    }

    public void setNo_of_stocks(Integer no_of_stocks) {
        this.no_of_stocks = no_of_stocks;
    }

    public Integer getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(Integer initialBalance) {
        this.initialBalance = initialBalance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Double getTradingAcc() {
        return tradingAcc;
    }

    public void setTradingAcc(Double tradingAcc) {
        this.tradingAcc = tradingAcc;
    }

    public String getSbroker() {
        return sbroker;
    }

    public void setSbroker(String sbroker) {
        this.sbroker = sbroker;
    }

    public String getMfbroker() {
        return mfbroker;
    }

    public void setMfbroker(String mfbroker) {
        this.mfbroker = mfbroker;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, List<Integer>> getStockHistory() {
        return StockHistory;
    }

    public void setUserStockHistory(Map<String, List<Integer>> StockHistory) {
        this.StockHistory = StockHistory;
    }

    public Map<String, Integer> getMutualFundsHistory() {
        return MutualFundsHistory;
    }

    public void setUserMutualFundsHistory(Map<String, Integer> MutualFundsHistory) {
        this.MutualFundsHistory = MutualFundsHistory;
    }

    @Override
    public String toString() {
        return "UserRegistrationDetails{" + "userID=" + userID + ", name=" + name + ", dob=" + dob + ", address=" + address + ", phone=" + phone + ", email=" + email + ", occupation=" + occupation + ", tradingAcc=" + tradingAcc + ", sbroker=" + sbroker + ", mfbroker=" + mfbroker + ", password=" + password + ", initialBalance=" + initialBalance + ", no_of_stocks=" + no_of_stocks + ", no_of_stocks_sell=" + no_of_stocks_sell + ", no_of_units=" + no_of_units + ", MFIndex_unit_selected=" + MFIndex_unit_selected + ", index_unit_value=" + index_unit_value + ", StockHistory=" + StockHistory + ", MutualFundsHistory=" + MutualFundsHistory + '}';
    }
    

}
