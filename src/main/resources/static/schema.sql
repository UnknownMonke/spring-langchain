DROP TABLE stock_data IF EXISTS;

CREATE TABLE stock_data (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    ticker VARCHAR(10) NOT NULL,
    current_price_usd DECIMAL(10, 2) NOT NULL,
    variation_last_10_days DECIMAL(5, 2),
    UNIQUE(ticker)
);