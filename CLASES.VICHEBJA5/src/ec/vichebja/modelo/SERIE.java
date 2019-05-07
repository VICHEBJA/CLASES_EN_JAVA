/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.vichebja.modelo;

/**
 *
 * @author vichebja
 */
public class SERIE {
    int id;
    String title;
    String genero;
    String creator;
    int duration;
    short year;
    boolean viewed;
    int sessionQuantuty;
    char Chaters; 
    public SERIE() {
    }
    public SERIE(int id, String title,String genero, String creator, int duration, short year, Boolean viewed, int timeviewed,int sessionQuantuty,char Chaters){
    this.id=id;
    this.title=title;
    this.genero=genero;
    this.creator=creator;
    this.duration=duration;
    this.year=year;
    this.viewed=viewed;
    this.sessionQuantuty=sessionQuantuty;
    this.Chaters=Chaters;}
     public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public void setSessionQuantuty(int sessionQuantuty) {
        this.sessionQuantuty = sessionQuantuty;
    }

    public void setChaters(char Chaters) {
        this.Chaters = Chaters;
    }
     public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreator() {
        return creator;
    }

    public int getDuration() {
        return duration;
    }

    public short getYear() {
        return year;
    }

    public boolean isViewed() {
        return viewed;
    }

    public int getSessionQuantuty() {
        return sessionQuantuty;
    }

    public char getChaters() {
        return Chaters;
    }
    
}
