package part2;

public class AgeOnPlanetCalculator {
    public static double calculateAgeOnPlanet(int ageInYears, String planet) {
        // If the planet is not in the list, return -1
        double orbitalPeriod;

        switch (planet.toLowerCase()) {
            case "mercury":
                orbitalPeriod = 0.2408467;
                break;
            case "venus":
                orbitalPeriod = 0.61519726;
                break;
            case "mars":
                orbitalPeriod = 1.8808158;
                break;
            case "jupiter":
                orbitalPeriod = 11.862615;
                break;
            case "saturn":
                orbitalPeriod = 29.447498;
                break;
            case "uranus":
                orbitalPeriod = 84.016846;
                break;
            case "neptune":
                orbitalPeriod = 164.79132;
                break;
            default:
                return -1;
        }
        return ageInYears / orbitalPeriod;
    }

    public static void main(String[] args) {
        int ageInYears = 1;
        String planet = "Mars";
        double result = calculateAgeOnPlanet(ageInYears, planet);
        System.out.println(result);
    }
}