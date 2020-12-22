--회원가입
CREATE OR REPLACE PROCEDURE sp_customer_insert
(
    v_member_id     IN    member.member_id%TYPE,
    v_member_password     IN    member.member_password%TYPE,
    v_member_name     IN    member.member_name%TYPE,
    v_member_gender     IN    member.member_gender%TYPE,
    v_member_birthday     IN    member.member_birthday%TYPE,
    v_member_email     IN    member.member_email%TYPE,
    v_member_phone     IN    member.member_phone%TYPE,
    v_member_terms     IN    member.member_terms%TYPE
)
IS
BEGIN
    INSERT INTO MEMBER(member_id, member_password, member_name, member_gender, member_birthday, member_email, member_phone, 
    member_activated, member_code, member_terms)
    VALUES(v_member_id, v_member_password, v_member_name, v_member_gender, v_member_birthday, v_member_email, v_member_phone, 
    '1', '1', v_member_terms);
    COMMIT;
END;

-- activated : 1/0
-- code : 1 for Customer

-- login
CREATE OR REPLACE PROCEDURE sp_customer_login
(
    v_member_id     IN      member.member_id%TYPE,
    v_member_password     IN      member.member_password%TYPE,
    v_result     OUT     NUMBER
)
IS
    t_member_password    member.member_password%TYPE;
BEGIN
    SELECT member_password INTO t_member_password 
    FROM Member
    WHERE member_id = v_member_id;
    
    --그런 아이디가 있다면
    IF v_member_password = t_member_password THEN   --패스워드가 일치한다면
        v_result := 1;
    ELSE                          --패스워드가 일치하지 않는다면
        v_result := 0;
    END IF;
    
    Exception 
        WHEN NO_DATA_FOUND THEN    --그런 아이디가 없다면
            v_result := -1;
END;


-- find ID by phone
create or replace PROCEDURE sp_customer_find_id_by_phone
(
    v_member_name     IN      member.member_name%TYPE,
    v_member_phone  IN      member.member_phone%TYPE,
    matched_member_id    OUT     SYS_REFCURSOR

)
AS
BEGIN
    OPEN matched_member_id FOR
    SELECT member_id
    FROM Member
    WHERE member_name = v_member_name
    AND v_member_phone = v_member_phone
    ORDER BY member_id ASC;
END;

-- find ID by email
create or replace PROCEDURE sp_customer_find_id_by_email
(
    v_member_name     IN      member.member_name%TYPE,
    v_member_email     IN      member.member_email%TYPE,
    matched_member_id    OUT     SYS_REFCURSOR

)
AS
BEGIN
    OPEN matched_member_id FOR
    SELECT member_id
    FROM Member
    WHERE member_name = v_member_name
    AND v_member_email = v_member_email
    ORDER BY member_id ASC;
END;

-- find password by phone
CREATE OR REPLACE PROCEDURE sp_customer_find_password_by_phone
(
    v_member_id     IN      member.member_id%TYPE,
    v_member_name     IN      member.member_name%TYPE,
    v_member_phone     IN      member.member_phone%TYPE,
    v_result     OUT     NUMBER
)
IS
    t_member_phone    member.member_phone%TYPE;
BEGIN
    SELECT member_phone INTO t_member_phone 
    FROM Member
    WHERE member_id = v_member_id
    AND member_name = v_member_name;
    
    --그런 아이디가 있다면
    IF v_member_phone = t_member_phone THEN   --번호가 일치한다면
        v_result := 1;
    ELSE                          --번호가 일치하지 않는다면
        v_result := 0;
    END IF;
    
    Exception 
        WHEN NO_DATA_FOUND THEN    --그런 아이디가 없다면
            v_result := -1;
END;

-- find password by email
CREATE OR REPLACE PROCEDURE sp_customer_find_password_by_email
(
    v_member_id     IN      member.member_id%TYPE,
    v_member_name     IN      member.member_name%TYPE,
    v_member_email     IN      member.member_email%TYPE,
    v_result     OUT     NUMBER
)
IS
    t_member_email    member.member_email%TYPE;
BEGIN
    SELECT member_email INTO t_member_email 
    FROM Member
    WHERE member_id = v_member_id
    AND member_name = v_member_name;
    
    --그런 아이디가 있다면
    IF v_member_email = t_member_email THEN   --메일이 일치한다면
        v_result := 1;
    ELSE                          --메일이 일치하지 않는다면
        v_result := 0;
    END IF;
    
    Exception 
        WHEN NO_DATA_FOUND THEN    --그런 아이디가 없다면
            v_result := -1;
END;

-- 이름으로 소비자 찾기
CREATE OR REPLACE PROCEDURE sp_customer_select_user_by_name
(
    v_member_name     IN    member.member_name%TYPE,
    result    OUT     SYS_REFCURSOR

)
IS
BEGIN
    OPEN result FOR

    SELECT member_id, member_password, member_name, member_gender, 
    TO_CHAR(member_birthday, 'YYYY-MM-DD'), member_email, member_phone, 
    member_activated, member_terms, TO_CHAR(member_date, 'YYYY-MM-DD')
    FROM MEMBER
    WHERE member_code=1 --소비자
    AND member_name = v_member_name;
END;


-- 친구 추가
CREATE OR REPLACE PROCEDURE sp_customer_insert_friends
(
    v_member_id     IN    friends.member_id%TYPE,
    v_friend_id     IN    friends.friend_id%TYPE
)
IS
BEGIN
    INSERT INTO FRIENDS(FRIENDS_ID, member_id, friend_id)
    VALUES(seq_friends_id.NEXTVAL, v_member_id, v_friend_id);
    COMMIT;
END;


-- 친구 목록 가져오기
CREATE OR REPLACE PROCEDURE sp_customer_select_friends
(
    v_member_id     IN    friends.member_id%TYPE,
    result    OUT     SYS_REFCURSOR
)
IS
BEGIN
    OPEN result FOR
    select member_id, member_name, member_gender, member_birthday, member_email
    from member
    where member_id in (
        select friend_id
        from member innter join friends USING (member_id)
        WHERE member_id = v_member_id);
END;
