package fantasyfball;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.BooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

public class FBALLDocumentController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ToggleGroup Position;

    @FXML
    private Button draftButton;

    @FXML
    private Label draftName;

    @FXML
    private ToggleGroup Type;

    @FXML
    private CheckBox TOMCHK;

    @FXML
    private CheckBox OLVECHK;

    @FXML
    private CheckBox MUSHCHK;

    @FXML
    private CheckBox BACCHK;

    @FXML
    private Text COST;

    @FXML
    private Text smorbg;

    @FXML
    private Text toop;

    @FXML
    private Text tom;

    @FXML
    private Text olve;

    @FXML
    private Text mush;

    @FXML
    private Text bac;

    @FXML
    private Text tax;

    @FXML
    void draftMe(ActionEvent event) {
        
        
        
        
               
        
        
        
        
        RadioButton selected = (RadioButton)Position.getSelectedToggle();
        smorbg.setText(selected.getText());
        
        RadioButton type_Selected = (RadioButton)Type.getSelectedToggle();
        toop.setText(type_Selected.getText());
        
        int toma = 0;
        int Mushroom = 0;
        int bacon = 0;
        int olive = 0;
        int soozePrice = 0;
        
        if (TOMCHK.isSelected()){
            tom.setText("Tomato, ");
            toma = 1;
        
        }
        else{
            tom.setText("  ");
            toma = 0;
            
        }
        
        if (OLVECHK.isSelected()){
            olve.setText("Olives, ");
            olive = 1;
        
        }
        else{
            tom.setText("  ");
            olive = 0;
            
        }
        
        if (MUSHCHK.isSelected()){
            olve.setText("Mushrooms, ");
            Mushroom = 1;
        
        }
        else{
            tom.setText("  ");
            Mushroom = 0;
            
        }
        
        if (BACCHK.isSelected()){
            olve.setText("Bacon, ");
            bacon = 1;
        
        }
        else{
            tom.setText("  ");
            bacon = 0;
            
        }
        
        String sooze= smorbg.toString();
        if ("Very Small - 25.00".equals(sooze)){
            soozePrice = 25;
            
        }
        else {
            soozePrice = 25;
            
        }
        
        
        int tempPRICE = soozePrice + toma + olive + Mushroom + bacon;
        double taxing = (tempPRICE*.06);
        String tex = Double.toString(taxing);
        tax.setText(tex);
        
        
        double PRICE = tempPRICE + taxing;
        String textPrice = Double.toString(PRICE);
        
        COST.setText(textPrice);
        
        
        
       
    }

    @FXML
    void initialize() {
        assert Position != null : "fx:id=\"Position\" was not injected: check your FXML file 'FBALLDocument.fxml'.";
        assert draftButton != null : "fx:id=\"draftButton\" was not injected: check your FXML file 'FBALLDocument.fxml'.";
        assert draftName != null : "fx:id=\"draftName\" was not injected: check your FXML file 'FBALLDocument.fxml'.";
        assert Type != null : "fx:id=\"Type\" was not injected: check your FXML file 'FBALLDocument.fxml'.";
        assert TOMCHK != null : "fx:id=\"TOMCHK\" was not injected: check your FXML file 'FBALLDocument.fxml'.";
        assert OLVECHK != null : "fx:id=\"OLVECHK\" was not injected: check your FXML file 'FBALLDocument.fxml'.";
        assert MUSHCHK != null : "fx:id=\"MUSHCHK\" was not injected: check your FXML file 'FBALLDocument.fxml'.";
        assert BACCHK != null : "fx:id=\"BACCHK\" was not injected: check your FXML file 'FBALLDocument.fxml'.";
        assert COST != null : "fx:id=\"COST\" was not injected: check your FXML file 'FBALLDocument.fxml'.";
        assert smorbg != null : "fx:id=\"smorbg\" was not injected: check your FXML file 'FBALLDocument.fxml'.";
        assert toop != null : "fx:id=\"toop\" was not injected: check your FXML file 'FBALLDocument.fxml'.";
        assert tom != null : "fx:id=\"tom\" was not injected: check your FXML file 'FBALLDocument.fxml'.";
        assert olve != null : "fx:id=\"olve\" was not injected: check your FXML file 'FBALLDocument.fxml'.";
        assert mush != null : "fx:id=\"mush\" was not injected: check your FXML file 'FBALLDocument.fxml'.";
        assert bac != null : "fx:id=\"bac\" was not injected: check your FXML file 'FBALLDocument.fxml'.";
        assert tax != null : "fx:id=\"tax\" was not injected: check your FXML file 'FBALLDocument.fxml'.";

    }
}
