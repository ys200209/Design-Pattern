package org.example.creational.factorymethod.creator;

import org.example.creational.factorymethod.product.BluePaper;
import org.example.creational.factorymethod.product.Product;
import org.example.creational.factorymethod.product.RedPaper;

public class PaperCreator implements Creator {
    @Override
    public Product redFactoryMethod() {
        return new RedPaper();
    }

    @Override
    public Product blueFactoryMethod() {
        return new BluePaper();
    }
}
