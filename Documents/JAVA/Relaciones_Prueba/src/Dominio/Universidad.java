
package Dominio;


public class Universidad {

    private Facultad facu[];
    
    public Universidad(){
        facu= new Facultad[3];
        facu[0]= new Facultad ("Matematica");
        facu[1]= new Facultad ("Lengua");
        facu[2]= new Facultad ("Ciencias");
    }
    
}

    

