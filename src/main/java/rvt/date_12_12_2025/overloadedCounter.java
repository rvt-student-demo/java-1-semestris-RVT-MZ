package rvt.date_12_12_2025;
public class overloadedCounter {
    static class Counter {
        private int startValue = 0;
        public Counter(int startValue) {
            this.startValue = startValue;
        }
        public int value() {
            return this.startValue;
        }
        public void increase() {
            this.startValue++;
        }
        public void decrease() {
            this.startValue--;
        }
        public void increaseV2(int increaseBy) { // no part 2
            this.startValue += increaseBy;
        }
        public void decreaseV2(int decreaseBy) { // no part 2
            this.startValue -= decreaseBy;
        }
    }
    public static void main(String[] args) {
        Counter first = new Counter(10);
        first.increase();
        System.out.println(first.value());
        first.decrease();
        System.out.println(first.value());
        first.increaseV2(5); // no part 2
        System.out.println(first.value());
        first.decreaseV2(3); // no part 2
        System.out.println(first.value());

    }
}
