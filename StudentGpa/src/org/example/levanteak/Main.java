package org.example.levanteak;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] stud = new Student[4];

        stud[0] = new Student(1, "Aibek", "SIB-27", new Course(3, new String[] {"Java", "Math", "Phil"}, new int[] {8, 5, 2}, 2, new float[] {85, 78, 100}));
        stud[1] = new Student(2, "Ersultan", "SIB-27", new Course(3, new String[] {"Java", "Math", "Phil"}, new int[] {8, 5, 2}, 2, new float[] {76, 82, 87}));
        stud[2] = new Student(3, "Turlykhan", "SIB-27", new Course(3, new String[] {"Java", "Math", "Phil"}, new int[] {5, 2, 2}, 2, new float[] {60, 74, 82}));
        stud[3] = new Student(4, "Alibek", "SIB-29", new Course(3, new String[] {"Java", "Math", "Phil"}, new int[] {5, 2, 2}, 2, new float[] {85, 85, 90}));


        TransferCourse TC = new TransferCourse();
        LABELFORWHILE:
        while(true) {
            int index = 0,a;
            System.out.println("Choose information to show:\n1.Transcript\n2.Student Information\n3.Transfer student to next course\n4.Stop Programm");
            a = sc.nextInt();
            if(a!=4) {
                System.out.println("Pick student from the list:");
                for(int i=0;i<4;i++) {
                    System.out.print(stud[i].getId() + "." + stud[i].getName() + "\n");
                }
                index = sc.nextInt()-1;
            }
            switch(a) {
                case 1:
                    stud[index].Transcript();
                    break;
                case 2:
                    stud[index].StudentInformation();
                    break;
                case 3:
                    TC.TrCo(stud[index]);
                    break;
                case 4:
                    break LABELFORWHILE;
                default:
                    System.out.print("Wrong number");
            }
        }
    }
}
