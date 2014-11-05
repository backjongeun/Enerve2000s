/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.enerve2000s.utils;

import javafx.application.Application;
import com.enerve2000s.define.EnerveConst;
import com.enerve2000s.xml.UserInfoVO;

/**
 *
 * @author kwon
 */
public class SystemInfo {
    public static String getIp(Application aThis) {
        //String HostIp= aThis.getHostServices().getCodeBase().toString();
        ////String ip2 ="InetAddress.getLocalHost()="+InetAddress.getLocalHost().getHostName();
        String HostIp = "http://192.168.10.57/dfd";
        String[] arry = HostIp.split("/");
        String ipAddr = arry[2];
        
        EnerveConst.HOST_IP = ipAddr;
        return ipAddr;
    }

    public static class LoginInfo {
        public static UserInfoVO userInfoVO = new UserInfoVO();
        public static String USER_ID = "";
        public static String USER_PASS = "";
        public static boolean USER_APPROVAL = false;
        public static String USER_GRADE = "";
    }
}
