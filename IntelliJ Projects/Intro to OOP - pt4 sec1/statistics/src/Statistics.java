public class Statistics {
    private int count;
    private int sum = 0;

    public Statistics() {
       this.count = 0;
    }

    public void addNumber(int number) {
        this.count ++;
        sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return this.sum * 1.0 / this.count;
    }
}