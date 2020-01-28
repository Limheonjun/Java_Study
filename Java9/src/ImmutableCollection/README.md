# Immutable Collection

## Decription
- 컬렉션이 생성된 후에 변경되기를 원하지 않는 경우에 사용하며, 의도치 않은 컬렉션 변경을 예방에 도움이 됨

## Features
- 아이템 추가, 수정, 제거가 불가능
- Java8까지는 Arrays API, Stream API, Guava 라이브러리 등을 이용하여 불변 컬렉션을 생성하였음
- List
  - of 메소드를 통해 불변 컬렉션 생성 가능
  - of 메소드 안에 인자를 넘기지 않으면 비어있는 불변 컬렉션 생성
- Set
  - of 메소드를 통해 불변 컬렉션 생성 가능
  - of 메소드 안에 중복 인자를 넘기면 IllegalArgumentException 발생
- Map
  - of 메소드를 통해 불변 컬렉션 생성 가능(키와 값을 번갈아 넘김)
  - ofEntries 메소드를 통해 키와 값을 묶어서 넘김
