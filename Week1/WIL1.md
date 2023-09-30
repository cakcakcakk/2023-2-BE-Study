# java

> 썬  마마이크로 시스템즈에서 발표한 객체지향 프로그래밍 언어. 



### 특징

- os에 독립적이다. 이식성이 높다.

-  jvm 사용으로 os에 독립적이다.
-  JVM 이란?
    - java와 os 싸이에서 중개자 역할을 수행하여 java 애플리케이션이 os에 독립적으로 작동할 수 있도록 한다.
    - 자동 메모리 관리, garbage collection 수행
    - 클래스 로더가 변환된 바이트코드를 JVM에 동적 로딩 후 런타임에 자바코드 로딩
    - JIT 컴파일러
- garbage collection 이란?
    -  불필요한 메모리를 알아서 정리
    -  JVM의 가비지 콜렉터가 해당 작업 수행
- 네트워크, 분산처리 지원
- 멀티쓰레드 지원. Java API로 인해 운영체제에 상관없이 구현가능.
- 동적 로딩 지원. 
   
<br>

## 객체지향 언어 특징

### 클래스
- 객체 생성 시 필요한 뼈대 생성
- 이와 같이 멤버변수, 생성자, getter, setter 메서드를 정의해준다.
``` java
class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return this.x;
    }

    public void setX(int x){
        this.x=x;
    }

}

``` 




### 캡슐화
- Point 의 멤버변수인 x, y를 private으로 선언하여 외부에서 접근하지 못하도록 한다.
- geeter, setter 메서드를 지정하여 간접적으로 멤버변수에 접근하여 데이터 무결성을 유지 


### 상속
``` java
class Car extends Vehicle{


    public Car(int n){
        super(n);
    }

    @Override
    public void hello(){
        System.out.println("The number of wheel is"+ this.getWheel());
    }
}
```

- Vehicle 클래스를 상속받는 Car 클래스. hello메소드를 오버라이딩하여 Car의 바퀴개수를 리턴한다.

### 다형성
```java
class Motorcycle extends Vehicle{

    public Motorcycle(int n){
        super(n);
    }

    @Override
    public void heelo(){
        System.out.println("The number of wheel is"+ this.getWheel());
    }
}    
```
- Vehicle을 상속받는 또다른 Motorcycle 클래스. hello메소드를 오버라이딩하여 Motorcycle의 바퀴개수를 리턴한다.
```java
public class Main{
    public static void main(String[] args) {
        Car car=new Car(4);
        Motorcycle mc=new Motorcycle(2);

        car.hello();
        mc.hello();
    }
}
```
- 각 클래스의 오버라이딩된 메서드가 실행됨
- 동일메서드로 다른 객체에 대한 작업 수행이 가능


### 추상화
```java
abstract class Shape{
    public abstract double calculateArea();
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    @Override
    public double calculateArea(){
        return width*height;
    }
}

```
- shape 클래스: 추상메서드를 포함한 클래스. 해당클래스를 상속받은 클래스는 반드시 추상메서드를 구현해야 한다.
- circle 클래스는 shape클래스의 추상메서드 calculateArea를 오버라이딩한다.
- rectangle 클래스도 마찬가지로 추상메서드 calculateArea를 오버라이딩한다.
- 각 클래스 객체의 오버라이딩한 메서드가 실행된다.
