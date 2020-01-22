# G1 Garbage Collector

## Decription
- G1 메모리 관리자(Garbage First Garbage Collector)는 Garbage가 가장 많은 영역의 정리를 수행

## Features
- 이전의 Garbage Collector 처럼 동일한 영역을 사용하지만 고정된 크기가 아니며 유연성을 제공
- G1 은 CMS 컬렉터와 유사한 방식으로 동작하며 객체의 유효화를 결정하는 동시에 마킹 단계를 수행하며, 마킹 단계를 완료하고 나면 대부분의 비어있는 영역을 알고 있음
