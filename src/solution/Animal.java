package solution;

public class Animal extends Handle {

    @Override
    public void solute() {
        int n = 1;
        // 公鸡的数量为a
        for(int a = 0; a < 21; a++) {// 如果有21只公鸡就会超过100块
            // 母鸡的数量为b
            for(int b = 0; b < 34; b++) {// 如果有34只母鸡也会超过100块
                // 小鸡的数量为c
                for (int c = 0; c < 100; c++) {
                    if((15 * a) + (9 * b) + (c) == 300// 因为小鸡的价格是无限小数，所以这里统一乘以3，判断总价相加等于300
                            && ((a + b + c) == 100)) {//  判断总数相机等于100
                        System.out.println("第" + n + "种");
                        System.out.println("5块钱的公鸡:" + a);
                        System.out.println("3块钱的母鸡:" + b);
                        System.out.println("1块3只的小鸡:" + c);
                        n++;
                    }
                }
            }
        }
    }
}
