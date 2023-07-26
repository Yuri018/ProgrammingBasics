public class homeWork07 {
    public static void main(String[] args) {

        //Task 1
        int startNum = 1;
        int num = 5;
        while (startNum <= num) {
            //int cubeNum = startNum * startNum * startNum;
            int cubeNum = (int) Math.pow(startNum, 3);
            System.out.println(startNum + " в кубе = " + cubeNum);
            startNum++;
        }
        System.out.println("-------------------");

        //Task 2
        int multiplier = 0;
        int n1 = 3;
        int n2 = 5;
        while (multiplier <= n2) {
            System.out.println(n1 + " * " + multiplier + " = " + n1 * multiplier);
            multiplier++;
        }
    }
}
