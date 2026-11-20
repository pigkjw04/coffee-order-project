public class Barista {

    private int price;
    private int coffeeBeans;
    private int cashBox;

    public Barista() {
        price = 3000;
        coffeeBeans = 1;
        cashBox = 0;
    }

    public Barista(int price, int coffeeBeans) {
        this.price = price;
        this.coffeeBeans = coffeeBeans;
        cashBox = 0;
    }

    public int getCoffeePrice() {
        return price;
    }

    public boolean checkCoffee() {
        if (coffeeBeans > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String makeCoffee(String menuName) {
        coffeeBeans = coffeeBeans - 1;

        System.out.println("[바리스타] 제조가 완료되었습니다.");
        System.out.println("[바리스타] 현재 원두는 "
                + coffeeBeans + "개 입니다.");

        return menuName;
    }

    public String takeOrder(String menuName, int payment) {

        if (checkCoffee() == false) {
            System.out.println("[바리스타] 원두가 없어서 주문이 불가능합니다.");
            System.out.println("[바리스타] " + payment + "원을 돌려드립니다.");
            return null;
        }

        cashBox = cashBox + payment;

        System.out.println("[바리스타] 주문을 확인했습니다.");
        System.out.println("[바리스타] 잔고는 "
                + cashBox + "원 입니다.");

        String madeCoffee = makeCoffee(menuName);

        return madeCoffee;
    }
}