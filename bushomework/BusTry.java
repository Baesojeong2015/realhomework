public class BusTry {
    public static void main(String[] args) {
        Bus bus = new Bus();

        System.out.println("[" + bus.busCondition + "]");
        bus.getInBus(5);
        System.out.println("1인당 요금은 "+ bus.price + "원입니다.");
        bus.driving();
        System.out.println("현재 속도는 "+ bus.nowSpeed + "입니다.");
        bus.newSpeed(10);


        System.out.println("[" + bus.busCondition + "]");
        bus.getInBus(2);
        System.out.println("1인당 요금은 "+ bus.price + "원입니다.");
        bus.driving();
        System.out.println("현재 속도는 "+ bus.nowSpeed + "입니다.");
        bus.newSpeed(20);


    }
}
