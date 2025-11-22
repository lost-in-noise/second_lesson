public class Main {
    public static void main(String[] args) {
//        Logical Operators
        int num1 = 5;
        int num2 = 10;
        boolean a = (num1 >= 6 && num2 == 10);

        System.out.println(a);

//        String Methods
        String courseName = "Manual Testing";
        System.out.println(courseName.length());
        System.out.println(courseName.toLowerCase());
        System.out.println(courseName.toUpperCase());
        System.out.println(courseName.indexOf("e"));
        System.out.println(courseName.charAt(3));
        System.out.println(courseName.contains("s"));
        System.out.println(courseName.replace('M', 'S'));


        //Java String Concatenation
        String firstLetters = "Man";
        String lastLetters = "go";
        System.out.println(firstLetters.concat(lastLetters));

//        Comparison operators
        String name1 = "Nino";
        String name2 = "Nino";
        System.out.println(name1.equals(name2));

//        Java Math Class
        int b = 5;
        int c = 10;
        int d = 16;
        int minNum = Math.min(b,c);
        System.out.println(minNum);
        int maxNum = Math.max(b, c);
        System.out.println(maxNum);
        System.out.println(Math.sqrt(d));

        System.out.println((int)(Math.random() * 100));
    }
}

