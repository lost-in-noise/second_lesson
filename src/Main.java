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
        System.out.println(courseName.replace('M',  'S'));
    }
}

