// code is not correct

/*

third = second;
second = first;
first = arr[i];
That would only work if you're updating all three in one go, and you're
* sure the current element is bigger than all three.
But in the loop, you're checking one condition at a time — and only
* updating when needed.
* So that shortcut doesn't apply safely in all cases.
*
* "We write third = second; second = first; when we are sure the previous
*  value is bigger than the current one, and we want
*  to update them in one place."
* */
public class ThridGreatest {
    public static void main(String[]args){
ThridGreatest object = new ThridGreatest() ;
int [] arr ={1,2,2,5,3,5} ;
//int [] arr = new int[] ;

int value = object.thirdMax(arr);
        System.out.println(value);
    }
    public int thirdMax(int[] nums) {
        int greatest = Integer.MIN_VALUE ;
        int sGreatest = Integer.MIN_VALUE ;
        int tGreatest = Integer.MIN_VALUE ;
        boolean ifFound = false ;
for(int i = 0 ; i<nums.length ; i++){
if(nums[i] ==greatest || nums[i]==sGreatest || nums[i]==tGreatest){
    continue;
}
    if (greatest< nums[i]){
        tGreatest = sGreatest ;
        sGreatest = greatest ;
        greatest = nums[i];
    } else if (sGreatest < nums[i]&& greatest > nums[i]) {
        tGreatest = sGreatest ;
        sGreatest = nums[i] ;

    } else if (tGreatest < nums[i]&& sGreatest > nums[i]) {
        tGreatest = nums[i];
        ifFound = true ;

    }


}
        if (ifFound){
         return tGreatest ;
           }else{
               return  greatest ;
           }
    }
}
