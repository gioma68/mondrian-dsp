FOR **(TNET.GxD5)** created DAO `tnetGxD5Query_MW`
with params
> * period_start = **[YYYY].[MM]** (+[WW] if period = Week eg `[2016].[4].[13]` for the 13st week of 2016 that is in April month)
> * period_end = **[YYYY].[MM]** (+[WW] if period = Week eg `[2016].[7].[29]` for the 29st week of 2016 that is in July month)
> * period = **Week|Month** (first letter Uppercase, eg `Week`) to select the aggregation level
> * org_name = **[Organization name]** (eg `[AssosPlayCOM]`) 

URL CALL 
```bash
http://bap.avacspro.com/pentaho/plugin/cda/api/doQuery?path=/public/AvacsPro/api/asm/tnet-widget.cda&dataAccessId=tnetGxD5Query_MW&paramperiod_start=[2016].[4].[13]&paramperiod_end=[2016].[7].[29]&paramorg_name=[AssosPlayCOM]&paramperiod=Week
```

JSON RESPONSE (for` Week` level)
```
{  
   "queryInfo":{  
      "totalRows":"52"
   },
   "resultset":[  
      [  
         "All Section Areas",
         "19",
         "[2016].[5].[19]",
         2994.58,
         -8.81025609793234
      ],
      [  
         "All Section Areas",
         "20",
         "[2016].[5].[20]",
         5929.24,
         97.99905161992668
      ],
      [  
         "All Section Areas",
         "21",
         "[2016].[5].[21]",
         24763.29,
         317.64694969338404
      ],
      [  
         "All Section Areas",
         "22",
         "[2016].[5].[22]",
         23368.26,
         -5.633459851255639
      ],
      [  
         "All Section Areas",
         "22",
         "[2016].[6].[22]",
         6423.02,
         -72.51391417247154
      ],
      [  
         "All Section Areas",
         "23",
         "[2016].[6].[23]",
         6022.12,
         -6.241612201114126
      ],
      [  
         "All Section Areas",
         "24",
         "[2016].[6].[24]",
         5201.22,
         -13.631412193712508
      ],
      [  
         "All Section Areas",
         "25",
         "[2016].[6].[25]",
         5771.03,
         10.955314330099467
      ],
      [  
         "All Section Areas",
         "26",
         "[2016].[6].[26]",
         5879.96,
         1.8875313418921804
      ],
      [  
         "All Section Areas",
         "26",
         "[2016].[7].[26]",
         197.38,
         -96.64317444336355
      ],
      [  
         "All Section Areas",
         "27",
         "[2016].[7].[27]",
         1755.07,
         789.183301246327
      ],
      [  
         "All Section Areas",
         "28",
         "[2016].[7].[28]",
         1929.33,
         9.928948702900739
      ],
      [  
         "All Section Areas",
         "29",
         "[2016].[7].[29]",
         425.82,
         -77.92912565502014
      ],
      [  
         "Casino Section",
         "19",
         "[2016].[5].[19]",
         19.55,
         388.75
      ],
      [  
         "Casino Section",
         "20",
         "[2016].[5].[20]",
         5298.8,
         27003.836317135552
      ],
      [  
         "Casino Section",
         "21",
         "[2016].[5].[21]",
         21591.88,
         307.4862232958406
      ],
      [  
         "Casino Section",
         "22",
         "[2016].[5].[22]",
         23273.65,
         7.788900271768834
      ],
      [  
         "Casino Section",
         "22",
         "[2016].[6].[22]",
         3281.3,
         -85.90122305697646
      ],
      [  
         "Casino Section",
         "23",
         "[2016].[6].[23]",
         1393.95,
         -57.51836162496572
      ],
      [  
         "Casino Section",
         "24",
         "[2016].[6].[24]",
         4231.5,
         203.56182072527707
      ],
      [  
         "Casino Section",
         "25",
         "[2016].[6].[25]",
         5256.45,
         24.221907125132926
      ],
      [  
         "Casino Section",
         "26",
         "[2016].[6].[26]",
         5610.75,
         6.740290500242563
      ],
      [  
         "Casino Section",
         "26",
         "[2016].[7].[26]",
         1.1,
         -99.98039477788174
      ],
      [  
         "Casino Section",
         "27",
         "[2016].[7].[27]",
         1256.66,
         114141.81818181819
      ],
      [  
         "Casino Section",
         "28",
         "[2016].[7].[28]",
         18.7,
         -98.51192844524374
      ],
      [  
         "Casino Section",
         "29",
         "[2016].[7].[29]",
         null,
         -100
      ],
      [  
         "Arena Section",
         "19",
         "[2016].[5].[19]",
         8,
         100
      ],
      [  
         "Arena Section",
         "20",
         "[2016].[5].[20]",
         3,
         -62.5
      ],
      [  
         "Arena Section",
         "21",
         "[2016].[5].[21]",
         null,
         -100
      ],
      [  
         "Arena Section",
         "22",
         "[2016].[5].[22]",
         null,
         null
      ],
      [  
         "Arena Section",
         "22",
         "[2016].[6].[22]",
         2,
         null
      ],
      [  
         "Arena Section",
         "23",
         "[2016].[6].[23]",
         null,
         -100
      ],
      [  
         "Arena Section",
         "24",
         "[2016].[6].[24]",
         null,
         null
      ],
      [  
         "Arena Section",
         "25",
         "[2016].[6].[25]",
         2,
         null
      ],
      [  
         "Arena Section",
         "26",
         "[2016].[6].[26]",
         2,
         0
      ],
      [  
         "Arena Section",
         "26",
         "[2016].[7].[26]",
         1,
         -50
      ],
      [  
         "Arena Section",
         "27",
         "[2016].[7].[27]",
         12,
         1100
      ],
      [  
         "Arena Section",
         "28",
         "[2016].[7].[28]",
         21,
         75
      ],
      [  
         "Arena Section",
         "29",
         "[2016].[7].[29]",
         28,
         33.33333333333333
      ],
      [  
         "Sport Section",
         "19",
         "[2016].[5].[19]",
         2967.03,
         -9.428553985164378
      ],
      [  
         "Sport Section",
         "20",
         "[2016].[5].[20]",
         627.44,
         -78.85292700107514
      ],
      [  
         "Sport Section",
         "21",
         "[2016].[5].[21]",
         3171.41,
         405.4523141654978
      ],
      [  
         "Sport Section",
         "22",
         "[2016].[5].[22]",
         94.61,
         -97.01678433252087
      ],
      [  
         "Sport Section",
         "22",
         "[2016].[6].[22]",
         3139.72,
         3218.5921149984138
      ],
      [  
         "Sport Section",
         "23",
         "[2016].[6].[23]",
         4628.17,
         47.40709362618324
      ],
      [  
         "Sport Section",
         "24",
         "[2016].[6].[24]",
         969.72,
         -79.0474420775382
      ],
      [  
         "Sport Section",
         "25",
         "[2016].[6].[25]",
         512.58,
         -47.14144289073134
      ],
      [  
         "Sport Section",
         "26",
         "[2016].[6].[26]",
         267.21,
         -47.86960084279528
      ],
      [  
         "Sport Section",
         "26",
         "[2016].[7].[26]",
         195.28,
         -26.918902735676053
      ],
      [  
         "Sport Section",
         "27",
         "[2016].[7].[27]",
         486.41,
         149.08336747234742
      ],
      [  
         "Sport Section",
         "28",
         "[2016].[7].[28]",
         1889.63,
         288.48502292304846
      ],
      [  
         "Sport Section",
         "29",
         "[2016].[7].[29]",
         397.82,
         -78.94720130395898
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
         "colName":"Time.Weekly"
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
> * **Time.Weekly**: Column for Low level time dimension value for the the selected aggregation  level  (Month/Week) 
> * **Period_id**: Column for time complete value for selected level with format [YYYY].[MM]|+[WW](eg for week: [2016].[5].[19]) 
> * **BetAmount**: Column for Bet Amount summed over the selected aggregation level (Month/Week)
> * **BetPercent**: Column for Bet % change calculated over the selected aggregation level (Month/Week)
