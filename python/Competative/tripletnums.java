public class tripletnums {
    public static void main(String[] args) {
        int[] num = {-1, 0, 1, 2, -1, -4};

        find(num);

    }

    static void find(int [] num){
        for (int i = 0; i < num.length - 2; i++) {

            for (int j = i + 1; j < num.length - 1; j++) {

                for (int k = j + 1; k < num.length; k++) {

                    if((i!=j && i!=k && j!=k) && (num[i]!=num[j] && num[i]!= num[k] && num[j]!=num[k])){
                    if (num[i] + num[j] + num[k] == 0) {
                        
                        System.out.println(num[i] + " " + num[j] + " " + num[k]);
                    }
                }
             }
            }
        }
    }
}
