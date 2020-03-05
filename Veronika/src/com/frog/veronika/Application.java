package com.frog.veronika;

import com.frog.veronika.search.ManagerSearch;

import static com.frog.veronika.search.EnumSearch.searcherType;

public class Application {

    public static void main(String[] args) {
        ManagerSearch searchManager = new ManagerSearch();

        searchManager.Search(searcherType.LINEAR);
        searchManager.Search(searcherType.ERROR_CHECK);
        searchManager.Search(searcherType.BINARY);
    }

}
