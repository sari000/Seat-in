package corso;

public class Section {
    //CAMPI
    String titolo;
    String descrizione;  //opzionale
    
    
    
    
    
    
    
    
    
    
    
    //METODI
    public void addNameSection(String nome){
        this.titolo=nome;
    }
    public void addMore(String nome,String descrizione){
        this.titolo=nome; this.descrizione=descrizione;
    }
    public void deleteSection(String titolo){
        this.titolo=titolo;
    }
    public void editSection(String titolo){
        this.titolo=titolo;
    }
}
