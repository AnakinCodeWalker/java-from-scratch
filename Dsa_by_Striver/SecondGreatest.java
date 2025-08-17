public  class SecondGreatest{
    public static void main(String[] args) {
        int [] arr = { 1 , 2  } ;
int value = second(arr) ;
if (value == -1 ||  value == Integer.MIN_VALUE){
    System.out.println("not enough unique element in the array");
}
     else  {
    System.out.println("second greatest in the array : "+value);
}
    }
     public static  int second(int[]arr){
    int greatest = Integer.MIN_VALUE ;
    int secondGreatest = Integer.MIN_VALUE ;
   if(arr.length >= 2){
     for(int i= 0 ; i  < arr.length ; i++) {
         if (greatest < arr[i]) {
             secondGreatest = greatest;
             greatest = arr[i];
         } else if (secondGreatest < arr[i] && greatest > arr[i]) {
             secondGreatest = arr[i];
         }
     }
     }else{
        return  -1 ;
    }
   return secondGreatest ;
}
}
