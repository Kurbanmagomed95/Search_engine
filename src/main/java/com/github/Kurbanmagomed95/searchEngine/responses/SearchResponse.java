package com.github.Kurbanmagomed95.searchEngine.responses;

import com.github.Kurbanmagomed95.searchEngine.seacrh.SearchResult;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class SearchResponse implements ResponseMarker{
    private boolean result;
    private long count;
    private ArrayList<SearchResult> data;
}