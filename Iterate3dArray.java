import java.util.*;
class Main{
  static Scanner kbd = new Scanner(System.in);
  public static void main(String[] args){
    int[][][] array = new int[3][2][3];
    for(int i = 0;i < array.length;i++){
      for(int j = 0;j < array[i].length;j++){
        for(int k = 0;k < array.length;k++)
          array[i][j][k] = kbd.nextInt();
      }
    }
  
   for(int i = 0;i < array.length;i++){
     for(int j = 0;j < array[i].length;j++){
       for(int k = 0;k < array.length;k++)
         System.out.print(array[i][j][k] + "\t");
       System.out.println();
       }
     System.out.println();
   }
  
  for(int[][] array2d:array){
    for(int[] array1d: array2d){
      for(int data:array1d){
        System.out.print(data + "\t");
      }
      System.out.println();
    }
  System.out.println();
  }
  }
}