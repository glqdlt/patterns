
커맨더 패턴과 비지터 패턴

둘다 어떠한 연산 로직을 서술하는 주체가 자기 자신이 아닌 외부에 의존한다는 점에서 비슷하게 보인다.

둘의 차이가 커맨드 패턴은 외부에의해서 알고리즘을 외부에게서 자기 자신에게 입력 받아와서 자기 자신이 실행시키는 데의의를 둔다.

반면 방문자 패턴은, 자기 자신의 몸을 외부에 맡기는 형태로, 내가 커맨더를 가진 대상에게 방문하는 개념이다.

커맨더를 가진 자는 입장하게 된 대상의 구석구석을 뒤져서 어떠한 커맨더를 해라고 명령을 하고, 대상은 그 명령을 수행하게 될 뿐이다.



책임 연쇄 패턴은 방문자 패턴이 연쇄적으로 일어나는 것처럼 느껴지기 때문에 유사해 보이지만, 대상이 내가 처리 가능한지에 대해 고민하는 데에 의의르 둔다.

방문자 패턴에는 invoke(this) 라는 개념처럼 대상 객체를 통해 커맨드를 실행하는 반면에

책임 연쇄 패턴은 해당 대상의 속성을 조작하지 않아도 된다. 단순히 해당 대상 객체를 통해 내가 어떠한 일을 해야할지를 판단하는 정도로 해도 되고, 그 일이 해당 객체의 속성을 바꾸는 일일수도 있다.



