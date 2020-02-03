# Local-Variable Type Inference

## Decription
- 지역 변수 선언을 var 를 이용하여 컴파일러가 타입을 추론할 수 있음

## Features
- 조건
  - 초기화된 지역 변수 선언 시 
  - 반복문에서 지역 변수 선언 시
- Diamond Operator안에 타입을 넣지 않을 경우 ArrayList<Object>로 추론
- 람다식, 제네릭스, 다이아몬드 연산자에선 이미 타입추론을 하고 있기 때문에, var에 대입하면 추론이 실패될 수 있음