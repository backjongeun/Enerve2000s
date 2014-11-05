/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.enerve2000s.xml;

import com.enerve2000s.define.EnerveConst;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * ASP XML
 * 상속 받아서 사용하도록 한다.
 * @author labsamin
 */
public abstract class Enerve2000sXML extends DefaultHandler{
    private String httpAddr = "http://"+EnerveConst.HOST_IP+"/XML.asp?VarQry=";
    protected boolean isFinished =false;
    public class SystemVO {
        public String SQLQRY;
        public String MSG;
        public int RESULT;
    }
    
    protected String temp;
    public  SystemVO systemVO=null;
    
    protected void Connection(String qry){
        System.out.println(qry);
        isFinished=false;
        String url=null;
        try {
            url = httpAddr+qry;
            url = httpAddr+URLEncoder.encode(qry, "EUC-KR");;
            //URLEncoder.encode(fullAddr, "UTF-8");
            //url = url.replace(" ","%20");
            run(url);
        } catch (InterruptedException ex) {
            System.out.println("ddddd1");
            Logger.getLogger(Enerve2000sXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            System.out.println("ddddd2");
            Logger.getLogger(Enerve2000sXML.class.getName()).log(Level.SEVERE, null, "[" + url + "]" + ex);
        } catch (SAXException ex) {
            System.out.println("ddddd3");
            Logger.getLogger(Enerve2000sXML.class.getName()).log(Level.SEVERE, "[" + url + "]" + ex, "[" + url + "]" + ex);
        } catch (UnsupportedEncodingException ex) {
            System.out.println("ddddd4");
            Logger.getLogger(Enerve2000sXML.class.getName()).log(Level.SEVERE, null, "[" + url + "]" + ex);
        } catch (IOException ex) {
            System.out.println("ddddd5");
            Logger.getLogger(Enerve2000sXML.class.getName()).log(Level.SEVERE, "[" + url + "]" + ex, "[" + url + "]" + ex);
        }
        
    }
    
    private void run(String fullAddr) throws ParserConfigurationException, SAXException, UnsupportedEncodingException, IOException, InterruptedException{
        System.out.println(fullAddr);
        //encodeURIComponent()
        //fullAddr= URLEncoder.encode(fullAddr, "UTF-8");
        URL url = new URL(fullAddr);
        InputSource source;
        InputStreamReader reader = new InputStreamReader(url.openConnection().getInputStream(), "EUC-KR");
        source = new InputSource();
        source.setCharacterStream(reader);
        
        SAXParserFactory spfac = SAXParserFactory.newInstance();
        SAXParser sp = spfac.newSAXParser();
        //CSaxAirconInfoDAO handler = this;
        sp.parse(source, this);
       // wait(600);
    }
    
    public void characters(char[] buffer, int start, int length) {
              temp = new String(buffer, start, length);
    }
    
    @Override
    public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        System.out.println("[s]"+localName);
        System.out.println("[s]"+qName);
        if (qName.equalsIgnoreCase("SYSTEM")) {
            systemVO = new SystemVO();
            //acct.setType(attributes.getValue("type"));
        }else{
            startElement(qName);
        }
    }
    
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        System.out.println("[e]"+localName);
        System.out.println("[e]"+qName);
        System.out.println("[e]"+temp);
        if (qName.equalsIgnoreCase("SQLQRY")) {
            systemVO.SQLQRY = this.temp;
        } else if (qName.equalsIgnoreCase("varResult")) {
            systemVO.RESULT = Integer.parseInt(this.temp);
        }else if (qName.equalsIgnoreCase("SYSTEM_MSG")) {
            systemVO.MSG = this.temp;
        }else{
            endElement(qName);
        }
    }
    
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        isFinished=false;
        System.out.println("[start]");
    }
  
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        isFinished=true;
        System.out.println("[end]");
     //   notify();
    }
    protected abstract void startElement(String qName) throws SAXException;
    protected abstract void endElement(String qName) throws SAXException;
    
    public abstract ArrayList getVoList();
    public abstract void select();
    public abstract void update();
    public abstract void delete();
    public abstract void Insert();
}
