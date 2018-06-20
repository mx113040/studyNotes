package io.github.maxin.j2se.base;

public interface Hockey extends Football {
    public void homeGoalScored();
    public void visitingGoalScored();
    public void endOfPeriod(int period);
    public void overtionPeriod(int ot);
}
