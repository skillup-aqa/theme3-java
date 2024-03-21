package part2;

public class AgeOnPlanetCalculator {
    public static double calculateAgeOnPlanet(int ageInYears, String planet) {
        // If the planet is not in the list, return -1
        // TODO: Implement solution here
        double orbitalPeriod;

        switch (planet.toUpperCase()) {
            case "MERCURY":
                orbitalPeriod = 0.2408467;
                break;
            case "VENUS":
                orbitalPeriod = 0.61519726;
                break;
            case "MARS":
                orbitalPeriod = 1.8808158;
                break;
            case "JUPITER":
                orbitalPeriod = 11.862615;
                break;
            case "SATURN":
                orbitalPeriod = 29.447498;
                break;
            case "URANUS":
                orbitalPeriod = 84.016846;
                break;
            case "NEPTUNE":
                orbitalPeriod = 164.79132;
                break;
            default:
                // If the planet is not in the list, return -1
                return -1;
        }
            return ageInYears / orbitalPeriod;
        }


    public static void main(String[] args) {
        int ageInYears = 41;
        String planet = "NEPTUNE";
        double result = calculateAgeOnPlanet(ageInYears, planet);
        System.out.println(result);
    }
}
