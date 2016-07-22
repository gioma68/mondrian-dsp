FOR **TNET.GxD5** created DAO `tnetGxD5Query_Month` for **MONTH** Level aggregation
with params
> * period_start = **[YYYY].[MM]** (where YYYY=year and MM=month without 0 for valuse <10 eg `[2016].[4]`)
> * period_end = **[YYYY].[MM]** (where YYYY=year and MM=month without 0 for valuse <10 eg `[2016].[10]`)
> * org_name = **[Organization name]** (eg `[AssosPlayCOM]`) 

URL CALL 
```bash
http://bap.avacspro.com/pentaho/plugin/cda/api/doQuery?path=/public/AvacsPro/api/asm/tnet-widget.cda&dataAccessId=tnetGxD5Query_Month&paramperiod_start=[2016].[4]&paramperiod_end=[2016].[7]&paramorg_name=[AssosPlayCOM]
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
         2994.3199999999997,
         303.4819166711578
      ],
      [  
         "All Section Areas",
         "5",
         "[2016].[5]",
         2515.5,
         -15.990942851799398
      ],
      [  
         "All Section Areas",
         "6",
         "[2016].[6]",
         3301.5699999999997,
         31.249055853707002
      ],
      [  
         "All Section Areas",
         "7",
         "[2016].[7]",
         1249.2000000000007,
         -62.16345556810848
      ],
      [  
         "Casino Section",
         "4",
         "[2016].[4]",
         60.06,
         -71.53689398606701
      ],
      [  
         "Casino Section",
         "5",
         "[2016].[5]",
         2252.9199999999983,
         3651.115551115548
      ],
      [  
         "Casino Section",
         "6",
         "[2016].[6]",
         3934.42,
         74.63647177884715
      ],
      [  
         "Casino Section",
         "7",
         "[2016].[7]",
         409.03999999999996,
         -89.60355020562116
      ],
      [  
         "Arena Section",
         "4",
         "[2016].[4]",
         12.68,
         -7.848837209302338
      ],
      [  
         "Arena Section",
         "5",
         "[2016].[5]",
         -16.28,
         -228.391167192429
      ],
      [  
         "Arena Section",
         "6",
         "[2016].[6]",
         4,
         124.57002457002457
      ],
      [  
         "Arena Section",
         "7",
         "[2016].[7]",
         -26.78,
         -769.5
      ],
      [  
         "Sport Section",
         "4",
         "[2016].[4]",
         2921.5800000000017,
         464.7202087561621
      ],
      [  
         "Sport Section",
         "5",
         "[2016].[5]",
         278.85999999999876,
         -90.45516467117113
      ],
      [  
         "Sport Section",
         "6",
         "[2016].[6]",
         -636.8500000000004,
         -328.37624614502016
      ],
      [  
         "Sport Section",
         "7",
         "[2016].[7]",
         866.94,
         236.1293868257831
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
         "colName":"Time"
      },
      {  
         "colIndex":2,
         "colType":"String",
         "colName":"Period_id"
      },
      {  
         "colIndex":3,
         "colType":"Numeric",
         "colName":"NetProfit"
      },
      {  
         "colIndex":4,
         "colType":"Numeric",
         "colName":"NetPercent"
      }
   ]
}
```
WHERE METADATA
> * **Section Area**: Column for Section/Product (All , Arena, Sport, Casino section) 
> * **Time**: Column for Low level time dimension single value 
> * **Period_id**: Column for time complete value for the aggregation level with format [YYYY].[MM]| (where YYYY=year and MM=month eg. `[2016].[4]`) 
> * **NetProfit**: Column for Net Profit summed over the aggregation level 
> * **NetPercent**: Column for Net % change calculated over the aggregation level

FOR **TNET.GxD5** created DAO `tnetGxD5Query_Week` for **WEEK** Level aggregation
with params
> * period_start = **[YYYY].[MM].[DD]** (where YYYY=year, MM=Month and DD=Day without 0 for valuse <10 eg `[2016].[5].[8]`)
> * period_end = **[YYYY].[MM].[DD]** (where YYYY=year, MM=month and DD=day without 0 for valuse <10 eg `[2016].[7].[18]`)
> * org_name = **[Organization name]** (eg `[AssosPlayCOM]`) 

