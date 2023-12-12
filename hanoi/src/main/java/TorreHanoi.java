
public class TorreHanoi {
    private int movimentos = 0;

    public void hanoi(int n, char origem, char destino, char auxiliar) {
        if (n > 0) {
            hanoi(n - 1, origem, auxiliar, destino);
            movimentos++;
            hanoi(n - 1, auxiliar, destino, origem);
        }
    }

    public int getMovimentos() {
        return movimentos;
    }
}
