package SelfEncapsulatedField;

class IntRange {
    private int low, high;
    
    public boolean includes(int arg) {
        return arg >= getLow() && arg <= getHigh();
    }

    public void grow(int factor) {
        setHigh(getHigh() * factor);
    }

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public IntRange(int low, int high) {
        this.low = low;
        this.high = high;
    }
}
