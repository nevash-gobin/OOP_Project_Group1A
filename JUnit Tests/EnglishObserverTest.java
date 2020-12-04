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
public class EnglishObserverTest {
    
    public EnglishObserverTest() {
    }

    @Test
    public void testUpdate() {
        AdvisorApp a = new AdvisorApp();
        Observer o = new EnglishObserver(a);
        a.setUpDegrees();
        a.setStudentEng("1");
        String actual = o.update();
        String expected = "Foun 1105 can be taken \n";
        assertEquals(expected,actual);
    }
    
}
