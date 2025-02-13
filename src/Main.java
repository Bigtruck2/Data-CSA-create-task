public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.repopulate();
        System.out.println(data.countIncreasingCols());
    }
}