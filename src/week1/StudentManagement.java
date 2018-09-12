package week1;

public class StudentManagement {


    Student[] students = new Student[100];

    public static boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup().equals(s2.getGroup()));
    }


    public void studentsByGroup() {
        String nameGroup1 = "INT22041";
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroup().equals(nameGroup1)) {
                System.out.println(students[i].getInfo());
            }
        }
    }

    public void remove(String id) {
        int dem = students.length;
        int i;
        for (i = 0; i < dem; i++) {
            if (students[i].getId() == id) {
                break;
            }
        }
        if (i == dem) System.out.println("Không có sinh viên nào có trùng mã id");
        for (int j = i; j < dem - 1; j++) {
            students[j] = students[j + 1];
        }
        dem--;
    }

    public static void main(String[] args) {
        Student sv1 = new Student();

        sv1.setName("Ung Thanh Long");
        sv1.setId("17020869");
        sv1.setGroup("INT22041");
        sv1.setEmail("17020869@vnu.edu.vn");
        System.out.println(sv1.getName());
        System.out.println(sv1.getInfo());


        Student sv2 = new Student("ABC", "17020864", "17020864@vnu.edu.vn");
        Student sv3 = new Student(sv1);

        System.out.println(sv2.getInfo());
        System.out.println(sv3.getInfo());

        //Kiểm tra 2 sinh viên có cùng lớp hay không?
        System.out.println("Kiểm tra 2 sinh viên có cùng lớp hay không? " + "\n");
        if (sameGroup(sv1, sv2)) System.out.println("2 sinh viên cùng lớp" + "\n");
        else System.out.println("2 sinh viên không cùng lớp" + "\n");


        StudentManagement st = new StudentManagement();

            //Nhập thông tin sinh viên
            for (int i = 0; i < st.students.length; i++) {
                st.students[i] = new Student();
                st.students[i].setName("UNG LONG");
                st.students[i].setId("113");
                st.students[i].setGroup("INT22044");
                st.students[i].setEmail("unglong5@gmail.com");
            }
            //In ra thông tin sinh viên
            for (int i = 0; i < st.students.length; i++) {
                System.out.println(st.students[i].getInfo());
            }

            System.out.println("In ra danh sách sinh viên cùng lớp " + "\n");

            st.studentsByGroup();

            System.out.println("Xóa sinh viên có mã sinh viên là ID" + "\n");

            st.remove("17020869");

        }
}
