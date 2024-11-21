package exercicio06;

public class Computador {
    private String processador;
    private String memoriaRAM;
    private int armazenamento;
    private boolean ligado = false;

    public Computador(String processador, String memoriaRAM, int armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligarPC() {
        System.out.println("Ligando pc...");
        ligado = true;
    }

    public void desligarPC() {
        System.out.println("Desligando pc...");
        ligado = false;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "processador='" + processador + '\'' +
                ", memoriaRAM='" + memoriaRAM + '\'' +
                ", armazenamento=" + armazenamento +
                ", ligado=" + ligado +
                '}';
    }
}
