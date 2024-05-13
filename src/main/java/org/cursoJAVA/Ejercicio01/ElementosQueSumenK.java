package org.cursoJAVA.Ejercicio01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ElementosQueSumenK {

    public static void main( String[] args )
    {
        System.out.println( ".......... Ejecutando Ejercicio 1 del Curso JAVA" );

        Integer k = Integer.valueOf(args[0]);
        List<Integer> lista = getList(args);
        Result result = checkFunction(k, lista);

        if(result.result)
            System.out.println(result.num1 + " + " + result.num2 + " = " + k);
        else
            System.out.println("No se ha encontrado ningún par de números que sumen " + k);
    }

    private static List<Integer> getList(String[] args) {

        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            lista.add(Integer.parseInt(args[i]));
        }

        return lista;
    }

    private static Result checkFunction(Integer x, List<Integer> lista) {

        Result result = new Result();
        result.result = false;

        for(int i = 1; i < lista.size(); i++){

            Integer sum = lista.get(i) + lista.get(i-1);
            if (Objects.equals(x, sum)) {
                result.result = true;
                result.num1 = lista.get(i);
                result.num2 = lista.get(i-1);
                break;
            }
        }

        return result;
    }
}

class Result {
    boolean result;
    Integer num1;
    Integer num2;
}
