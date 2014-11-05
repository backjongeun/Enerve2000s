/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.enerve2000s.fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;


/**
 * FXML Controller class
 *
 * @author 박세정
 */
public class Setup implements Initializable {
    @FXML
    private AnchorPane pan_setup_m1;
    @FXML
    private AnchorPane pan_setup_m2;
    @FXML
    private AnchorPane pan_setup_m3;
    @FXML
    private AnchorPane pan_setup_m4;
    @FXML
    private AnchorPane pan_setup_m5;
    @FXML
    private AnchorPane pan_setup_m6;
    @FXML
    private AnchorPane pan_setup_m7;
    @FXML
    private AnchorPane pan_setup_m8;
    @FXML
    private AnchorPane pan_setup_m9;
    @FXML
    private AnchorPane pan_setup_m10;
    @FXML
    private AnchorPane pan_setup_m11;
    @FXML
    private AnchorPane pan_setup_m12;
    @FXML
    private AnchorPane pan_setup_m13;
  
    @FXML
    private ToggleButton btn_setup_m1;

    @FXML
    private ToggleButton btn_setup_m2;
    @FXML
    private ToggleButton btn_setup_m3;
    @FXML
    private ToggleButton btn_setup_m4;
    @FXML
    private ToggleButton btn_setup_m5;
    @FXML
    private ToggleButton btn_setup_m6;
    @FXML
    private ToggleButton btn_setup_m7;
    @FXML
    private ToggleButton btn_setup_m8;
    @FXML
    private ToggleButton btn_setup_m9;
    @FXML
    private ToggleButton btn_setup_m10;
    @FXML
    private ToggleButton btn_setup_m11;
    @FXML
    private ToggleButton btn_setup_m12;
    @FXML
    private ToggleButton btn_setup_m13;
 

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        // 토글그룹 생성해서 패널 지정
        final ToggleGroup group = new ToggleGroup(); 
        btn_setup_m1.setToggleGroup(group);
        btn_setup_m1.setUserData(pan_setup_m1);        
        btn_setup_m2.setToggleGroup(group);
        btn_setup_m2.setUserData(pan_setup_m2);
        btn_setup_m3.setToggleGroup(group);
        btn_setup_m3.setUserData(pan_setup_m3);        
        btn_setup_m4.setToggleGroup(group);
        btn_setup_m4.setUserData(pan_setup_m4);                
        btn_setup_m5.setToggleGroup(group);
        btn_setup_m5.setUserData(pan_setup_m5);                
        btn_setup_m6.setToggleGroup(group);
        btn_setup_m6.setUserData(pan_setup_m6);                
        btn_setup_m7.setToggleGroup(group);
        btn_setup_m7.setUserData(pan_setup_m7);                
        btn_setup_m8.setToggleGroup(group);
        btn_setup_m8.setUserData(pan_setup_m8);                
        btn_setup_m9.setToggleGroup(group);
        btn_setup_m9.setUserData(pan_setup_m9);                
        btn_setup_m10.setToggleGroup(group);
        btn_setup_m10.setUserData(pan_setup_m10);                
        btn_setup_m11.setToggleGroup(group);
        btn_setup_m11.setUserData(pan_setup_m11);                
        btn_setup_m12.setToggleGroup(group);
        btn_setup_m12.setUserData(pan_setup_m12);                
        btn_setup_m13.setToggleGroup(group);
        btn_setup_m13.setUserData(pan_setup_m13);                
        //초기 화면에서 선택된 버튼
        btn_setup_m1.setSelected(true);
       
        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
            public void changed(ObservableValue<? extends Toggle> ov,  Toggle old_toggle, Toggle new_toggle) {
               if(old_toggle != null){
                      ((AnchorPane)old_toggle.getUserData()).setVisible(false);
               }
               if (new_toggle != null) {
                       ((AnchorPane)new_toggle.getUserData()).setVisible(true);
               }                
           }
       });
    }    

    
    @FXML
    private void show_steup_m1(ActionEvent event) {
        System.out.println("DC제어관련 설정");
    }

    @FXML
    private void show_steup_m2(ActionEvent event) {
        System.out.println("활정/약정/그룹설정");
    }

    
    @FXML
    private void show_steup_m3(ActionEvent event) {
        System.out.println("이더넷/전력제어설정");        
    }

    @FXML
    private void show_setup_m4(ActionEvent event) {
        System.out.println("부하번호/우선순위설정");             
    }

    @FXML
    private void show_setup_m5(ActionEvent event) {
        System.out.println("목표값/계절설정");              
    }

    @FXML
    private void show_setup_m6(ActionEvent event) {
         System.out.println("부하시간대(평일)");                 
    }

    @FXML
    private void show_setup_m7(ActionEvent event) {
         System.out.println("부하시간대(공휴일)");              
    }

    @FXML
    private void show_setup_m8(ActionEvent event) {
         System.out.println("수신로그보기");            
    }

    @FXML
    private void show_setup_m9(ActionEvent event) {
         System.out.println("사용자정보설정/초기화");                   
    }

    @FXML
    private void show_setup_m10(ActionEvent event) {
         System.out.println("공휴일 설정");              
    }

    @FXML
    private void show_setup_m11(ActionEvent event) {
         System.out.println("DC통신관련 설정");                      
    }

    @FXML
    private void show_setup_m12(ActionEvent event) {
         System.out.println("설정값 복구");           
    }

    @FXML
    private void show_setup_m13(ActionEvent event) {
         System.out.println("시간별목표전력설정");                   
    }


}

