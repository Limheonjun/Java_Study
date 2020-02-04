# Nest Based Access Control

## Description
- 메인 클래스의 private 메소드를 메인클래스 안에 생성된 클래스에서 접근이 가능했었으나, 자바 리플렉션을 쓰면 IllegalStateException을 발생시킴

## Features
- 리플렉션에 GetNestHost, getNestMembers, isNestmateOf 메소드가 추가
