package part2;

public class AgeOnPlanetCalculator {
    public static double calculateAgeOnPlanet(int ageInYears, String planet) {
        // If the planet is not in the list, return -1
        switch (planet) {
            case "Mercury":
                return ageInYears / 0.2408467;
            case "Venus":
                return ageInYears / 0.61519726;
            case "Mars":
                return ageInYears / 1.8808158;
            case "Jupiter":
                return ageInYears / 11.862615;
            case "Saturn":
                return ageInYears / 29.447498;
            case "Uranus":
                return ageInYears / 84.016846;
            case "Neptune":
                return ageInYears / 164.79132;
            default:
                System.out.println("Unknown planet: " + planet);
                 return - 1;
        }
    }

    public static void main(String[] args) {
        int ageInYears = 20;
        String planet = "Neptune";
        double result = calculateAgeOnPlanet(ageInYears, planet);
        System.out.println(result);
    }
}
