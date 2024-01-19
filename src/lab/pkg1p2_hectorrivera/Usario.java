/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg1p2_hectorrivera;

import java.util.Date;

/**
 *
 * @author hrolriverav
 */
public class Usario {
    String Mail, con;
    Date fn;
    
    public Usario(String Mail, String con, Date fn){
        this.Mail= Mail;
        this.con = con;
        this.fn = fn;
    }
    public String getMail() {
        return Mail;
    }
    public Date getFn() {
        return fn;
    }
    public String getCon() {
        return con;
    }
    
    public void setMail(String Mail) {
        this.Mail = Mail;
    }
    public void setCon(String con) {
        this.con = con;
    }
    public void setFn(Date fn) {
        this.fn = fn;
    }
    
    
    
}
