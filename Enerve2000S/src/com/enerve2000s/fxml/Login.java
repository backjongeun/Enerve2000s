/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.enerve2000s.fxml;

import enerve2000s.Enerve2000S;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import com.enerve2000s.xml.Enerve2000sDAO;
import com.enerve2000s.xml.UserInfoDAO;
import com.enerve2000s.xml.UserInfoVO;
import com.enerve2000s.utils.SystemInfo;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.ArrayList;


/**
 * FXML Controller class
 *
 * @author 박세정
 */
public class Login implements Initializable {
//    final public GetService service = new GetService();
    public int mStepSwith = 0 ;
    static public boolean mStep01 = false;  //
    static public boolean mStep02 = false;  // 로그인

//    public class GetService extends Service {
 
//        @Override
//        protected Task createTask() {
//            return new GetTask();
//        }
//    }
//    public class GetTask extends Task{       
//        
//        @Override
//        protected Object call() {
//            int timeSleep = 300;
//            updateMessage("DB를 수신합니다.");
//            updateProgress(-1, 1);
//            try {
//                if(mStepSwith == 1 && mStep01 == false) {
//                    Thread.sleep(timeSleep);
//                    updateMessage("DB 동기화 - 1.1 Enerve2000s 정보 [1/1]");
//                    Enerve2000sDAO enerve2000sDAO = new Enerve2000sDAO();
//                    enerve2000sDAO.select();
//                    
//                    mStep01 = true;
//                    updateMessage("DB 동기화 - 완료 [1/1]");
//                    Thread.sleep(1000); 
//                } else if(mStepSwith == 2 && mStep02 == false) {
//                    Thread.sleep(timeSleep);
//                    updateMessage("DB 동기화 - 1.1 Enerve2000s 정보 [1/2]");
//                    Enerve2000sDAO enerve2000sDAO = new Enerve2000sDAO();
//                    enerve2000sDAO.select();
//                    Thread.sleep(timeSleep);
//                    updateMessage("DB 동기화 - 1.2 Enerve2000s 유저 정보 [2/2]");
//                    UserInfoDAO userInfoDAO = new UserInfoDAO();
//                    userInfoDAO.select();
//
//                    mStep02 = true;
//                    Thread.sleep(timeSleep);
//                    updateMessage("DB 동기화 - 완료 [2/2]");
//                    Thread.sleep(1000);
//                }
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            return "GetService";
//        }
//    }

    @FXML
    private TextField userid;
    @FXML
    private TextField userpw;
    @FXML
    private Button btn_login;
    @FXML 
    private Label errormsg;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    @FXML protected void processLogin(ActionEvent event) {
//        if(userpw.getText().equalsIgnoreCase("") || userid.getText().equalsIgnoreCase("")) {
//            errormsg.setText("아이디 & 비밀번호를 다시 입력해주세요.");
//            return;
//        }
//        
//        
//        //this.ui_SysMsg.setText("로그인" + ui_LoginID.getText() +ui_LoginPass.getText());
//        UserInfoVO UserInfo=null;  //현재 접속한 유저정보
//        UserInfoDAO cDAO = new UserInfoDAO();
//        cDAO.select();
//        
//        ArrayList<UserInfoVO> voList = UserInfoDAO.voList;
//        
//        for(int i = 0 ; i< voList.size();i++){
//            UserInfoVO vo = voList.get(i);
//            if(vo.USER_ID.equals(userid.getText())){
//                UserInfo = vo;
//                break;
//            }
//        }
        
        //cDAO.select(ui_LoginID.getText() );
//        if(UserInfo != null) {
//            //ui_LoginInfo.setText(SmartccsData.CUserInfo."");
//            SystemInfo.LoginInfo.userInfoVO.Copy(UserInfo);
//            SystemInfo.LoginInfo.USER_ID =UserInfo.USER_ID;
//            SystemInfo.LoginInfo.USER_PASS = UserInfo.USER_PASS;
//            if(userpw.getText().equalsIgnoreCase(SystemInfo.LoginInfo.USER_PASS)) {
//                SystemInfo.LoginInfo.USER_APPROVAL =true;
//                errormsg.setText("로그인 성공");
                Enerve2000S.getInstance().gotoMain();
                //btnMainStart(null);
//            } else {
//                SystemInfo.LoginInfo.USER_APPROVAL =false;
//                errormsg.setText("비밀번호가 틀립니다.");
//            }
//            SystemInfo.LoginInfo.USER_GRADE = UserInfo.USER_LEVEL.toString();
//        } else {
//            errormsg.setText("유저정보를 수신하지 못했습니다.");
//        }
//        errormsg.setText(cDAO.voList.size() +"/"+ SystemInfo.LoginInfo.USER_ID +"/"+
//                    SystemInfo.LoginInfo.USER_PASS +"/"+
//                    SystemInfo.LoginInfo.USER_APPROVAL +"/"+
//                    SystemInfo.LoginInfo.USER_GRADE );
    }    
}
