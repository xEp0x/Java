package workForce.jobs;

import java.util.EventListener;


public interface Listener extends EventListener {

    void handle(JobDoneEvent event);
}
