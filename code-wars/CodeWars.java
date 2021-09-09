public class CodeWars {

  private static int count;

  public static void main(String[] args){
    System.out.println("Hello World!");

    int[] values = {1,2,3,4,5,6,7,8,9,10,11};
    int[] result = reverseArray(values);
    
    printArray(result); /** Output : 11 10 9 8 7 6 5 4 3 2 1 */

    /** static variable */
    System.out.println(count);
    sayHello("Doke");
    sayHelloWorld();
    System.out.println(count);
    System.out.println(sayHelloWorld("Hello World!"));
    System.out.println(count);
    /** static variable */
  }

  /** Manual array reverse */
  private static int[] reverseArray(int[] array){
    int[] result = new int[array.length];
    int j = 0; 
    for(int i = array.length - 1; i >= 0; i--){
      result[j] = (array[i]);
      j++;
    }
    return result;
  }

  private static void printArray(int[] array){
    for(int i = 0; i < array.length; i++){
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  /**------------------------====== */

  private static void sayHello(String nama){
    count++;
    System.out.println("Halo, nama saya " + nama);
  }

  private static void sayHelloWorld(){
    count++;
    System.out.println("Hello World!");
  }

  private static String sayHelloWorld(String text){
    count = count + 5;
    return text;
  }

  /**------------------------====== */

}