import java.util.ArrayList;

public class Degree implements Programme{
    private ArrayList<Programme> courses;       // a degree has multiple courses

    public Degree (){
        courses = new ArrayList<>();
    }

    public void addCourse (Programme obj){      // adds course to degree
        courses.add(obj);
    }

    public String getCourseDetails(){           // returns a string containing deatils of all coursess in degree
        String str = "";
        if (courses.isEmpty()){
            return str;
        }
        for (Programme i: courses){
            str += i.getCourseDetails()+"\n";
        }
        return str;
    }
    
}
