# 메멘토 패턴 설명
Memento 클래스는 Originator 안에 public 클래스로 정의하였다.  
Memento 클래스의 생성자와 속성은 모두 private로 설정하여 외부에서 접근할 수 없도록 하였다.  
Memento가 하나면 충분했기에 Caretaker 역할을 따로 만들지는 않았다.   
main 함수에서는 Memento의 속성을 알 수 없기 때문에 Originator가
직접 Memento의 속성과 갱신된 Originator의 속성을 비교하고, Memento의 갱신이 필요한지를 확인했다.