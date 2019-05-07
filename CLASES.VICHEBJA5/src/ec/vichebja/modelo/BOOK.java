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
public class BOOK {
    int id;
    String title;
 // Date ediciondate;
    String editorial;
    String[] autores;
    String isbn;
    boolean readed;
    int timeReaded;
    public BOOK(){}
    public BOOK(int id, String title,String editorial,String[] autores, String isbn, boolean readed,int  timeReaded){
    this.id=id;
    this.title= title;
    //this.ediciondate=ediciondate;
   this.editorial= editorial;
   this.autores= autores;
   this.isbn= isbn;
   this.readed= readed;
   this.timeReaded= timeReaded;}
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

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String[] getAutores() {
        return autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

   // public void setEdiciondate(Date ediciondate) {
   //     this.ediciondate = ediciondate;
   // }

    //public Date getEdiciondate() {
    //    return ediciondate;
    //}
}
