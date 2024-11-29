import java.util.Arrays; // to use arrays sort
public class Main {

    /**
     * Mean Methods
     */

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        return -1;
    }

    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        return -1;
    }

    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        return -1;
    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        return -1;
    }

    /**
     * Median Methods
     */

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        return -1;
    }


    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        return -1;
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        int median = 0;
        Arrays.sort(retailEstimatesKgPerCapitaPerYear);
        int middle = retailEstimatesKgPerCapitaPerYear[retailEstimatesKgPerCapitaPerYear.length / 2];
        if (retailEstimatesKgPerCapitaPerYear.length % 2 == 0) {
            int secondValue = retailEstimatesKgPerCapitaPerYear[retailEstimatesKgPerCapitaPerYear.length / 2 + 1];
            median = (middle + secondValue) / 2;
        } else {
            median = middle;
        }

        return median;
    }


    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        return -1;
    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        return -1;
    }

    /**
     * Min Methods
     */

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        return -1;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        return -1;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        return -1;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        return -1;
    }


    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        return -1;
    }

    /**
     * Max Methods
     */

    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear) {
        return -1;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear) {
        return -1;
    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        return -1;
    }

    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear) {
        return -1;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear) {
        return -1;
    }

    /**
     * Misc Methods
     */


    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear) {
        int index = 0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals(country)) {
                index = i;
            }
        }

        return totalWasteKgPerCapitaPerYear[index];
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear) {
        int MostCountry = 0;
        for (int i = 0; i < totalWasteKgPerCapitaPerYear.length; i++) {
            if (totalWasteKgPerCapitaPerYear[i] > totalWasteKgPerCapitaPerYear[MostCountry]) {
                MostCountry = i;
            }
        }
        return countries[MostCountry];
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty) {
        double maxValue = 0;
        for (int i = 0; i < percentagesShareInPoverty.length; i++) {
            if (percentagesShareInPoverty[i] > maxValue) {
                maxValue = percentagesShareInPoverty[i];
            }
        }
        int numberOfCountry = 0;
        for (int i = 0; i < percentagesShareInPoverty.length; i++) {
            if (percentagesShareInPoverty[i] == maxValue) {
                numberOfCountry = numberOfCountry + 1;
            }
        }
        String[] getCountriesWithHighestPovertyPercentage = new String[numberOfCountry];
        int arrayIndex = 0;
        for (int i = 0; i < percentagesShareInPoverty.length; i++) {
            if (percentagesShareInPoverty[i] == maxValue) {
                getCountriesWithHighestPovertyPercentage[arrayIndex] = countries[i];
                arrayIndex = arrayIndex + 1;
            }
        }
        return getCountriesWithHighestPovertyPercentage;
    }

    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences) {
        int numberOfCountry = 0;
        for (int i = 0; i < confidences.length; i++) {
            if (confidences[i].equals("High Confidence")) {
                numberOfCountry = numberOfCountry + 1;
            }
        }

        String[] getCountriesWithHighConfidence = new String[numberOfCountry];
        int arrayIndex = 0;
        for (int i = 0; i < confidences.length; i++) {
            if (confidences[i].equals("High Confidence")) {
                getCountriesWithHighConfidence[arrayIndex] = countries[i];
                arrayIndex = arrayIndex + 1;
            }
        }
        return getCountriesWithHighConfidence;
    }
}
