package part2;

public class AgeOnPlanetCalculator {
    public static double calculateAgeOnPlanet(int ageInYears, String planet) {
        // If the planet is not in the list, return -1
        return switch (planet) {
            case "Mars" : yield  ageInYears / 1.8808158;
            case "Mercury" : yield  ageInYears / 0.2408467;
            case "Venus" : yield  ageInYears / 0.61519726;
            case "Jupiter" : yield  ageInYears / 11.862615;
            case "Saturn" : yield  ageInYears / 29.447498;
            case "Uranus" : yield  ageInYears / 84.016846;
            case "Neptune" : yield   ageInYears / 164.79132;
            default : {
                System.out.println("Що це за планета: " + planet + '?');
                yield -1;
            }
        };
    }


    public static void main(String[] args) {
        int ageInYears = 1;
        String planet = "V";
        double result = calculateAgeOnPlanet(ageInYears, planet);
        System.out.println(result);
    }
}
