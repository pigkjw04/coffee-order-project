public class Main {

    public static void main(String[] args) {

        Barista barista = new Barista(3000, 1);

        Customer customer = new Customer(10000, false);

        System.out.println("=== 시나리오 1: 정상 주문 ===");

        customer.order(barista, "아메리카노");

        System.out.println();

        System.out.println("=== 시나리오 2: 재고 부족 ===");

        customer.order(barista, "아메리카노");
    }
}