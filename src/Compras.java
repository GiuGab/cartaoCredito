public class Compras implements Comparable<Compras>{
    private String nome;
    private int valorDaCompra;

    public Compras(String nome, int valorDaCompra) {
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }

    public String getNome() {
        return nome;
    }

    public int getValorDaCompra() {
        return valorDaCompra;
    }

    @Override
    public String toString() {
        return  nome + " - " + valorDaCompra;
    }

    @Override
    public int compareTo(Compras outraCompras) {
        return Integer.compare(this.valorDaCompra, outraCompras.getValorDaCompra());
    }
}
