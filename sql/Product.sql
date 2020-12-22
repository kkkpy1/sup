--상품 전체 가져오기
CREATE OR REPLACE PROCEDURE sp_product_select_all
(
    product_record     OUT     SYS_REFCURSOR
)
AS
BEGIN
    OPEN product_record FOR
    SELECT product_id, member_id, product_name, product_img, product_price,
    product_brand, product_detail, product_category, product_quantity,
    product_activated, product_date
    FROM Product
    ORDER BY product_id DESC;
END;

-- select One Product
CREATE OR REPLACE PROCEDURE sp_product_select
(
    v_product_id     IN      product.product_id%TYPE,
    product_record    OUT     SYS_REFCURSOR

)
AS
BEGIN
    OPEN product_record FOR
    SELECT product_id, member_id, product_name, product_img, product_price, 
    product_brand, product_detail, product_category, product_quantity, product_activated, 
    TO_CHAR(product_date, 'YYYY-MM-DD') AS product_date
    FROM Product
    WHERE product_id = v_product_id;
END;

