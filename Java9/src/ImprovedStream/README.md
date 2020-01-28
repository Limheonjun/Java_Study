# Improved Stream

## Decription
- Stream 메소드 추가

## Features
- takeWhile : 조건이 false가 나올 때까지 Stream을 생성
- dropWhile : 조건이 false가 나올 때부터 Stream을 생성
- iterate
  - for문의 스트림 버전
  - 초기문, 조건문, 증감문
- ofNullable : 값이 null인 경우 비어있는 Optional을 반환
  - null 확인을 회피할 수 있도록 도와주는 기능