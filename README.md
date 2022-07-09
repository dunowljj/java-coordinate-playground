# 1. 좌표계산기(선 길이)

## 1.1. 기능 요구사항
- 사용자가 점에 대한 좌표 정보를 입력
- (10,10)-(14,15) 와 같이 입력 X,Y 좌표는 최대 24까지만 입력 가능
- 입력 범위 초과 -> 에러 문구 출력 후 다시 입력
- 정상적인 좌표값 입력 -> 해당 좌표에 특수문자를 표시
- 좌표값 두 개 입력 -> 두 점을 잇는 직선으로 가정한다.


## 1.2. 기능 구현 목록
### 입력
- [입출력] 입력 요구 및 좌표 입력받는 기능 o
- 사용자가 점에 대한 좌표를 입력 받아서 저장 o
    - 한 개 일때 (X,Y) 저장하는 기능, Point 생성 o
    - 두 개 일때 (X,Y)-(X2,Y2) 저장하는 기능, Line 생성 o
    - [예외] 정규표현식으로 잘못된 형식의 입력에 예외 던지는 기능 o
    - [예외] 입력범위 0~24 벗어날 시 예외 던지는 기능 o
    - Point 생성자 부분 리팩터링 고려해보기. 예외처리 클래스를 따로 만들어야할까?
    - [예외] 잘못된 입력(형식, 범위) 시 다시 입력하도록하는 기능 o
### 계산
- 직선일 경우 두 점사이 거리를 계산하는 기능 o
- 해당 좌표에 특수문자 찍는 기능 o
### 출력
- [출력] 특수문자 찍은 표를 출력하는 기능 o
- [출력] 계산한 내용 문구와 함께 출력하는 기능 o

## 수정
### 입력
- 좌표를 개수 상관없이 처리해주도록 변경 (현재 2개 좌표입력시만 처리) o
  - 좌표 입력받는 Points 추가, 여러 개 좌표 입력시 점찍어주는 기능으로 수정 o
  - 좌표가 2개인 경우 직선의 길이를 구해주도록 구현 o
- Line이 생성자로 List<Point>형 변수를 받도록 구현 o
### 생각
- Graph클래스에 그래프 그림 전반을 넣었는데, 너무 복잡하다. 리팩터링이 의미가 있나 싶을 정도. 명명법도 고민이 필요하다.
  - Graph클래스에서 그래프를 생성할때, List<point>형 객체를 매개변수로 받는 형식으로 구현했는데, Line 클래스도 Point 2개를 멤버변수로 받지 말고 고쳐야할까?
  - 상수 처리를 상수의 장점을 못 살린다는 생각이 든다.
- Line의 멤버변수를 Point가 아닌 List로 해야 하는가?