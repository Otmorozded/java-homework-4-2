public class BmiService {

    public float calculate (float growth, float weight) {
        double index = (growth / (weight * weight)) * 100 * 100;
        return (float) index;

    }
}
