# Functional Interface

## Decription
- 하나의 추상 메소드로 이루어진 인터페이스

## Features
- @FunctionalInterface 애노테이션으로 표시
- Runnable : 스레드 생성시 사용
- Supplier<ReturnType> : 파라미터는 없고 리턴값만 존재. 
- Consumer<ParamType> : 리턴값은 없고 파라미터만 존재
- Function<ParamType,ReturnType> : 하나의 파라미터와 리턴값을 가짐. 제네릭으로 지정 가능
- Predicate<ParamType> : 하나의 파라미터와 리턴값을 가짐. Function과 다르게 리턴타입을 지정하지 않음. 반환타입은 boolean으로 고정되어 있으며 Function<T, Boolean>형태라고도 할 수 있음
- UnaryOperator<Param&ReturnType> : 하나의 파라미터와 리턴값을 가짐. 파라미터와 리턴타입이 같아야함
- BinaryOperator<Param&ReturnType> : 두개의 파라미터와 리턴값을 가짐. 파라미터와 리턴타입이 같아야함
- BiPredicate<ParamType,ParamType> : 두개의 파라미터와 리턴값을 가짐. 파라미터의 타입은 다를 수 있으며 리턴타입은 boolean임
- BiConsumer<ParamType,ParamType> : 리턴값은 없고 두개의 파라미터만 존재
- BiFunction<ParamType,ParamType,ReturnType> : 두개의 파라티머와 리턴값을 가짐
- Comparator<ParamType> : 리턴값은 없고 파라미터만 존재. 객체간의 우선순위 비교시 사용