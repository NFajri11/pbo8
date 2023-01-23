import javax.print.attribute.standard.MediaSize.Engineering;

public class Mobil {
    public String merk;
    public Engine mesin;
    public List <Wheel> roda;
    
    public Mobil() {
        this.roda = new List<Wheel>();
    
    }
    public addRoda(Wheel w) {
        this.roda.Add(w);
    }
    public void start() {
        mesin.start();
    }
    public void stop() {
        mesin.stop();
    }
    public void run() {
        System.out.println("Mobil running... ");
    }   
}