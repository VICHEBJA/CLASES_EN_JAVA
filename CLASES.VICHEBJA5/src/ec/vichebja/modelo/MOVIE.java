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
public class MOVIE {
    int id;
    String title;
    String genero;
    String creator;
    int duration;
    short year;
    boolean viewed;
    int timeviewed;
    public MOVIE() {
    }
    public MOVIE(int id, String title,String genero, String creator, int duration, short year, Boolean viewed, int timeviewed){
    this.id=id;
    this.title=title;
    this.genero=genero;
    this.creator=creator;
    this.duration=duration;
    this.year=year;
    this.viewed=viewed;
    this.timeviewed=timeviewed;
    } 
    
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

    public void setTimeviewed(int timeviewed) {
        this.timeviewed = timeviewed;
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

    public int getTimeviewed() {
        return timeviewed;
    }
}
