public class StopWatch {
    private long startTime;
    private long elapsedTime;
    private boolean isRunning;

    public StopWatch() {
        this.reset();
    }

    public void start() {
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        if (!this.isRunning) {
            return;
        }
        this.isRunning = false;
        long endTime = System.currentTimeMillis();
        this.elapsedTime += endTime - this.startTime;
    }

    public long getElapsedTime() {
        if (this.isRunning) {
            long endTime = System.currentTimeMillis();
            return this.elapsedTime + endTime - this.startTime;
        }

        return this.elapsedTime;
    }

    public void reset() {
        this.elapsedTime = 0;
        this.isRunning = false;
    }

    public void showElapsedTime() {
        System.out.println("Elapsed time: " + this.elapsedTime + " milliseconds.");
    }
}
