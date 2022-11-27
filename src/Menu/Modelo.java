
package Menu;


public class Modelo {
 
    private double Nuemgallinas,Numdias,Produhuevos;

    public Modelo() {
    }

    public Modelo(double Nuemgallinas, double Numdias, double Produhuevos) {
        this.Nuemgallinas = Nuemgallinas;
        this.Numdias = Numdias;
        this.Produhuevos = Produhuevos;
    }

    public double getNuemgallinas() {
        return Nuemgallinas;
    }

    public void setNuemgallinas(double Nuemgallinas) {
        this.Nuemgallinas = Nuemgallinas;
    }

    public void setNumdias(double Numdias) {
        this.Numdias = Numdias;
    }

    public void setProduhuevos(double Produhuevos) {
        this.Produhuevos = Produhuevos;
    }

    public double getNumdias() {
        return Numdias;
    }

    public double getProduhuevos() {
        return Produhuevos;
    }
    


public String toString(){
 
return"Modelo{"+ "Nuemgallinas=" +Nuemgallinas + "Numdias" +Numdias+ "Produhuevos" + Produhuevos + "}";


}
   }