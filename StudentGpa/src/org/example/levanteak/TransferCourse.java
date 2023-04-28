package org.example.levanteak;
public class TransferCourse {
    StudentSetter SS = new StudentSetter();

    public void Transfer(Student student) {
        char[] group = student.getGroup().toCharArray();
        if(group[group.length-2]=='/') group[group.length-4] = (char)((student.getCourse().getCourseNumber()+1)+'0');
        else group[group.length-2] = (char)((student.getCourse().getCourseNumber()+1)+'0');
        String gr = String.valueOf(group);
        student.setGroup(gr);
        student.getCourse().setCourseNumber(student.getCourse().getCourseNumber()+1);
    }

    public boolean TrCo (Student stud) {
        float gpa = SS.GpaCalculator(stud.getCourse());
        switch(stud.getCourse().getCourseNumber()) {
            case 1:
                if(gpa >= 1.8) {
                    Transfer(stud);
                    return true;
                } else {
                    return false;
                }
            case 2:
                if(gpa >= 2.0) {
                    Transfer(stud);
                    return true;
                }else {
                    return false;
                }
            case 3:
                if(gpa >= 2.2) {
                    Transfer(stud);
                    return true;
                }else {
                    return false;
                }
            default:
                System.out.print("Wrong course number!");
                return false;
        }
    }
}
