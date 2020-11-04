// used to ensure that programme, course and degree classes are working properly
public class test {

    public static void main(String[] args)throws Exception {
        DCIT dcit = new DCIT();
        dcit.loadCourses();
        dcit.loadDegrees();
        
        for (Programme i: dcit.getDegrees()){
            System.out.println(i.getCourseDetails());
        }

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
