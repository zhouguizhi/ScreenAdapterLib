package com.adapter.view;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.adapter.R;
import com.adapter.util.ScreenUtil;

public class CustomAdapterRelativeLayout extends RelativeLayout{
    public CustomAdapterRelativeLayout(Context context) {
        super(context);
    }
    public CustomAdapterRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public CustomAdapterRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width= MeasureSpec.getSize(widthMeasureSpec);
        int height= MeasureSpec.getSize(heightMeasureSpec);
        //测量出子控件的宽高进行改变
        int childCount=this.getChildCount();
        for(int i =0;i<childCount;i++){
            View child=this.getChildAt(i);
            RelativeLayout.LayoutParams layoutParams= (RelativeLayout.LayoutParams) child.getLayoutParams();
            layoutParams.width = (int) ScreenUtil.getWidth(((LayoutParams)layoutParams).getWidth());
            layoutParams.height = (int) ScreenUtil.getHeight(((LayoutParams)layoutParams).getHeight());
            layoutParams.leftMargin= (int) ScreenUtil.getWidth(((LayoutParams)layoutParams).getMarginLeft());
            layoutParams.topMargin= (int) ScreenUtil.getHeight (((LayoutParams)layoutParams).getMarginTop());
            layoutParams.rightMargin= (int) ScreenUtil.getWidth(((LayoutParams)layoutParams).getMarginRight());
            layoutParams.bottomMargin= (int)ScreenUtil.getHeight (((LayoutParams)layoutParams).getMarginBottom());
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }
    @Override
    public RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(),attrs);
    }
    public static class LayoutParams extends RelativeLayout.LayoutParams{
        private  int marginBottom;
        private  int marginRight;
        private  int marginTop;
        private  int marginLeft;
        private  int width;
        private  int height;
        private  float textSize;
        public LayoutParams(Context c, AttributeSet attrs) {
            super(c, attrs);
            TypedArray array=c.obtainStyledAttributes(attrs,R.styleable.CustomRelativeLayout);
            width=array.getInt(R.styleable.CustomRelativeLayout_custom_layout_width,0);
            height=array.getInt(R.styleable.CustomRelativeLayout_custom_layout_height,0);
            marginBottom=array.getInt(R.styleable.CustomRelativeLayout_custom_layout_marginBottom,0);
            marginRight=array.getInt(R.styleable.CustomRelativeLayout_custom_layout_marginRight,0);
            marginTop=array.getInt(R.styleable.CustomRelativeLayout_custom_layout_marginTop,0);
            marginLeft=array.getInt(R.styleable.CustomRelativeLayout_custom_layout_marginLeft,0);
            textSize = array.getFloat(R.styleable.CustomRelativeLayout_custom_text_size,14);
        }
        public float getMarginBottom() {
            return marginBottom;
        }

        public float getMarginRight() {
            return marginRight;
        }

        public float getMarginTop() {
            return marginTop;
        }

        public float getMarginLeft() {
            return marginLeft;
        }

        public float getWidth() {
            return width;
        }

        public float getHeight() {
            return height;
        }

        public float getTextSize() {
            return textSize;
        }
    }
}



