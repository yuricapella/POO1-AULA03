public class Carro extends VeiculoComPortas implements Abastecimento{

    public Carro(String cor, String modelo, String placa, int ano, int portas) {
        super(cor, modelo, placa, ano, portas);
    }

    public void abastecer(){
        System.out.printf("Carro %s está abastecendo etanol.\n",placa);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "portas=" + portas +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", ano=" + ano +
                '}';
    }
}
