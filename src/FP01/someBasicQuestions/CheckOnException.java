package src.FP01.interrrr;

public class CheckOnException {
    public static void main(String[] args) {

        for (int i=0; i< 10; i++) {
//            if(i==4) {
//                throw new ArrayIndexOutOfBoundsException("Testing");
//            }
            try {
                if(i==4) {
                    throw new ArrayIndexOutOfBoundsException("Testing");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println("********"+ "   "+ i);
        }
    }
}
