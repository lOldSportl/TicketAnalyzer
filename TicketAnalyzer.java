public class TicketAnalyzer {
    public static void main(String args[]) {
        int z = 0;
        for(int ticketNum = 1001; ticketNum < 1000000; ticketNum++) {
            int[] parts = Calculator.numSplit(ticketNum);
            if(Integer.compare(Calculator.sumDigits(parts[0]), Calculator.sumDigits(parts[1])) == 0) {
                z++;
                NumPrinter.printNum(ticketNum, z);
            }
        }
    }

}
