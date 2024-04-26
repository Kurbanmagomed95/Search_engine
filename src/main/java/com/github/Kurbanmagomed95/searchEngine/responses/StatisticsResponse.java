package com.github.Kurbanmagomed95.searchEngine.responses;

import com.github.Kurbanmagomed95.searchEngine.entities.repositories.IndexRepository;
import com.github.Kurbanmagomed95.searchEngine.entities.repositories.LemmaRepository;
import com.github.Kurbanmagomed95.searchEngine.entities.repositories.PageRepository;
import com.github.Kurbanmagomed95.searchEngine.entities.repositories.SiteRepository;
import com.github.Kurbanmagomed95.searchEngine.responses.statistics.Statistics;
import lombok.Data;

@Data
public final class StatisticsResponse implements ResponseMarker{
    private boolean result;
    private Statistics statistics;

    public StatisticsResponse(LemmaRepository lemmaRepository,
                              SiteRepository siteRepository,
                              PageRepository pageRepository,
                              Boolean result,
                              IndexRepository indexRepository) {
        this.result = result;
        statistics = new Statistics(lemmaRepository, siteRepository, pageRepository, indexRepository);
    }

}