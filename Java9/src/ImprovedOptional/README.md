# Improved Optinal

## Decription
- Optional에 메소드 추가

## Features
- or
  - 중간 처리 메소드로 기본값을 제공할 수 있는 공급자 함수를 정의할 수 있음
  - 중간에 체이닝을 통해 우선순위를 결정할 수 있음
- ifPresentOrElse
  - ifPresent 메소드와 유사해 보이지만 한가지 매개변수를 더 받을 수 있음
  - 첫번째 매개변수 action은 유효한 객체를 받을 경우 실행, 두번째 매개변수
  - emptyAction은 유효한 객체를 받지 못했을 경우 실행
 - stream
   - 메서드는 중간 처리 연산자로 기존 자바 8에서 옵셔널 객체가 바로 스트림 객체로 전환 되지 않아 불편했던 부분을 해소
