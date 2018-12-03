package corso;
import java.awt.GraphicsConfiguration;
import javax.swing.JFrame;

public class Corso {
    //CAMPI
    private String codID;
    public String nomeCorso;
    public int annoATT;
    public String corsoLaureaRIF;
    public String descrizione;
    
    public static int countIscritti; //*
    static GraphicsConfiguration gc; //*
    
    //costruttore
    public Corso(String nome, String codiceId){
        this.nomeCorso=nome;
        this.codID=codiceId;
    }
    
    
    
    //METODI
    public void preview(){
        //vista ristretta per corsi cui si deve iscrivere per una vista totale
        
    }
    
    public void getInfoCorso(){
        
    }
    
    
    public String getCodID(String nome){ this.nomeCorso=nome; return codID;}
    
    public String getNomeCorso(){return nomeCorso;}
    
    public int getAnnoAtt(String nome){ this.nomeCorso=nome; return annoATT;}
    
    public String getCorsoLaureaRIF(String nomeCorso){ this.nomeCorso=nomeCorso; return corsoLaureaRIF;}
    
    public String getDescrizione(String nomeCorso){ this.nomeCorso=nomeCorso; return descrizione;}
    
    
    //MAIN
    public static void main(String[] args) {
        
       /* JFrame frame= new JFrame(gc);	
        frame.setVisible(true);
        frame.setTitle("CORSO");
	frame.setSize(600, 400);
	frame.setVisible(true);
        frame.setLocation(200, 200);*/
        
    }
    
}
