public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int summands = Integer.parseInt(args[0]);
        int i = 0;
        while (i < summands) {
            if (i % 2 == 0) {
                approxPi += 1.0/(2*i + 1);
            } else {
                approxPi -= 1.0/(2*i + 1);
            }
            i += 1;
        }
        approxPi *= 4;
        System.out.println(approxPi + " " + actualPi);
    }
}
