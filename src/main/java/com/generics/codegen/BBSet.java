package com.generics.codegen;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.LinkedHashSet;

public class BBSet<E> extends LinkedHashSet<E> implements Externalizable {
    private static final long serialVersionUID = 7907438491793587749L;

    public BBSet() {

    }

    public BBSet(Collection<? extends E> c) {
        super(c);
    }

    @Override
    public boolean add(E e) {
        return super.add(e);
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    public void writeExternal(ObjectOutput out) throws IOException {
//        ExternalizeUtils.writeSerialVersionUID(serialVersionUID, out);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//        ExternalizeUtils.checkSerialVersionUID(serialVersionUID, in);
    }
}
