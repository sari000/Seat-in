
package user;


public class Admin extends User {
    //DATA
    private String department;
    
    //COSTRUCTOR
    public Admin(){
        super();
    }
    
    //METHODS
    public void getInfoAdmin(){
        //visualize the information of its profile -->overriding
        super.getInfo();
    }
    
    public void getCourse(){
        //get the information of a course -->overriding
        super.getCourse();
    }
    
    public void analizeSeatIn(){
        //analize how the platform is used
    }
    
    public void assignToProfessor(){
        //assign a course to a professor
    }
    
    public void createCourse(){
        //create a course
    }
    
    public void enableUser(){
        //enable a profile(Admin,Professor,Student)
    }
    
    public void editDataUser(){
        //edit the data of a User already signed up (except the pwd which is private only read)
    }
    
}
