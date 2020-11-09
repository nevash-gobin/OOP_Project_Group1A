public class DegreeObserver implements Observer{

    private AdvisorApp advisor;

    public DegreeObserver(AdvisorApp advisor){
        this.advisor = advisor;
    }

    @Override
    public void update() { // changes can occur to this, only for console model
        if(advisor.getDegreeString().equals("BSc General: Major in Computer Science")){
            System.out.println(advisor.getDcit().getAllCoursesFor(0));
        }
        

    }
    
}
