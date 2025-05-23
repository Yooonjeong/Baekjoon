-- 코드를 작성해주세요
WITH RECURSIVE FIND_DEPTH AS (
    SELECT ID, PARENT_ID, 1 AS DEPTH 
    FROM ECOLI_DATA 
    WHERE PARENT_ID IS NULL 
    
    UNION ALL
    
    SELECT A.ID, A.PARENT_ID, B.DEPTH+1 
    FROM ECOLI_DATA A 
    JOIN FIND_DEPTH B 
    ON A.PARENT_ID = B.ID 
)

SELECT COUNT(*) AS COUNT, DEPTH AS GENERATION 
FROM FIND_DEPTH 
WHERE ID NOT IN (SELECT PARENT_ID FROM ECOLI_DATA WHERE PARENT_ID IS NOT NULL) 
GROUP BY DEPTH 
ORDER BY GENERATION;