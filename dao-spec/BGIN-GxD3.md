###FOR **BGIN.GxD3** created DAO `bginGxD3Query_Month` for **MONTH** Level aggregation
with params###

> * period_start = **[YYYY].[MM]** (where YYYY=year and MM=month without 0 for valuse <10 eg `[2016].[4]`)
> * period_end = **[YYYY].[MM]** (where YYYY=year and MM=month without 0 for valuse <10 eg `[2016].[10]`)
> * org_name = **[Organization name]** (eg `[AssosPlayCOM]`) 

URL CALL 
```bash
http://bap.avacspro.com/pentaho/plugin/cda/api/doQuery?path=/public/AvacsPro/api/asm/bgin-widget.cda&dataAccessId=bginGxD3Query_Month&paramperiod_start=[2016].[4]&paramperiod_end=[2016].[7]&paramorg_name=[AssosPlayCOM]
```

JSON RESPONSE
```
{  
   "queryInfo":{  
      "totalRows":"16"
   },
   "resultset":[  
      [  
         "All Section Areas",
         "4",
         "[2016].[4]",
         14167.74,
         47.47508814004976
      ],
      [  
         "All Section Areas",
         "5",
         "[2016].[5]",
         60639.27,
         328.00947787014724
      ],
      [  
         "All Section Areas",
         "6",
         "[2016].[6]",
         29297.35,
         -51.68584648199096
      ],
      [  
         "All Section Areas",
         "7",
         "[2016].[7]",
         7837.18,
         -73.24952598101876
      ],
      [  
         "Casino Section",
         "4",
         "[2016].[4]",
         227.95,
         -82.44715666268817
      ],
      [  
         "Casino Section",
         "5",
         "[2016].[5]",
         50187.88,
         21917.056372011408
      ],
      [  
         "Casino Section",
         "6",
         "[2016].[6]",
         19773.95,
         -60.60014888056639
      ],
      [  
         "Casino Section",
         "7",
         "[2016].[7]",
         4250.91,
         -78.50247421481292
      ],
      [  
         "Arena Section",
         "4",
         "[2016].[4]",
         32,
         -11.11111111111111
      ],
      [  
         "Arena Section",
         "5",
         "[2016].[5]",
         15,
         -53.125
      ],
      [  
         "Arena Section",
         "6",
         "[2016].[6]",
         6,
         -60
      ],
      [  
         "Arena Section",
         "7",
         "[2016].[7]",
         64.1,
         968.3333333333331
      ],
      [  
         "Sport Section",
         "4",
         "[2016].[4]",
         13907.79,
         68.12645214948347
      ],
      [  
         "Sport Section",
         "5",
         "[2016].[5]",
         10436.39,
         -24.96011228239714
      ],
      [  
         "Sport Section",
         "6",
         "[2016].[6]",
         9517.4,
         -8.805631065914552
      ],
      [  
         "Sport Section",
         "7",
         "[2016].[7]",
         3522.17,
         -62.99230882383844
      ]
   ],
   "metadata":[  
      {  
         "colIndex":0,
         "colType":"String",
         "colName":"Section Area"
      },
      {  
         "colIndex":1,
         "colType":"String",
         "colName":"Period"
      },
      {  
         "colIndex":2,
         "colType":"String",
         "colName":"Period_id"
      },
      {  
         "colIndex":3,
         "colType":"Numeric",
         "colName":"BetAmount"
      },
      {  
         "colIndex":4,
         "colType":"Numeric",
         "colName":"BetPercent"
      }
   ]
}
```
WHERE METADATA
> * **Section Area**: Column for Section/Product (All , Arena, Sport, Casino section) 
> * **Period**: Column for Low level time dimension single value 
> * **Period_id**: Column for time complete value for the aggregation level with format [YYYY].[MM]| (where YYYY=year and MM=month eg. `[2016].[4]`) 
> * **BetAmount**: Column for Bet Amount summed over the aggregation level 
> * **BetPercent**: Column for Bet % change calculated over the aggregation level

