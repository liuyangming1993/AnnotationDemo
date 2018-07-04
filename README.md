# AnnotationDemo
编译期注解使用demo</br>
坑：</br>
1.报错：Annotation processors must be explicitly declared now.  The following dependencies on the compile classpath are found to contain annotation processor.  Please add them to the annotationProcessor configuration.</br>
       - MyAnnotation.jar (project :MyAnnotation)</br>
   解决方案：app的defaultConfig{...}增加javaCompileOptions { annotationProcessorOptions { includeCompileClasspath = true } }</br>
2.报错：Failed to find byte code for javax/annotation/processing/AbstractProcessor</br>
   解决方案：File -> Settings -> Instant Run -> 取消勾选Enable instant...</br>