/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;


/**
 *
 * @author hmzko
 */
public class JavaFXApplication2 extends Application implements EventHandler<ActionEvent> {
    
    
   Button btnCalc, btnBack;
   TextField tfName,tfPrincipal,tfRate,tfResult, tfTime,tfCustName,tfEarned;
   Stage window;
   Scene mainScene,scene2;
    
    @Override
    public void start(Stage primaryStage) {
        
        window = primaryStage;
        Label lbName = new Label ("Name:");
        tfName=new TextField();
        
        Label lbPrincipal = new Label ("Investment:");
        tfPrincipal=new TextField();
        
        Label lbRate = new Label ("Rate:");
        tfRate=new TextField();
        
        Label lbTime = new Label ("Time:");
        tfTime=new TextField();
        
        btnCalc = new Button("Calculate Interest");
        btnCalc.setOnAction(this);
        
        Label lbResult= new Label("Interest Earned");
        tfResult = new TextField();
        VBox layout = new VBox();
        
        layout.getChildren().addAll(lbName,tfName,lbPrincipal,tfPrincipal,lbRate,tfRate,lbTime,tfTime,lbResult,tfResult);
        mainScene = new Scene(layout,500,500);
        
        
        //Scene 2
        
        Label lbCustName = new Label("Report for");
        tfCustName = new TextField();
        Label lbInterest= new Label("Interest Earned");
        tfEarned = new TextField();
        btnBack = new Button("Back");
        btnBack.setOnAction(this);
        
        
        layout.getChildren().addAll(lbCustName,tfCustName,lbInterest,tfEarned,btnBack);
        mainScene = new Scene(layout,500,500);
        
        
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
    
    public void handle(ActionEvent e ){
    if(e.getSource()==btnCalc){
        double p = Double.valueOf(tfPrincipal.getText());
         double r = Double.valueOf(tfRate.getText());
          double t = Double.valueOf(tfTime.getText());
          cust = new Customer(tfName.getText(),p,r,t);
          tfResult.setText(""+cust.calcInterest());
          tfCustName.setText(cust.name);
          tfEarned.set
    
    }  
    
      if(e.getSource()==btnBack){
    
    
    
    } 
    
      
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
