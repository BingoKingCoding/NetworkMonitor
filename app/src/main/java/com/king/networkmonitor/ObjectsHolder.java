package com.king.networkmonitor;

import java.util.ArrayList;
import java.util.List;

/**
 * <内部用ArrayList实现的多对象持有管理类>
 * Created by wwb on 2017/7/13 17:32.
 */

public class ObjectsHolder<T> implements IObjectsHolder<T>
{
    private List<T> mListObject = new ArrayList<>();

    @Override
    public void add(T object)
    {
        if (object == null)
        {
            return;
        }
        if (!mListObject.contains(object))
        {
            mListObject.add(object);
        }
    }

    @Override
    public boolean remove(T object)
    {
        if (object == null)
        {
            return false;
        }
        return mListObject.remove(object);
    }

    @Override
    public boolean contains(T object)
    {
        if (object == null)
        {
            return false;
        }
        return mListObject.contains(object);
    }

    @Override
    public int size()
    {
        return mListObject.size();
    }

    @Override
    public void clear()
    {
        mListObject.clear();
    }

    @Override
    public boolean foreach(IterateCallback<T> callback)
    {
        return CollectionUtil.foreach(mListObject,callback);
    }

    @Override
    public boolean foreachReverse(IterateCallback<T> callback)
    {
        return CollectionUtil.foreachReverse(mListObject,callback);
    }
}
