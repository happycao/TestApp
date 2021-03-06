package com.cl.testapp.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * 支持IconFont的TextView
 * Created by Administrator on 2016-11-25.
 */

public class IconFontView extends AppCompatTextView {

    private static Typeface cachedTypeFace = null;

    public IconFontView(Context context) {
        super(context);
        initFont();
    }

    public IconFontView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initFont();
    }

    public IconFontView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initFont();
    }

    private void initFont() {
        if (cachedTypeFace == null) {
            cachedTypeFace = Typeface.createFromAsset(getContext().getAssets(), "iconfont.ttf");
        }
        setTypeface(cachedTypeFace);
    }

}
