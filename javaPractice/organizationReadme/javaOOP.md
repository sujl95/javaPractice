# 자바와 객체 지향

## 다중 상속과 자바

- 다중 상속을 지원하지 않는 이유는 다중 상속을 할 때 득과 실중 실이 많아서 지원하지 않는다

## 상속과 인터페이스

- 상위 클래스는 하위 클래스에게 물려줄 특성이 많을수록 좋은지? 적을 수록 좋은지?
- 인터페이스는 구현을 강제할 메서드가 많을수록 좋은지? 적을수록 좋은지?
    - 이에 대답은 상위 클래스는 물려줄 특성이 풍성할수록 좋고, 인터페이스  는 구현을 강제할 메서드의 개수가 적을수록 좋다는 결론에 도달할 수 있다.
    - 객체 지향 설계 5원칙 중에서 상위 클래스가 풍성할수록 좋은 이유는 LSP(리스코프 치환원칙)에 따른 이유라고 할 수 있다.
    - 인터페이스에 메서드가 적을수록 좋은 이유는 ISP(인터페이스 분할 원칙)에 따른 이유라고 할 수 있다.