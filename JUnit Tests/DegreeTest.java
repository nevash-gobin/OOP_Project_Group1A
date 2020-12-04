/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvisorApp;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.*;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Adesh Maraj
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DegreeTest {
    
    public DegreeTest() {
    }

    private Degree testDegree = new Degree("BSc General: Major in Computer Science");
    private Degree testDegree1 = new Degree("BSc General: Minor in Computer Science");
    
    @Test
    public void test1AddCourse() {
        Course testCourse = new Course("COMP1600","Introduction to Computing Concepts",1,3,"","Introduction to Computing Concepts","Core");
        testDegree.addCourse(testCourse);
        String expected = "BSc General: Major in Computer Science\nCourse Code: COMP1600\nCourse Title: Introduction to Computing Concepts\n"
                + "Semester: 1\nCredits: 3\nPre- Requsite: None\nDescription: Introduction to Computing Concepts\nType: Core\n\n";
        String actual = testDegree.getCourseDetails();
        assertEquals(expected,actual);
    }

    @Test
    public void test2GetCourseDetails() {
        Course testCourse2 = new Course("COMP1600","Introduction to Computing Concepts",1,3,"","Introduction to Computing Concepts","Core");
        testDegree.addCourse(testCourse2);
        String expected = "BSc General: Major in Computer Science\nCourse Code: COMP1600\nCourse Title: Introduction to Computing Concepts\n"
                + "Semester: 1\nCredits: 3\nPre- Requsite: None\nDescription: Introduction to Computing Concepts\nType: Core\n\n";
        String actual = testDegree.getCourseDetails();
        assertEquals(expected,actual);
    }
    
}
