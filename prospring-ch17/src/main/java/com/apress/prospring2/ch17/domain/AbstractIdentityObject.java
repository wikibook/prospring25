package com.apress.prospring2.ch17.domain;

/**
 * @author Aleksa Vukotic
 */
public class AbstractIdentityObject<T> {
    protected T productId;

    public AbstractIdentityObject() {

    }

    public AbstractIdentityObject(T productId) {
        this.productId = productId;
    }

    protected final boolean idEquals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        //noinspection CastToConcreteClass
        final AbstractIdentityObject that = (AbstractIdentityObject) o;

        //noinspection RedundantIfStatement
        if (this.productId != null ? !this.productId.equals(that.productId) : that.productId != null) return false;

        return true;
    }

    protected final int idHashCode() {
        int result = super.hashCode();
        result = 31 * result + (this.productId != null ? this.productId.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(final Object o) {
        return idEquals(o);
    }

    @Override
    public int hashCode() {
        return idHashCode();
    }

    public T getProductId() {
        return productId;
    }

    public void setProductId(final T productId) {
        this.productId = productId;
    }

}
