import org.junit.jupiter.api.Test;
import slidingwindow.CourseSchedule;

import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleTest {

    @Test
    void canFinishTest1() {
        int num = 2;
        int[][] preReq = {{1, 0}};

        CourseSchedule sol = new CourseSchedule();

        assertTrue(sol.canFinish(num, preReq));
    }

    @Test
    void canFinishTest2() {
        int num = 2;
        int[][] preReq = {{1, 0}, {0, 1}};

        CourseSchedule sol = new CourseSchedule();

        assertFalse(sol.canFinish(num, preReq));
    }

}