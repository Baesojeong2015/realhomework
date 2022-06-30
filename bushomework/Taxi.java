class Taxi {
    int taxiNumber; //택시번호
    int oilVolume;  //주유량
    int nowSpeed = 50; //현재속도
    int destination; //목적지
    int basicDistance =5; //기본거리
    int distanceToDestination; //목적지까지 거리
    int basicPrice = 3500; //기본요금
    int pricePerDistance = 300; //거리당 요금
    String taxiCondition = "일반"; //상태


    //생성자
    Taxi() {
        this.taxiNumber = (int) (Math.random() * 10000 * 1);
         System.out.println("택시번호: " + taxiNumber);
    }
    
    //주유량확인, 운행 상태 확인
   boolean driving(int oilVolume){
         if(oilVolume >= 10){
             System.out.println("[운행 가능]");
             return true;
         } else{
             System.out.println("[운행 불가]");
             return false;
         }
    }
    
    //승객 탑승
    boolean getInTaxi() {
         if( taxiCondition == "일반"){
             System.out.println(taxiCondition = "운행 중");
         } else{
             System.out.println(taxiCondition = "탑승 불가");
         }
         return false;
    }
    
    //속도변경
    void newSpeed(int changeSpeed){
         if(taxiCondition == "운행 중"){
             System.out.println("현재 속도는 " + nowSpeed + "입니다.");
             nowSpeed = nowSpeed + changeSpeed;
             System.out.println("변경된 속도는 " + nowSpeed + "입니다.");
         }
    }
    
    //요금추가
    int addPrice(int distanceToDestination){
         this.distanceToDestination = distanceToDestination;
         if(distanceToDestination > basicDistance){
             basicPrice = basicPrice + (distanceToDestination - basicDistance) * pricePerDistance;
         } else{
             System.out.println("요금은 " + basicPrice + "원입니다.");
             return basicPrice;
         }
        System.out.println("추가 요금이 붙어 총 요금은 " + basicPrice + "원입니다.");
        return destination;

    }


}
