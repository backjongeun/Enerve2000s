/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enerve2000s;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.stage.Screen;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Rectangle2D;
import javafx.fxml.JavaFXBuilderFactory;
import com.enerve2000s.define.EnerveConst;
import com.enerve2000s.utils.SystemInfo;


/**
 *
 * @author kwon
 */
public class Enerve2000S extends Application {
    private Stage stage;
    private Scene scene;
    private static Enerve2000S instance;
    
    public Enerve2000S() {
        instance = this;
    }
        
    public static Enerve2000S getInstance() {
        return instance;
    }

    @Override
    public void init() throws Exception {
        super.init();
         //Font.loadFont(SmartCCS_Com.class.getResource("/com/ui/font/H2HDRM.TTF").toExternalForm(), 10);
        //new CFontLoad();
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        SystemInfo.getIp(this);
        
       

        try {
            stage = primaryStage;            
            gotoLogin();
            primaryStage.show();
//            scene.getWindow().sizeToScene();
        } catch (Exception ex) {
            Logger.getLogger(Enerve2000S.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void gotoMain(){
        try {
         replaceSceneContent("/com/enerve2000s/fxml/Main.fxml");         
        } catch (Exception ex) {
            Logger.getLogger(Enerve2000S.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
        
     public void gotoLogin() {
        try {
            replaceSceneContent("/com/enerve2000s/fxml/Login.fxml");
        } catch (Exception ex) {
            Logger.getLogger(Enerve2000S.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   private void replaceSceneContent(String fxml) throws Exception{
//        Parent page = (Parent) FXMLLoader.load(Enerve2000S.class.getResource(fxml), null, new JavaFXBuilderFactory());
        Parent page = FXMLLoader.load(Enerve2000S.class.getResource(fxml));
        
        
             
         if (scene == null) {
                scene = new Scene(page , 1200 , 800);                        
                stage.setTitle(EnerveConst.ENERVE2000S);
                 Screen screen = Screen.getPrimary();
                Rectangle2D bounds = screen.getVisualBounds();
                stage.setX(0);
                stage.setY(0);
                stage.setWidth(bounds.getWidth());
                stage.setHeight(bounds.getHeight());        
                stage.setScene(scene);
                scene.getStylesheets().add(Enerve2000S.class.getResource("/com/enerve2000s/css/login_style.css").toExternalForm());                 
            } else {
//              stage.setScene(scene);
              stage.setHeight(800);
                stage.setWidth(1200);
                scene.getStylesheets().add(Enerve2000S.class.getResource("/com/enerve2000s/css/main_style.css").toExternalForm());        
                stage.getScene().setRoot(page);  
               
//                scene.getWindow().sizeToScene();
         }                    
        
        
    }

}
