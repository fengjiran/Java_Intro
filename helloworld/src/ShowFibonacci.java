public class ShowFibonacci {
    public static void main(String[] args) {
        int len = Integer.parseInt(args[0]);
        int tmp1 = 1;
        int tmp2 = 1;
        int tmp;

        System.out.print(tmp1 + "、");
        System.out.print(tmp2 + "、");

        for (int i = 2; i < len; i++) {
            tmp = tmp2;
            tmp2 = tmp1 + tmp2;
            tmp1 = tmp;
            if (i == len - 1)
                System.out.print(tmp2);
            else
                System.out.print(tmp2 + "、");
        }
    }
}
