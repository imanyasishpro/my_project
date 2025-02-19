class FirstClass {

    public static void main(String[] args) {

        int i = 1;
        int count = 0;

        while (i <= 20) {
            i++;
            if((i % 2) == 0) {
                System.out.println("Even number " + i);
                count++;
            }

            if (count == 5) {
                System.out.println("5 even numbers found");
                break;
            }
        }
    }
}