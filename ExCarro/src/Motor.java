public class Motor {
    private int cilindrada;
    private String modelo;
    private TipoCombustivel tipoCombustivel;
    private int rpm;
    private int potencia;


    public Motor(int cilindrada, String modelo, TipoCombustivel tipoCombustivel, int rpm, int potencia) {
        this.cilindrada = cilindrada;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = rpm;
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getModelo() {
        return modelo;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public int getRpm(int incrementoRPM) {
        return rpm;
    }

    public int getPotencia() {
        return potencia;
    }

    public void acelerar(int incrementoRPM) {
        rpm += incrementoRPM;
    }

    public void freiar(int decrementoRPM) {
        rpm -= decrementoRPM;
    }

    public void subirMarcha (int incrementoRPM) {
        rpm += incrementoRPM;
    }

    public void ligar(){
        System.out.println("Ligando, " + modelo);
        this.rpm = 1000;
    }

    public void desligar() {
        System.out.println("Desligando, " + modelo);
        this.rpm = 0;
    }

    public void ativarNitro () {
        System.out.println("Nitro ativado:" + ", VRUMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
        this.rpm = 10000;
    }

    public void reduzirPotencia (int decrementoRPM) {
        rpm -= decrementoRPM;
    }
}
