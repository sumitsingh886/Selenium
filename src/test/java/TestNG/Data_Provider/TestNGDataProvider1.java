package TestNG.Data_Provider;

import org.testng.annotations.DataProvider;

public class TestNGDataProvider1 {
    @DataProvider(name = "searchDataSet")
    public Object[][] searchData(){
        Object[][] searchKeyWord = new Object[3][2];
        searchKeyWord[0][0] = "India";
        searchKeyWord[0][1] = "Qutab Minar";

        searchKeyWord[1][0] = "Agra";
        searchKeyWord[1][1] = "Taj Mahal";

        searchKeyWord[2][0] = "Hyderbad";
        searchKeyWord[2][1] = "Chariminar";

        return searchKeyWord;

    }
}
