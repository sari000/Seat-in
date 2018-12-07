
package user;

public class Professor extends User {
    //DATA
    private String department;
    
    //COSTRUCTOR
    public Professor(){
        super();
    }
    
    
    
    //METHODS
    public void getInfoProfessor(){
        //visualize the information of its profile -->overriding
        super.getInfo();
    }
    
    public void getCourse(){
        //get the information of a course-->overriding
        super.getCourse();
    }
    
    public void analizePage(){
        //analize the access of page's courses
    }
    
    public void communicating(){
        //communicate with students through newsletter about its courses
    }
    
    public void publish(){
        //publish educational materials/information about its courses
    }
    
    public void delete(){
        //delete content of materials/information about its courses
    }
    
    public void add(){
        //add content of materials/information about its courses
    }
    
    public void edit(){
        //edit content of materials/information about its courses
    }
}
