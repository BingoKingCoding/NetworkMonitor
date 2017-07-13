package com.king.networkmonitor;

/**
 * 多对象持有管理类，适用于保存监听对象
 *
 * @param <T>
 */
public interface IObjectsHolder<T>
{

    /**
     * @Description 添加对象
     * @param object
     */
    void add(T object);

    /**
     * @Description 移除对象
     * @param object
     */
    boolean remove(T object);

    /**
     *
     * @Description 是否已经包含了该对象
     * @param object
     */
    boolean contains(T object);

    /**
     * @Description 对象个数
     */
    int size();

    /**
     * @Description 清空对象
     */
    void clear();

    /**
     * @Description 遍历对象
     */

    boolean foreach(IterateCallback<T> callback);


    /**
     * @Description 倒序遍历对象
     */
    boolean foreachReverse(IterateCallback<T> callback);

}
