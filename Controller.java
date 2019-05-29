
import java.util.TreeSet;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author archimede
 */
public class Controller {
    
    TreeSet<Player> players = new TreeSet<>();
    
    @FXML
    private TextField inputText;
    
    @FXML
    private TextField role;
    
    @FXML
    private TextArea outputText;
    
    @FXML
    private void createPlayer() {
        Player p = new Player(this.inputText.getText(), Player.Role.valueOf(this.role.getText()));
        this.inputText.setText("");
        this.players.add(p);
        this.outputText.setText(players.toString());
        
    }
    
}
