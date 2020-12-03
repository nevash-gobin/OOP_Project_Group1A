/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvisorApp;

/**
 *
 * @author Adesh Maraj
 */
public class EnglishObserver implements Observer{

    private AdvisorApp advisor;
    
    public EnglishObserver(AdvisorApp advisor){
        this.advisor = advisor;
    }

    
    @Override
    public String update() {
        String x = "\n";
        if(advisor.getEngString().equals("1")){
            x = "Foun 1105 can be taken \n";
        }
        else if(advisor.getEngString().equals("2")){
            x = "Foun 1105 can be taken \n";
        }
        else{
            x = "Required to do ELPT \n";
        }

        return x;
    }

}
    

