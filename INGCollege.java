import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;


public class INGCollege implements ActionListener{
    
    private JFrame frame;
        
    private JPanel panel, panel2;
        
    private JLabel title, n_title, CourseID, n_CourseID, Coursename, n_Coursename,Courseleader, n_Courseleader, Duration, n_Duration,
                Lecturername, n_Lecturername, Level, n_Level, Credit, n_Credit, Startdate, n_Startdate, Completiondate, n_Completiondate,
                Numberofassessments, n_Numberofassessments, Instructorname, n_Instructorname, Examdate, n_Examdate, Prerequisites,
                n_Prerequisites;
                
    private JTextField Ac_CourseID, non_CourseID, Ac_Coursename, non_Coursename, Ac_Courseleader, non_Courseleader, Ac_Duration, non_Duration,
                    Ac_Lecturername, non_Lecturername, Ac_Level, non_Level, Ac_Credit, non_Credit, Ac_Startdate, non_Startdate, 
                    Ac_Completiondate,non_Completiondate, Ac_Numberofassessments, non_Numberofassessments, Ac_Instructorname, 
                    non_Instructorname, Ac_Examdate,non_Examdate, Ac_Prerequisites, non_Prerequisites;
                    
    private JButton Ac_Register, non_Register, Ac_Display, non_Display, Ac_Clear, non_Clear, Ac_Add, non_Add, non_Remove;
        
    ArrayList<Course> courselist = new ArrayList(); //creating arraylist named courselist
        
