package entities;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    static List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> list = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(isSelfDivide(i)){
                list.add(i);
            }
        }
        return list;
    }
    static boolean isSelfDivide(int num){
        int temp = num;
        while(temp > 0){
            int digit = temp % 10;
            temp /= 10;
            if(digit == 0 || num % digit != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(40, 89).toString());
    }
}