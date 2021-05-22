DROP TABLE IF EXISTS coffee;

CREATE TABLE IF NOT EXISTS coffee  (
    coffee_id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    brand VARCHAR(20),
    origin VARCHAR(20),
    characteristics VARCHAR(30)
);