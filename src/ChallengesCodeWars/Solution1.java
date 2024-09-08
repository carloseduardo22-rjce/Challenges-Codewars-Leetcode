package ChallengesCodeWars;
import java.util.ArrayList;
import java.util.List;

public class Solution1 {

  public int solution(int number) {
    
    List<Integer> valoresMultiplos = new ArrayList();
    
    int valor=10;
    
    for (int i=0; i<valor; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        valoresMultiplos.add(i);
      }
    }
    
    Integer soma = 0;
    for (Integer n : valoresMultiplos) {
      soma += n;
    }
    
    return soma;
    
  }

}
