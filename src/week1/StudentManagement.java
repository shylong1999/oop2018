package week1;

public class StudentManagement {

    Student[] students = new Student[100];
    public int count;
    public  boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup().equals(s2.getGroup()));
    }


    public void setStudents(Student students) {
        this.students[count] = students;
        count++;
    }

    public void printNameStudent() {
        for (int i = 0; i < count ; i++) {
            System.out.println(students[i].getName());
        }
        System.out.println("\n");
    }

    public void studentsByGroup() {
        String[] nameGroup = new String[10];
        int j=0;
        int length=0;
        for (int i=0;i<count;i++) {
            while (j<length){
                if (students[i].getGroup().equals(nameGroup[j])) break;
                j++;
            }
            if (j==length){
                nameGroup[length++] = students[i].getGroup();
            }
        }
        for (int i=0;i<length;i++) {
            System.out.println("Group "+nameGroup[i] + ": ");
            for (j=0;j<count;j++) {
                if (students[j].getGroup().equals(nameGroup[i])) {
                    System.out.println(students[j].getName());
                }
            }
            System.out.println("\n");
        }
    }


    public void remove(String id) {
        int i;
        for (i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                break;
            }
        }
        if (i == count) System.out.println("Không có sinh viên nào có trùng mã id");
        for (int j = i; j < count - 1; j++) {
            students[j] = students[j + 1];
        }
        count--;
    }

    public static void main(String[] args) {
        StudentManagement st = new StudentManagement();

        Student sv1 = new Student();

        sv1.setName("Ung Thanh Long");
        sv1.setId("17020869");
        sv1.setGroup("INT22041");
        sv1.setEmail("17020869@vnu.edu.vn");
        System.out.println(sv1.getName());
        System.out.println(sv1.getInfo());

        Student sv2 = new Student("Nguyen Ngoc Diep", "17021105", "17021105@vnu.edu.vn");
        Student sv3 = new Student("UNG LONG","17051999","unglong5@gmail.com");
        Student sv4 = new Student();
        Student sv5 = new Student(sv1);

        sv4.setName("Nguyen Van A");
        sv4.setId("17020899");
        sv4.setGroup("INT22042");
        sv4.setEmail("17020869@vnu.edu.vn");

        System.out.println(sv2.getInfo());
        System.out.println(sv3.getInfo());
        System.out.println(sv4.getInfo());
        System.out.println(sv5.getInfo());

        //Kiểm tra 2 sinh viên có cùng lớp hay không?
        System.out.println("Kiểm tra 2 sinh viên Long và A có cùng lớp hay không? ");
        if (st.sameGroup(sv1, sv4)) System.out.println("2 sinh viên cùng lớp" + "\n");
        else System.out.println("2 sinh viên không cùng lớp" + "\n");

        System.out.println("Kiểm tra 2 sinh viên Diep và Long có cùng lớp hay không? ");
        if (st.sameGroup(sv2, sv3)) System.out.println("2 sinh viên cùng lớp" + "\n");
        else System.out.println("2 sinh viên không cùng lớp" + "\n");

        //Nhập thông tin sinh viên
        st.setStudents(sv1);
        st.setStudents(sv2);
        st.setStudents(sv3);
        st.setStudents(sv4);
        /*for (int i = 0; i < st.students.length; i++) {
            st.students[i] = new Student();
            st.students[i].setName("UNG LONG");
            st.students[i].setId("1702xxxx");
            st.students[i].setGroup("INT22044");
            st.students[i].setEmail("unglong5@gmail.com");
        }*/
        System.out.println("In ra danh sách sinh viên cùng lớp");
        st.studentsByGroup();

        System.out.println("Danh sách sau khi xóa sinh viên có mã sinh viên ID là 17051999 ");
        st.remove("17051999");
        st.printNameStudent();

        }
}
