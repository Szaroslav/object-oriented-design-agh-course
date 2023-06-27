package adapter;

public class RoundHole
{
    private final float radius;

    public RoundHole(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.radius == peg.getRadius();
    }
}
