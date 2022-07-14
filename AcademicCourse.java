public class AcademicCourse extends Course{
    int numberofassessments;
    int credit;
    String lecturername, Level, StartingDate, CompletionDate;
    boolean isRegistered;
    //creation of constructor that accepts parameters for different data type
    public AcademicCourse(String Level,  int credit, String courseID, int numberofassessments ,String coursename,int Duration){
        super(courseID,coursename,Duration); // calling parameters from parent class
        this.Level=Level;
        this.credit=credit;
        this.numberofassessments=numberofassessments;
        lecturername="";
        StartingDate="";
        CompletionDate="";
        isRegistered=false;
        }
        //accessor/getter method
        public String getlecturername(){ //accessor method to return lecturername
            return lecturername;
        }
        public String getLevel(){ //accessor method to return level
            return Level;
        }
        public int getcredit(){ //accessor method to return credit
            return credit;
        }
        public String getStartingDate(){ //accessor method to return Startingdate
            return StartingDate;
        }
        public String getCompletionDate(){ //accessor method to return Completiondate
            return CompletionDate;
        }
        public int getnumberofassessments(){
            return numberofassessments;
        }
        public boolean getisRegistered(){
            return isRegistered;
        }
        public void setlecturername(String lecturername){
            this.lecturername=lecturername;
        }
        public void setnumberofassessments(int numberofassessments){
            this.numberofassessments=numberofassessments;
        }
        public void register(String courseleader,String lecturername,String StartingDate,String CompletionDate){
            if (isRegistered==true){
                System.out.println("The course is already registered");
                System.out.println("The courseleader is : "+courseleader);
                System.out.println("The StartingDate is : "+StartingDate);
                System.out.println("The CompletionDate is : "+CompletionDate);
            }else{
                super.setcourseleader(courseleader);
                this.lecturername=lecturername;
                this.StartingDate=StartingDate;
                this.CompletionDate=CompletionDate;
                this.isRegistered=true;
            }
        }
        public void display(){
            super.display();
            if (isRegistered==true){
                System.out.println("The lecturername is : "+lecturername);
                System.out.println("The Level is : "+Level);
                System.out.println("The credit is : "+credit);
                System.out.println("The StartingDate is : "+StartingDate);
                System.out.println("The CompletionDate is : "+CompletionDate);
                System.out.println("The numberofassessments is : "+numberofassessments);
            }
        }
}