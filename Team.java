
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author archimede
 */
public class Team {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player p1 = new Player("Carlo Leonardi", Player.Role.CENTRE);
        Player p2 = new Player("Carlo Mammana", Player.Role.PROP);
        Player p3 = new Player("Alberto Toscano", Player.Role.HOOKER);
        Player p4 = new Player("Valerio Leonardi", Player.Role.FULLBACK);
        Player p5 = new Player("Claudio Nocera", Player.Role.SCRUM_HALF);
        
        TreeSet<Player> players = new TreeSet<>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        System.out.println(players);
    }
    
}
