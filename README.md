# UVA10038

解題技巧：　判斷公差ｄ是否相鄰

//判斷方法
```
boolean flag=true;
            if(cases != 1)
            {
                int table[] = new int[cases-1];//cases-1原因為５個數字相減後會剩４個數字這樣
                for(int i = 0;i < table.length;i++)
                {
                    table[i] = Math.abs(arr[i] - arr[i+1]);//將陣列元素相減後取絕對值放到table中
                }
                Arrays.sort(table);//排序完畢後可以開始檢查
                for(int i = 0;i < table.length;i++)
                {
                    if(table[i] != i+1)
                    {
                        flag = false;//將對比好整個陣列後放入flag必免重複輸出
                        break;
                    }
                }
            }
```
