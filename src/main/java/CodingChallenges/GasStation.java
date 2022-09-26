package CodingChallenges;

public class GasStation {

    public static String GasStations(String[] strArr){
      String returnValue = "impossible";

      int getLength = strArr.length - 1;
      int j = 1;
      while (j <= getLength){

          String GC = strArr[j];
          String[] getGAndC = GC.split(":");

          int G = Integer.parseInt(getGAndC[0]);
          int C = Integer.parseInt(getGAndC[1]);
          int totalGasNeeded = C * (Integer.parseInt(strArr[0]));

          if(G >= totalGasNeeded){
              returnValue = strArr[j];
          }

          j++;
      }

      return returnValue;
    }

    public static void main(String[] arg){

        String[] strArr = new String[] {"4", "3:5", "1:1", "2:1", "5:2"};
        System.out.println(GasStations(strArr));
    }
}
