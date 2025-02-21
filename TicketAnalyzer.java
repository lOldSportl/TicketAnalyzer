public class TicketAnalyzer {
    public static void main(String args[]) {
        for(int ticketNum = 1001; ticketNum < 1000000; ticketNum++) {
            int[] parts = numSplit(ticketNum);
            if(Integer.compare(parts[0], parts[1]) == 0) {
                printNum(ticketNum);
            }
        }
    }

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

    static void  printNum(int ticketNum) {
        System.out.println(ticketNum); 
    }
}
