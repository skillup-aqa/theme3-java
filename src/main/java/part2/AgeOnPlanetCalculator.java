package part2;

public class AgeOnPlanetCalculator {
    public static double calculateAgeOnPlanet(int ageInYears, String planet) {
        double earthYears = ageInYears;
        double ageOnPlanet;

        switch (planet.toLowerCase()) {
            case "mercury":
                ageOnPlanet = earthYears * 0.2408467;
                break;
            case "venus":
                ageOnPlanet = earthYears * 0.61519726;
                break;
            case "mars":
                ageOnPlanet = earthYears * 1.8808158;
                break;
            case "jupiter":
                ageOnPlanet = earthYears * 11.862615;
                break;
            case "saturn":
                ageOnPlanet = earthYears * 29.447498;
                break;
            case "uranus":
                ageOnPlanet = earthYears * 84.016846;
                break;
            case "neptune":
                ageOnPlanet = earthYears * 164.79132;
                break;
            case "pluto":
                ageOnPlanet = earthYears * 247.92065;
                break;
            default:
                return -1; // Unknown planet, return -1
        }
        return ageOnPlanet;
    }

    public static void main(String[] args) {
        int ageInYears = 1;
        String planet = "Mars";
        double result = calculateAgeOnPlanet(ageInYears, planet);
        if (result != -1) {
            System.out.println("Age on " + planet + ": " + result);
        } else {
            System.out.println("Invalid planet entered.");
        }
    }
}