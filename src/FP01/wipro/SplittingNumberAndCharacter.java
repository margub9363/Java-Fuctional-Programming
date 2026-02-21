package src.FP01.wipro;

/*
given  -> [1,2,a,v,s,f,6,7,d,s,2,k,h,0]
output -> [1,2,6,7,2,0,a,v,s,f,d,s,k,h]
We have to code everything
 */
public class SplittingNumberAndCharacter {
    public static void main(String[] args) {
        Object[] input = new Object[]{1, 2, 'a', 'v', 's', 'f', 6, 7, 'd', 's', 2, 'k', 'h', 0};
        Object[] output = new Object[input.length];

        int count = 0;
        for (int i = 0; i < input.length; i++) {
            try {
                if ((int) input[i] >= 0 && (int) input[i] <= 9) {
                    output[count] = input[i];
                    count++;
                }
            } catch (Exception e) {

            }
        }

        for (int i = 0; i < input.length; i++) {
            try {
                if ((int) (char) input[i] >= 97 && (int) (char) input[i] <= 122) {
                    output[count] = input[i];
                    count++;
                }
            } catch (Exception e) {

            }
        }

        // print data
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
