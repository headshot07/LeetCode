package main;

public class GrumpyBookstoreOwner {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int satisfied = 0;// Total satisfied without using power.
        for(int i=0;i<n;i++){
            if(grumpy[i]==0)
                satisfied += customers[i];
        }

        int maxSum = 0;
        int currSum = 0;
        int winStart = 0;

        for(int winEnd = 0; winEnd < n; winEnd++){
            if(grumpy[winEnd]==1)
                currSum += customers[winEnd];

            if(winEnd - winStart + 1 == minutes){//Minutes == Window ka Size.
                maxSum = Math.max(maxSum,currSum);//Iss window me hum kitne 1 ko 0 krke maximum
                //customers ko satisfied krr paye.
                if(grumpy[winStart]==1)
                    currSum -= customers[winStart];
                winStart++;
            }
        }
        return satisfied + maxSum;
    }
}

