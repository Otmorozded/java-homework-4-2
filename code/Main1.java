public class Main1 {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        float index = service.calculate(70, 175);
        System.out.println(index);

    }
}


