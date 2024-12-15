import java.util.ArrayList;
import java.util.List;


public class Main
{
    public static void main (String[] args) {
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

        class Strings {
            protected List<String> StringsList;

            public Strings(List<String> stringsList) {
                StringsList = stringsList;
            }

            void SortStrings() {
                for (int i = 0; i < StringsList.size() - 1; i++) {
                    for (int j = 0; i < StringsList.size() - i - 1; j++) {
                        if (StringsList.get(i).length() > StringsList.get(i).length()) {
                            String t = StringsList.get(j+1);
                            StringsList.add(j+1, StringsList.get(j));
                            StringsList.add(j, t);
                        }
                    }
                }
            }

            void AddString(String NewString) {
                StringsList.add(NewString);
            }

            String MaxElem() {
                String elem = "";
                int maxlen = 0;
                for (int i = 0; i < StringsList.size(); i++) {
                    if (maxlen < StringsList.get(i).length()) {
                        maxlen = StringsList.get(i).length();
                        elem = StringsList.get(i);
                    }
                }
                return elem;
            }

            double avg() {
                double sum = 0;
                for (int i = 0; i < StringsList.size(); i++) {
                    sum += StringsList.get(i).length();
                }
                return sum / StringsList.size();
            }
        }
        List<String> l = new ArrayList<>();
        Strings s = new Strings (l);
        System.out.println(s.MaxElem());
    }
}

