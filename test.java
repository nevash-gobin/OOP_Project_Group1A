// used to ensure that programme, course and degree classes are working properly
public class test {

    public static void main(String[] args)throws Exception {
        DCIT dcit = new DCIT();
        dcit.loadCourses();
        dcit.loadDegrees();
        System.out.println("BSc General: Major in Computer Science");
        System.out.println(dcit.getAllCoursesFor(0));
        System.out.println("BSc General: Minor in Computer Science");
        System.out.println(dcit.getAllCoursesFor(1));
        System.out.println("BSc General: Major in Information Technology");
        System.out.println(dcit.getAllCoursesFor(2));
        System.out.println("BSc General: Minor in Information Technology");
        System.out.println(dcit.getAllCoursesFor(3));
        System.out.println("BSc Computer Science (Special)");
        System.out.println(dcit.getAllCoursesFor(4));
        System.out.println("BSc Information Technology (Special)");
        System.out.println(dcit.getAllCoursesFor(5));
        System.out.println("BSc Computer Science with Management (Special)");
        System.out.println(dcit.getAllCoursesFor(6));
        System.out.println("BSc Information Technology with Management (Special)");
        System.out.println(dcit.getAllCoursesFor(7));

        /* to get
        ‣ BSc General: Major in Computer Science (0)
        ‣ BSc General: Minor in Computer Science (1)
        ‣ BSc General: Major in Information Technology (2)
        ‣ BSc General: Minor in Information Technology (3)
        ‣ BSc Computer Science (Special) (4)
        ‣ BSc Information Technology (Special) (5)
        ‣ BSc Computer Science with Management (Special) (6)
        ‣ BSc Information Technology with Management (Special) (7)
        */
        
    }
    
}
