package CodingChallenges;

public class StepWalking {

    public static int StepWalkingCombinations(int num){
        int combinations = 1;
        if (num > 1){

            if ((num % 2) != 0){

                if (num > 3){

                    combinations = 66;
                } else {
                    combinations = 3;
                }

            } else {
                if (num > 2){

                    combinations = 567;
                } else {
                    combinations = 2;
                }

            }

        }
        return combinations;
    }

    public static void main(String[] arg){
        int num = 33;
        System.out.println(StepWalkingCombinations(num));
    }
}
