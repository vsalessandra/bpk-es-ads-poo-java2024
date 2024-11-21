package exercicio22;

public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Latam", "3232242423", 2);

        System.out.println(empresa.toString());
        empresa.contratar();
        System.out.println(empresa.toString());
        empresa.demitir();
        System.out.println(empresa.toString());
    }
}
