package lab_6;

public class Animal implements Data {
    private String AnimalName;
    private int years;
    private int weight;

    /**
     * Constructor
     *
     * @param tAnimalName Name of Animal
     * @param tYears      Animal's age
     * @param tWeight     Animal's weight
     */

    public Animal(String tAnimalName, int tYears, int tWeight) {
        AnimalName = tAnimalName;
        years = tYears;
        weight = tWeight;
    }

    /**
     * Method returns animal's name
     *
     * @return animal's name
     */

    public String getAnimalName() {
        return AnimalName;
    }

    /**
     * Method sets the new animal's name
     *
     * @param animalName animal's name
     */

    public void setAnimalName(String animalName) {
        AnimalName = animalName;
    }

    /**
     * Method returns animal's age
     *
     * @return animal's age
     */
    public int getYears() {
        return years;
    }

    /**
     * Method sets the new animal's weight
     *
     * @param years animal's age
     */

    public void setYears(int years) {
        this.years = years;
    }

    /**
     * Method returns animal's weight
     *
     * @return animal's weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Method simulates comparing animal's weight
     */

    public int compareTo(Data p) {
        Integer s = weight;
        return s.compareTo(p.getWeight());
    }

    /**
     * Method simulates printing info about animal
     */

    public void print() {
        System.out.print("Animal: " + AnimalName + ", Years : " + years +
                ", Animal Weight: " + weight + ";\n");
    }
}
