package rvt.date_13_11_2025;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count=count;
    }

    public void addNumber(int number) {
        count++;
        sum=sum+number;
    }

    public int getCount() {
        return count;
    }
    public int sum() {
        return sum;
    }

    public double average() {
        return sum/count;
    }
}