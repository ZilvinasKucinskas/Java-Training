package com.toohightoplay.patterns.observer;

/**
 * Observer pattern example.
 * 
 * @author Zilvinas Kucinskas
 */
public interface Observer {

    // Method to update the observer, used by subject
    public void update();

    // Attach with subject to observe
    public void setSubject(Subject sub);
}
