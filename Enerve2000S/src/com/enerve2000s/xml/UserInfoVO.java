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
public class UserInfoVO {
   public int ID;
   public String USER_ID;
   public String USER_PASS;
   public Integer USER_LEVEL;
   public String USER_NAME;
   public Integer USER_INDEX;
   public String CREDATE;
   public String UPDATE_DATE;
   
   public String getUSER_LEVEL(){
       if(USER_LEVEL == 0){
           return "일반사용자";
       }else if(USER_LEVEL == 1){
           return "관리자";
       }
       return "알수없음";
   }
   
   public void Copy(UserInfoVO vo){
        this.ID = vo.ID;
        this.USER_ID = vo.USER_ID;
        this.USER_NAME = vo.USER_NAME;
        this.USER_PASS = vo.USER_PASS;
        this.USER_LEVEL = vo.USER_LEVEL;
        this.USER_INDEX = vo.USER_INDEX;
        this.CREDATE = vo.CREDATE;
        this.UPDATE_DATE = vo.UPDATE_DATE;
   }
    
}
