class Student{
String name;
int rollNo;

public void Student(){
    System.out.println("This is Student non paramaterized Constructor");
}
public void info(){
    System.out.println(this.name);
    System.out.println(this.rollNo);
}

}


public class Constructor {
    public static void main(String[] args) {
        Student st = new Student();
        st.name ="Vidushi Chauhan";
        st.rollNo=123456;
        st.info();   
    }

}
