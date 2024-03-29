# 예외처리(exception handing)
### 프로그램 오류
- 발생시점에 따라 컴파일에러(compile-time error), 런타임에러(runtime error)로 나눌 수 있다
  - 컴파일 에러 : 컴파일할 때 발생하는 에러
  - 런타임 에러 : 프로그램의 실행도중 발생하는 에러
  - 논리적 에러 : 컴파일도 잘 되고 실행도 잘 되지만 의도한 것과 다르게 동작할 때

<br>

- 자바는 실행 시 발생할 수 있는 오류를 '에러', '예외' 두 가지로 구분했다
  - 에러 : 메모리 부족(OutOfMemoryError)이나 스택오버플로우(StackOverflowError)와 같이 발생하면 복구할 수 없는 심각한 오류
  - 예외 :발생하더라도 수습될 수 있는 비교적 덜 심각한 것

<br><br>
- 에러 : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
- 예외 : 프로그램 코드에 의해서 수습 될 수 있는 다소 미약한 오류

<br><br>


모든 예외의 최고 조상은 Exception클래스<br>상속계층도를 Exception클래스부터 도색화하는 것은 책415p참고

<br><br>
예외클래스들은 다음과 같이 두 그룹으로 나눠질 수 있다
1. Exception클래스와 그 자손들
2. RuntimeException클래스와 그 자손들

<br>

- Exception클래스들은 주로 외부의 영향으로 발생할 수 있는 것들로, 프로그램의 사용자들 동작에 의해서 발생하는 경우가 많다
- RuntimeException클래스들은 주로 프로그래머의 실수에 의해서 발생

<br><br>

### 예외처리하기 try-catch문

프로그램의 실행도중 발생하는 예외는 프로그래머가 이에 대한 처리를 미리 해줘야한다<br>
<br>예외처리의 목적은 예외의 발생으로 인한 실행 중인 프로그램의 갑작스런 비정상 종료를 막고 정상적인 실행상태를 유지할 수 있도록 하는 것


- 예외처리
  - 정의 : 프로그램 실행 시 발생할 수 있는 예외에 대비한 코드를 작성하는 것
  - 목적 : 프로그램의 비정상 종료를 막고 정상적인 실행상태를 유지하는 것

