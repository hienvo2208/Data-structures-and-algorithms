public class Main {

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int j =0;
        for(int i=0;i<n-1;i++){
            if(nums[i] != nums[i+1]){
                temp[j]=nums[i];
                j++;
            }
        }
        temp[j] = nums[n-1];
        for(int i=0;i< nums.length;i++){
            if(i<=j){
                nums[i]=temp[i];
            }else{
                nums[i]=nums[nums.length-1];
            }
        }
       return j+1;

    }

    public static void main (String[] args)
    {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(arr);
        // Print updated array
        for (int i=0; i<args.length; i++)
            System.out.print(arr[i]+" ");
    }
}
