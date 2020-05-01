
package excusegenerator.pkg2.pkg0;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;


public class FXMLDocumentController implements Initializable {
    
    
//<editor-fold defaultstate="collapsed" desc="FXML elemek">
    @FXML
    private Pane basePane;
    @FXML
    private Pane gamePane;
    @FXML
    private Label adLabel;
    @FXML
    private Label excuseLabel;
    @FXML
    private Button playButton;
    @FXML
    private Button nextButton;
//</editor-fold>
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
    // Itt kell majd meghívi két dolgot
    //    a. első pane eltűnik, második megjelenik
        basePane.setVisible(false);
        gamePane.setVisible(true);
        System.out.println("Kifogásokat keresünk.");
    //    b. a második pane-en a label kiírja a kifogást
        generator();
               
    }
    
    //Itt képződnek a random mondatok
      public String generator(){ 
    
    String[] firstPart = {"Ne haragudj, de ", "Bocsáss meg, ", "Tudod, hogy általában nem jellemző rám, viszont ", "Nem fogod elhinni, de ", "Basszus, képzeld el, hogy ", "Én csak tettem a dolgom, mint mindig, erre ", "Kissé elvesztettem az időérzékemet, ugyanis ", "Tényleg nem tehetek róla, de ", "Sajnos megváltoztak a körülmények, mivel "};
    String[] secondPart = {"egy háromlábú nő ", "egy részeg angol turista ", "Orbán Ráhel ", "Kucsera evezője ", "egy xenomorf ", "a görbe néni a Mars-térről ", "egy csapat feldühödött Fradi szurkoló ", "egy Károly nevű triceratopsz ", "Adolf Hitler szelleme ", "Peter Griffin ", "egy embernagyságú hörcsög ", "a macskám ", "egy arab terrorista ", "Rick és Morty ", "egy Sailor Moon jelmezes transzvesztita ", "Tyrion Lannister ", "egy mutáns varjú ", "egy zombi csivava "};
    String[] lastPart = {"rasszista viccekkel zaklatott telefonon.", "betört hozzánk.", "sört öntött a laptopomba.", "olcsó parfümöket akart rámsózni.", "Ginát rakott az italomba.", "kiégette cigivel a pulcsimat.", "ellopta a biciklimet.", "telespammelte pornóvideókkal a Facebookomat.", "eltépte az adóbevallásomat.", "összeverekedett a buszsofőrrel.", "megkergetett az utcán.", "egész éjjel részegen ordibált az ablakom alatt.", "megette a zoknimat.", "felgyújtotta a kukánkat.", "megfakockázta a metrót.", "ellopta az összes budipapíromat.", "arcmaszkot varrt a nadrágomból."};

    int random1 = (int)(Math.random()*firstPart.length);
    int random2 = (int)(Math.random()*secondPart.length);
    int random3 = (int)(Math.random()*lastPart.length);
    
    String sentence = firstPart[random1] + secondPart[random2] + lastPart[random3];
    excuseLabel.setText(sentence);
        return sentence;
      }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
    }    
    
}
