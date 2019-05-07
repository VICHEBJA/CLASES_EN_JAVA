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
public class MAGAZINE {
    int id;
    String title;
    //Date editionDATE;
    String editorial;
    String autores;
    public MAGAZINE(){}
    public MAGAZINE(int id, String title , String editorial,String autores){
    this.id= id;
     this.title= title;
    //Date editionDATE;
     this.editorial= editorial;
     this.autores=autores;
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

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }
    
    
}
