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
- 사용자가 점에 대한 좌표를 입력 받아서 저장
    - 한 개 일때 (X,Y) 저장하는 기능, Dot 생성
    - 두 개 일때 (X,Y)-(X2,Y2) 저장하는 기능
    - [예외] 입력범위 0~24 벗어날 시 예외 던지는 기능
    - [예외] 입력범위 0~24 벗어날 시 다시 입력받는 기능
### 계산
- 직선일 경우 두 점사이 거리를 계산하는 기능
- 해당 좌표에 특수문자 찍는 기능
### 출력
- [출력] 특수문자 찍은 표를 출력하는 기능
- [출력] 계산한 내용 문구와 함께 출력하는 기능
