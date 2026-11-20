public class Customer {

    private int money;
    private boolean hasCoffee;

    public Customer() {
        money = 10000;
        hasCoffee = false;
    }

    public Customer(int money, boolean hasCoffee) {
        this.money = money;
        this.hasCoffee = hasCoffee;
    }

    public int pay(int amount) {

        if (money < amount) {
            return -9;
        }

        money = money - amount;
        return 0;
    }

    public void order(Barista barista, String menuName) {

        System.out.println("[손님] " + menuName + " 한 잔 주세요.");

        int price = barista.getCoffeePrice();

        System.out.println("[바리스타] 커피 가격은 "
                + price + "원 입니다.");

        int paymentCheck = pay(price);

        if (paymentCheck == -9) {
            System.out.println("[손님] 돈이 부족합니다.");
            return;
        }

        System.out.println("[손님] " + price + "원을 지불했습니다.");

        String coffee = barista.takeOrder(menuName, price);

        if (coffee == null) {
            money = money + price;

            System.out.println("[손님] 환불받았습니다.");
            System.out.println("[손님] 현재 잔액은 "
                    + money + "원 입니다.");
            return;
        }

        takeCoffee(coffee);
    }

    public void takeCoffee(String coffee) {

        hasCoffee = true;

        System.out.println("[손님] " + coffee + "를 받았습니다.");
        System.out.println("[손님] 현재 잔액은 "
                + money + "원 입니다.");
    }
}