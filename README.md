# AnnotationDemo
编译期注解使用demo
坑：
1、报错：Annotation processors must be explicitly declared now.  The following dependencies on the compile classpath are found to contain annotation processor.  Please add them to the annotationProcessor configuration.
       - MyAnnotation.jar (project :MyAnnotation)
   解决方案：app的defaultConfig{...}增加javaCompileOptions { annotationProcessorOptions { includeCompileClasspath = true } }
2、报错：Failed to find byte code for javax/annotation/processing/AbstractProcessor
   解决方案：File -> Settings -> Instant Run -> 取消勾选Enable instant...