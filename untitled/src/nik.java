import java.util.HashSet;

public class nik {

    public static int hash(int num) {
        int res = -1;
        int i = 0;

        int[] resArr = new int[10];
        do {
            resArr[i] = num % 10;
            num /= 10;
            i++;
        }while (num != 0);

        for (int val : resArr){
            int v1 = val;
            v1 +=2;

            int mod = val % (v1==0 ? v1+1 : v1);

            res = res + val*v1+mod * Math.floorDiv(i,2);

        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(hash(123));
        System.out.println(hash(125));
        System.out.println(hash(126));
        System.out.println(hash(123));

        HashSet result = new HashSet();

        double p=0;
        for (int b= -25000000; b <= 25000000; b++){
            if (b%10000==0){
                p+=0.02;
                System.out.println(p);
            }
             int h=hash(b);
            System.out.print(b);
            System.out.print(" ");
            System.out.println(h);
            if (result.contains(h)){
                System.out.print("Взломано ");
                System.out.print(b);
                System.out.print(" ");
                System.out.println(h);
            }else result.add(h);
        }
    }

}
