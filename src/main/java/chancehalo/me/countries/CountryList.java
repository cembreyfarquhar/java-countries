package chancehalo.me.countries;

import java.util.ArrayList;

public class CountryList {
    public ArrayList<Country> countryList = new ArrayList<>();

    public CountryList() {
        countryList.add(new Country("UK", 6600, 93628, 40));
        countryList.add(new Country("Germany", 8279, 137847, 46));
        countryList.add(new Country("Spain", 4672, 195364, 43));
    }

    public Country findCountry(CheckCountry tester) {
        for (Country c: countryList) {
            if (tester.test(c)) {
                return c;
            }
        }

        return null;
    }

    public ArrayList<Country> findCountries(CheckCountry tester) {
        ArrayList<Country> tempCountryList = new ArrayList<>();

        for (Country c: countryList) {
            if (tester.test(c)) {
                tempCountryList.add(c);
            }
        }

        return tempCountryList;
    }





}
