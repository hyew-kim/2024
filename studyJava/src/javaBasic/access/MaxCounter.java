package javaBasic.access;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count < max)
            count += 1;
        else
            System.out.println("최대값을 초과할 수 없습니다.");
    }
    public int getCount() {
        return count;
    }
}
