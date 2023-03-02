package ejercicios;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio5_3 {
    public static void main(String[] args) {
        Integer[] enteros={1,2,6,9,3,5,25,22,66};

        Map<Integer,Integer> mapaCount=new TreeMap<>();
        for (Integer numero :
                enteros) {
            if(mapaCount.containsKey(numero)){
                mapaCount.put(numero,mapaCount.get(numero+1));
            }else{
                mapaCount.put(numero,1);
            }
        }
        System.out.println(mapaCount);
    }
}
