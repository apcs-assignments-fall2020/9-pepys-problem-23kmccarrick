public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int count = 0;
        for(int i = 0; i < 10000; i ++){
            if((int)(Math.random() * 6 + 1)==6||(int)(Math.random() * 6 + 1)==6||(int)(Math.random() * 6 + 1)==6||(int)(Math.random() * 6 + 1)==6||(int)(Math.random() * 6 + 1)==6||(int)(Math.random() * 6 + 1)==6)
                count++;
        }
        return (double)count/(double)(10000)*100;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int count = 0;
        int j = 0;
        for(int i = 0; i < 10000; i ++){
            for(int b = 0; b < 12; b++){
                if((int)(Math.random() * 6 + 1)==6)
                    j++;
            }
            if(j>1)
                count++;
            j = 0;
        }
        return (double)count/(double)(10000)*100;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int count = 0;
        int j = 0;
        for(int i = 0; i < 10000; i ++){
            for(int b = 0; b < 18; b++){
                if((int)(Math.random() * 6 + 1)==6)
                    j++;
            }
            if(j>2)
                count++;
            j = 0;
        }
        return (double)count/(double)(10000)*100;
     
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
