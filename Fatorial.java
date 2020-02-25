public class Fatorial{


    public int calcularFatorial(int n) throws IllegalArgumentException   {
        if(n < 0)
            throw new IllegalArgumentException("Não existe fatorial de números negativos");
        int resultado = 1;

            for(int i = 2; i <=n; i++)
                resultado*= i;
                return resultado;
    }
}