FOR **BGIN.GxD3** created DAO `bginGxD3Query_Week` for **WEEK** Level aggregation
with params
> * period_start = **[YYYY].[MM].[DD]** (where YYYY=year, MM=Month and DD=Day without 0 for valuse <10 eg `[2016].[5].[8]`)
> * period_end = **[YYYY].[MM].[DD]** (where YYYY=year, MM=month and DD=day without 0 for valuse <10 eg `[2016].[7].[18]`)
> * org_name = **[Organization name]** (eg `[AssosPlayCOM]`) 

URL CALL 
```bash
http://bap.avacspro.com/pentaho/plugin/cda/api/doQuery?path=/public/AvacsPro/api/asm/bgin-widget.cda&dataAccessId=bginGxD3Query_Week&paramperiod_start=[2016].[5].[8]&paramperiod_end=[2016].[7].[18]&paramorg_name=[AssosPlayCOM]
```

JSON RESPONSE
```
{  
   "queryInfo":{  
      "totalRows":"48"
   },
   "resultset":[  
      [  
         "All Section Areas",
         "18",
         "[2016].[18]",
         3283.9,
         521.5858113607542
      ],
      [  
         "All Section Areas",
         "19",
         "[2016].[19]",
         2994.58,
         -8.81025609793234
      ],
      [  
         "All Section Areas",
         "20",
         "[2016].[20]",
         5929.24,
         97.99905161992668
      ],
      [  
         "All Section Areas",
         "21",
         "[2016].[21]",
         24763.29,
         317.64694969338404
      ],
      [  
         "All Section Areas",
         "22",
         "[2016].[22]",
         29791.28,
         20.304208366497335
      ],
      [  
         "All Section Areas",
         "23",
         "[2016].[23]",
         6022.12,
         -79.78562854633974
      ],
      [  
         "All Section Areas",
         "24",
         "[2016].[24]",
         5201.22,
         -13.631412193712508
      ],
      [  
         "All Section Areas",
         "25",
         "[2016].[25]",
         5771.03,
         10.955314330099467
      ],
      [  
         "All Section Areas",
         "26",
         "[2016].[26]",
         6077.34,
         5.307718033002781
      ],
      [  
         "All Section Areas",
         "27",
         "[2016].[27]",
         1755.07,
         -71.12108257889143
      ],
      [  
         "All Section Areas",
         "28",
         "[2016].[28]",
         1929.33,
         9.928948702900739
      ],
      [  
         "All Section Areas",
         "29",
         "[2016].[29]",
         3955.4,
         105.01417590562528
      ],
      [  
         "Casino Section",
         "18",
         "[2016].[18]",
         4,
         -86.82042833607908
      ],
      [  
         "Casino Section",
         "19",
         "[2016].[19]",
         19.55,
         388.75
      ],
      [  
         "Casino Section",
         "20",
         "[2016].[20]",
         5298.8,
         27003.836317135552
      ],
      [  
         "Casino Section",
         "21",
         "[2016].[21]",
         21591.88,
         307.4862232958406
      ],
      [  
         "Casino Section",
         "22",
         "[2016].[22]",
         26554.95,
         22.985816890423617
      ],
      [  
         "Casino Section",
         "23",
         "[2016].[23]",
         1393.95,
         -94.75069619788401
      ],
      [  
         "Casino Section",
         "24",
         "[2016].[24]",
         4231.5,
         203.56182072527707
      ],
      [  
         "Casino Section",
         "25",
         "[2016].[25]",
         5256.45,
         24.221907125132926
      ],
      [  
         "Casino Section",
         "26",
         "[2016].[26]",
         5611.85,
         6.761217171284812
      ],
      [  
         "Casino Section",
         "27",
         "[2016].[27]",
         1256.66,
         -77.6070279854237
      ],
      [  
         "Casino Section",
         "28",
         "[2016].[28]",
         18.7,
         -98.51192844524374
      ],
      [  
         "Casino Section",
         "29",
         "[2016].[29]",
         2974.45,
         15806.14973262032
      ],
      [  
         "Arena Section",
         "18",
         "[2016].[18]",
         4,
         300
      ],
      [  
         "Arena Section",
         "19",
         "[2016].[19]",
         8,
         100
      ],
      [  
         "Arena Section",
         "20",
         "[2016].[20]",
         3,
         -62.5
      ],
      [  
         "Arena Section",
         "21",
         "[2016].[21]",
         null,
         -100
      ],
      [  
         "Arena Section",
         "22",
         "[2016].[22]",
         2,
         null
      ],
      [  
         "Arena Section",
         "23",
         "[2016].[23]",
         null,
         -100
      ],
      [  
         "Arena Section",
         "24",
         "[2016].[24]",
         null,
         null
      ],
      [  
         "Arena Section",
         "25",
         "[2016].[25]",
         2,
         null
      ],
      [  
         "Arena Section",
         "26",
         "[2016].[26]",
         3,
         50
      ],
      [  
         "Arena Section",
         "27",
         "[2016].[27]",
         12,
         300
      ],
      [  
         "Arena Section",
         "28",
         "[2016].[28]",
         21,
         75
      ],
      [  
         "Arena Section",
         "29",
         "[2016].[29]",
         30.1,
         43.33333333333334
      ],
      [  
         "Sport Section",
         "18",
         "[2016].[18]",
         3275.9,
         559.1878622021893
      ],
      [  
         "Sport Section",
         "19",
         "[2016].[19]",
         2967.03,
         -9.428553985164378
      ],
      [  
         "Sport Section",
         "20",
         "[2016].[20]",
         627.44,
         -78.85292700107514
      ],
      [  
         "Sport Section",
         "21",
         "[2016].[21]",
         3171.41,
         405.4523141654978
      ],
      [  
         "Sport Section",
         "22",
         "[2016].[22]",
         3234.33,
         1.983975581838995
      ],
      [  
         "Sport Section",
         "23",
         "[2016].[23]",
         4628.17,
         43.095169633278
      ],
      [  
         "Sport Section",
         "24",
         "[2016].[24]",
         969.72,
         -79.0474420775382
      ],
      [  
         "Sport Section",
         "25",
         "[2016].[25]",
         512.58,
         -47.14144289073134
      ],
      [  
         "Sport Section",
         "26",
         "[2016].[26]",
         462.49,
         -9.772133130438181
      ],
      [  
         "Sport Section",
         "27",
         "[2016].[27]",
         486.41,
         5.172003718999333
      ],
      [  
         "Sport Section",
         "28",
         "[2016].[28]",
         1889.63,
         288.48502292304846
      ],
      [  
         "Sport Section",
         "29",
         "[2016].[29]",
         950.85,
         -49.680625307599904
      ]
   ],
   "metadata":[  
      {  
         "colIndex":0,
         "colType":"String",
         "colName":"Section Area"
      },
      {  
         "colIndex":1,
         "colType":"String",
         "colName":"Period"
      },
      {  
         "colIndex":2,
         "colType":"String",
         "colName":"Period_id"
      },
      {  
         "colIndex":3,
         "colType":"Numeric",
         "colName":"BetAmount"
      },
      {  
         "colIndex":4,
         "colType":"Numeric",
         "colName":"BetPercent"
      }
   ]
}
```
WHERE METADATA
> * **Section Area**: Column for Section/Product (All , Arena, Sport, Casino section). 
> * **Period**: Column for Low level time dimension single value. 
> * **Period_id**: Column for time complete value for the aggregation level with format \[YYYY].[WW\] (where YYYY=year and WW=week eg. `[2016].[29]` using the Standard `ISO 8601` convention numbering). 
> * **BetAmount**: Column for Bet Amount summed over the aggregation level. 
> * **BetPercent**: Column for Bet % change calculated over the aggregation level.
