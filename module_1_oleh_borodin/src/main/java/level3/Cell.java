package level3;

import java.util.ArrayList;

public class Cell {
    ArrayList<Cell> near;
    Status status;

    public Cell() {
        status = Status.NONE;
        near = new ArrayList<>();
    }

    void addNear(Cell cell) {
        near.add(cell);
    }

    void firstStep() {
        int around = countNearCells();
        status = status.firstStep(around);
    }

    void secondStep() {
        status = status.secondStep();
    }

    int countNearCells() {
        int count = 0;
        for (Cell cell : near)
            if (cell.status.isCell())
                count++;
        return count;
    }


}
