package org.example.creational.builder;

import org.example.creational.builder.builder.SpecialCarBuilder;
import org.example.creational.builder.builder.StandardCarBuilder;
import org.example.creational.builder.director.CarDirector;
import org.example.creational.builder.model.Car;

/**
 * - Builder: Product 객체의 일부 요소들을 생성하기 위한 추상 인터페이스를 정의합니다.
 *
 * - ConcreteBuilder: Builder 클래스에 정의된 인터페이스를 구현하며, 제품의 부품들을 모아 빌더를 복합합니다.
 * 생성한 요소의 표현을 정의하고 관리합니다. 또한 제품을 검색하는 데 필요한 인터페이스(GetASCIIText, GetTextWidget)를 제공합니다.
 *
 * - Director: Builder 인터페이스를 사용하는 객체를 합성합니다.
 *
 * - Product: 생성할 복합 객체를 표현합니다.
 * ConcreteBuilder는 제품(Product)의 내부 표현을 구축하고 복합 객체가 어떻게 구성되는지에 관한 절차를 정의합니다.
 *
 * 1. 사용자는 Director 객체를 생성하고, 자신이 원하는 Builder 객체로 합성해 나간다.
 * 2. 제품의 일부가 구축(built)될 때마다 Director는 Builder에 통보합니다.
 * 3. Builder는 Director의 요청을 처리하여 제품에 부품을 추가합니다.
 * 4. 사용자는 Builder 에서 제품을 검색합니다.
 */

public class BuilderMain {

    /**
     * 1. new ConcreteBuilder()
     * 2. new Director
     * 3. Construct()
     * 4. Director.BuildPartA()
     * 5. Director.BuildPartB()
     * 6. Director.BuildPartC()
     * 7. GetResult()
     */

    /**
     * 각 ConcreteBuilder는 특정 종류의 제품을 생성하고 조립하는 데 필요한 '모든 코드'를 포함합니다. 코드는 한 번만 작성됩니다.
     * 이후에 Director 객체들이 이것을 재사용해서 똑같은 부품에서 여러 가지 Product를 구축할 수 있습니다.
     */

    public static void main(String[] args) {
        CarDirector director = new CarDirector(new SpecialCarBuilder());
        director.build();

        Car car = director.getCar();
        car.show();
    }
}
