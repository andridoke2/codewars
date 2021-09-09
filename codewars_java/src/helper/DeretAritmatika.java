package helper;

public class DeretAritmatika {
  
  public int aritmatika(int u, int un){
    int result = 0;
    for(int i = 1; i <= un; i++){
      result = result + u;
    }
    return result;
  }
}
