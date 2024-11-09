package src.FP01.persistent;

import java.util.LinkedList;
import java.util.List;

public class P2 {
    public static void main(String[] args) {

        List<Integer> inputList = new LinkedList<>();
        inputList.add(10);
        inputList.add(101);
        inputList.add(1011);
        inputList.add(10111);

    }

    class LinkedListOperation {
        private int value;
        private int address;
    }
}
