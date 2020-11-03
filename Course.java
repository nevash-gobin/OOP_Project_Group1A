public class Course implements Programme{
    private String courseCode;              //stores courseCode
    private String courseTitle;             //stroes courseTitle 
    private int semester;                   //stores semester avail
    private int credits;                    //stores amt of credits
    private String preReq;                  //stores any prereq
    private String description;             //stores description of course
    private String type;                    // stores if Foundation, Elective or Core

    public Course(String courseCode, String courseTitle, int semester, int credits, String preReq, String description, String type){
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.semester = semester;
        this.credits = credits;
        this.preReq = preReq;
        this.description = description;
        this.type = type;
    }

    public String getCourseDetails(){       //Returns a string in the format of DCIT website
        String str = "";
        str+= "Course Code: "+ courseCode+"\n";
        str+= "Course Title: "+ courseTitle+"\n";
        str+= "Semester: "+String.valueOf(semester)+"\n";
        str+= "Credits: "+String.valueOf(credits)+"\n";
        if(preReq.equals("")){
            str+= "Pre- Requsite: "+"None"+"\n";
        }
        else{
            str+= "Pre- Requsite: "+preReq+"\n";
        }
        str+= "Description: "+description+"\n";
        str+= "Type: "+type+"\n";
        return str;
    }

}
