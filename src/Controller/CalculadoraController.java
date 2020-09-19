
package Controller;

import Model.ClaseSegundaria;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;


public class CalculadoraController implements Initializable {

    @FXML
    private Button Operaciones;
    @FXML
    private RadioButton RBSuma;
    @FXML
    private RadioButton RBResta;
    @FXML
    private RadioButton RBMulti;
    @FXML
    private RadioButton RBDIvicion;
    @FXML
    private TextField TxtDato1;
    @FXML
    private TextField TxtDato2;
    @FXML
    private TextField TxtResult;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ToggleGroup tg= new ToggleGroup();
        this.RBSuma.setToggleGroup(tg);
        this.RBResta.setToggleGroup(tg);
        this.RBMulti.setToggleGroup(tg);
        this.RBDIvicion.setToggleGroup(tg);
    }    

    @FXML
    private void Operacion(ActionEvent event) {
       int Num1= Integer.parseInt(this.TxtDato1.getText());
       int Num2 = Integer.parseInt(this.TxtDato2.getText());
       
       //llamar clase
       ClaseSegundaria Operacion= new ClaseSegundaria();
       //condiciones
       Operacion.Recoger(Num1, Num2);
        if (this.RBSuma.isSelected()) {
            this.TxtResult.setText( Operacion.Suma()+"");
        } else if (this.RBResta.isSelected()){
            this.TxtResult.setText( Operacion.Resta()+"");  
        }else if(this.RBMulti.isSelected()){
          this.TxtResult.setText( Operacion.Multiplicacion()+"");
        }else if(this.RBDIvicion.isSelected()){
          this.TxtResult.setText( Operacion.Divicion()+"");
        }
    }
    
}
