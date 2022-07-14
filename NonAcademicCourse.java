public class NonAcademicCourse extends Course{
    String instructorname, startingdate,completiondate,examdate,prerequisite;
    boolean isRegistered,isRemoved;
    public NonAcademicCourse(String courseID, String coursename, int duration, String prerequisite){
        super(courseID,coursename,duration);
        this.prerequisite=prerequisite;
        startingdate="";
        completiondate="";
        examdate="";
        isRegistered=false;
        isRemoved=false;
    }
    public String getinstructorname(){
        return instructorname;
    }
    public String getstartingdate(){
        return startingdate;
    }
    public String getcompletiondate(){
        return completiondate;
    }
    public String getexamdate(){
        return examdate;
    }
    public String getprerequisite(){
        return prerequisite;
    }
    boolean getisRegistered(){
        return isRegistered;
    }
    boolean getisRemoved(){
        return isRemoved;
    }
    public void setinstructorname(String newinstructor){
        if(isRegistered==false){
            instructorname=newinstructor;
        }
        else{
            System.out.println("The instructorname cannot be changed");
        }
    }
    public void register(String courseleader,String instructorname,String startingdate,String completiondate,String examdate){
        if(isRegistered==false){
            this.setinstructorname(instructorname);
            this.isRegistered=true;
            this.courseleader=courseleader;
            this.startingdate=startingdate;
            this.completiondate=completiondate;
            this.examdate=examdate;
        }else{
            System.out.println("The course is already registered");
        }
    }
    public void remove(){
        if(isRemoved==true){
            System.out.println("The course has already been removed");
        }else{
            super.setcourseleader("");
            this.instructorname="";
            this.startingdate="";
            this.completiondate="";
            this.examdate="";
            this.isRegistered=false;
            this.isRemoved=true;
            }
    }
    public void display(){
        super.display();
        if(isRegistered==true){
        System.out.println("instructor name is : " + instructorname);
        System.out.println("starting date is : " +startingdate);
        System.out.println("completiondate is : " +completiondate);
        System.out.println("examdate is : " +examdate);
        
        }
    }
    
}