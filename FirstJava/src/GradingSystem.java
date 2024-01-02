import java.util.*;
public class GradingSystem {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
        System.out.println("Automated Grading System ");
        


        int failed = 0;
        int passed = 0;
        double quiz = 0;
        double OvAttendance = 0;
        double result = 0;
        
        double exam = 0;
        double Assignment = 0;
        double  finalGrade = 0;
        System.out.print("Enter number of students: ");
        int stud = inp.nextInt();
        for (int students = 1; students <= stud; students++) {    
            System.out.print("Enter student " + students + " Surname: ");
            String surname = inp.next();
            boolean a = true;
            while(a){
            System.out.print("Attendace (Enter 1, 2 ,3 or 4) : ");
            
            int attendance = inp.nextInt();
            OvAttendance = attendance / 0.20;
            
            if(attendance >4 ){
                System.out.println("Invalid, Please try again");
            } else {
                a = false;
            }
            }
            
          //OvAttendance = attendance / 0.2;
            System.out.print("Quiz (Enter a score out of 100: ");
            int score = inp.nextInt();
                quiz = score * 0.2;            
            System.out.print("Exam (Enter a score out of 100): ");
            int examScore = inp.nextInt();
             exam = examScore * 0.4;
            System.out.print("Assignments (Enter 1 or 2): ");
            int assignments = inp.nextInt();
            if(assignments == 1){
                Assignment = 20 / 2;
            } else if (assignments == 2){
                Assignment = 20 /1;    
                }
            finalGrade = (OvAttendance + quiz + exam + Assignment);
            System.out.print("Student: " + surname +", " + "Final grade is " + finalGrade +" %"+ ", Result:  ");
            if ( score >= 75){
                System.out.println("PASSED");     
            } else if(score < 75){
                System.out.println("FAILED");
            }
        }


    }

}
