package com.fearlessbear.uilearn;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by BigFaceBear on 2018.08.16
 */

public class LayoutLineHeightView extends TextView {
    public LayoutLineHeightView(Context context) {
        super(context);
    }

    public LayoutLineHeightView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LayoutLineHeightView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public int getLineHeight(int line) {
        return getLayout().getLineTop(line);
    }
}
