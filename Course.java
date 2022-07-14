public class Course{
    String courseID,coursename, courseleader;
    int duration;
    Course(String courseID,String coursename,int duration){
        this.courseID=courseID;
        this.coursename=coursename;
        courseleader="";
        this.duration=duration;
        
        }
        public String getcourseID(){
             return courseID;
        }
        public String getcoursename(){
            return coursename;
        } 
        public String getcourseleader(){
            return courseleader;
        }
        public int getduration(){
            return duration;
        }
        public void setcourseleader(String newname){
            this.courseleader=newname;
        }
        public void display(){
            System.out.println("The courseID is: "+courseID);
            System.out.println("The coursename is: "+coursename);
            System.out.println("The duration is: "+duration);
            if(courseleader!=""){
                System.out.println("The courseleader is: "+courseleader);
            }
        
        }
    
}