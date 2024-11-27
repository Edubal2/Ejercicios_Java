public class Ejer4_11 {
    public static void main(String[] args){

        int sumaPares= 0, sumaImpares=0;
        for (int i=100;i<=200;i++ ){
            if (i%2==0){
                sumaPares+=i;
                System.out.println("Pares: "+sumaPares);
            }else {
                sumaImpares+=i;
                System.out.println("Impares: "+sumaImpares);
            }
        }

        System.out.println("\nValor final:\n - Pares: "+sumaPares+"\n - Impares: "+sumaImpares);
    }
}
