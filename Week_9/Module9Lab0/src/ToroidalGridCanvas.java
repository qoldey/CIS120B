public class ToroidalGridCanvas extends GridCanvas {

    public ToroidalGridCanvas(int rows, int cols, int size) {
        super(rows, cols, size);
    }
    // override the test method so that the coordinates r and c map to the opposite
    // side of the grid if either or both exceed the index limits.

    /**
     * Returns 1 if the cell at (r, c) exists and is on. Returns 0 if the cell
     * doesn't exist or is off.
     * 
     * @param r row index
     * @param c column index
     * @return 1 or 0
     */

    // allows the coordinates r and c map to the opposite side of the grid if either
    // or both exceed the index limits.
    // This is not currently working.

    @Override
    public int test(int r, int c) {
        System.out.println(r + " " + c);
        try {
            if (array[r][c].isOn()) {
                return 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // cell doesn't exist
            if (r > numRows()) {
                // if row exceeds rows, map to opposite side.
                System.out.println("newRow");
                array[0][c].turnOn();
            }
            if (c > numCols()) {
                // if column exceeds columns, map to opposite side.
                System.out.println("newColumn");
                array[r][0].turnOn();
            }

        }
        return 0;
    }
}
