public class main {
    public static void main (String [] args){
        // Membuat object engine
        Engine mesin = new Engine();
        mesin.merk = "Honda F23A";
        mesin.cc = 2300;
        Mobil odyssey = new Mobil();
        odyssey.merk = "Honda Odyssey";
        odyssey.mesin = mesin;
        mesin.addRoda(new Wheel(17, "GT Radial"));
        odyssey.addRoda(new Wheel(11, "GT Radial"));
        odyssey.addRoda(new Wheel(12, "GT Radial"));
        odyssey.addRoda(new Wheel(13, "GT Radial"));
        odyssey.start();
        odyssey.run();
        odyssey.stop();
        }
}