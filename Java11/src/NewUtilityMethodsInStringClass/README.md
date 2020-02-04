# New Utility Methods In String Class

## Description
- 새로운 String 클래스의 유틸리티 메소드

## Features
- isBlank : boolean 값을 리턴합니다. 빈 문자열 및 공백 만있는 문자열은 공백으로 처리
- lines : 문자열 스트림 반환하며, 이는 모든 서브 스트링을 한 행으로 나눈 것
- strip : 문자열의 양쪽 공백을 없애줌
  - trim과의 차이점 : 유니코드가 발전되기 전에 나온 메소드이기 때문에 발전된 유니코드에 맞추어 사용하려면 strip을 사용해야함
- stripLeading : 문자열의 좌측 공백 제거
- stripTrailing : 문자열의 우측 공백 제거
- repeat : 파라미터만큼 문자열 반복
