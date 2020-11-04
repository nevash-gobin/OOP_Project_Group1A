import java.io.*;
import java.util.ArrayList;
public class DCIT {
    private String courseLocation;
    private String degreeLocation;
    private ArrayList<Programme> courses;
    private ArrayList<Programme>degrees;

    public DCIT(){
        courseLocation = "Courses.txt";
        degreeLocation = "Degrees.txt";
        courses = new ArrayList<>();
        degrees = new ArrayList<>();
    }

    public void loadCourses() throws FileNotFoundException{
        File courseFile = new File(courseLocation); 
        try{
            BufferedReader bRCF = new BufferedReader(new FileReader(courseFile)); 
            String st;
            while (!(st = bRCF.readLine()).equals("*")){
                String split[] = st.split(",", 0);
                String courseCode = split[0];
                String courseTitle = split[1];
                int semester = Integer.parseInt(split[2]);
                int credits = Integer.parseInt(split[3]);
                String preReq = split[4];
                String description = split[5];
                String type = split[6];
                Course c = new Course(courseCode, courseTitle, semester, credits, preReq, description, type);
                courses.add(c);
            }
            bRCF.close();
        }
        catch (IOException ioe) {
            System.out.println("Trouble reading from the file");
        }
    }

    public void loadDegrees() throws FileNotFoundException{
        File degreeFile = new File(degreeLocation);
        try{
              BufferedReader bRDF = new BufferedReader(new FileReader(degreeFile));
              String st2;
              while (!(st2 = bRDF.readLine()).equals("*")){
                  String split[] = st2.split(",", 0);
                  Degree d1 = new Degree(split[0]);
                  for(int i = 1; i < split.length; i++){
                      d1.addCourse(courses.get(Integer.parseInt(split[i])));
                  }
                  degrees.add(d1);
              }
              bRDF.close();
        }
        catch(IOException ioe) {
            System.out.println("Trouble reading from the file");
        }
    }

    public ArrayList<Programme> getDegrees (){
        return degrees;
    }

    public String getAllCoursesFor(int degreeNum){
        Programme d1 = degrees.get(degreeNum);
        return d1.getCourseDetails();
    }
    
}
