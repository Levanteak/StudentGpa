package org.example.levanteak;
public class Student {
    private int id;
    private String name;
    private String group;
    private Course course;

    StudentSetter SS = new StudentSetter();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Course getCourse() {
        return course;
    }

    public Student(int id, String name, String group, Course course) {
        super();
        this.id = id;
        this.name = name;
        this.group = group;
        this.course = course;
    }

    public void Transcript() {
        System.out.println("Transcript for " + name + "\nDiscipline	Discipline ID	Credits	Mark in Percent	Mark in Points	Mark in Letter	Mark in Traditional");
        for(int i = 0; i<course.getDiscplineSum(); i++) {
            System.out.println(course.getOneDiscipline(i) + "	     	" + i + "\t	     	" + course.getOneCredit(i) + "     \t\t" + course.getOneMark(i) + "	   \t\t" + SS.GpaChanger(course.getOneMark(i)) + "	\t\t\t	" + SS.GpaChangerL(course.getOneMark(i)) + "	\t	" + SS.GpaChangerT(course.getOneMark(i)));
        }System.out.print("\n\n");
    }

    public void StudentInformation() {
        System.out.print("id=" + id + "\nname=" + name + "\ngroup=" + group + "\ncourse=" + course.CourseNumber + "\n\n");
    }





}
