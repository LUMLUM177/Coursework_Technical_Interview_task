public class Main {
    public static void main(String[] args) {

        try{
            throw new CustomException("It's exception");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }
}