package com.king.networkmonitor;

import java.util.Collection;
import java.util.List;

/**
 * <集合工具类>
 * Created by wwb on 2017/7/13 17:38.
 */

public class CollectionUtil
{
    public static boolean isEmpty(Collection<?> list)
    {
        if (list != null && !list.isEmpty())
        {
            return false;
        } else
        {
            return true;
        }
    }

    public static <T> boolean foreach(List<T> list, IterateCallback<T> callback)
    {
        if (!isEmpty(list) && callback != null)
        {
            int size = list.size();
            for (int i = 0; i < size; i++)
            {
                if (callback.next(i, list.get(i), null))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> boolean foreachReverse(List<T> list, IterateCallback<T> callback)
    {
        if (!isEmpty(list) && callback != null)
        {
            int size = list.size();
            for (int i = size - 1; i >= 0; i--)
            {
                if (callback.next(i, list.get(i), null))
                {
                    return true;
                }
            }
        }
        return false;
    }

}
