package adapter;

public class Main
{
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rPeg = new RoundPeg(5);

        System.out.println("Hole fits round peg: " + hole.fits(rPeg)); // True

        SquarePeg smallSqPeg = new SquarePeg(5);
        SquarePeg largeSqPeg = new SquarePeg(10);

        System.out.println("Hole fits small square peg: "
                           + hole.fits(new SquarePegAdapter(smallSqPeg))); // False
//        System.out.println("Hole fits small square peg: "
//                           + hole.fits(smallSqPeg)); // This won't compile ( incompatible types )
    }
}
