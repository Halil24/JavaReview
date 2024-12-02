public class TestStock {
    public static void main(String[]args){
        Stock st1=new Stock("ORCL","Oracle Coorporation");
        st1.setPreviousClosingPrice(34.5);
        st1.setCurrentPrice(34.35);

        System.out.printf("Change percentage: %.3f",st1.getChangePercent());
    }
}
