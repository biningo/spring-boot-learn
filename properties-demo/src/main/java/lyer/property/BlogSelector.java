package lyer.property;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/***
 *@Author icepan
 *@Date 2020/11/6 上午10:14
 *@Description
 *
 ***/

public class BlogSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{ArticleProperties.class.getName(),BookProperties.class.getName()};
    }
}
