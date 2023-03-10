-- 코드를 입력하세요
SELECT user_id, nickname, concat(city,' ', street_address1,' ',street_address2) as 전체주소, 
    concat(left(TLNO,3),'-',substring(tlno,4,4),'-',right(tlno,4)) as 전화번호
from used_goods_board ugb
join used_goods_user ugu
on ugb.writer_id = ugu.user_id
group by ugb.writer_id
having count(ugb.writer_id) >= 3
order by ugu.user_id DESC