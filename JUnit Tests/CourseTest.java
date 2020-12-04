/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvisorApp;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.*;


/**
 *
 * @author Adesh Maraj
 */
public class CourseTest {
    
    public CourseTest() {
    }

    @Test
    public void testGetCourseDetails() {
        Course testCourse = new Course("COMP1600","Introduction to Computing Concepts",1,3,"","Introduction to Computing Concepts","Core");
        String actual = testCourse.getCourseDetails();
        String expected = "Course Code: COMP1600\nCourse Title: Introduction to Computing Concepts\n"
                + "Semester: 1\nCredits: 3\nPre- Requsite: None\nDescription: Introduction to Computing Concepts\nType: Core\n";
        assertEquals(expected,actual);
    }
    
}
