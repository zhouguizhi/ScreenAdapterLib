# ScreenAdapterLib
屏幕适配框架第一个版本
在使用之前一定要在Applicaiton或者activity中调用 AdapterUtil.init(this);这个代码,传递上下文.
使用在demo中已有写了,此框架只做了针对RelativeLayout做了封装,如果在xml中使用,就一定要使用这个写的自定义CustomAdapterRelativeLayout,或者是嵌套使用
