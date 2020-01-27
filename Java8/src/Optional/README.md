
# Optional

## Decription
- NPE를 처리하기 위한 코드의 가독성을 높이는 역할

## Features
- Optional 객체 생성
  - Optional.empty() : 비어있는 Optional 객체 생성
  - Optional.of(value) : value가 null인 경우 NPE 발생
  - Optional.ofNullable(value) : value가 null인 경우 비어있는 Optional 반환. 값이 null일 수도 있는 것은 해당 메소드 사용

- Optional 중간 처리
  - filter : predicate 값이 거짓이면 필터를 통과할 수 없음
  - map : mapper 함수를 통해 입력값을 다른 값으로 변환
  - flatMap : mapper 함수를 통해 입력값을 다른 값으로 변환. map은 제네릭으로 U를 정의 하였지만, flatMap은 제네릭으로 Optional(U)를 정의
 
- Optional 종단 처리
  - ifPresent 
    - 최종적으로 연산을 끝낸 후 값이 비어있지 않다면 입력값으로 주어짐 
    - 하지만 비어있는 Optional 객체를 받게 되면 ifPresent를 수행하지 않음
  - isPresent
    - 최종적으로 연산을 끝낸 후 객체가 존재하는지 여부 판별
  - get
    - 최종적으로 연산을 끝낸 후 객체를 꺼냄 
    - Optional 객체가 비어있으면 예외 발생
  - orElse
    - 최종적으로 연산을 끝낸 후에도 Optional 객체가 비어있으면 기본값으로 제공할 Supplier함수를 지정
  - orElseThrow
    - 최종적으로 연산을 끝낸 후에도 Optional 객체가 비어있다면 예외 공급자 함수를 통해 예외를 발생시킴
   
- 그 외 Optional 클래스
  - OptionalInt
  - OptionalLong
  - OptionalDouble
  
 
  >- Java9에서 추가된 메소드
  >    - or
  >      - 중간 처리 메소드로 기본값을 제공할 수 있는 공급자 함수를 정의할 수 있음
  >      - 중간에 체이닝을 통해 우선순위를 결정할 수 있음
  >    - ifPresentOrElse
  >      - ifPresent 메소드와 유사해 보이지만 한가지 매개변수를 더 받을 수 있음 
  >      - 첫번째 매개변수 action은 유효한 객체를 받을 경우 실행, 두번째 매개변수 emptyAction은 유효한 객체를 받지 못했을 경우 실행
  >    - stream
  >      - 메서드는 중간 처리 연산자로 기존 자바 8에서 옵셔널 객체가 바로 스트림 객체로 전환 되지 않아 불편했던 부분을 해소

  >- Java10에서 추가된 메소드
  >    - orElseThrow
  >      - 매개변수가 필요없는 예외 메소드