public class Fatorial{

    public static void main(String[] args) {
        System.out.println(calcularFatorial(5));

    }

    public static int calcularFatorial(int n){
            int resultado = 1;

            for(int i = 2; i <=n; i++)
                resultado*= i;
                return resultado;
    }
}