import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //EXAMPLE

        //INPUT nums = [1,4,3,9];
        //RequiredSum = 8;
        // False

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(4);
        nums.add(3);
        nums.add(9);

        int requiredNum = 8;

        Collections.sort(nums);

        System.out.println(formarNumero(nums,requiredNum));

        System.out.println(formarNumerosSimplificado(nums,requiredNum));
    }

    public static boolean formarNumero (ArrayList<Integer> lista , int required){

        for(int i = 0; i < lista.size() -1 ; i++){ //Me posiciona en la primer ubicacion
            for(int j = i+1 ; j < lista.size() ; j++){ // Me posiciona una ubicacion mas a la inicial
                if(lista.get(i) + lista.get(j) == required){ // Comparo la primer posicion con todas las demas y luego pasa a la siguiente
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean formarNumerosSimplificado (ArrayList<Integer> lista , int required){

        int a = 0;
        int b = 1;

        while(a < lista.size() -1 ){

            if(b < lista.size()){

                if(lista.get(a) + lista.get(b) == required){
                    return true;
                }
                b++;
            }else{
                a++;
                b = a + 1;
            }


        }
        return false;
    }
}
