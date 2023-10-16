## String

### 📌 Scanner
- 입력을 받기 위한 클래스.
- Scanner는 java.util 클래스에 있다.
- 공백(띄어쓰기) 또는 개행(줄 바꿈)을 기준으로 읽는다.
    ```
    Scanner in = new Scanner(System.in); // Scanner 객체 생성
    ```
- System.in: 사용자로부터 입력을 받기 위한 입력 스트림

    #### Scanner의 여러가지 메서드
    ```
    in.nextByte()		// byte 형 입력 및 리턴
    in.nextShort()		// short 형 입력 및 리턴
    in.nextInt()		// int 형 입력 및 리턴
    in.nextLong()		// long 형 입력 및 리턴
    
    in.nextFloat()		// float 형 입력 및 리턴
    in.nextDouble()		// double 형 입력 및 리턴
    
    in.nextBoolean()	// boolean 형 입력 및 리턴
    
    in.next()			// String 형 입력 및 리턴	(공백을 기준으로 한 단어를 읽음)
    in.nextLine()		// String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음)
    ```

### 📌 문자열 변환
- toUpperCase(): 문자열 안의 모든 문자를 대문자로 변환하는 메서드
- toLowerCase(): 문자열 안의 모든 문자를 소문자로 변환하는 메서드 
- toCharArray(): 문자열을 배열로 만들어주는 메서드

### 📌 아스키코드
- 소문자: 65~90
- 대문자: 97~122
- 소문자와 대문자의 아스키코드 차이: 97-65=32

### 📌 String 속 단어
- String[] split(String regex)
    - regex라는 문자열을 기준으로 String 배열을 만들어주는 메서드
    #### subString()
    - String substring(int beginIndex)
        - beginIndex전까지의 문자열을 자르고 그 뒤의 문자열만 반환
    - String substring(int beginIndex, int endIndex)        
        - beginIndex의 문자열부터 endIndex-1까지의 문자열을 잘라서 반환
    #### indexOf()
    - indexOf(String str): 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며
    만약 찾지 못했을 경우 "-1"을 반환
    - lastIndexOf(String str): 특정 문자나 문자열이 "뒤에서부터" 처음 발견되는 인덱스를 반환하며
    만약 찾지 못했을 경우 "-1"을 반환
    #### length()
    - length: 배열 원소의 수를 알고 싶을 때 사용
    - length(): 문자열의 문자의 수를 알고 싶을 때 사용

### 📌 StringBuilder
1. 가변성: 문자열을 동적으로 조작할 수 있으며, 문자열의 크기를 동적으로 조절 가능
2. 성능: 문자열을 추가하거나 변경할 때 문자열의 복사본을 만들지 않고 기존 문자열에 직접 작성하여 성능을 향상
3. 메서드: 문자열을 추가하거나 변경하기 위한 다양한 메서드 제공(ex. append(), insert(), delete(), replace() ...)
4. 스레드 안정성: StringBuilder는 멀티 스레드 환경에서 동시에 여러 스레드가 접근하지 않아야 한다. 멀티 스레드 환경에서는 'StringBuffer' 클래스 이용 가능. (기능은 같은데 StringBuffer에서 스레드 동기화만 뺸 것이 StringBuilder)   
    #### StringBuilder 사용 예시
    ```    
    StringBuilder sb = new StringBuilder();
    sb.append("Hello, ");
    sb.append("World!");
    sb.insert(7, "Java ");
    sb.delete(0, 7);

    String result = sb.toString(); // StringBuilder를 String으로 변환
    System.out.println(result); // "Java World!"
    ```
### 📌 ArrayList와 List의 차이
- 가장 큰 차이점: 크기 조절과 유연성에 있다.
#### ArrayList<Type>
- 동적 크기의 리스트로, 원소를 추가하거나 제거할 때 크기를 자동으로 조절. 크기를 런타임에 변경할 수 있으므로 유연. 이것은 컬렉션 프레임워크의 일부로 제공되며 다양한 유용한 메서드를 포함. 크기를 동적으로 변경할 수 있어 데이터 항목을 추가하거나 제거할 때 편리.
    ```
    ArrayList<String> answer = new ArrayList<>();
    answer.add("첫 번째 항목");
    answer.add("두 번째 항목");
    ```

#### 배열
- 고정된 크기를 가지며 선언할 때 크기를 지정해야 한다. 배열의 크기는 변경할 수 없으며, 미리 정해진 크기에서 움직이게 된다.
    ```
    String[] answer = new String[5]; // 크기가 5인 배열 생성
    answer[0] = "첫 번째 항목";
    answer[1] = "두 번째 항목";
    ```
### String.valueOf(s) vs toString()
- Null 값에 따른 NPE(NullPointerException)
- String.valueOf() - 파라미터가 null이면 문자열 "null"을 만들어서 반환한다.
- toString() - 대상 값이 null이면 NPE를 발생시키고 Object에 담긴 값이 String이 아니여도 출력한다.