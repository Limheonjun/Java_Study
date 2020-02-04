# A Scalable Low-Latency Garbage Collector

## Decription
- jdk 11에서 등장한 가비지 콜렉터

## Features
- GC가 동작할 때 애플리케이션이 멈추는 현상(Stop-The-World)은 성능에서 큰 영향을 끼쳐왔으나 이러한 정지시간을 줄이거나 없앰으로써 애플리케이션의 성능향상에 기여할 수 있음
- GC 일시 중지 시간은 10ms를 초과하지 않음
- 작은 크기(수백 메가) ~ 매우 큰 크기(수 테라) 범위의 힙을 처리
- G1에 비해 애플리케이션 처리량이 15%이상 감소하지 않음
- 향후 GC 최적화를 위한 기반 마련
- 처음에는 Linux / x64을 지원 (향후 추가 플랫폼 지원 가능)
- ZGC의 주요 원리는 Load barrier와 Colored object pointer를 함께 사용하는 것