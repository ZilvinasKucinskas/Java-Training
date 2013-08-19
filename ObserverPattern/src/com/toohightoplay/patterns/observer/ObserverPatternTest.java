package com.toohightoplay.patterns.observer;

/**
 * Observer design pattern example.
 * 
 * @author Zilvinas Kucinskas
 */
public class ObserverPatternTest {

    public static void main(String[] args) {

        // Create subject
        MyTopic topic = new MyTopic();

        // Create observers
        Observer o1 = new MyTopicSubscriber("Obj 1");
        Observer o2 = new MyTopicSubscriber("Obj 2");
        Observer o3 = new MyTopicSubscriber("Obj 3");

        // Register observers to the subject
        topic.register(o1);
        topic.register(o2);
        topic.register(o3);

        // Attach observers to the subject
        o1.setSubject(topic);
        o2.setSubject(topic);
        o3.setSubject(topic);

        // Check if any update is available
        o1.update();

        // Now send a message to subject
        topic.postMessage("New Message");
    }
}
