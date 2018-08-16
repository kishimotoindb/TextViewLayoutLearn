package com.fearlessbear.uilearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String TAG = "lineHeight";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LayoutLineHeightView view = (LayoutLineHeightView) findViewById(R.id.text);
        // 2.通过textView的layout拿到的lineTop，line=0的时候，lineTop=0，line高度的坐标系的原点
        //   在第一行的(left,top)，不是textView的原点
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG, "onCreate: line0 is " + view.getLineHeight(0));
//                Log.d(TAG, "onCreate: line1 is " + view.getLineHeight(1));
//                Log.d(TAG, "onCreate: line2 is " + view.getLineHeight(2));
//            }
//        });

        // 1.TextView的lineTop和lineBottom
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int lineBottom = textView.getLayout().getLineBottom(0);
//                int lineBottom1 = textView.getLayout().getLineBottom(1);
//                int lineTop = textView.getLayout().getLineTop(0);
//                int lineTop1 = textView.getLayout().getLineTop(1);
//                int lineHeight = textView.getLineHeight();
//
//                /*
//                 *
//                 * Layout的各个行是紧挨着的，中间没有空隙
//                 * TextView
//                 * ----------------------- top0
//                 * hellow
//                 * ----------------------- bottom0/top1, bottom0和top1是一条线，Layout是连续的，两行文字之间的空白也是layout
//                 * work
//                 * ----------------------- bottom1
//                 *
//                 *
//                 *
//                 *
//                 */
//                Log.i(TAG, "lineTop0 is " + lineTop);
//                Log.i(TAG, "lineBottom0 is " + lineBottom);
//                Log.i(TAG, "lineBottom0 - lineTop0 is " + (lineBottom - lineTop));
//
//                Log.i(TAG, "lineTop1 is " + lineTop1);
//                Log.i(TAG, "lineBottom1 is " + lineBottom1);
//                Log.i(TAG, "lineBottom1 - lineTop1 is " + (lineBottom1 - lineTop1));
//
//                Log.i(TAG, "lineTop1 - lineBottom0 is " + (lineTop1 - lineBottom));
//
//                Log.i(TAG, "lineHeight is " + lineHeight);
//            }
//        });


    }
}
