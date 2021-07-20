package reto1.logica;

public class Viabilidad {
    
    private int pTiempo;
    private double pCapital;
    private double pInteres;

    public Viabilidad(int
    pTiempo, double pCapital, double pInteres){
        this.pTiempo = pTiempo;
        this.pCapital = pCapital;
        this.pInteres = pInteres;
    }
    
    public int getpTimpo() {
        return pTiempo;
    }
    public void setpTiempo(int pTiempo) {
        this.pTiempo = pTiempo;
    }
    public double getpCapital(){
        return pCapital;
    }
    public void setpCapital(double pCapital) {
        this.pCapital = pCapital;
    }
    public double getInteres(){
        return pInteres;
    }
    public void setpInteres(double pInteres) {
        this.pInteres = pInteres;
    }

    public double InteresSimple(int pTiempo, double pCapital, double pInteres){
        double ecuacion1 = pCapital*pInteres*pTiempo;
        return ecuacion1;
    }

    public double InteresCompuesto(int pTiempo, double pCapital, double pInteres){
        double ecuacion2 = pCapital * (Math.pow((1+pInteres),pTiempo)-1);
        return ecuacion2;
    }

    public double CompararInversion(int pTiempo, double pCapital, double pInteres){
       double ecuacion3 = InteresCompuesto(pTiempo, pCapital, pInteres)-InteresSimple(pTiempo, pCapital, pInteres);
        return ecuacion3;
    }

    public String inversion (int pTiempo, double pCapital, double pInteres) {
        double respuesta = InteresCompuesto(pTiempo, pCapital, pInteres)-InteresSimple(pTiempo, pCapital, pInteres);
        return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $ "+respuesta;
    }


}