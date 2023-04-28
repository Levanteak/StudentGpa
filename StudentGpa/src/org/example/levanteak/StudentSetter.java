package org.example.levanteak;
public class StudentSetter {

    public float GpaChanger(float mark) {
        if(mark >= 95) return 4;
        else if(mark >= 90) return (float)3.67;
        else if(mark >= 85) return (float)3.33;
        else if(mark >= 80) return 3;
        else if(mark >= 75) return (float)2.67;
        else if(mark >= 70) return (float)2.33;
        else if(mark >= 65) return 2;
        else if(mark >= 60) return (float)1.67;
        else if(mark >= 55) return (float)1.33;
        else if(mark >= 50) return 1;
        else if(mark >= 25) return (float)0.5;
        else return 0;
    }
    public String GpaChangerL(float mark) {
        if(mark >= 95) return "A+";
        else if(mark >= 90) return "A";
        else if(mark >= 85) return "B+";
        else if(mark >= 80) return "B";
        else if(mark >= 75) return "B-";
        else if(mark >= 70) return "C+";
        else if(mark >= 65) return "C";
        else if(mark >= 60) return "C-";
        else if(mark >= 55) return "D+";
        else if(mark >= 50) return "D";
        else if(mark >= 25) return "FX";
        else return "F";
    }
    public String GpaChangerT(float mark) {
        if(mark >= 90) return "Awesome";
        else if(mark >= 70) return "Good";
        else if(mark >= 50) return "Satisfied";
        else return "Dissatisfied";
    }

    public float GpaCalculator(Course course) {
        int n = course.getDiscplineSum();
        float[] arr1 = new float[n];
        for(int i=0;i<n;i++) {
            arr1[i] = GpaChanger(course.getOneMark(i));
        }
        int[] arr2 = course.getCredit();
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++) {
            sum1+=arr1[i]*arr2[i];
            sum2+=arr2[i];
        }
        return ((float)sum1/sum2);
    }

}

