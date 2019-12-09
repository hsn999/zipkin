package app1.com;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

public class MyMapperScannerRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        AnnotationAttributes annoAttrs = AnnotationAttributes.fromMap(importingClassMetadata.getAnnotationAttributes(MyMapperScan.class.getName()));
        String value = annoAttrs.getString("value");
        registry.getBeanDefinitionNames();
        System.out.println(value);
        System.out.println("配置类:"+importingClassMetadata.getClassName());
        System.out.println("registry.getBeanDefinitionNames() 类:"+registry.getBeanDefinitionNames());
    }
}