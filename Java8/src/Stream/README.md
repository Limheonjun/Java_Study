# Method Reference

## Decription
- 자료구조들을 선언적으로 다루는 역할. 연산을 위한 객체

## Features
- 중간 연산 메소드 : 스트림을 반환하여 메소드 체이닝이 가능하도록 함
>- Stream<R>map(Function<A,R>)
>- Stream<T>filter(Predicate<T>)
>- Stream<T>peek(Consumer<T>)

- 최종 연산 메소드 : 스트림이 아닌 값을 반환하여 메소드 체이닝을 종료시킴
>-R collect(Collector)
>-void forEach(Consumer<T>)
>-Optional<T> reduce(BinaryOperator<T>)
>-boolean allMatch(Predicate<T>)
>-boolean anyMath(Predicate<T>)

- 최종 연산 메소드가 없으면 중간 연산 메소드로만 이루어진 체이닝은 실행되지 않음
- 기본형 스트림 사용시 Boxing비용을 줄일 수 있으며, 해당 타입에 맞는 연산들을 메소드로 제공함
- 스트림과 기본형 스트림은 관계가 없기 때문에 타입변환이 되질 않음.