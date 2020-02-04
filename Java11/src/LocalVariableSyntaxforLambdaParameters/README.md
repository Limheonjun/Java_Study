# Local Variable Syntax for Lambda Parameters

## Decription
- var 를 람다 표현식에 쓰는 경우에 전달되는 파라미터들의 타입을 추론할 수 있음

## Features
- 기존 파라미터에 var 키워드만 추가하는 것으로 달라진점은 타입에 붙일 수 있는 애노테이션을 사용할 수 있음
- 파라미터에 var타입을 생략할 수 없음
- 다른 타입과 var를 함께 사용할 수 없음
- 람다식에서 파라미터타입으로 var을 받는 경우엔 타입을 생략할 수 없음