package com.adapter.util;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
/**
 * Created by zhouguizhi on 2017/12/6.
 */
public class ViewCalculateUtil {
    public static void setViewLinearLayoutParam(View view, int width, int height, int leftMargin, int topMargin, int rightMargin, int bottomMargin){
        RelativeLayout.LayoutParams layoutParams=(RelativeLayout.LayoutParams)view.getLayoutParams();
        if(width!= RelativeLayout.LayoutParams.MATCH_PARENT || width!= RelativeLayout.LayoutParams.WRAP_CONTENT){
            layoutParams.width= ScreenUtil.getWidth(width);
        }else{
            layoutParams.width=width;
        }
        if(height!= RelativeLayout.LayoutParams.MATCH_PARENT || height!= RelativeLayout.LayoutParams.WRAP_CONTENT){
            layoutParams.height= ScreenUtil.getHeight(height);
        }else{
            layoutParams.height=height;
        }
        layoutParams.leftMargin= ScreenUtil.getWidth(leftMargin);
        layoutParams.topMargin= ScreenUtil.getHeight(topMargin);
        layoutParams.rightMargin= ScreenUtil.getWidth(rightMargin);
        layoutParams.bottomMargin= ScreenUtil.getHeight(bottomMargin);
        view.setLayoutParams(layoutParams);
    }
    static void scaleTxtSize(View v, float size) {
        if (v!=null&&v instanceof TextView) {
            float txtSize = size / Math.min(ScreenUtil.STANDARD_WIDTH, ScreenUtil.STANDARD_HEIGHT) * Math.min(ScreenUtil.getScreenWidth(), ScreenUtil.getScreenHeight()) / ScreenUtil.getScaledDensity();
            ((TextView) v).setTextSize(txtSize);
        }
    }
}











