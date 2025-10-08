

public class teste{
    public static void main (String[]args){
        int x = somar(5, 0);
        System.out.println("Soma: " + x);
    }
    public static void conta(int num){
        System.out.println(num);
        if(num < 10)
            return;
        conta(num + 1);
        
    }

    public static void contarate(int contador, int limite){
        if(contador > limite)
            return;
        System.out.println(contador);
        contarate(contador + 1, limite);
    }

    public static void tabuada(int num, int mult){
        if(mult > 10)
            return;
        int r = num * mult;
        System.out.printf("%d x %d = %d\n", num, mult, r);

        tabuada(num, mult + 1);
    }

    public static void tabuadainvertida(int num, int cont){
        if(cont < 1)
            return;
        int r = num * cont;
        System.out.printf("%d x %d = %d\n ", num, cont, r);
        tabuadainvertida(num, cont - 1);
    }

    public static int somar(int num, int cont){
        if(num == 0)
            return cont;
        return somar(num - 1, num + cont);

    }
}