package com.a6studios.aid4college;

import java.io.Serializable;

/**
 * Created by HP on 11/22/2017.
 */

public class UserData implements Serializable{
    private String name;
    private String email;
    private String colName;
    private String colLink;
    private String rollNo;
    private String colEmail;
    private boolean emailCorrect;

    public UserData(){}

    public UserData(String n,String e,String cn,String cl,String r,String ce){
        name = n;
        email = e;
        colName = cn;
        colLink = cl;
        rollNo = r;
        colEmail = ce;
    }

    public void setName(String a)
    {
        name = a;
    }
    public String getName (){
        return name;
    }

    public void setEmail(String a)
    {
        email = a;
    }
    public String getEmail (){
        return email;
    }

    public void setColName(String a)
    {
        colName = a;
    }
    public String getColName (){
        return colName;
    }

    public void setColLink(String a)
    {
        colLink = a;
    }
    public String getColLink (){
        return colLink;
    }

    public void setRollNo(String a)
    {
        rollNo = a;
    }
    public String getRollNo (){
        return rollNo;
    }

    public void setColEmail(String a)
    {
        colEmail = a;
    }
    public String getColEmail (){
        return colEmail;
    }

    public void setEmailCorrect(boolean b) {emailCorrect= b;}
    public boolean getEmailCorrect (){
        return emailCorrect;
    }
}
