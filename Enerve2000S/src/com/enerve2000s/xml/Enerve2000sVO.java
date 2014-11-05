/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.enerve2000s.xml;

/**
 *
 * @author kwon
 */
public class Enerve2000sVO {
    public String USER_ID;
    public String USER_NAME;
    public String PASSWORD;
    public String COMMPANY;
    public String TELNUMBER;
    public String INNUMBER;
    public String PONENUMBER;
    public int ID;
    public int MONITERING;
    public int USEPOWER;
    public int CHECKDAY;

    public String ToString() {
        String str = "[VO] USER_ID: "+ USER_ID+ 
                "USER_NAME: "+ USER_NAME+ 
                "PASSWORD: "+ PASSWORD+ 
                "COMMPANY: "+ COMMPANY+ 
                "TELNUMBER: "+ TELNUMBER+ 
                "INNUMBER: "+ INNUMBER+ 
                "PONENUMBER: "+ PONENUMBER+ 
                "ID: "+ ID+ 
                "MONITERING: "+ MONITERING+ 
                "USEPOWER: "+ USEPOWER+ 
                "CHECKDAY: "+ CHECKDAY;
        return str;
    }    
}
