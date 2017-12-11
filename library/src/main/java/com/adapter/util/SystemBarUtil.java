package com.adapter.util;
import android.content.Context;
import android.text.TextUtils;

import java.lang.reflect.Field;
/**
 * Created by zhouguizhi on 2017/12/6.
 */
public class SystemBarUtil {
    /**
     * 获取状态栏的高度
     * @param context 上下文
     */
    static int getSystemBarHeight(Context context) {
        return getValue(context,"com.android.internal.R$dimen","system_bar_height", ScreenUtil.DEFAULTSYSTEMBAR);
    }
    /**
     * 通过反射获取状态栏的高度
     * @param context 上下文
     */
    private static int getValue(Context context, String attrGroupClass, String attrName, int defValue) {
        if(null==context|| TextUtils.isEmpty(attrGroupClass)|| TextUtils.isEmpty(attrName)){
            return 0;
        }
        try {
            Class e= Class.forName(attrGroupClass);
            Object obj=e.newInstance();
            Field field=e.getField(attrName);
            //获取到的是一个ID
            int x= Integer.parseInt(field.get(obj).toString());
            return context.getResources().getDimensionPixelOffset(x);
        } catch (Exception e1) {
            return defValue;
        }
    }
}
