package com.adapter.util;
import android.content.Context;
import android.view.View;
/**
 * Created by zhouguizhi on 2017/12/6.
 */
public final class AdapterUtil {
    private static int screenWidth;
    private static int screenHeight;
    private AdapterUtil(){}
    public static void init(Context context){
        if(null!=context) {
            ScreenUtil.init(context.getApplicationContext());
        }
    }
    public static void setMargin(View view, int w, int h, int l, int t, int r, int b){
        if(null==view){
            return;
        }
        ViewCalculateUtil.setViewLinearLayoutParam(view,w,h,l,t,r,b);
    }
    public static void setMargin(View view, int w, int h){
        if(null==view){
            return;
        }
        ViewCalculateUtil.setViewLinearLayoutParam(view,w,h,0,0,0,0);
    }
    public static void setMargin(View view, int w, int h, int l, int t){
        if(null==view){
            return;
        }
        ViewCalculateUtil.setViewLinearLayoutParam(view,w,h,l,t,0,0);
    }
    public static void scaleTxtSize(View v, float size) {
        ViewCalculateUtil.scaleTxtSize(v,size);
    }
    public static int getHeight(int height){
        return ScreenUtil.getHeight(height);
    }
}
