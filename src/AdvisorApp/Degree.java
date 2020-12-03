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
public class Degree implements Programme{
    private String name;
    private ArrayList<Programme> courses;       // a degree has multiple courses

    public Degree (String name){
        this.name = name;
        courses = new ArrayList<>();
    }

    public void addCourse (Programme obj){      // adds course to degree
        courses.add(obj);
    }

    public String getCourseDetails(){           // returns a string containing deatils of all coursess in degree
        String str = "";
        str += name +"\n";
        if (courses.isEmpty()){
            return str;
        }
        for (Programme i: courses){
            str += i.getCourseDetails()+"\n";
        }
        return str;
    }
    
}
