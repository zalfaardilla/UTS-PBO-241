package UTS;

/**
 *
 * @author Septian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Intel intel1 = new Intel(2);
        AMD amd1 = new AMD (3);
        Komputer komputer1 = new Komputer (intel1);
        
        komputer1.cetakInfo();
        komputer1.mencabut(intel1);
        komputer1.memasang(amd1);
        komputer1.cetakInfo();
        
    }
    
}
