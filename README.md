# 1. 연료 주입
## 1.1. 기능 요구사항
- 렌터카 회사. 현재 보유 차랑 Sonata 2, Anvante 1, K5 2 -> 총 5대
- 고객이 예약시 대략적인 이동거리를 입력받고, 이것을 이용해 차량 별로 필요한 연료 주입
- 각 연비
  * Sonata : 10km/리터
  * Avante : 15km/리터
  * K5 : 13km/리터
  
## 1.2. 프로그래밍 요구사항 1
- 상속과 추상메소드 활용
- if/else 없이 구현
- 테스트 주어짐
- 메서드 이름 주어짐

## 1.3. 기능 구현 목록 1
- 팩토리 메서드로 RentCompany 만들기
  - 거리를 등록하는 기능 -> addCar(new 차종(거리));
  - report 생성하는 기능 구현 -> 차량별로 ` "차종 : x리터"+ 개행 `
- 상속 활용해서 차량들 추상화



## 1.4. 프로그래밍 요구사항 2
- 인터페이스 사용

## 1.5. 기능 구현 목록 2
- 새 패키지에 인터페이스로 변경해보기