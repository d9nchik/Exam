package com.d9nich.exercise1;

public class LinearFunction {
    private final double k;
    private final double b;

    public LinearFunction(String equations) {
        String[] words = equations.split("[= ]+");
        String mainPart;
        if (words[0].equals("y"))
            mainPart=words[1];
        else
            mainPart=words[0];
        words = mainPart.split("[+]+");
        if (words[0].contains("x")){
            k=Double.parseDouble(words[0].replaceAll("x", ""));
            b=Double.parseDouble(words[1]);
        }
        else {
            k=Double.parseDouble(words[1].replaceAll("x", ""));
            b=Double.parseDouble(words[0]);
        }
    }

    public LinearFunction(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public double getY(double x){
        return k*x+b;
    }

    public double getK() {
        return k;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        return "LinearFunction{" +
                "k=" + k +
                ", b=" + b +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LinearFunction that = (LinearFunction) o;

        if (Double.compare(that.k, k) != 0) return false;
        return Double.compare(that.b, b) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(k);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
