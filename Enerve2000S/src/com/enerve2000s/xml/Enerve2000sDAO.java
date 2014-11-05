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
public class Enerve2000sDAO extends Enerve2000sXML {
    private Enerve2000sVO vo;
    public static ArrayList<Enerve2000sVO> voList= new ArrayList<Enerve2000sVO>();
    
    public ArrayList getVoList() {
        int loopCount = 0;
        while(true){
            try {
                if(!voList.isEmpty()){
                    break;
                }
                
                if(this.isFinished==true){
                    break;
                }
                loopCount++;
                Thread.sleep(100);
                if(this.isFinished==true){
                    break;
                }
                if(loopCount > 3000){
                    System.out.print("DAO.getVoList() 실패");
                    return null;
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
            }
        }
        //System.out.print(vo);
        return this.voList;
    }

    @Override
    public void select() {
        String sql =
                "SELECT * " +
                "  FROM T_SYSTEM_INFO " ;
        voList.clear();
        this.Connection(sql);
    }
   
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void update(String username , String company) {
        String sql =
                " UPDATE T_SYSTEM_INFO  " +
                "    SET USER_NAME = "+username+", " +
                "        COMPANY = " + company ;
        
        this.Connection(sql);
    }
    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
   
    @Override
    public void Insert() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
   
    @Override
    protected void startElement(String qName) throws SAXException {
        this.temp="";
        if (qName.equalsIgnoreCase("ROW")){
            vo = new Enerve2000sVO();
        }
    }

    @Override
    protected void endElement(String qName) throws SAXException {
        if (qName.equalsIgnoreCase("ROW")) {
            voList.add(vo);
        } else if (qName.equalsIgnoreCase("USER_ID")) {
            vo.USER_ID= this.temp;
        }else if (qName.equalsIgnoreCase("USER_NAME")) {
            vo.USER_NAME=this.temp;
        }else if (qName.equalsIgnoreCase("PASSWORD")) {
            vo.PASSWORD = this.temp;
        }else if (qName.equalsIgnoreCase("COMMPANY")){
           vo.COMMPANY = this.temp;
        }else if (qName.equalsIgnoreCase("TELNUMBER")){
           vo.TELNUMBER = this.temp;
        }else if (qName.equalsIgnoreCase("INNUMBER")){
           vo.INNUMBER = this.temp;
        }else if (qName.equalsIgnoreCase("PONENUMBER")){
           vo.PONENUMBER = this.temp;
        }else if (qName.equalsIgnoreCase("ID")){
           vo.ID =Integer.parseInt(this.temp);
        }else if (qName.equalsIgnoreCase("MONITERING")){
           vo.MONITERING = Integer.parseInt(this.temp);
        }else if (qName.equalsIgnoreCase("USEPOWER")){
           vo.USEPOWER =Integer.parseInt(this.temp);
        }else if (qName.equalsIgnoreCase("CHECKDAY")){
           vo.CHECKDAY = Integer.parseInt(this.temp);
        }
    }
}
