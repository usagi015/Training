-- 「FROM purchases」のあとにコードを追加し、priceカラムがNULLでないデータを取得してください

SELECT *
FROM purchases
WHERE price IS NOT NULL;