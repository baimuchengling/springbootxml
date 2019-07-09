package com.hzl.util;

import java.util.Random;

/**
 * @ClassName: DataUtil
 * @Description:
 * @Author: zhilin
 * @CreateDT: 2019-06-27 23:00
 **/

public class DataUtil {

    public static String generateId(){

        int num=(int)(Math.random()*10000000);
        String str1=String.valueOf(num);
        Random random=new Random();
        char chr=(char)(random.nextInt(26)+65);
        String str2=String.valueOf(chr);

        return str2+str1;
    }

}
