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
public class MathObserverTest {
    
    public MathObserverTest() {
    }

    @Test
    public void testUpdate() {
        AdvisorApp a = new AdvisorApp();
        Observer o = new DegreeObserver(a);
        Observer o1 = new MathObserver(a);
        a.setUpDegrees();
        a.setStudentDegree("BSc Information Technology (Special)");
        a.setStudentMath("1");
        String actual = o1.update();
        String expected = "Exempted from Math1115 \n";
        assertEquals(expected,actual);
    }
    
}
