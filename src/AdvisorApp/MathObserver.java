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
public class MathObserver implements Observer{

    private AdvisorApp advisor;
    
    public MathObserver(AdvisorApp advisor){
        this.advisor = advisor;
    }

        
    @Override
    public String update() {
        String x = "\n";
        if((advisor.getDegreeString().equals("BSc Information Technology (Special)")||
                advisor.getDegreeString().equals("BSc Computer Science with Management (Special)"))||
                advisor.getDegreeString().equals("BSc Information Technology with Management (Special)")){
            if(advisor.getMathString().equals("1")){
                x = "Exempted from Math1115 \n";
            }

            else if(advisor.getMathString().equals("2")){
                x = "Exempted from Math1115 \n";
            }

            else if(advisor.getMathString().equals("3")){
                x = "Exempted from Math1115 \n";
            }
            else{
                x = "Required to do Math1115 \n";
            }
        }
        return x;
    }
    
}