        INGCollege(){  
        //add set size, Layout and visibility
        frame = new JFrame("Course Registration");
        frame.setVisible(true); // by default frame is invisible
        frame.setSize(1800,1000); // int width, int height
        frame.setLayout(new GridLayout(1,2)); //int row, int column
        
        //create components
        title = new JLabel("Academic Course");
        title.setBounds(250,00,250,70); // int x, int y, int width, int height
        title.setFont(new Font("NewTimesRoman",Font.BOLD,18));
        
        CourseID = new JLabel("Course ID:");
        Ac_CourseID= new JTextField();
        CourseID.setBounds(10,98,90,30); // int x, int y, int width, int height
        Ac_CourseID.setBounds(110,98,180,30);
        
        Coursename = new JLabel("Course Name:");
        Ac_Coursename= new JTextField();
        Coursename.setBounds(400,98,90,30); // int x, int y, int width, int height
        Ac_Coursename.setBounds(500,98,180,30);
        
        Duration = new JLabel("Duration:");
        Ac_Duration= new JTextField();
        Duration.setBounds(10,160,90,30);// int x, int y, int width, int height
        Ac_Duration.setBounds(110,160,180,30);
        
        Lecturername = new JLabel("Lecturer Name:");
        Ac_Lecturername= new JTextField();
        Lecturername.setBounds(10,218,90,30);// int x, int y, int width, int height
        Ac_Lecturername.setBounds(110,218,180,30);
        
        
        Instructorname = new JLabel("Instructor Name:");
        Ac_Instructorname = new JTextField();
        Instructorname.setBounds(10,267,100,30);// int x, int y, int width, int height
        Ac_Instructorname.setBounds(110,267,180,30);

        
        Level = new JLabel("Level:");
        Ac_Level= new JTextField();
        Level.setBounds(10,400,50,30);// int x, int y, int width, int height
        Ac_Level.setBounds(86,400,80,30);
        
        Numberofassessments = new JLabel("Number of Assessments:");
        Ac_Numberofassessments = new JTextField();
        Numberofassessments.setBounds(450,400,200,30);// int x, int y, int width, int height
        Ac_Numberofassessments.setBounds(600,400,80,30);
        
        Startdate = new JLabel("Start Date:");
        Ac_Startdate= new JTextField();
        Startdate.setBounds(10,340,80,30);// int x, int y, int width, int height
        Ac_Startdate.setBounds(86,340,80,30);
        
        Examdate = new JLabel("Exam Date:");
        Ac_Examdate= new JTextField();
        Examdate.setBounds(245,340,80,30);// int x, int y, int width, int height
        Ac_Examdate.setBounds(320,340,80,30);
        
        Completiondate = new JLabel("Completion Date:");
        Ac_Completiondate= new JTextField();
        Completiondate.setBounds(490,340,180,30);// int x, int y, int width, int height
        Ac_Completiondate.setBounds(600,340,80,30);
        
        Prerequisites = new JLabel("Prerequisites:");
        Ac_Prerequisites= new JTextField();
        Prerequisites.setBounds(380,267,100,30);// int x, int y, int width, int height
        Ac_Prerequisites.setBounds(500,267,180,30);
        
        Courseleader = new JLabel("Course Leader:");
        Ac_Courseleader= new JTextField();
        Courseleader.setBounds(400,218,90,30);// int x, int y, int width, int height
        Ac_Courseleader.setBounds(500,218,180,30);
        
        Credit = new JLabel("Credit:");
        Ac_Credit= new JTextField();
        Credit.setBounds(245,400,100,30);// int x, int y, int width, int height
        Ac_Credit.setBounds(315,400,80,30);
        
        
        Ac_Register= new JButton("Register");
        Ac_Register.setBounds(500,460,180,35); // int x, int y, int width, int height
        
        Ac_Display= new JButton("Display");
        Ac_Display.setBounds(210,550,180,35); // int x, int y, int width, int height
         
        Ac_Clear= new JButton("Clear");
        Ac_Clear.setBounds(395,550,180,35); // int x, int y, int width, int height
        
        Ac_Add= new JButton("Add");
        Ac_Add.setBounds(500,160,180,35);
        
        
        
        n_title = new JLabel("Non Academic Course");
        n_title.setBounds(250,00,250,70);
        n_title.setFont(new Font("NewTimesRoman",Font.BOLD,18));
        
        n_CourseID = new JLabel("Course ID:");
        non_CourseID= new JTextField();
        n_CourseID.setBounds(10,98,90,30); 
        non_CourseID.setBounds(110,98,180,30);
        
        n_Coursename = new JLabel("Course Name:");
        non_Coursename= new JTextField();
        n_Coursename.setBounds(400,98,90,30);
        non_Coursename.setBounds(500,98,170,30);
        
        n_Duration = new JLabel("Duration:");
        non_Duration= new JTextField();
        n_Duration.setBounds(10,160,90,30);
        non_Duration.setBounds(110,160,180,30);
        
        n_Lecturername = new JLabel("Lecturer Name:");
        non_Lecturername= new JTextField();
        n_Lecturername.setBounds(10,218,90,30);
        non_Lecturername.setBounds(110,218,180,30);
        
        
        n_Instructorname = new JLabel("Instructor Name:");
        non_Instructorname= new JTextField();
        n_Instructorname.setBounds(10,267,100,30);
        non_Instructorname.setBounds(110,267,180,30);

        
        n_Level = new JLabel("Level:");
        non_Level= new JTextField();
        n_Level.setBounds(10,400,50,30);
        non_Level.setBounds(86,400,80,30);
        
        n_Numberofassessments= new JLabel("Number of Assessments:");
        non_Numberofassessments= new JTextField();
        n_Numberofassessments.setBounds(430,400,200,30);
        non_Numberofassessments.setBounds(590,400,80,30);
        
        n_Startdate = new JLabel("Start Date:");
        non_Startdate= new JTextField();
        n_Startdate.setBounds(10,340,80,30);
        non_Startdate.setBounds(86,340,80,30);
        
        n_Examdate = new JLabel("Exam Date:");
        non_Examdate = new JTextField();
        n_Examdate.setBounds(250,340,80,30);
        non_Examdate.setBounds(335,340,80,30);
        
        n_Completiondate = new JLabel("Completion Date:");
        non_Completiondate= new JTextField();
        n_Completiondate.setBounds(470,340,180,30);
        non_Completiondate.setBounds(580,340,80,30);
        
        n_Prerequisites = new JLabel("Prerequisites:");
        non_Prerequisites= new JTextField();
        n_Prerequisites.setBounds(400,267,100,30);
        non_Prerequisites.setBounds(500,267,170,30);
        
        n_Courseleader = new JLabel("Course Leader:");
        non_Courseleader= new JTextField();
        n_Courseleader.setBounds(400,218,90,30);
        non_Courseleader.setBounds(500,218,170,30);
        
        n_Credit = new JLabel("Credit:");
        non_Credit= new JTextField();
        n_Credit.setBounds(250,400,100,30);
        non_Credit.setBounds(315,400,80,30);
        
        
        non_Register= new JButton("Register");
        non_Register.setBounds(500,460,170,35);
        
        non_Display = new JButton("Display");
        non_Display.setBounds(210,550,180,35);
         
        non_Clear= new JButton("Clear");
        non_Clear.setBounds(395,550,180,35);
        
        non_Add= new JButton("Add");
        non_Add.setBounds(500,160,170,35);
        
        non_Remove= new JButton("Remove");
        non_Remove.setBounds(318,460,170,35);
        
        
        panel = new JPanel(); // panel created for Academic Course
        panel.setLayout(null); // we can position our components absolute
        panel.setBounds(0,0,850,1000);
        Color C1 = new Color(229,255,249); // setting background color panel
        panel.setBackground(C1);
        
        
        panel2 = new JPanel(); //panel created for Non ACcademic Course
        panel2.setLayout(null); // we can position our components absolute
        panel.setBounds(900,10,900,1000); 
        Color C2 = new Color(249,236,236); // setting background color for panel2
        panel.setBackground(C2);
        
        frame.add(panel); //panel added in frame
        frame.add(panel2); //panel2 added in frame
        panel.add(title);
        panel.add(CourseID);
        panel.add(Ac_CourseID);
        panel.add(Coursename);
        panel.add(Ac_Coursename);
        panel.add(Duration);
        panel.add(Ac_Duration);
        panel.add(Lecturername);
        panel.add(Ac_Lecturername);
        panel.add(Instructorname);
        panel.add(Ac_Instructorname);
        panel.add(Level);
        panel.add(Ac_Level);
        panel.add(Numberofassessments);
        panel.add(Ac_Numberofassessments);
        panel.add(Startdate);
        panel.add(Ac_Startdate);
        panel.add(Examdate);
        panel.add(Ac_Examdate);
        panel.add(Completiondate);
        panel.add(Ac_Completiondate);
        panel.add(Prerequisites);
        panel.add(Ac_Prerequisites);
        panel.add(Courseleader);
        panel.add(Ac_Courseleader);
        panel.add(Credit);
        panel.add(Ac_Credit);
        panel.add(Ac_Register);
        panel.add(Ac_Display);
        panel.add(Ac_Clear);
        panel.add(Ac_Add);
        
    
        panel2.add(n_title);
        panel2.add(n_CourseID);
        panel2.add(non_CourseID);
        panel2.add(n_Coursename);
        panel2.add(non_Coursename);
        panel2.add(n_Duration);
        panel2.add(non_Duration);
        panel2.add(n_Lecturername);
        panel2.add(non_Lecturername);
        panel2.add(n_Instructorname);
        panel2.add(non_Instructorname);
        panel2.add(n_Level);
        panel2.add(non_Level);
        panel2.add(n_Numberofassessments);
        panel2.add(non_Numberofassessments);
        panel2.add(n_Startdate);
        panel2.add(non_Startdate);
        panel2.add(n_Examdate);
        panel2.add(non_Examdate);
        panel2.add(n_Completiondate);
        panel2.add(non_Completiondate);
        panel2.add(n_Prerequisites);
        panel2.add(non_Prerequisites);
        panel2.add(n_Courseleader);
        panel2.add(non_Courseleader);
        panel2.add(n_Credit);
        panel2.add(non_Credit);
        panel2.add(non_Register);
        panel2.add(non_Display);
        panel2.add(non_Clear);
        panel2.add(non_Add);
        panel2.add(non_Remove);
         
         //register listener
        Ac_Register.addActionListener(this); //passing current instance
        non_Register.addActionListener(this);
        
        Ac_Display.addActionListener(this);
        non_Display.addActionListener(this);
        
        Ac_Clear.addActionListener(this);
        non_Clear.addActionListener(this);
        
        Ac_Add.addActionListener(this);
        non_Add.addActionListener(this);
        
        non_Remove.addActionListener(this);
        
                
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing operation 
    }    
        //registration methods
    public void actionPerformed(ActionEvent e){
        int count = 0; 
        int count1 = 0;
        //initializing variables to zero
        
        // Event handling and button for Academic Course Class
        if(e.getSource() == Ac_Add){
            if(Ac_CourseID.getText().isEmpty() || Ac_Coursename.getText().isEmpty() || Ac_Duration.getText().isEmpty() ||
                Ac_Courseleader.getText().isEmpty() || Ac_Lecturername.getText().isEmpty() || Ac_Level.getText().isEmpty() ||
                Ac_Credit.getText().isEmpty() || Ac_Startdate.getText().isEmpty() || Ac_Completiondate.getText().isEmpty() ||
                Ac_Numberofassessments.getText().isEmpty() || Ac_Instructorname.getText().isEmpty() || Ac_Examdate.getText().isEmpty() ||
                Ac_Prerequisites.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame,"Please kindly fill the required textfields: Course ID,Coursename, Duration, Courseleader,Lecturer Name, Level, Credit, Startdate, Completiondate, Numberofassessments, Instructorname, Examdate,Prerequisites");
            }
            else{
                try{
                    String CourseID = Ac_CourseID.getText();
                    String Coursename = Ac_Coursename.getText();
                    int duration = Integer.parseInt(Ac_Duration.getText()); // convert string to int.
                    String Level = Ac_Level.getText();
                    int credit = Integer.parseInt(Ac_Credit.getText());
                    int numberofassessments = Integer.parseInt(Ac_Numberofassessments.getText());
                    
                    //order of Academic Course Class
                    AcademicCourse AC = new AcademicCourse(Level, credit, CourseID, numberofassessments, Coursename, duration);
        
                        courselist.add(AC);
                    JOptionPane.showMessageDialog(null, "Course added");   

                } 
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Please enter a valid number");
                }
            }
        }
        
        // Event handling and button for Non Academic Course class
        if(e.getSource() == non_Add){
            if(non_CourseID.getText().isEmpty() || non_Coursename.getText().isEmpty() || non_Duration.getText().isEmpty() ||
                non_Courseleader.getText().isEmpty() || non_Lecturername.getText().isEmpty() || non_Level.getText().isEmpty() ||
                non_Credit.getText().isEmpty() || non_Startdate.getText().isEmpty() || non_Completiondate.getText().isEmpty() ||
                non_Numberofassessments.getText().isEmpty() || non_Instructorname.getText().isEmpty() || non_Examdate.getText().isEmpty() ||
                non_Prerequisites.getText().isEmpty()){
                
                JOptionPane.showMessageDialog(frame,"Please kindly fill the required textfields: Course ID,Coursename, Duration, Courseleader,Lecturer Name, Level, Credit, Startdate, Completiondate, Numberofassessments, Instructorname, Examdate,Prerequisites");
            }
            else{   
                try{
                String n_CourseID = non_CourseID.getText();
                String n_Coursename = non_Coursename.getText();
                int duration = Integer.parseInt(non_Duration.getText()); // convert string to int
                String n_Prerequisites = non_Prerequisites.getText();
                
            
                NonAcademicCourse NAC = new NonAcademicCourse(n_CourseID, n_Coursename, duration , n_Prerequisites); //order of NonAcademicCourse class
                    courselist.add(NAC);
                JOptionPane.showMessageDialog(null, "Course added");    
                     
                }
                catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Please enter a valid number");
                }
            }
        }
                
        //Register button for Academic Course
        if(e.getSource() == Ac_Register){
            if(Ac_CourseID.getText().isEmpty() || Ac_Coursename.getText().isEmpty() || Ac_Duration.getText().isEmpty() ||
                Ac_Courseleader.getText().isEmpty() || Ac_Lecturername.getText().isEmpty() || Ac_Level.getText().isEmpty() ||
                Ac_Credit.getText().isEmpty() || Ac_Startdate.getText().isEmpty() || Ac_Completiondate.getText().isEmpty() ||
                Ac_Numberofassessments.getText().isEmpty() || Ac_Instructorname.getText().isEmpty() || Ac_Examdate.getText().isEmpty() ||
                Ac_Prerequisites.getText().isEmpty()){
                    
                JOptionPane.showMessageDialog(frame,"Please kindly fill the required textfields: Course ID,Coursename, Duration, Courseleader,Lecturer Name, Level, Credit, Startdate, Completiondate, Numberofassessments, Instructorname, Examdate,Prerequisites");
            }
            else{    
                for(int i = 0;i< courselist.size();i++){
                    if((courselist.get(i).getcourseID()).equals(Ac_CourseID.getText())){
                        AcademicCourse academic_course = (AcademicCourse)(courselist.get(i));
                        if(academic_course.isRegistered == false){
                            academic_course.register(Ac_Courseleader.getText(), Ac_Lecturername.getText(), Ac_Startdate.getText(), 
                            Ac_Completiondate.getText());
                            
                            JOptionPane.showMessageDialog(null, "Course registered successfully");
                                
                        }
                        else{
                            JOptionPane.showMessageDialog(null, " Course Exists");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Invalid Input");
                    }
                }
            }
        }        
        
        
        //Register button for NonAcademic Course
        if(e.getSource() == non_Register){
            if(non_CourseID.getText().isEmpty() || non_Coursename.getText().isEmpty() || non_Duration.getText().isEmpty() ||
                non_Courseleader.getText().isEmpty() || non_Lecturername.getText().isEmpty() || non_Level.getText().isEmpty() ||
                non_Credit.getText().isEmpty() || non_Startdate.getText().isEmpty() || non_Completiondate.getText().isEmpty() ||
                non_Numberofassessments.getText().isEmpty() || non_Instructorname.getText().isEmpty() || non_Examdate.getText().isEmpty() ||
                non_Prerequisites.getText().isEmpty()){
                
                JOptionPane.showMessageDialog(frame,"Please kindly fill the required textfields:Course ID,Coursename, Duration, Courseleader,Lecturer Name, Level, Credit, Startdate, Completiondate, Numberofassessments, Instructorname, Examdate,Prerequisites");
            }
            else{   
                for(int i = 0; i<courselist.size();i++){
                    if((courselist.get(i).getcourseID()).equals(non_CourseID.getText())){
                        NonAcademicCourse non_academic_course = (NonAcademicCourse)(courselist.get(i));
                        if(non_academic_course.isRegistered == false){
                            non_academic_course.register(non_Courseleader.getText(), non_Lecturername.getText(), non_Startdate.getText(),
                            non_Completiondate.getText(), non_Examdate.getText());
                        
                            JOptionPane.showMessageDialog(null, "Course registered successfully");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Course Exists");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Invalid input");
                    }
                }
            }
        }
        
        //Display button for Academic Course
        if(e.getSource() == Ac_Display){
            for(Course Z : courselist){
                if (Z instanceof AcademicCourse){
                    AcademicCourse AC = (AcademicCourse)Z;
                    AC.display();
                } 
            }
        }
        
        //Display button for Non Academic Course
        if(e.getSource() == non_Display){
            for(Course Y : courselist){
                if(Y instanceof  NonAcademicCourse){
                    NonAcademicCourse NAC = (NonAcademicCourse)Y;
                    NAC.display();
                }
            }        
        }
        
        // Clear button for Academic Course class and non Academic course class
        if(e.getSource() == Ac_Clear || e.getSource() == non_Clear){
            Ac_CourseID.setText("");
            non_CourseID.setText("");
            
            Ac_Coursename.setText("");
            non_Coursename.setText("");
            
            Ac_Duration.setText("");
            non_Duration.setText("");
            
            Ac_Instructorname.setText("");
            non_Instructorname.setText("");
            
            Ac_Courseleader.setText("");
            non_Courseleader.setText("");
            
            Ac_Level.setText("");
            non_Level.setText("");
            
            Ac_Credit.setText("");
            non_Credit.setText("");
            
            Ac_Startdate.setText("");
            non_Startdate.setText("");
            
            Ac_Examdate.setText("");
            non_Examdate.setText("");
            
            Ac_Completiondate.setText("");
            non_Completiondate.setText("");
            
            Ac_Numberofassessments.setText("");
            non_Numberofassessments.setText("");
            
            Ac_Prerequisites.setText("");
            non_Prerequisites.setText("");
            
            Ac_Lecturername.setText("");
            non_Lecturername.setText("");    
        }
        
        //Remove button for Non Academic Course Class
        if(e.getSource() == non_Remove){ 
            if(non_CourseID.getText().isEmpty() || non_Coursename.getText().isEmpty() || non_Duration.getText().isEmpty() ||
                non_Courseleader.getText().isEmpty() || non_Lecturername.getText().isEmpty() || non_Level.getText().isEmpty() ||
                non_Credit.getText().isEmpty() || non_Startdate.getText().isEmpty() || non_Completiondate.getText().isEmpty() ||
                non_Numberofassessments.getText().isEmpty() || non_Instructorname.getText().isEmpty() || non_Examdate.getText().isEmpty() ||
                non_Prerequisites.getText().isEmpty()){
                
                JOptionPane.showMessageDialog(frame,"Please kindly fill the required textfields: Course ID,Coursename, Duration, Courseleader,Lecturer Name, Level, Credit, Startdate, Completiondate, Numberofassessments, Instructorname, Examdate,Prerequisites");
            }
            
            else{   
                count1 += 1;
                for(Course x : courselist){
                    if(non_CourseID.getText().equals(x.getcourseID()) && x instanceof NonAcademicCourse){
                        NonAcademicCourse NAC = (NonAcademicCourse) x;
                        courselist.remove(non_CourseID.getText());
                        NAC.remove();
                        if(count1 == 1){
                            JOptionPane.showMessageDialog(frame, "The course has already been removed");
                        }
                        else{
                            break;
                        }
                    }
                }
            }
        }
    }        
    public static void main (String[] args){
        INGCollege c = new INGCollege();
    }
}
    
