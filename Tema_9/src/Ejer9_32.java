public class Ejer9_32 {

    public static int[] booleanCount(boolean[][] array){
        int isTrue = 0, isFalse = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j]){
                    isTrue++;
                } else{
                    isFalse++;
                }
            }
        }
        return new int[]{isTrue, isFalse};
    }

    public static void main(String[]args){
        boolean[][] array = new boolean[3][3];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = Math.random() > 0.5;
            }
        }
        System.out.println("Esta es nuestra matriz de booleanos: ");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int[] result = booleanCount(array);

        System.out.println( result[0] + " De los valores son TRUE \n" + result[1] + " De los valores son FALSE ");
    }
}
