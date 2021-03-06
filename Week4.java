import java.text.DecimalFormat;

public class Week4 {
    public int max(int num1, int num2) {
        if (num1 >= num2) {
            return num1;
        }
        else {
            return num2;
        }
    }

    private int[] Arr = new int[100];

    public int minArray(int[] arr) {
        if (arr.length > 100 || arr.length == 0) {
            return 0;
        }
        else {
            int minOfArr = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (minOfArr > arr[i]) {
                    minOfArr = arr[i];
                }
            }
            return minOfArr;
        }
    }

    public String caculateIBM(double height, double weight) {
        double IBM = 0.0;
        DecimalFormat decimalFormat = new DecimalFormat("#0.0");

        if (height <= 0 || weight <=0) {
            return  "valid index";
        }
        else {
            IBM = (weight / (height * height));

            if (IBM < 18.50) {
                System.out.println("Thiếu cân");
            }

            if (IBM >= 18.50 && IBM < 22.99) {
                System.out.println("Bình thường");
            }

            if (IBM >= 23 && IBM < 24.99) {
                System.out.println("Thừa cân");
            }

            if (IBM >= 24) {
                System.out.println("Béo phì");
            }

        }

        return decimalFormat.format(IBM);
    }
}

