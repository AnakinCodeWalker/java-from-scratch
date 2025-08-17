//1672. Richest Customer Wealth (leet-Code question)
// note on how to perform the sum of all number of 2D matrix
// using a variable inside a loop so it can be reinitialized by 0 again and again for every new customer.
public class RichestCustomerWealth {
    public static void main(String[] args) {
        //accounts = [[1,2,3],[3,2,1]]
                      // 1      2  --> array number.
        // output = 6 ;
    }
    public int maximumWealth(int[][] accounts) {

        int maxSum = Integer.MIN_VALUE;
for(int customer = 0 ; customer < accounts.length ;customer++){ //customer is row / number of array
    //for  every column  in each row

    int sum = 0 ; // define sum here because for every customer it needs to be 0 ,
    // each time the loop iterates the sum will be reinitialized.
    for(int account = 0 ; account < accounts[customer].length ; account++){
// now return the  sum of person account  with Highest money in it.
        // now perform sum for each column and compare with current sum.

    sum +=  accounts[customer][account];
//    sum = sum+arr[row][column]
    }
if(sum > maxSum){
    maxSum = sum ;
}
}
  return maxSum ;
    }
}
