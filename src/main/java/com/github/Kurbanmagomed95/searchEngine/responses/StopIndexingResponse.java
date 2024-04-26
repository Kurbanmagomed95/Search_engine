package com.github.Kurbanmagomed95.searchEngine.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StopIndexingResponse implements ResponseMarker{
    private boolean result;
}