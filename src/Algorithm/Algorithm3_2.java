package Algorithm;

public class Algorithm3_2 {
    public static void main(String[] args) {
        int[] a = {3,6,2};

        int max = a[0];
        if(a[1]>max) max = a[1];
        if(a[2]>max) max = a[2];

        System.out.println(max);

        int[] a_ = {7,5,43,2,21,4,5,6,215,123,12,1,234,523,232345,3};

        max = a_[0];
        for(int i=0; i<a_.length; i++){
            if(a_[i]>max) max = a_[i];
        }

        System.out.println(max);
    }
}
