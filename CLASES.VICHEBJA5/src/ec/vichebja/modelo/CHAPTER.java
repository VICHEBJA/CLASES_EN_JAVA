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
public class CHAPTER {
    int id;
    String title;
    int duration;
    short year;
    boolean viewed;
    int timeviewed;
    int sessionNumber;
    public CHAPTER(){}
    public CHAPTER (int id, String title, int duration, short year, Boolean viewed, int timeviewed, int sessionNumber){
    this.id=id;
    this.title=title;
    this.duration=duration;
    this.year=year;
    this.viewed=viewed;
    this.timeviewed=timeviewed;
    this.sessionNumber=sessionNumber;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public int getTimeviewed() {
        return timeviewed;
    }

    public void setTimeviewed(int timeviewed) {
        this.timeviewed = timeviewed;
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }
    
}
