package Lesson2.homework;

public interface QueueBehaviour {

    void takeInQueue(Actor actor);
    void makeOrders();
    void takeOrders();
    void releaseFromQueue();
}
