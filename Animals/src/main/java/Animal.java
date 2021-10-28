public abstract class Animal {
    private double weigh;
    private double height;
    public abstract void voice();

    public Animal(double weigh, double height) {
        this.weigh = weigh;
        this.height = height;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return  "weigh = " + weigh + "k.g." +
                ", height = " + height + "m.";
    }
}
