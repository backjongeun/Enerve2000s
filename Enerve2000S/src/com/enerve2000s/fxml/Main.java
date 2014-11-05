/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.enerve2000s.fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import javafx.scene.layout.AnchorPane;
import enerve2000s.Enerve2000S;
/**
 * FXML Controller class
 *
 * @author 박세정
 */

public class Main implements Initializable {
    @FXML
    private Button btn_nav_m1; //dc
    @FXML
    private Button btn_nav_m2; //setup
    @FXML
    private Button btn_nav_m3; //report
    @FXML
    private Button btn_nav_m99; //exit
    @FXML
    private AnchorPane pan_include;
    
    public static int currentbtn =-1; //이전 선택된버튼
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void linkDc(ActionEvent event) {
        clearPan();        
        resetButton(1);   
        try{
            Parent inpage =  FXMLLoader.load(getClass().getResource("/com/enerve2000s/fxml/Dcmonitor.fxml"), null, new JavaFXBuilderFactory());
            this.pan_include.getChildren().add(inpage);     
        }catch(Exception ex){
            System.out.println(this.getClass().getName());
        }                
    }

    @FXML
    private void linkSetup(ActionEvent event) {
      clearPan();
      resetButton(2);
      try{
            Parent inpage =  FXMLLoader.load(getClass().getResource("/com/enerve2000s/fxml/Setup.fxml"), null, new JavaFXBuilderFactory());
            this.pan_include.getChildren().add(inpage);    
        }catch(Exception ex){
            System.out.println(this.getClass().getName());
        }        
   }

    @FXML
    private void linkReport(ActionEvent event) {
        clearPan();        
        resetButton(3);
    }

    @FXML
    private void linkExit(ActionEvent event) {
        clearPan();        
        resetButton(99);
        Enerve2000S.getInstance().gotoLogin();

    }
    
    
    
    private void resetButton(int nowbtn){
        if(currentbtn != nowbtn){
            switch(currentbtn){
                case 1: btn_nav_m1.getStyleClass().clear(); btn_nav_m1.getStyleClass().add("nav_m1");
                break; 
                case 2: btn_nav_m2.getStyleClass().clear(); btn_nav_m2.getStyleClass().add("nav_m2");
                break;
                case 3: btn_nav_m3.getStyleClass().clear(); btn_nav_m3.getStyleClass().add("nav_m3");
                break; 
                case 99: btn_nav_m99.getStyleClass().clear(); btn_nav_m99.getStyleClass().add("nav_m99");
                break;                   
            }
             switch(nowbtn){
                case 1: btn_nav_m1.getStyleClass().clear(); btn_nav_m1.getStyleClass().add("nav_m1_selected");
                break; 
                case 2: btn_nav_m2.getStyleClass().clear(); btn_nav_m2.getStyleClass().add("nav_m2_selected");
                break;
                case 3: btn_nav_m3.getStyleClass().clear(); btn_nav_m3.getStyleClass().add("nav_m3_selected");
                break; 
                case 99: btn_nav_m99.getStyleClass().clear(); btn_nav_m99.getStyleClass().add("nav_m99_selected");
                break;                     
            }
           currentbtn = nowbtn; 
        }
    }
    
    
    private void clearPan(){
          pan_include.getChildren().clear();
    }
}

