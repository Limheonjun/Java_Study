# Functional Interface

## Decription
- �ϳ��� �߻� �޼ҵ�� �̷���� �������̽�

## Features
- @FunctionalInterface �ֳ����̼����� ǥ��
- Runnable : ������ ������ ���
- Supplier<ReturnType> : �Ķ���ʹ� ���� ���ϰ��� ����. 
- Consumer<ParamType> : ���ϰ��� ���� �Ķ���͸� ����
- Function<ParamType,ReturnType> : �ϳ��� �Ķ���Ϳ� ���ϰ��� ����. ���׸����� ���� ����
- Predicate<ParamType> : �ϳ��� �Ķ���Ϳ� ���ϰ��� ����. Function�� �ٸ��� ����Ÿ���� �������� ����. ��ȯŸ���� boolean���� �����Ǿ� ������ Function<T, Boolean>���¶�� �� �� ����
- UnaryOperator<Param&ReturnType> : �ϳ��� �Ķ���Ϳ� ���ϰ��� ����. �Ķ���Ϳ� ����Ÿ���� ���ƾ���
- BinaryOperator<Param&ReturnType> : �ΰ��� �Ķ���Ϳ� ���ϰ��� ����. �Ķ���Ϳ� ����Ÿ���� ���ƾ���
- BiPredicate<ParamType,ParamType> : �ΰ��� �Ķ���Ϳ� ���ϰ��� ����. �Ķ������ Ÿ���� �ٸ� �� ������ ����Ÿ���� boolean��
- BiConsumer<ParamType,ParamType> : ���ϰ��� ���� �ΰ��� �Ķ���͸� ����
- BiFunction<ParamType,ParamType,ReturnType> : �ΰ��� �Ķ�Ƽ�ӿ� ���ϰ��� ����
- Comparator<ParamType> : ���ϰ��� ���� �Ķ���͸� ����. ��ü���� �켱���� �񱳽� ���