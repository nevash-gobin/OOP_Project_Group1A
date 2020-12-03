/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvisorApp;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Adesh Maraj
 */
public class AdvisorApp implements Subject {

    private ArrayList<Observer> observers;
    private DCIT dcit;
    private String degreeString;
    
    private ArrayList<String> x;
    private ArrayList<String> z;
    private String mathString;
    private String englishString;

    public AdvisorApp() {
        observers = new ArrayList<>();
        dcit = new DCIT();
        x = new ArrayList<>();
        z = new ArrayList<>();
    }

    @Override
    public void notifyObserver() {
        for (Observer i : observers) {
            i.update();
        }
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    
    public ArrayList<Observer> getObserver(){
        return observers;
    }

    
    
    public ArrayList<String> getStudentDegree() {   
        System.out.println("");
        z = (ArrayList<String>)notifyObserver1().clone();
        return z;
    }
    
    public ArrayList<String> notifyObserver1() {
        String y="";
        for (Observer i : observers) {
            y=i.update();
            if(y != null){
                x.add(y);
            }
        }
        return x;
    }
    
    public String getStudentMath () {
        System.out.println("get student math");
        String math = notifyObserver2();
        return math;
    }
    public String notifyObserver2() {
        String y="";
        for (Observer i : observers) {
            y=i.update();
        }
        return y;
    }
    public void setStudentMath (String x){
        mathString = x;
    }
    
    public String getMathString() {
        return mathString;
    }
    
    public String getStudentEnglish () {
        System.out.println("get student english");
        String eng = notifyObserver3();
        return eng;
    }
    
    public String notifyObserver3() {
        String y="";
        for (Observer i : observers) {
            y=i.update();
        }
        return y;
    }
    
    public void setStudentEng (String x) {
        englishString = x;
    }
    public String getEngString() {
        return englishString;
    }
    public void setStudentDegree(String x){
        degreeString = x;
    }


    public DCIT getDcit() {
        return dcit;
    }

    public String getDegreeString() {
        return degreeString;
    }

    public void setUpDegrees() {
        try {
            dcit.loadCourses();
            System.out.println("Course loaded");
        } catch (FileNotFoundException e){
            System.out.println("Error");
        }
        try {
            dcit.loadDegrees();
            System.out.println("Degree loaded");
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }
    
    public static void main(String[] args)throws Exception {
        AdvisorApp a = new AdvisorApp();
        Observer o = new DegreeObserver(a);
        Observer o1 = new MathObserver(a);
        Observer o2 = new EnglishObserver(a);
        a.addObserver(o);
        a.addObserver(o1);
        a.addObserver(o2);
        a.setUpDegrees();
        System.out.println("end1");
        Login x = new Login(a);
        x.setVisible(true);
        
        


    }
}