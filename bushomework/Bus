class Bus {
    //  필드
    int maxPassengerNumber = 12; // 최대 승객수
    int nowPassengerNumber = 0; // 현재 승객수
    int price = 1500; //요금
    int busNumber; // 버스 번호
    int oilVolume = 13; // 주유량;
    int nowSpeed = 50; // 현재 속도
    int changeSpeed; //바뀐속도;
    String busCondition = "운행"; // 버스 상태


    //  생성자
    Bus() {
        this.busNumber = (int) (Math.random() * 10000 + 1);
        System.out.println("버스번호:" + busNumber);
    }

    //  주유량 10이상인지 아닌지
    boolean oilHave() {
        return oilVolume >= 10;
    }

    // 승객 탑승 가능 수
    boolean ableGetInBus() {
        return nowPassengerNumber <= maxPassengerNumber;
    }

    // 주유상태 체크, 버스 상태 변경
    boolean driving() {
        if (oilHave()) {
            System.out.println("주유량 " + oilVolume + "이며 운행 중입니다.");
            oilVolume -= 1;
            return true;
        }

        if (!oilHave()) {
            System.out.println("주유가 필요합니다.");
            busCondition = "차고지행";
        }
        return true;
    }

    // 속도 변경
    int newSpeed(int changeSpeed) {
        this.changeSpeed = changeSpeed;

        if (oilHave()) {
            nowSpeed += changeSpeed;

            System.out.println("속도가 " + nowSpeed + "로 변경되었습니다.");
        }
        if (!oilHave()) {
            System.out.println("속도가 0입니다.");
        }
        return nowSpeed;
    }

    // 승객 탑승
    int getInBus(int passenger) {
        nowPassengerNumber += passenger;
        while (ableGetInBus()) {
            if (busCondition == "운행") {
                System.out.println( passenger + "명의 승객이 탑승했습니다. " + "현재 승객 수는 " + nowPassengerNumber + "명입니다.");
            }
            break;
        }
        if (!ableGetInBus()) {
            System.out.println(nowPassengerNumber - maxPassengerNumber + "명이 초과되어 새로운 승객은 탑승할 수 없습니다.");
        }
        return nowPassengerNumber;
    }

}
