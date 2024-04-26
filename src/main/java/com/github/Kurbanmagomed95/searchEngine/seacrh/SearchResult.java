package com.github.Kurbanmagomed95.searchEngine.seacrh;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SearchResult {
    private String site;
    private String siteName;
    private String uri;
    private String title;
    private String snippet;
    private double relevance;
}