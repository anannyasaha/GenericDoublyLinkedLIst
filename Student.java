public class Student implements Comparable<Student>{
    public String name;
    public float GPA;

    public Student(String name, float GPA){
        this.name = name;
        this.GPA = GPA;
    }

    public String toString(){
     String s = this.name+"(GPA: "+this.GPA + ")";
     return s;
    }

    @Override
    public int compareTo( final Student s) {
        return Float.compare( s.GPA,this.GPA);
    }
}
