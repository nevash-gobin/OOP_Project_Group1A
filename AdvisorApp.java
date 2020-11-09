import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdvisorApp implements Subject {

    private ArrayList<Observer> observers;
    private DCIT dcit;
    private String degreeString;

    public AdvisorApp() {
        observers = new ArrayList<>();
        dcit = new DCIT();
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

    public void getStudentDegree() {
        Scanner myObj = new Scanner(System.in); // for console only probly list in gui
        System.out.println("Select Degree");
        degreeString = myObj.nextLine();
        System.out.println("");
        notifyObserver();
        myObj.close();
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
        } catch (FileNotFoundException e){
            System.out.println("Error");
        }
        try {
            dcit.loadDegrees();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }
    
    public static void main(String[] args)throws Exception {
        AdvisorApp a = new AdvisorApp();
        Observer o = new DegreeObserver(a);
        a.addObserver(o);
        a.setUpDegrees();
        a.getStudentDegree();


    }
}
