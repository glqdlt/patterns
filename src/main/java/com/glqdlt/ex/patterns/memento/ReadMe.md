# 메멘토 패턴

커맨드 패턴을 탐구하다 보면, 명령했던 커맨드를 롤백하고 싶을 떄가 있다. 이러한 경우 메멘토 패턴을 적절히 섞으면 매우 유용하게 접근이 가능하다.

다른 예제를 보면 너무 단순하고, 실무와는 괴리괌이 있더라.. 마침 baeldung 에서 매우 적절한 예제를 다루고 있어서 이를 조금 보완해서 접근해보았다.

GOF 책에 귀띰 돠는 것처럼 CareTaker 역활을 하는 객체가 Memento 조차 인지하지 못하게 하는 캡슐화를 표현하고 싶었다. 


TextEditorTest#restore() 를 실행 하면 아래처럼, 잘 동작한다. 

![](images/f9f1f60e.png)

# reference

- https://www.baeldung.com/java-memento-design-pattern
