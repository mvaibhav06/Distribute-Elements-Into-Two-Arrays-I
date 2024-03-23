import java.util.Arrays;

public class DistributeArray {
    public static int[] resultArray(int[] nums) {
        int len = nums.length;

        int[] a = new int[len];
        int[] b = new int[len];
        int[] out = new int[len];

        int i = 0;
        int j = 0;
        int k = 0;
        a[j++] = nums[i++];
        b[k++] = nums[i++];

        while(i < len){
            if(a[j-1] > b[k-1]){
                a[j++] = nums[i++];
            }else{
                b[k++] = nums[i++];
            }
        }

        int p = 0;
        while(p < j){
            out[p] = a[p];
            p++;
        }
        int q = 0;
        while(q < k){
            out[p] = b[q];
            p++;
            q++;
        }
        return out;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,3};
        System.out.println(Arrays.toString(resultArray(nums)));
    }
}
