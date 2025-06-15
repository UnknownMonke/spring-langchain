package org.monke.langchain.stock;

import dev.langchain4j.agent.tool.Tool;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockService {

    private final StockRepository stockRepository;

    @Tool("Finds a stock by ticker, with all its information.")
    public Stock findByTicker(String ticker) {
        return stockRepository.findByTicker(ticker);
    }
}
