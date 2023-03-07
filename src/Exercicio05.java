public class Exercicio05 {
    public static void main(String[] args) {
        int[] values = new int[100];

        for (int i = 1; i < 100; i++) {
            values[i] = i;
        }

        System.out.println("Números primos na faixa 1 -> 100:");
        for(int i = 1; i < 100; i++){
            for(int j = i - 1; j > 0; j--){
                if(j == 1){
                    System.out.println(i);
                }else{
                    if(i%j == 0){
                        break;
                    }
                }
            }
        }
    }
}
