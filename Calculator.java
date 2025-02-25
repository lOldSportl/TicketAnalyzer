public class Calculator {
    static int[] numSplit(int ticketNum) {
        int firstPart = ticketNum % 1000;  
        int secondPart = ticketNum / 1000;
        return new int[] {firstPart, secondPart};
    }

    static int sumDigits(int part) {
        int sum = 0;
        while(part > 0) {
        sum += part % 10; 
        part /= 10;
        }
        return sum;
    }
}
