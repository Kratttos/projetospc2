package com.cefet.pc2.trabalhospraticos.figurasgeometricas.src.dao;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DbName{

    String value();
}
