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