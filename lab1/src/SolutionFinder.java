public class SolutionFinder {
    public static void main(String[] args) {
        double a = 4 , b = 8, c = 3;
        double Cal_x1 = (-b + (Math.sqrt(Math.pow(b, 2) - 4*a*c))) / (2*a);
        double Cal_x2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4*a*c))) / (2*a);

        System.out.println(Cal_x1);
        System.out.println(Cal_x2);
    }
}
