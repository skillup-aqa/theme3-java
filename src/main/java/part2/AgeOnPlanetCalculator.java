package part2;

public class AgeOnPlanetCalculator {
    public static double calculateAgeOnPlanet(int ageInYears, String planet) {
        // If the planet is not in the list, return -1
        double doubleAgeInYears = ageInYears;
        double age;
        switch (planet) {
            case "Mercury":
                age = doubleAgeInYears / 0.2408467;
                break;
            case "Venus":
                age = doubleAgeInYears / 0.61519726;
                break;
          /*  case "Earth":
                age = doubleAgeInYears;
                break; */
            case "Mars":
                age = doubleAgeInYears / 1.8808158;
                break;
            case "Jupiter":
                age = doubleAgeInYears / 11.862615;
                break;
            case "Saturn":
                age = doubleAgeInYears / 29.447498;
                break;
            case "Uranus":
                age = doubleAgeInYears / 84.016846;
                break;
            case "Neptune":
                age = doubleAgeInYears / 164.79132;
                break;
            default:
                age = -1;
        }

        return age;
    }

    public static void main(String[] args) {
        int ageInYears = 1;
        String planet = "Mars";
        double result = calculateAgeOnPlanet(ageInYears, planet);
        System.out.println(result);
    }
}
