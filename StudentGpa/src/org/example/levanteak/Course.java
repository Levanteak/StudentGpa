package org.example.levanteak;
public class Course {
    int CourseNumber;
    int DiscplineSum;
    String[] Discipline;
    int[] credit;
    float[] mark;
    public Course(int ds, String[] d, int[] c, int cn, float[] m) {
        this.CourseNumber = cn;
        this.DiscplineSum = ds;
        this.Discipline = d;
        this.credit = c;
        this.mark = m;
    }
    public String getOneDiscipline(int i) {
        return Discipline[i];
    }


    public float getOneMark(int i) {
        return mark[i];
    }

    public int getOneCredit(int i) {
        return credit[i];
    }


    public void setCourseNumber(int CoN) {
        this.CourseNumber = CoN;
    }


    public int getCourseNumber() {
        return CourseNumber;
    }


    public int getDiscplineSum() {
        return DiscplineSum;
    }


    public String[] getDiscipline() {
        return Discipline;
    }


    public float[] getMark() {
        return mark;
    }


    public int[] getCredit() {
        return credit;
    }

}
