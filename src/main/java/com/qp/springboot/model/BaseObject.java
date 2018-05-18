package com.qp.springboot.model;

import java.io.Serializable;

/**
 * @Author Liubity
 * @Date 2018/5/18
 */
public abstract class BaseObject implements Serializable,Comparable {

    @Override
    public abstract String toString();
    @Override
    public abstract boolean equals(Object o);
    @Override
    public abstract int hashCode();

}
