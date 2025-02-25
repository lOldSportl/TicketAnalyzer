class Calculator {
    int[] numSplit(int ticketNum) {
        int firstPart = ticketNum % 1000;  
        int secondPart = ticketNum / 1000;
        return new int[] {firstPart, secondPart};
    }

    int sumDigits(int part) {
        int sum = 0;
        while(part > 0) {
        sum += part % 10; 
        part /= 10;
        }
        return sum;
    }

    void luckyNumber() {
    for(int ticketNum = 1001; ticketNum < 1000000; ticketNum++) {
        NumPrinter print = new NumPrinter();
        int[] parts = numSplit(ticketNum);
        if(Integer.compare(sumDigits(parts[0]), sumDigits(parts[1])) == 0) {
            print.printNum(ticketNum);
            }
        }
    }
}
