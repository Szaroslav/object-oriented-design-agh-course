package adapter;

public class SquarePegAdapter extends RoundPeg
{
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super();
        this.peg = peg;
    }

    @Override
    public float getRadius() {
        return (float) (peg.getWidth() * Math.sqrt(2) / 2);
    }
}