<br>
예외를 처리하기 위해서 try-catch문을 사용한다<br>
try{<br>//예외가 발생할 가능성이 있는 문장을 넣음<br>} catch (Exception1 e1) {<br>//Exception1이 발생했을 경우 이를 처리하기 위한 문장<br>} catch (Exception2 e2) {<br>}


<br><br>

catch블럭의 괄호 내에 선언된 변수는 catch블럭 내에서만 유효하기때문에 위의 모든 catch블럭에 참조변수 'e'하나만을 사용해도 된다

<br><br>

### try-catch문에서의 흐름

- try블럭 내에서 예외가 발생한 경우
    1. 발생한 예외와 일치하는 catch블럭이 있는지 확인한다
    2. 일치하는 catch블럭을 찾게 되면 그 catch블럭 내의 문장들을 수행하고 전체try-catch문을 빠져나가서 그 다음 문장을 계속해서 수행, 만약 일치하는 catch 블럭을 찾지 못하면 예외는 처리되지 못한다

- try블럭 내에서 예외가 발생하지 않은 경우
  1. catch블럭을 거치지 않고 전체 try-catch문을 빠져나가서 수행을 계속한다

<br><br>

### 예외의 발생과 catch블럭
- 모든 예외클래스는 Exception클래스의 자손이므로, catch블럭의 괄호()에 Exception클래스타입의 참조변수를 선언해놓으면 어떤 종류의 예외가 발생하더라도 이 catch블럭에 의해서 처리된다

- printStackTrace() : 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메세지를 화면에 출력한다
- getMessage() : 발생한 예외클래스의 인스턴스에 저장된 메세지를 얻을 수 있다


<br><br>

### 예외 발생시키기
- 키워드 throw를 사용해 고의로 예외를 발생시킬 수 있다

1. 먼저 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음<br>- Exception e = new Exception("고의로 발생시킴");
2. 키워드 throw를 이용해서 예외를 발생시킨다<br>throw e;


<br><br>

### 메서드에 예외 선언하기
- 메서드에 예외를 선언하려면 메서드의 선언부에 키워드 throws를 사용하여 메서드 내에서 발생할 수 있는 예외를 적어주면 된다, 예외가 여러 개일 경우에는 쉼표, 로 구분한다


- 예외가 발생한 메서드 내에서 처리가능
- 예외가 발생한 메서드를 호출한 메서드에서 처리가능
- 또는 두 메서드가 예외처리를 분담가능

<br><br>

### finally블럭
- finally블럭은 예외의 발생여부에 상관없이 실행되어야할 코드를 포함시킬 목적으로 사용
- try-catch문의 끝에 선택적으로 덧붙여 사용할 수 있으며, try-catch-finally의 순서로 구성

- 예외가 발생한 경우에는 try-catch-finally의 순으로 실행
- 예외가 발생하지 않은 경우에는 try-finally의 순으로 실행

- try블럭에서 return문이 실행되는 경우에도 finally블럭의 문장들이 먼저 실행된 후 현재 실행중인 메서드를 종료
- catch블럭의 문장 수행 중 return문을 만나도 finally블럭의 문장들은 수행된다

<br><br>

### 자동 자원 반환 try-with-resources문
- 만약 try블럭과 finally블럭에서 모두 예외가 발생하면 try블럭의 예외는 무시되는 문제때문에 try-with-resources문이 추가됐다

// 참고 괄호() 안에 두 문장 이상을 넣을 경우 ';'로 구분한다

- try-with-resource문에 의해 자동으로 객체의 close()가 호출될 수 있으려면, 클래스가 AutoCloseable이라는 인터페이스를 구현한 것이어야한다

<br><br>

### 사용자정의 예외 만들기
- Exception클래스로부터 상속을 받아 만들 수 있다
- 필요하다면 멤버변수나 메서드를 추가할 수 있다

- ex)메세지를 저장할 수 있으려면 439p 예제와 같이 String을 매개변수로 받는 생성자를 추가해주어야한다

<br><br>

### 예외 되던지기
- 단 하나의 예외에 대해서도 예외가 발생한 메서드와 호출한 메서드, 양 쪽에서 처리하도록 할 수 있다
- 이것을 예외를 처리한 후에 인위적으로 다시 발생시키는 방법을 통해 가능한데 이것을 예외 되던지기 라고 한다

- 이 때 주의할 점은 예외가 발생할 메서드에서는 try-catch문을 사용해서 예외처리를 해줌과 동시에 메서드의 선언부에 발생할 예외를 throws에 지정해줘야 한다는 것

- 만약 반환값이 있는 return문의 경우 catch블럭에도 return문이 있어야한다, 예외가 발생했을 때도 값을 반환해야하기 때문

- 또는 catch블럭에서 예외 되던지기를 해서 호출한 메서드로 예외를 전달하면 return문이 없어도 된다

<br>

//참고 : finally블럭 내에서도 return문을 사용할 수 있으며, try블럭이나 catch블럭의 return문 다음에 실행된다, 최종적으로 finally블럭 내의 return문의 값이 반환된다


<br><br>

### 연결된 예외
- 한 예외가 다른 예외를 발생시킬 수도 있다
  - ex) 예외 A가 예외 B를 발생시켰다면 A를 B의 '원인 예외' 라고한다
- initCause()로 예외등록을 한 뒤 throw로 이 예외를 던진다 444p참고

- Throwable initCause(Throwable cause) 지정한 예외를 원인 예외로 등록
- Throwable getCause() 원인 예외를 반환

<br>

1. 발생한 예외를 원인 예외로 등록해서 다시 예외를 발생시키는 이유는 여러가지 예외를 하나의 큰 분류의 예외로 묶어서 다루기 위해
2. cheched예외를 unchecked예외로 바꿀 수 있도록 하기 위함

<br>

- RuntimeException(Throwable cause) //원인 예외를 등록하는 생성자