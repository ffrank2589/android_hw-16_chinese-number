package com.example.lib;

public class hw16 {
    public static void main(String agrs[])
    {
        long number=1929;
        String num[]={"零","壹","貳","?","肆","伍","陸","柒","捌","玖"};

        String num1[]={"拾","佰","仟","萬","拾萬","百萬","仟萬","億","拾億","百億","仟億"},
                je[]=new String[30];

        int n=agrs.length;

        if(n==0)
            System.out.println("輸入："+number+"");

        else
        {
            number=Long.parseLong(agrs[n-1]);
        }

        int bitt=0,j,k=-1,i=0;


        while(number!=0)
        {
            bitt=(int)(number%10L);


            for(j=0;j<num.length;j++)
            {
                if(j==bitt)break;
            }


            if(k!=-1){je[i]=num1[k];i++;}
            je[i]=num[j];i++;
            number=number/10;
            k++;
            if(number==0)
            {

                System.out.print("輸出：");
                i--;
                for(;i>=0;i--)
                    System.out.print(je[i]);
            }

        }

    }
}
