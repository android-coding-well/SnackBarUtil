package com.junmeng.snackbar;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;

/**
 * 带颜色的snackbar
 * 如需指定颜色，请在colors.xml添加如下：
 * <color name="j_snack_alert">#129BFF</color>
 * <color name="j_snack_warning">#FEB500</color>
 * <color name="j_snack_error">#FF5B3B</color>
 * Created by hwj on 2016/11/29.
 */

public class ColorSnackbar {

    public static void alert(@NonNull Snackbar snackbar) {
        SnackDecorator.decorateBgRes(snackbar, R.color.j_snack_alert).show();
    }

    public static void warning(@NonNull Snackbar snackbar) {
        SnackDecorator.decorateBgRes(snackbar, R.color.j_snack_warning).show();
    }

    public static void error(@NonNull Snackbar snackbar) {
        SnackDecorator.decorateBgRes(snackbar, R.color.j_snack_error).show();
    }

    public static void alert(@NonNull Snackbar snackbar, @DrawableRes int icon) {
        SnackDecorator.decorateBgRes(snackbar, R.color.j_snack_alert);
        SnackDecorator.decorateIcon(snackbar, icon).show();
    }

    public static void warning(@NonNull Snackbar snackbar, @DrawableRes int icon) {
        SnackDecorator.decorateBgRes(snackbar, R.color.j_snack_warning);
        SnackDecorator.decorateIcon(snackbar, icon).show();
    }

    public static void error(@NonNull Snackbar snackbar, @DrawableRes int icon) {
        SnackDecorator.decorateBgRes(snackbar, R.color.j_snack_error);
        SnackDecorator.decorateIcon(snackbar, icon).show();
    }

}
