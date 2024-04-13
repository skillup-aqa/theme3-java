package part2;

public class AgeOnPlanetCalculator {
    public static double calculateAgeOnPlanet(int ageInYears, String planet) {
        // If the planet is not in the list, return -1
        switch (planet) {
            case "Merkurii":
                System.out.println("Year in Merkurii:" + ageInYears / 0.2408467);
                break;
            case "Venera":
                System.out.println("Year in Venera:" + ageInYears / 0.61519726);
                break;
            case "Mars":
                System.out.println("Year in Mars:" + ageInYears / 1.8808158);
                break;
            case "Jupiter":
                System.out.println("Year in Jupiter:" + ageInYears / 11.862615);
                break;
            case "Saturn":
                System.out.println("Year in Saturn:" + ageInYears / 29.447498);
                break;
            case "Uran":
                System.out.println("Year in Uran:" + ageInYears / 84.016846);
                break;
            case "Neptun":
                System.out.println("Year in Neptun:" + ageInYears / 164.79132);
                break;
            default:
                System.out.println("Planet not found:" + planet);
        }
        ;
        return -1;
    }


    public static void main(String[] args) {
        int ageInYears = 1;
        String planet = "Mars";
        double result = calculateAgeOnPlanet(ageInYears, planet);
        System.out.println(result);
    }
}

