FOR **BGIN.GxD3** created DAO `bginGxD3Query_Month` for **MONTH** Level aggregation
with params
> * period_start = **[YYYY].[MM]** (where YYYY=year and MM=Month without 0 for valuse <10 eg `[2016].[4]`)
> * period_end = **[YYYY].[MM]** (where YYYY=year and MM=Month without 0 for valuse <10 eg `[2016].[10]`)
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
> * **Period_id**: Column for time complete value for the aggregation level with format [YYYY].[MM]| (eg. `[2016].[4]`) 
> * **BetAmount**: Column for Bet Amount summed over the aggregation level 
> * **BetPercent**: Column for Bet % change calculated over the aggregation level
