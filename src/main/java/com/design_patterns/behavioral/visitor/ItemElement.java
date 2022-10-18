package com.design_patterns.behavioral.visitor;

public interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}
