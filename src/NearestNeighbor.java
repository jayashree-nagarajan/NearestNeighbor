import java.util.ArrayList;
import java.util.List;

    public class NearestNeighbor {

        public static List<String> findNearestObjects(double[][] coordinates, double[] target) {
            List<String> result = new ArrayList<>();
            for (double[] coordinate : coordinates) {
                if (Math.abs(coordinate[0] - target[0]) <= 50 && Math.abs(coordinate[1] - target[1]) <= 50) {
                    result.add(coordinate[0] + "," + coordinate[1]);
                }
            }
            return result;
        }

        public static void main(String[] args) {
            double[][] coordinates = {{0, 0}, {10, 10}, {20, 20}, {30, 30},{60,75},{45,45}};
            double[] target = {15, 15};
            List<String> objectsWithin50Units = findNearestObjects(coordinates, target);
            System.out.println("Objects within 50 units of target coordinates:");
            for (String object : objectsWithin50Units) {
                System.out.println(object);
            }
        }
    }

