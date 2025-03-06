public class Main {
    public static int sumArray(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum +=num;
        }
        return sum;
    }
        
       
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        System.out.println("The sum array = "+sumArray(arr));
    }
}