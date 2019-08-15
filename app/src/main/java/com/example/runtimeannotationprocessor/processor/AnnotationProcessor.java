package com.example.runtimeannotationprocessor.processor;

import com.example.runtimeannotationprocessor.annotation.FruitColor;
import com.example.runtimeannotationprocessor.annotation.FruitName;
import com.example.runtimeannotationprocessor.annotation.FruitProvider;
import java.lang.reflect.Field;

/**
 * 运行时注解处理器
 */
public class AnnotationProcessor {
    public static void getFruitInfo(Class<?> clazz) {
        String strFruitName="水果名称:";
        String strFruitColor="水果颜色:";
        String strFruitProvider="供应商信息:";

        //获取所有属性
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            //根据注解的类型做不同的处理
            if(field.isAnnotationPresent(FruitName.class)){
                //获取该类型的注解
                FruitName fruitName = field.getAnnotation(FruitName.class);
                //获取注解中元素值
                strFruitName = strFruitName+fruitName.value();
                System.out.println(strFruitName);
            }else if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                strFruitColor = strFruitColor+fruitColor.fruitColor().toString();
                System.out.println(strFruitColor);
            }else if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                strFruitProvider = strFruitProvider+"编号:"+fruitProvider.id()+"名称："+fruitProvider.name()
                        +"地址："+fruitProvider.address();
                System.out.println(strFruitProvider);
            }
        }
    }
}
