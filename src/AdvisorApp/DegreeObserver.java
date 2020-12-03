/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvisorApp;

import java.util.ArrayList;

/**
 *
 * @author Adesh Maraj
 */
public class DegreeObserver implements Observer{

    private AdvisorApp advisor;
    

    public DegreeObserver(AdvisorApp advisor){
        this.advisor = advisor;
    }

    
    @Override
    public String update() {
    String y ="";
    if(advisor.getDegreeString().equals("BSc General: Major in Computer Science")){
        y=(advisor.getDcit().getAllCoursesFor(0));
        
    }

    else if(advisor.getDegreeString().equals("BSc General: Minor in Computer Science")){
        y=(advisor.getDcit().getAllCoursesFor(1));
        
    }

    else if(advisor.getDegreeString().equals("BSc General: Major in Information Technology")){
        y=(advisor.getDcit().getAllCoursesFor(2));
    }

    else if(advisor.getDegreeString().equals("BSc General: Minor in Information Technology")){
        y=(advisor.getDcit().getAllCoursesFor(3));
    }

    else if(advisor.getDegreeString().equals("BSc Computer Science (Special)")){
        y=(advisor.getDcit().getAllCoursesFor(4));
        
    }

    else if(advisor.getDegreeString().equals("BSc Information Technology (Special)")){
        y=(advisor.getDcit().getAllCoursesFor(5));
        
    }

    else if(advisor.getDegreeString().equals("BSc Computer Science with Management (Special)")){
        y=(advisor.getDcit().getAllCoursesFor(6));
        
    }

    else if(advisor.getDegreeString().equals("BSc Information Technology with Management (Special)")){
        y=(advisor.getDcit().getAllCoursesFor(7));
        
    }
    
    return y;
}
    
}