import java.util.ArrayList;

/**
 * @author gabiszoka
 */

public class Array {

    protected void startArray(int[] v1){
        int counting;

        for (int i = 0; i < 15; i++) {
            counting = (int)(Math.random()*100);
            v1[i]= counting;
        }
    }

    protected void showInfo(int[] v1) {
        for (int i = 0; i < 15; i++) {
            System.out.println("/- Número: " + (i + 1) + " : " + v1[i]);
        }
        System.out.println("/---------------------------------- ");
    }

    protected void allPairs(int[] v1){
        int pair = 0;
        for (int i = 0; i < 15; i++) {
            if (v1[i]%2==0){
                pair++;
            }
        }
        System.out.println("/- Total de número pares: " + pair);
        System.out.println("/---------------------------------- ");
    }

    protected void biggerValue(int[] v1){
        int biggerValue = 0;
        for (int i = 0; i < 15; i++) {
            if (v1[i]>biggerValue){
                biggerValue++;
            }
        }
        System.out.println("/- O maior valor: " + biggerValue);
        System.out.println("/---------------------------------- ");
    }

    protected void allEquals(int[] v1, int[] v2) {
        int allEquals = 0;
        for (int i = 0; i < 15; i++) {
            for (int a = 0; a < 15; a++) {
                if (v1[i] == v2[a]) {
                    allEquals++;
                }
            }
        }
        System.out.println("/- Total de iguais: " + allEquals);
        System.out.println("/---------------------------------- ");
    }

    protected void multiplyArray(int[] v1, int[] v2){
        ArrayList v3 = new ArrayList();
        for (int i = 0; i < 15; i++) {
            v3.add(v1[i]*v2[i]);
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("/- Produto: " + (i + 1) + " : " + v3.get(i));;
        }
        System.out.println("/---------------------------------- ");
    }

    protected void sumArray(int[] v1, int[] v2) {
        ArrayList v3 = new ArrayList();
        for (int i = 0; i < 15; i++) {
            v3.add(v1[i] + v2[i]);
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("/- Soma " + (i + 1) + " : " + v3.get(i));
        }
        System.out.println("/---------------------------------- ");
    }

    protected void mediaArray(int[] v1) {
        int media = 0, sum = 0;
        for (int i = 0; i < 15; i++) {
            sum = sum + v1[i];
        }
        media = sum / v1.length;
        System.out.println("/- Media do Array:" + media);
        System.out.println("/---------------------------------- ");
    }

    protected void searchArray(int[] v1, int value) {
        String message  = "/- Valor inexistente";
        int position = 0;
        for (int i = 0; i < 15; i++) {
            if (v1[i] == value) {
                message = "/- Valor encontrado!";
                position = i;
            }
        }
        System.out.println(message);
        System.out.println("/- Posição :" + position + " º");
        System.out.println("/---------------------------------- ");
    }

}