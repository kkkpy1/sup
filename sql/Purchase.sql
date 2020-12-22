-- Insert into Purchase
CREATE OR REPLACE PROCEDURE sp_purchase_insert
(
    v_product_id     IN    purchase.purchase_id%TYPE,
    v_sender_id     IN    purchase.sender_id%TYPE,
    v_recepient_id     IN    purchase.recepient_id%TYPE
)
IS
BEGIN
    INSERT INTO PURCHASE(purchase_id, product_id, sender_id, recepient_id, 
    purchase_state, purchase_date)
    VALUES(seq_purchase_id.NEXTVAL, v_product_id, v_sender_id, v_recepient_id, 
    1, SYSDATE); 
END;

-- select send in purchase
CREATE OR REPLACE PROCEDURE sp_purchase_select_send
(
    v_sender_id     IN      purchase.sender_id%TYPE,
    purchase_record    OUT     SYS_REFCURSOR
)
AS
BEGIN
    OPEN purchase_record FOR
    SELECT product_id, sender_id, recepient_id, purchase_state, 
    TO_CHAR(purchase_date, 'YYYY-MM-DD') AS purchase_date,
    product_name, product_price
    FROM purchase INNER JOIN Product USING(product_id)

    WHERE sender_id = v_sender_id;
END;

-- select receive in purchase
CREATE OR REPLACE PROCEDURE sp_purchase_select_receive
(
    v_recepient_id     IN      purchase.recepient_id%TYPE,
    purchase_record    OUT     SYS_REFCURSOR
)
AS
BEGIN
    OPEN purchase_record FOR
    SELECT product_id, sender_id, recepient_id, purchase_state, 
    TO_CHAR(purchase_date, 'YYYY-MM-DD') AS purchase_date,
    product_name, product_price
    FROM purchase INNER JOIN Product USING(product_id)

    WHERE recepient_id = v_recepient_id;
END;

-- 상품상태 Unused -> Used
CREATE OR REPLACE PROCEDURE sp_purchase_update_state_to_used
(
    v_purchase_id          IN       Purchase.purchase_id%TYPE
)
IS
BEGIN
    UPDATE Purchase
    SET purchase_state = 1
    WHERE purchase_id = v_purchase_id;
END;

-- 상품상태 Unused -> Rejected
CREATE OR REPLACE PROCEDURE sp_purchase_update_state_to_rejected
(
    v_purchase_id          IN       Purchase.purchase_id%TYPE
)
IS
BEGIN
    UPDATE Purchase
    SET purchase_state = 2
    WHERE purchase_id = v_purchase_id;
END;
