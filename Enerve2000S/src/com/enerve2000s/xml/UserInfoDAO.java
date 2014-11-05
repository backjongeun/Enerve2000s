/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.enerve2000s.xml;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xml.sax.SAXException;

/**
 *
 * @author kwon
 */
public class UserInfoDAO extends Enerve2000sXML {
    public UserInfoVO vo=null;
    public static ArrayList<UserInfoVO> voList = new ArrayList<UserInfoVO>();
    
    
    /*
    * null반환시 5분 초과로 파싱 못함.
    */
    public ArrayList getVoList() {
        int loopCount = 0;
        while(true){
            try {
                loopCount++;
                Thread.sleep(100);
                if(this.isFinished==true){
                    break;
                }
                if(loopCount >3000){
                    return null;
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(UserInfoVO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.voList;
    }
    
    @Override
    protected void startElement(String qName) throws SAXException {
        this.temp="";
        if (qName.equalsIgnoreCase("ROW")){
            vo = new UserInfoVO();
        }
    }

    @Override
    protected void endElement(String qName) throws SAXException {

        if (qName.equalsIgnoreCase("ROW")) {
            voList.add(vo);
        } else if (qName.equalsIgnoreCase("ID")) {
            vo.ID = Integer.parseInt(this.temp);
        }else if (qName.equalsIgnoreCase("USER_ID")) {
            vo.USER_ID = this.temp;
        }else if (qName.equalsIgnoreCase("USER_PASS")) {
            vo.USER_PASS = String.valueOf(this.temp);
        }else if (qName.equalsIgnoreCase("LEVEL")) {
            vo.USER_LEVEL = Integer.parseInt(this.temp);
        }else if (qName.equalsIgnoreCase("CREDATE")) {
            vo.CREDATE = String.valueOf(this.temp);
        }else if (qName.equalsIgnoreCase("UPDATE_DATE")) {
            vo.UPDATE_DATE = String.valueOf(this.temp);
        }else if (qName.equalsIgnoreCase("USER_INDEX")) {
            vo.USER_INDEX = Integer.parseInt(this.temp);
        }else if (qName.equalsIgnoreCase("USER_NAME")) {
            vo.USER_NAME = String.valueOf(this.temp);
        }
    }

    @Override
    public void select() {
        voList.clear();
        this.Connection("SELECT * FROM T_USER_INFO");
    }
    
    public void select(String id) {
        voList.clear();
        this.Connection("SELECT * FROM T_USER_INFO WHERE USER_ID ='"+id+"'");
    }
    @Override
     public void update() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    public void update(String id ,String pass) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String qry = "UPDATE T_USER_INFO "+
                        "SET USER_ID = '" + id +"',"+
                            "USER_PASS = '" + pass +"'";
        this.Connection(qry);
    }
    public void update(int keyNo, String id ,String pass) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String qry = "UPDATE T_USER_INFO "+
                        "SET USER_ID = '" + id +"',"+
                            "USER_PASS = '" + pass +"'"+
                        "WHERE ID ="+String.valueOf(keyNo);
        this.Connection(qry);
    }
    public void update(int keyNo, String id ,String pass,String name) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String qry = "UPDATE T_USER_INFO "+
                        "SET USER_ID = '" + id +"',"+
                            " USER_PASS = '" + pass +"',"+
                            " USER_NAME = '" + name +"'"+
                        " WHERE ID = "+String.valueOf(keyNo);
        this.Connection(qry);
    }
    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
   
    public void delete(int keyNo) {
        String qry = "UPDATE T_USER_INFO "+
                        "SET USER_ID = '',"+
                            "USER_PASS = ''"+
                        "WHERE ID ="+String.valueOf(keyNo);
                
        this.Connection(qry);
    }

    @Override
    public void Insert() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
