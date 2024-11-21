public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void acionarAcelerador(int incrementoRPM) {
        System.out.println("Acelerando " + modelo + ", vruuuuuuuuuuum");
        motor.acelerar(incrementoRPM);
    }

    public void acionarFreio(int decrementoRPM) {
        System.out.println("Freiando " + modelo + ", iiiiiiiiihhhh");
        motor.freiar(decrementoRPM);
    }

    public void trocarMarcha() {
        System.out.println("Trocando marcha");
    }

    public void ligarCarro () {
        motor.ligar();
    }

    public void desligar () {
        motor.desligar();
    }

    public void turboBoost () {
        motor.ativarNitro();
    }

    public void reduzirPotencia (int decrementoRPM) {
        System.out.println("Reduzindo potência do motor");
        motor.reduzirPotencia(decrementoRPM);
    }

}
