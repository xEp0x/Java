package workForce.jobs;

public class JobEventListener implements Listener {

    @Override
    public void handle(JobDoneEvent event) {
        System.out.println(String.format("Job %s done!", event.getJobName()));
    }
}
