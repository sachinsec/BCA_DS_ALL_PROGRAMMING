public class array_shorting {
    public static void main(String[] args) {
        System.out.println("Hello shorting");
        int [] arr={9,33,7,6,18};

        for(int i = 0 ; i<arr.length;i++){
            int temp=0;
            for(int j= 0 ; j<arr.length;j++){
                if (arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
