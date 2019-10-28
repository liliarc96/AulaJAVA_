package com.testearray;
import java.util.*;

public class ComparandoArrays {
  public static void main(String[] args) {
    int[] array1 = new int[10];
    int[] array2 = new int[10];

    Arrays.fill(array1, 47);
    Arrays.fill(array2, 47);

    System.out.println(Arrays.equals(array1,array2));
    array2[3] = 11;
    System.out.println(Arrays.equals(array1, array2));
    array2[1] = 6;
    array2[8] = 5;
    array2[4] = 2;
    array2[9] = 1;
    System.out.println(Arrays.toString(array2));
    Arrays.sort(array2);
    System.out.println(Arrays.toString(array2));
    
    int indice = Arrays.binarySearch(array2, 5);
    System.out.println(indice);
    
    String[] string1 = new String[5];
    Arrays.fill(string1, "Olá");
    String[] string2 = {"Olá","Olá","Olá","Olá","Olá"};
    System.out.println(Arrays.equals(string1, string2));
    
    //
    
    //valores podem ser repetidos
    List<Integer> lista = new ArrayList(); 
    //valores únicos
    Set<Integer> listaSet = new HashSet();
    // chave e valor
    Map<Integer,Integer> map = new HashMap();
    
    Map<Integer,String> mapNome = new HashMap();
    
    lista.add(1);
    lista.add(2);
    lista.add(1);
    System.out.println(lista.toString());
    listaSet.add(1);
    listaSet.add(2);
    listaSet.add(1);
    System.out.println(listaSet.toString());
    map.put(1,50);
    map.put(2,100);
    System.out.println(map.values().toString());
    System.out.println(map.toString());
    mapNome.put(1,"Sonic");
    mapNome.put(2,"Robotnic");
    System.out.println(mapNome.values().toString());
  }
}