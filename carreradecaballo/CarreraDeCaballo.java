/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package carreradecaballo;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

/**
 *
 * @author joselopez
 */
public class CarreraDeCaballo extends Application {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("carreraGrafica.fxml"));
        stage.setTitle("Carrera De Caballos");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
    
    @FXML
    private CheckBox lucky;
    
    @FXML
    private CheckBox azabache;

    @FXML
    private CheckBox silvestre;
    
    @FXML
    private CheckBox rayo;
    
    @FXML
    private CheckBox kentuchy;
    
    @FXML
    private TextField nombreUsurio;
    
    @FXML
    private TextField monto;
    
    @FXML
    private ProgressBar progresoCarrera;
    
    @FXML
    private Button nuevaApuesta;
    
    @FXML
    private Button inicio;
    
    @FXML
    private Label ganador;
    
    Vector<Vector<String>> apostadores = new Vector<Vector<String>>();
    Vector<String> resultados = new Vector<String>();
    int numApostador = 0, caballo = 0;
    String caballoGanador = "";
    
    @FXML
    void usuarios(ActionEvent event) {
        /*Pattern patNombre = Pattern.compile("^([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\']+[\\s])+([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\'])+[\\s]?([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ\\'])?$");
        Matcher matNombre = patNombre.matcher(nombreUsurio.getText());
        if (!matNombre.matches()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error en el nombre");
        }*/
    }
    
    @FXML
    void caballoLucky(ActionEvent event) {
        if (lucky.isSelected()) {
            //numero del caballo
            caballo = 1;
            
            
            
            //Se deactiva las demas opciones
            azabache.setSelected(false);
            silvestre.setSelected(false);
            rayo.setSelected(false);
            kentuchy.setSelected(false);
            
        } else {
            
            lucky.setSelected(false);
            azabache.setSelected(false);
            silvestre.setSelected(false);
            rayo.setSelected(false);
            kentuchy.setSelected(false);
            caballo = 0;
        }
        
        System.out.println(caballo);
    }

    @FXML
    void caballoAzabache(ActionEvent event) {
        if (azabache.isSelected()) {
            //numero del caballo
            caballo = 2;
            
            
            //Se deactiva las demas opciones
            lucky.setSelected(false);
            silvestre.setSelected(false);
            rayo.setSelected(false);
            kentuchy.setSelected(false);
            
        } else {
            
            lucky.setSelected(false);
            azabache.setSelected(false);
            silvestre.setSelected(false);
            rayo.setSelected(false);
            kentuchy.setSelected(false);
            caballo = 0;
        }
        System.out.println(caballo);
    }
    
    @FXML
    void caballoSilvestre(ActionEvent event) {
        if (silvestre.isSelected()) {
            //numero del caballo
            caballo = 3;
            
            
            //Se deactiva las demas opciones
            lucky.setSelected(false);
            azabache.setSelected(false);
            rayo.setSelected(false);
            kentuchy.setSelected(false);
            
        } else {
            
            lucky.setSelected(false);
            azabache.setSelected(false);
            silvestre.setSelected(false);
            rayo.setSelected(false);
            kentuchy.setSelected(false);
            caballo = 0;
        }
        System.out.println(caballo);
    }
    
    @FXML
    void caballoRayo(ActionEvent event) {
        if (rayo.isSelected()) {
            //numero del caballo
            caballo = 4;
            
            
            //Se deactiva las demas opciones
            lucky.setSelected(false);
            azabache.setSelected(false);
            silvestre.setSelected(false);
            kentuchy.setSelected(false);
            
        } else {
            
            lucky.setSelected(false);
            azabache.setSelected(false);
            silvestre.setSelected(false);
            rayo.setSelected(false);
            kentuchy.setSelected(false);
            caballo = 0;
        }
        System.out.println(caballo);
    }
    
    @FXML
    void caballoKentucky(ActionEvent event) {
        if (kentuchy.isSelected()) {
            //numero del caballo
            caballo = 5;
            
            
            //Se deactiva las demas opciones
            lucky.setSelected(false);
            azabache.setSelected(false);
            silvestre.setSelected(false);
            rayo.setSelected(false);
            
            
        } else {
            
            lucky.setSelected(false);
            azabache.setSelected(false);
            silvestre.setSelected(false);
            rayo.setSelected(false);
            kentuchy.setSelected(false);
            caballo = 0;
        }
        System.out.println(caballo);
    }
    
    @FXML
    void agregarMonto(ActionEvent event) {
        
    }

    @FXML 
    void agregarNuevaApuesta(ActionEvent event) {
        apostadores.get(numApostador).add(nombreUsurio.getText());
        apostadores.get(numApostador).add(monto.getText());
        
        switch (caballo) {
            case 1:
                apostadores.get(numApostador).add("Lucky");
                break;
                
            case 2:
                apostadores.get(numApostador).add("Azabache");
                break;
            
            case 3:
                apostadores.get(numApostador).add("Silvestre");
                break;
            
            case 4:
                apostadores.get(numApostador).add("Rayo");
                break;
            
            case 5:
                apostadores.get(numApostador).add("Kentucky");
                break;
        }//Fin de SWITCH
        
        //System.err.println("usuario "+nombreUsurio.getText());
        //System.err.print("Monto "+monto.getText());
        //se devuelve todo como estaba al inicio
        limpiar();
        
        numApostador++;
    }//Fin de agregarNuevaApuesta
    
    void guardar(){
        apostadores.get(numApostador).add("prueba");
        System.err.println(numApostador);
    }
    
    void limpiar(){
        nombreUsurio.clear();
        monto.clear();
        lucky.setSelected(false);
        azabache.setSelected(false);
        silvestre.setSelected(false);
        rayo.setSelected(false);
        kentuchy.setSelected(false);
    }
    
    @FXML
    void iniciarCarrera(ActionEvent event) throws InterruptedException {
        agregarNuevaApuesta(event);
        // lanzar caballos
        caballos();
        finCarrera();
        limpiar();
        
    }//Fin de iniciarCarrera
    
    void caballos() throws InterruptedException{
        Thread lucky = new Thread();
        Thread azabache = new Thread();
        Thread silvestre = new Thread();
        Thread rayo = new Thread();
        Thread kentucky = new Thread();
        
        lucky.sleep((long) Math.random());
        azabache.sleep((long) Math.random());
        silvestre.sleep((long) Math.random());
        rayo.sleep((long) Math.random());
        kentucky.sleep((long) Math.random());
            
        lucky.start();
        azabache.start();
        silvestre.start();
        rayo.start();
        kentucky.start();
        
    }
    
    void finCarrera(){
        for (int i = 0; i < apostadores.size(); i++) {
            //preguntar cuantos apostadores le apostaron al caballo ganador
            
        }
    }
}
