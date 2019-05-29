/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Player implements Comparable<Player>{

    
    public enum Role {
        PROP,
        HOOKER,
        SECOND_LINE,
        THIRD_LINE,
        SCRUM_HALF,
        FLY_HALF,
        CENTRE,
        WING,
        FULLBACK
    }
    private String displayName;
    private Role role;

    public Player(String displayName, Role role) {
        this.displayName = displayName;
        this.role = role;
    }
    
    @Override
    public int compareTo(Player p) {
        if (this.role.ordinal() > p.role.ordinal()) return 1;
        return -1;
    }
    
    
    @Override
    public String toString() {
        return "Player{" + "displayName=" + displayName + ", role=" + role + "}\n";
    }
    
    
    
    
    
    
}
