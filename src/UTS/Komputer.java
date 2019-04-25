package UTS;

/**
 *
 * @author Septian
 */
public class Komputer {
    private CPU cpu;
    
    public Komputer (CPU cpu){
        this.cpu = cpu;
   
    }
    public void memasang (CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU"+this.cpu.getCPUData()+"GHz dipasang");
    }
    public void mencabut (CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU : "+this.cpu.getCPUData()+"GHz dipasang");
    }

    public void cetakInfo() {
        System.out.println("spesifikasi : CPU : "+this.cpu.getCPUData()+"GHz");
    }
    
    
}
