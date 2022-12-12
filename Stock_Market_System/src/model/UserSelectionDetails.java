/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apoorvakulkarni
 */
public class UserSelectionDetails {
    
    private List<UserRegistrationDetails> selections;
    
    public UserSelectionDetails () {
        
        this.selections = new ArrayList<>();
        
    }

    public List<UserRegistrationDetails> getSelections() {
        return selections;
    }

    public void setSelections(List<UserRegistrationDetails> selections) {
        this.selections = selections;
    }
    
    public UserRegistrationDetails addUser() {
        UserRegistrationDetails newUser = new UserRegistrationDetails();
        selections.add(newUser);
        return newUser;
    }
    
    
}
