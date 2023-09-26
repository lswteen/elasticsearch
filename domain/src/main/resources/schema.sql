DROP TABLE IF EXISTS `product` CASCADE;

CREATE TABLE product (
    product_id BIGINT NOT NULL,
    name VARCHAR(255),
    price DOUBLE,
    PRIMARY KEY (product_id)
);