import java.util.Scanner;

public class AttendanceStatusEvaluator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int attendence=sc.nextInt();
        if(attendence>85){
            System.out.println("Excellent");
        }
        else if(attendence<60){
            System.out.println("Poor");
        }
        else{
             System.out.println("Satisfactory");
        }
        sc.close();

    }
}

