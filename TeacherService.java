package ДЗ;

import java.util.ArrayList;
public class TeacherService {
    private String FirstName;
    private String LastName;
    private String cabinet;
    private String predmet;
    private String number_tel;

    public TeacherService(){

    }

    public void addFirstName(String FirstName){
        this.FirstName=FirstName;
    }
    public void addLastName(String LastName){
        this.LastName=LastName;
    }
    public void addCabinet(String cabinet){
        this.cabinet=cabinet;
    }
    public void addPredmet(String predmet){
        this.predmet=predmet;
    }
    public void addNumber_tel(String number_tel){
        this.number_tel=number_tel;
    }

    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public String getCabinet(){
        return cabinet;
    }
    public String getPredmet(){
        return predmet;
    }
    public String getTelefon(){
        return number_tel;
    }



}
