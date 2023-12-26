package lab_6;

public class Grain implements Data {
    private String GrainType;
    private int weight;

    /**
     * Constructor
     *
     * @param grainType type of grain
     * @param Weight    the weight from all grain's type
     */


    public Grain(String grainType, int Weight) {
        GrainType = grainType;
        weight = Weight;
    }

    /**
     * Method returns grain's type
     *
     * @return grain's type
     */

    public String getGrainType() {
        return GrainType;
    }

    /**
     * Method sets the grain's type
     *
     * @param grainType grain's type
     */


    public void setGrainType(String grainType) {
        GrainType = grainType;
    }

    /**
     * Method returns grain's weight
     *
     * @return grain's weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Method sets the grain's weight
     *
     * @param weight grain's type
     */

    public void setWeight(int weight) {
        weight = weight;
    }

    /**
     * Method simulates comparing thing`s weight
     */


    public int compareTo(Data p) {
        Integer j = weight;
        return j.compareTo(p.getWeight());
    }


    /**
     * Method simulates printing info about thing
     */

    public void print() {
        System.out.print("Type of grain: " + GrainType + ", Grain Weight: " + weight + ";\n");
    }


}
