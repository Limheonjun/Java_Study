# Method Reference

## Decription
- �ڷᱸ������ ���������� �ٷ�� ����. ������ ���� ��ü

## Features
- �߰� ���� �޼ҵ� : ��Ʈ���� ��ȯ�Ͽ� �޼ҵ� ü�̴��� �����ϵ��� ��
>- Stream<R>map(Function<A,R>)
>- Stream<T>filter(Predicate<T>)
>- Stream<T>peek(Consumer<T>)

- ���� ���� �޼ҵ� : ��Ʈ���� �ƴ� ���� ��ȯ�Ͽ� �޼ҵ� ü�̴��� �����Ŵ
>-R collect(Collector)
>-void forEach(Consumer<T>)
>-Optional<T> reduce(BinaryOperator<T>)
>-boolean allMatch(Predicate<T>)
>-boolean anyMath(Predicate<T>)

- ���� ���� �޼ҵ尡 ������ �߰� ���� �޼ҵ�θ� �̷���� ü�̴��� ������� ����
- �⺻�� ��Ʈ�� ���� Boxing����� ���� �� ������, �ش� Ÿ�Կ� �´� ������� �޼ҵ�� ������
- ��Ʈ���� �⺻�� ��Ʈ���� ���谡 ���� ������ Ÿ�Ժ�ȯ�� ���� ����.