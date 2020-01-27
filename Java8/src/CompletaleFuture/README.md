# Completable Future

## Decription
- 비동기 인터페이스인 Future의 기능을 확장

## Features
- Future 인터페이스 
  - 미래의 어느 시점에 결과를 얻는 모델에 활용함
  - 비동기 계산을 모델링하는데 사용 가능
  - 계산이 끝났을 때 결과에 접근할 수 있는 레퍼런스를 제공
  - isDone : 비동기 계산이 끝났는지 확인
  - get : 타임아웃을 설정하고 결과 출력
- 비동기 처리를 선언형으로 이용 가능
- 람다 표현식과 파이프라인을 사용하여 비동기 작업 조합 가능
- 상황에 따라 병렬스트림 또는 Completable Future를 사용
  - Completable Future는 executor를 커스터마이징 할 수 있으며, 로직에 따라 최적화 하는것이 훨씬 효과적일 수 있음