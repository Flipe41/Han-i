
public class TorreHanoi {
    private int movimentos = 0;

    public void hanoi(int n, char origem, char destino, char auxiliar) {
        if (n > 0) {
            // Mova n-1 discos de origem para auxiliar
            hanoi(n - 1, origem, auxiliar, destino);
            // Mova o disco restante de origem para destino
            movimentos++;
            // Mova os n-1 discos de auxiliar para destino
            hanoi(n - 1, auxiliar, destino, origem);
        }
    }

    public int getMovimentos() {
        return movimentos;
    }
}
