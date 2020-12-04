/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvisorApp;

import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.*;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Adesh Maraj
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DegreeObserverTest {
    
    public DegreeObserverTest() {
    }

    @Test
    public void testUpdate() {
        AdvisorApp a = new AdvisorApp();
        Observer o = new DegreeObserver(a);
        a.setUpDegrees();
        a.setStudentDegree("BSc General: Major in Computer Science");
        
        String actual = o.update();
        String expected = "BSc General: Major in Computer Science\n" +
        "Course Code: COMP1600\n" +
        "Course Title: Introduction to Computing Concepts\n" +
        "Semester: 1\n" +
        "Credits: 3\n" +
        "Pre- Requsite: None\n" +
        "Description: Introduction to Computing Concepts\n" +
        "Type: Core\n" +
        "\n" +
        "Course Code: COMP1601\n" +
        "Course Title: Computer Programming I\n" +
        "Semester: 1\n" +
        "Credits: 3\n" +
        "Pre- Requsite: None\n" +
        "Description: Computer Programming I\n" +
        "Type: Core\n" +
        "\n" +
        "Course Code: COMP1602\n" +
        "Course Title: Computer Programming II\n" +
        "Semester: 2\n" +
        "Credits: 3\n" +
        "Pre- Requsite: None\n" +
        "Description: Computer Programming II\n" +
        "Type: Core\n" +
        "\n" +
        "Course Code: COMP1603\n" +
        "Course Title: Computer Programming III\n" +
        "Semester: 2\n" +
        "Credits: 3\n" +
        "Pre- Requsite: None\n" +
        "Description: Computer Programming III\n" +
        "Type: Core\n\n";
        assertEquals(expected,actual);
        
    }
    
}
