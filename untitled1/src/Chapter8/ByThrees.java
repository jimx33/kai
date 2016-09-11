package Chapter8;

/**
 * Created by test on 7/14/2016.
 */
class ByThrees implements Series {
    int start;
    int val;
    ByThrees() {
        start = 0;
        val = 0;
    }
    public int getNext() {
        val += 3;
        return val;
    }
    public void reset() {
        val = start;
    }
    public void setStart(int x) {
        start = x;
        val = x;
    }
}
