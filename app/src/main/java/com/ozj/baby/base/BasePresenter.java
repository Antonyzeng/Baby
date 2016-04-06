package com.ozj.baby.base;

import android.support.annotation.NonNull;
import android.view.View;

/**
 * Created by Administrator on 2016/3/25.
 */
public interface BasePresenter {
    /**
     * 注入View，使之能够与View相互响应
     *
     * @param view
     */
    void attachView(@NonNull View view);

    /**
     * 释放资源
     */
    void detachView();

}
