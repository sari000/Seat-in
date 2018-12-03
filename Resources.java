
package corso;

public class Resources {
    //CAMPI
    String nome;
    String descrizione;
    
    
    
    //METODI
    public void addNameResource(String nome){
        this.nome=nome;
    }
    public void addMore(String nome,String descrizione){
        this.nome=nome; this.descrizione=descrizione;
    }
    public void deleteResource(String titolo){
        this.nome=titolo;
    }
    public void editResource(String titolo){
        this.nome=titolo;
    
    }
}