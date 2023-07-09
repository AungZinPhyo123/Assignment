package Chapter_2_control_flows;

public class Chapter_2 {
    public static void main(String[] args) {
        // Arithmatic operator;
        System.out.println("Arithmatic Chapter_2_control_flows.Chapter_2.Operator");

        int b = 3;
        int c = 4;
        System.out.println(b + c);
        System.out.println(b - c);
        System.out.println(b * c);
        System.out.println(b / c);
        System.out.println(b % c);
        System.out.println();
        System.out.println("Comparision Chapter_2_control_flows.Chapter_2.Operator");
        // Comparision operator;
        int a = 5 + 6;
        boolean result = 3 > 4;
        System.out.println();
        // Logi cal operator
        // Same true display true;
        // Same false display false;
        // Same 1 1 = 0;
        // Same 0 0 = 0;
        // Not same 1 0 = 1;
        // Not same 0 1 = 1;
        System.out.println("Logical Chapter_2_control_flows.Chapter_2.Operator");

        boolean result1 = 3>5&&5<10;
        System.out.println(result1);
        boolean result2 = true ^ true;
        System.out.println(result1);
        System.out.println();
        System.out.println("Bitwise op");
        // Bitwise operator;
        // Same true display true;
        // Same false display false;
        // Same 1 1 = 0;
        // Same 0 0 = 0;
        // Not same 1 0 = 1;
        // Not same 0 1 = 1;
        boolean result0 = true | false;
        System.out.println(result0);
        System.out.println();
        // Shift operator;
        System.out.println("Shift op");
        int result3 = 4 << 2;
        System.out.println(result3);
        int result4 = 10 >> 2;
        System.out.println(result4);
        System.out.println();
        // Assignment operator;
        System.out.println("Assignment operator");
        int abc = 7;
        abc += 6;
        System.out.println(abc);
        abc -= 2;
        System.out.println(abc); // 11
        abc *= 3;
        System.out.println(abc); // 33
        abc /= 5;
        System.out.println(abc);
        int abcd = (3>4)?3:4;
        boolean blah = (34<300)?false:false;
        System.out.println(blah);
        int number = 88;
        int number2 = number++;
        System.out.println(number2);
    }

    public static class Operator {
        public static void main(String[] args) {
            // Arithmetic operator;
            int a = 5;
            int b = 6;
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);

            // Comparision operator;
            boolean condition = true;
            int c = 2;
            int d = 3;
            boolean conds = a < b;
            System.out.println(conds);

            //logical operator;
            //Same true display true;
            //       // Same false display false;
            //       // Same 1 1 = 0
            //       //      0 0 = 0
            //       // Not same 0 1 = 1
            //       //          1 0 = 1
            boolean result = 3 < 5 && 6 > 12;
            System.out.println(result);
            // Bitwise;
            // Same true display true;
            // Same false display false;
            // Same 1 1 = 0
            //      0 0 = 0
            // Not same 0 1 = 1
            //          1 0 = 1
            boolean result2 = true|false;
            System.out.println(result2);

            // Shift;
            int results3 = 10 >> 3;
            System.out.println(results3);
            int result4 = 10 >> 3;
            System.out.println(result4);

            // Assignmant oprerator;
            int abc = 7;
            abc += 6;
            System.out.println(abc);

            abc -= 2;
            System.out.println(abc);

            abc *= 3;
            System.out.println(abc);

            abc /= 5;
            System.out.println(abc);

            // Unary operator;
            int num = 31;
            int num2 = ++num;
            System.out.println(num2);


            // Ternary operator;
            int f = (3 > 4) ? 3 : 4;
            Object blah = (34 < 300) ? false : true;
            System.out.println(blah);
        }
    }
}
