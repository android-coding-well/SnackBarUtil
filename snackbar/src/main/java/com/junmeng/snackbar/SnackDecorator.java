package com.junmeng.snackbar;

import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.R.attr.textColor;

/**
 * Snackbar修饰器
 * Created by hwj on 2016/11/29.
 */

public class SnackDecorator {
    /**
     * 装饰文字和背景
     *
     * @param snackbar
     * @param textColor
     * @param bgColor
     * @return
     */
    public static Snackbar decorate(@NonNull Snackbar snackbar, @ColorInt int textColor, @ColorInt int bgColor) {
        View view = snackbar.getView();
        if (view != null) {
            if (bgColor > 0) {
                view.setBackgroundColor(bgColor);
            }
            if (textColor > 0) {
                ((TextView) view.findViewById(R.id.snackbar_text)).setTextColor(textColor);
            }
        }
        return snackbar;
    }


    /**
     * 装饰文字
     *
     * @param snackbar
     * @param textColor
     * @return
     */
    public static Snackbar decorateTextColor(@NonNull Snackbar snackbar, @ColorInt int textColor) {
        return decorate(snackbar, textColor, -1);
    }
    /**
     * 装饰文字
     *
     * @param snackbar
     * @param colorRes
     * @return
     */
    public static Snackbar decorateTextColorRes(@NonNull Snackbar snackbar, @ColorRes int colorRes) {
        View view = snackbar.getView();
        if (view != null) {
            if (textColor > 0) {
                ((TextView) view.findViewById(R.id.snackbar_text)).setTextColor(view.getResources().getColor(colorRes));
            }
        }
        return snackbar;
    }

    /**
     * 装饰背景
     *
     * @param snackbar
     * @param bgColor
     * @return
     */
    public static Snackbar decorateBg(@NonNull Snackbar snackbar, @ColorInt int bgColor) {
        return decorate(snackbar, -1, bgColor);
    }

    /**
     * 装饰背景
     * @param snackbar
     * @param colorRes
     * @return
     */
    public static Snackbar decorateBgRes(@NonNull Snackbar snackbar, @ColorRes int colorRes) {
        View view = snackbar.getView();
        if (view != null) {
            view.setBackgroundResource(colorRes);
        }
        return snackbar;
    }

    /**
     * 装饰图标
     * @param snackbar
     * @param iconRes
     * @return
     */
    public static Snackbar decorateIcon(Snackbar snackbar, @DrawableRes int iconRes) {
        View snackbarview = snackbar.getView();

        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbarview;//将获取的View转换成SnackbarLayout

        View add_view = LayoutInflater.from(snackbarview.getContext()).inflate(R.layout.item_snack_icon, null);
        ((ImageView) add_view.findViewById(R.id.iv_icon)).setImageResource(iconRes);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);//设置新建布局参数

        lp.gravity = Gravity.CENTER_VERTICAL;//垂直居中显示

        snackbarLayout.addView(add_view, 0, lp);//
        return snackbar;
    }

}
