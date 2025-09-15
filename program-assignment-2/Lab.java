public class Lab {
    public static void main(String[] args) {
        String course = "is-5103";
        System.out.println(course);

        int[] lab = {20, 20, 20, 20, 20, 20, 20, 20, 20, 20};
        int sum = 0;

        for (int i = 0; i < lab.length; ++i) {
            System.out.println("Lesson " + (i + 1) + " Lab: " + lab[i]);
            sum += lab[i];
        }

        double avg = (double) sum / lab.length;
        System.out.println("lab average: " + avg);
    }
}
