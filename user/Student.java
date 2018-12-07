
package user;


public class Student extends User {
    //DATA
    private int yearRegistration;   //annoImmatricolazione
    private String courseDegree;    //CorsoLaurea
    private String statusCareer;    //statoCarriera
    
    //COSTRUCTOR
    public Student(){
        super();
    }
    
    //METHODS
    public void getInfoStudent(){
        //visualize the information of its profile --> overriding
        super.getInfo();
    }
    
    public void getCourse(){
        //get the information of a course-->overriding
        super.getCourse();
    }
    
    public void getInfoCourse(){
        //visualize the information published of a course in which is signed up -->N.B:restrict vision if is not signed up-->poss.sol:another method?
    }
    
    public void sendEmail(){
        //send email to a professor
    }
    
    public void download(){
        //download educational materials
    }
    
    
    
}
