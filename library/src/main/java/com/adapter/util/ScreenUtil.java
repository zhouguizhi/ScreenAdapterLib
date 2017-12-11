package com.adapter.util;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;

/**
 * Created by zhouguizhi on 2017/12/6.
 */
public final class ScreenUtil {
    static int DEFAULTSYSTEMBAR = 48;//默认状态栏的高度
    static int STANDARD_WIDTH = 1080;
    static int STANDARD_HEIGHT = 1920-DEFAULTSYSTEMBAR;//这里是以宽为1080 高度要减少状态栏的值为高的基准值为适配的标准
    private static int screenWidth;
    private static int screenHeight;
    private static float scaledDensity;
    private ScreenUtil(){}
    static int getScreenWidth() {
        return screenWidth;
    }
    static int getScreenHeight() {
        return screenHeight;
    }
    //开始获取缩放以后的结果
    public static float getWidth(float width){
        return width*screenWidth/STANDARD_WIDTH;
    }

    public static float getHeight(float height){
        return height*screenHeight/STANDARD_HEIGHT;
    }

    static int getWidth(int width){
        return (width*screenWidth/STANDARD_WIDTH);
    }
    static int getHeight(int height){
        return (height*screenHeight/STANDARD_HEIGHT);
    }

    static void init(Context context) {
        if(null!=context){
            WindowManager windowManager = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int systemBarHeight = SystemBarUtil.getSystemBarHeight(context);
            scaledDensity = displayMetrics.scaledDensity;
            if(displayMetrics.widthPixels>displayMetrics.heightPixels) {//适配平板
                screenWidth=displayMetrics.heightPixels;
                screenHeight=displayMetrics.widthPixels-systemBarHeight;
            }else{
                screenWidth=displayMetrics.widthPixels;
                screenHeight=displayMetrics.heightPixels;
                Log.e("ScreenUtil","screenWidth="+screenWidth);
                Log.e("ScreenUtil","screenHeight="+screenHeight);
            }
        }
    }
    static float getScaledDensity() {
        return scaledDensity;
    }
}
