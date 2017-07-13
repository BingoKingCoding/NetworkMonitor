package com.king.networkmonitor;

import java.util.Iterator;

/**
 * <遍历回调>
 * Created by wwb on 2017/7/13 17:30.
 */

public interface IterateCallback<T>
{
    /**
     * 返回true，结束遍历
     *
     * @param i
     * @param item
     * @param it
     * @return
     */
    boolean next(int i, T item, Iterator<T> it);
}
