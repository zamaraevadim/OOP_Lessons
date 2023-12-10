package Lesson6.DIP;
//D — Dependency Inversion (Принцип инверсии зависимостей)
//Модули верхнего уровня не должны зависеть от модулей нижнего уровня. И те, и другие должны зависеть от абстракций. Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.
public class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
}
