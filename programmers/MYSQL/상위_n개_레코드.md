# 상위 n개 레코드

> programmers
> 

---

`ANIMAL_INS` 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다. `ANIMAL_INS` 테이블 구조는 다음과 같으며, `ANIMAL_ID`, `ANIMAL_TYPE`, `DATETIME`, `INTAKE_CONDITION`, `NAME`, `SEX_UPON_INTAKE`는 각각 동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.

동물 보호소에 가장 먼저 들어온 동물의 이름을 조회하는 SQL 문을 작성해주세요.

```sql
SELECT
    NAME
FROM
    ANIMAL_INS
ORDER BY 
    DATETIME ASC LIMIT 1;
```

<aside>
❓ 요구하는 조건에서 NAME만 나오게 해야하므로 ANIMAL_INS 테이블에서 NAME만 가져오도록 SELECT문을 구성하고, 보호소에 가장 먼저 들어온 동물 한마리만 나오게 해야하므로 DATETIME을 ASC를 사용하여 오름차순으로 정렬하고 그 중에 한마리만 보이게 하기 위해 LIMIT 1 으로 제한을 걸어준다.

</aside>