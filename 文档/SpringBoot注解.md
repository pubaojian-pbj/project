```
@Slf4j																																				使用log打印日志
```

```
@Configuration				用于定义配置类，可替换xml配置文件，被注解的类内部包含有一个或多个被@Bean注解的方法，这些方法将会被AnnotationConfigApplicationContext或AnnotationConfigWebApplicationContext类进行扫描，并用于构建bean定义，初始化Spring容器
```

```
@RestController				相当于@Controller + @ResponseBody 合在一起的作用
```

```
@Api				value - 字段说明,description - 注释说明这个类

swagger是当前最好用的Restful  API文档生成的开源项目,通过swagger-spring项目实现了springMVC框架的无缝集成功能,方便生成restful风格的接口文档,同时,swagger-ui还可以测试spring  restful风格的接口功能

作用范围                         API                                          使用位置

对象属性                        @ApiModelProperty                用在参数对象的字段上

协议集描述                    @Api                                        用在Conntroller类上

协议描述                        @ApiOperation                        用在controller方法上

Response集                   @ApiResponses                      用在controller方法上

Response                      @ApiResponse                        用在@ApiResponses里面

非对象参数集                 @ApilmplicitParams                用在controller方法上


```

```
@EnableKeystoneConfig
```

```
@EnableKeystoneControllerAdvise
```

```
@EnableWorkspaceInfo
```

```
@EnableTelamonConfig
```

```
@EnableAuditConfig
```

```
@ApiOperation   

value - 字段说明

notes - 注释说明

httpMethod - 说明这个方法被请求的方式

response - 方法的返回值的类型
```

```
@ApiResponses				用于表示一组响应
```

```
@ApiResponse				用在@ApiResponses中，一般用于表达一个错误的响应信息
                    code：数字，例如400
                    message：信息，例如”请求参数没填好”
                    response：抛出异常的类

```

```
@ApiParam			是注解api的参数，也就是用于swagger提供开发者文档，文档中生成的注释内容
```

```
@AuditBatchPrns		
```

```
@AuditBusinessRequest
```

```
@EnableWorkspaceInfoConfig
```

```
@ThreadSafe			@Immutable、@ThreadSafe、@NotThreadSafe、@GuardedBy 都不是 JDK 的标准注释，使用它们，需要导入额外的依赖项：jcip-annotations.jar，

@ThreadSafe 是表示这个类是线程安全的。具体是否真安全，那要看实现者怎么实现的了，反正打上这个标签只是表示一下。不线程安全的类打上这个注解也没事儿。
@Immutable 表示，类是不可变的，包含了　@ThreadSafe　的意思。
@NotThreadSafe 表示这个类不是线程安全的。如果是线程安全的非要打上这个注解，那也不会报错。
@GuardedBy( "this" ) 受对象内部锁保护
@GuardedBy( "fieldName" ) 受 与fieldName引用相关联的锁 保护。
@GuardedBy( "ClassName.fieldName" ) 受 一个类的静态field的锁 保存。
@GuardedBy( "methodName()" ) 锁对象是 methodName() 方法的返值，受这个锁保护。
@GuardedBy( "ClassName.class" ) 受 ClassName类的直接锁对象保护。而不是这个类的某个实例的锁对象。

```

