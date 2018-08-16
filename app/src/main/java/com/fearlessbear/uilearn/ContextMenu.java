package com.fearlessbear.uilearn;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;

/**
 * Created by BigFaceBear on 2018.08.04
 */

public class ContextMenu extends View {

    public ContextMenu(Context context) {
        super(context);
    }

    public ContextMenu(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ContextMenu(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onCreateContextMenu(android.view.ContextMenu menu) {
        super.onCreateContextMenu(menu);

        menu.add(Menu.NONE, 101, 101,"自定义")
                .setAlphabeticShortcut('z')
                .setOnMenuItemClickListener(null)
                .setEnabled(true);
    }
}
