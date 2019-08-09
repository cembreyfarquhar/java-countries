package chancehalo.me.countries;

import java.util.ArrayList;

public class CountryList {
    public ArrayList<Country> countryList = new ArrayList<>();

    public CountryList() {
        countryList.add(new Country("UK", 66000000, 93628, 40));
        countryList.add(new Country("Germany", 82790000, 137847, 46));
        countryList.add(new Country("Spain", 46720000, 195364, 43));
    }
}
