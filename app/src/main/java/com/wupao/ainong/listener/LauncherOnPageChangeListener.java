package com.wupao.ainong.listener;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RelativeLayout;

import com.wupao.ainong.utils.UIUtils;

/**
 * Created by 隋虹山 on 2016/5/17.
 */
public class LauncherOnPageChangeListener implements ViewPager.OnPageChangeListener {
    View redPoint;
    public LauncherOnPageChangeListener(View view){
        redPoint = view;
    }

    /**
     * ViewPager滑动时回调
     *
     * @param position
     * @param positionOffset
     * @param positionOffsetPixels
     */
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        // 红点移动的距离
        int redMoveX = (int) ((position + positionOffset) * UIUtils.dip2px(12));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) redPoint.getLayoutParams();
        // 设置红点的在边距
        layoutParams.leftMargin = redMoveX;
        redPoint.setLayoutParams(layoutParams);
    }

    @Override
    public void onPageSelected(int position) {
    }

    @Override
    public void onPageScrollStateChanged(int state) {
    }

}