URL CALL 
```bash
http://bap.avacspro.com/pentaho/plugin/cda/api/doQuery?path=/public/AvacsPro/api/asm/tnet-widget.cda&dataAccessId=tnetGxD5Query_Week&paramperiod_start=[2016].[5].[8]&paramperiod_end=[2016].[7].[18]&paramorg_name=[AssosPlayCOM]
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
         -628.48,
         -1177.1387929282657
      ],
      [  
         "All Section Areas",
         "19",
         "[2016].[19]",
         952.6999999999998,
         251.5879582484725
      ],
      [  
         "All Section Areas",
         "20",
         "[2016].[20]",
         1310.9699999999993,
         37.605752073055484
      ],
      [  
         "All Section Areas",
         "21",
         "[2016].[21]",
         609.8100000000013,
         -53.484061420169674
      ],
      [  
         "All Section Areas",
         "22",
         "[2016].[22]",
         1024.5200000000004,
         68.00642823174402
      ],
      [  
         "All Section Areas",
         "23",
         "[2016].[23]",
         322.1700000000001,
         -68.55405458165775
      ],
      [  
         "All Section Areas",
         "24",
         "[2016].[24]",
         50.99000000000069,
         -84.17295216810979
      ],
      [  
         "All Section Areas",
         "25",
         "[2016].[25]",
         838,
         1543.4595018630882
      ],
      [  
         "All Section Areas",
         "26",
         "[2016].[26]",
         1528.37,
         82.38305489260142
      ],
      [  
         "All Section Areas",
         "27",
         "[2016].[27]",
         -202.6400000000001,
         -113.2585695872073
      ],
      [  
         "All Section Areas",
         "28",
         "[2016].[28]",
         836.05,
         512.5789577575995
      ],
      [  
         "All Section Areas",
         "29",
         "[2016].[29]",
         444.8899999999999,
         -46.786675438071896
      ],
      [  
         "Casino Section",
         "18",
         "[2016].[18]",
         -2.5999999999999996,
         -206.99588477366257
      ],
      [  
         "Casino Section",
         "19",
         "[2016].[19]",
         12.830000000000002,
         593.4615384615386
      ],
      [  
         "Casino Section",
         "20",
         "[2016].[20]",
         1208.3700000000003,
         9318.316445830087
      ],
      [  
         "Casino Section",
         "21",
         "[2016].[21]",
         182.70000000000073,
         -84.88045879987084
      ],
      [  
         "Casino Section",
         "22",
         "[2016].[22]",
         1545.0699999999997,
         745.6869184455356
      ],
      [  
         "Casino Section",
         "23",
         "[2016].[23]",
         516.9300000000001,
         -66.54326341201369
      ],
      [  
         "Casino Section",
         "24",
         "[2016].[24]",
         597.0999999999999,
         15.508869672876374
      ],
      [  
         "Casino Section",
         "25",
         "[2016].[25]",
         729,
         22.090102160442154
      ],
      [  
         "Casino Section",
         "26",
         "[2016].[26]",
         1398.8700000000008,
         91.888888888889
      ],
      [  
         "Casino Section",
         "27",
         "[2016].[27]",
         -30.159999999999854,
         -102.15602593521913
      ],
      [  
         "Casino Section",
         "28",
         "[2016].[28]",
         8.229999999999999,
         127.28779840848819
      ],
      [  
         "Casino Section",
         "29",
         "[2016].[29]",
         430.03999999999996,
         5125.273390036453
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
         -8.559999999999999,
         -313.99999999999994
      ],
      [  
         "Arena Section",
         "20",
         "[2016].[20]",
         -11.72,
         -36.915887850467314
      ],
      [  
         "Arena Section",
         "21",
         "[2016].[21]",
         null,
         100
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
         1,
         -50
      ],
      [  
         "Arena Section",
         "27",
         "[2016].[27]",
         -1.3399999999999999,
         -234
      ],
      [  
         "Arena Section",
         "28",
         "[2016].[28]",
         1.3500000000000014,
         200.74626865671652
      ],
      [  
         "Arena Section",
         "29",
         "[2016].[29]",
         -27.79,
         -2158.5185185185164
      ],
      [  
         "Sport Section",
         "18",
         "[2016].[18]",
         -629.8800000000001,
         -1096.580547112461
      ],
      [  
         "Sport Section",
         "19",
         "[2016].[19]",
         948.4300000000003,
         250.57312503969013
      ],
      [  
         "Sport Section",
         "20",
         "[2016].[20]",
         114.32000000000005,
         -87.94639562223885
      ],
      [  
         "Sport Section",
         "21",
         "[2016].[21]",
         427.1099999999997,
         273.6091672498246
      ],
      [  
         "Sport Section",
         "22",
         "[2016].[22]",
         -522.5500000000002,
         -222.3455315960761
      ],
      [  
         "Sport Section",
         "23",
         "[2016].[23]",
         -194.76000000000022,
         62.72892546167827
      ],
      [  
         "Sport Section",
         "24",
         "[2016].[24]",
         -546.1099999999999,
         -180.40151981926437
      ],
      [  
         "Sport Section",
         "25",
         "[2016].[25]",
         107.00000000000006,
         119.5931222647452
      ],
      [  
         "Sport Section",
         "26",
         "[2016].[26]",
         128.5,
         20.09345794392517
      ],
      [  
         "Sport Section",
         "27",
         "[2016].[27]",
         -171.13999999999993,
         -233.18287937743185
      ],
      [  
         "Sport Section",
         "28",
         "[2016].[28]",
         826.47,
         582.9204160336569
      ],
      [  
         "Sport Section",
         "29",
         "[2016].[29]",
         42.639999999999986,
         -94.84070807167835
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
         "colName":"NetProfit"
      },
      {  
         "colIndex":4,
         "colType":"Numeric",
         "colName":"NetPercent"
      }
   ]
}
```
WHERE METADATA
> * **Section Area**: Column for Section/Product (All , Arena, Sport, Casino section) 
> * **Period**: Column for Low level time dimension single value 
> * **Period_id**: Column for time complete value for the aggregation level with format [YYYY].[WW] (where YYYY=year and WW=week eg. `[2016].[29]` using the Standard `ISO 8601` convention numbering) 
> * **NetProfit**: Column for Net Profit summed over the aggregation level 
> * **NetPercent**: Column for Net % change calculated over the aggregation level
