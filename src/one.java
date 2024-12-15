import java.util.ArrayList;
import java.util.List;


public class one {
    public static void main(String[] args) {
        abstract class Student {
            protected String FIO;
            protected int course;
            protected int lastgrade;

            public Student(String FIO, int course, int lastgrade) {
                this.FIO = FIO;
                this.course = course;
                this.lastgrade = lastgrade;
            }

            public void WriteExam() {
                System.out.println("Student is writing an exam");
            }
        }
        class IUStudent extends Student {
            public IUStudent(String FIO, int course, int lastgrade) {
                super(FIO, course, lastgrade);
            }

            public void WriteExam() {
                System.out.println("IU Student is writing an exam");
            }

            @java.lang.Override
            public java.lang.String toString() {
                return "IUStudent{" +
                        "FIO='" + FIO + '\'' +
                        ", course=" + course +
                        ", lastgrade=" + lastgrade +
                        '}';
            }
        }
        class MathStudent extends Student {
            public MathStudent(String FIO, int course, int lastgrade) {
                super(FIO, course, lastgrade);
            }

            public void WriteExam() {
                System.out.println("Math Student is writing an exam");
            }

            @java.lang.Override
            public java.lang.String toString() {
                return "MathStudent{" +
                        "FIO='" + FIO + '\'' +
                        ", course=" + course +
                        ", lastgrade=" + lastgrade +
                        '}';
            }
        }
        IUStudent student1 = new IUStudent("a", 1, 1);
        MathStudent student2 = new MathStudent("b", 2, 2);
        student1.WriteExam();
        System.out.println(student2.toString());
    }
}