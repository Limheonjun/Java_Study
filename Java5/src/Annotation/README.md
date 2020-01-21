# Annotation

## Decription
- �ҽ��ڵ忡 �ۼ��� �ֳ����̼��� ���� �ڵ����� �ڵ带 �������־�, �ݺ����� �ڵ� �ۼ��� ����

## Features
- ������ ���α׷����� �����ϰ� ��
- ����Ͻ� �������� ������ ���� �ʰ� �ش� Ÿ���� ���� ����̳� �ҽ��ڵ��� ������ ������ �� ����
- @Target, @Retention�� ���� ��Ÿ �ֳ����̼��� ���� Ŀ���� �ֳ����̼��� ���� �� ����

## Default Annotation
- @Override
  * ������ �޼��尡 �������̵� �Ǿ��ִٴ� ���� ǥ��
  * ���� Ŭ�������� �ش� �޼ҵ带 ã�� �� ������ ���� �߻�

- @Deprecated
  * �ش� �޼ҵ带 �� �̻� ������� ������ ǥ��
  * ���� ����� ��� ��� �߻�

- @SuppressWarnings
  * ������ ���� ������ ��� ������

- @SafeVarargs
  * Java7���� ����, ���׸� ���� ���������� �Ű������� ����Ҷ� ��� ����

- @FunctionalInterface
  * Java8���� ����, �Լ��� �������̽��� ����
  * �޼ҵ尡 ���ų�, default�޼ҵ带 ������ �Ѱ� �̻��� �޼ҵ尡 ������ ��� ���� �߻�

## Meta Annotation
- @Retention
  * �ڹ� �����Ϸ��� �ֳ����̼��� �ٷ�� ����� ���, Ư�� �������� ������ ��ġ������ ����
  * ����
    * RetentionPolicy.SOURCE : ������ �������� ��ȿ. (������ ���Ŀ��� �����)
    * RetentionPolicy.CLASS : �����Ϸ��� Ŭ������ ������ ������ ��ȿ.
    * RetentionPolicy.RUNTIME : ������ ���Ŀ��� JVM�� ���� ��� ������ ����. (���÷��� ���)

- @Target
  * �ֳ����̼��� ������ ��ġ ����
  * ����
    * ElementType.PACKAGE : ��Ű�� ����
    * ElementType.TYPE : Ÿ�� ����
    * ElementType.ANNOTATION_TYPE : ������̼� Ÿ�� ����
    * ElementType.CONSTRUCTOR : ������ ����
    * ElementType.FIELD : ��� ���� ����
    * ElementType.LOCAL_VARIABLE : ���� ���� ����
    * ElementType.METHOD : �޼��� ����
    * ElementType.PARAMETER : �������� ����
    * ElementType.TYPE_PARAMETER : �������� Ÿ�� ����
    * ElementType.TYPE_USE : Ÿ�� ����

- @Documented
  * �ش� �ֳ����̼��� Javadoc�� ���Խ�Ŵ

- @Inherited
  * �ֳ����̼��� ����� �����ϰ� ��

- @Documented
  * Java8���� ����, ���������� �ֳ����̼��� ������ �� �ֵ��� ��
