# Annotation

## Decription
- 소스코드에 작성된 애노테이션을 통해 자동으로 코드를 생성해주어, 반복적인 코드 작성을 방지

## Features
- 선언적 프로그래밍을 가능하게 함
- 비즈니스 로직에는 영향을 주지 않고 해당 타겟의 연결 방법이나 소스코드의 구조를 변경할 수 있음
- @Target, @Retention과 같은 메타 애노테이션을 통해 커스텀 애노테이션을 만들 수 있음

## Default Annotation
- @Override
  * 선언한 메서드가 오버라이드 되어있다는 것을 표현
  * 상위 클래스에서 해당 메소드를 찾을 수 없으면 에러 발생

- @Deprecated
  * 해당 메소드를 더 이상 사용하지 않음을 표시
  * 만약 사용할 경우 경고 발생

- @SuppressWarnings
  * 선언한 곳의 컴파일 경고를 무시함

- @SafeVarargs
  * Java7부터 지원, 제네릭 같은 가변인자의 매개변수를 사용할때 경고 무시

- @FunctionalInterface
  * Java8부터 지원, 함수형 인터페이스를 지정
  * 메소드가 없거나, default메소드를 제외한 한개 이상의 메소드가 존재할 경우 오류 발생

## Meta Annotation
- @Retention
  * 자바 컴파일러가 애노테이션을 다루는 방법을 기술, 특정 시점까지 영향을 미치는지를 결정
  * 종류
    * RetentionPolicy.SOURCE : 컴파일 전까지만 유효. (컴파일 이후에는 사라짐)
    * RetentionPolicy.CLASS : 컴파일러가 클래스를 참조할 때까지 유효.
    * RetentionPolicy.RUNTIME : 컴파일 이후에도 JVM에 의해 계속 참조가 가능. (리플렉션 사용)

- @Target
  * 애노테이션이 적용할 위치 지정
  * 종류
    * ElementType.PACKAGE : 패키지 선언
    * ElementType.TYPE : 타입 선언
    * ElementType.ANNOTATION_TYPE : 어노테이션 타입 선언
    * ElementType.CONSTRUCTOR : 생성자 선언
    * ElementType.FIELD : 멤버 변수 선언
    * ElementType.LOCAL_VARIABLE : 지역 변수 선언
    * ElementType.METHOD : 메서드 선언
    * ElementType.PARAMETER : 전달인자 선언
    * ElementType.TYPE_PARAMETER : 전달인자 타입 선언
    * ElementType.TYPE_USE : 타입 선언

- @Documented
  * 해당 애노테이션을 Javadoc에 포함시킴

- @Inherited
  * 애노테이션의 상속을 가능하게 함

- @Documented
  * Java8부터 지원, 연속적으로 애노테이션을 선언할 수 있도록 함
