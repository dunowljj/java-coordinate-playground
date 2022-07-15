좌표계산기 재구현
=========
# 1. 선 길이
## 1.1. 기능 요구사항
- 사용자가 점에 대한 좌표 정보를 입력하는 메뉴를 구성한다.
- 좌표 정보는 괄호"(", ")"로 둘러쌓여 있으며 쉼표(,)로 x값과 y값을 구분한다.
- X, Y좌표 모두 최대 24까지만 입력할 수 있다.
- 입력 범위를 초과할 경우 에러 문구를 출력하고 다시 입력을 받는다.
- 정상적인 좌표값을 입력한 경우, 해당 좌표에 특수문자를 표시한다.
- 좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정한다. 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
- 직선인 경우는 두 점 사이 거리를 계산해서 출력한다.

## 1.2. 기능 구현목록
- 좌표 정보를 입력받는 기능 o
  - 두 개 입력 가능, 좌표간 '-'로 구분 o
  - (,) 로 둘러싸인 형식을 입력 받는 기능 o 
  - x,y좌표 24까지 입력 제한 o
  - [예외] 범위 초과시 에러 문구 출력 후 다시 입력 o 
  - [예외] 동일한 좌표 입력 시 에러 문구 및 다시 입력 o 
- 입력받은 좌표를 표시하는 기능 o
- 좌표를 두 개 입력한 경우 두 점 사이 거리를 계산하여 출력하는 기능 o

## 1.3. 생각
- 피드백 코드에는 InputView에서 입력값을 처리하여, Point에 좌표만 뽑아 넘겨주는 방식이었는데, view에서 데이터를 처리하고 싶지 않은 마음에 다른 곳에서 처리하도록 구현중이다.
- 우선 Points를 일급컬렉션으로 만들어서 처리해보고 있다. Line을 어플리케이션에 넣어논 상태이며 변경 예정이다. 피드백 코드처럼 깔끔하게 만들도록 노력하자.

# 2. 사각형
## 2.1. 기능 요구 사항
- 사각형 넓이를 구하는 기능
- 직사각형임을 검증
- Figure 인터페이스에서 다형성을 활용하여 Line과 같이 묶기