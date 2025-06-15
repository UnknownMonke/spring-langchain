package org.monke.langchain.stock;

import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends StockJpaRepository {
    Stock findByTicker(String ticker);
}
