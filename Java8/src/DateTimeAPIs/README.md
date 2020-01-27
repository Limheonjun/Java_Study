# Date / Time APIs

## Decription
- 

## Features
- LocalDate, LocalTime, LocalDateTime 세가지 시간 관리 클래스가 있음
- 날짜 조정 연산을 직관적으로 가능
- Duration
  - 시간 단위로 간격을 표현
  - LocalTime, LocalDateTime, Instant 사용 가능
  - LocalDate는 시간 단위로 표현할 수 없기 때문에 사용 불가

- Period
  - 날짜 단위로 간격을 표현
  - LocalDate를 사용할 수 있음
  - 섬머타임을 바탕으로 간격을 표현하려면 Period를 사용해야함

- Time Parsing and Formatting
  - 기존 SimpleDateFormat과 같이 문자열에서 날짜를 parse나 날짜 객체를 format하여 출력하는 기능 역시 수행 가능

- 특정 시간대 적용
  - 기존에는 TimeZone 클래스가 그 역할을 하였음
  - 새 API로는 ZoneId 클래스가 등장
  - ZoneId를 사용하면 시간대 변경 시 섬머타임과 같은 문제에 대해 고려할 필요가 없음

- Java8의 API는 하위 호환성을 위해 Calendar, Date를 fromXX 등으로 지원