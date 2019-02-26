package com.gupao.mode.proxy;


import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * JDK 中是把InvocationHandler 定义在 Proxy 中，
 * 在这里我们为了方便将InvocationHandler直接定在生成的动态代理中
 */
public class NBProxy {

    private static final String ln = "\r\n";

    public static Object newProxyInstance(NBClassLoader classLoader, Class<?>[] interfaces,
                                          NBInvocationHandler handler) {

        //1.生成Java文件
        String src = generateSrc(interfaces);

        //2.将Java文件写入到磁盘
        String filePath = NBProxy.class.getResource("").getPath();

        try {
            System.out.println("filePath = " + filePath);
            File file = new File(filePath + "$Proxy0.java");
            FileWriter writer = new FileWriter(file);
            writer.write(src);
            writer.flush();
            writer.close();

            //3.把生成的Java文件编译程Class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = compiler.getTask(null,manager,null,null,null,iterable);
            task.call();
            manager.close();
            //4.将class文件加载到JVM中
            Class proxyClass = classLoader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(NBInvocationHandler.class);
            return c.newInstance(handler);
            //file.delete();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package com.gupao.mode.proxy;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public class $Proxy0 implements ").append(interfaces[0].getName()).append("{").append(ln);

        //这里为什么是把接口定义在这里(JDK 是定义在 Proxy 中的)
        sb.append("public NBInvocationHandler handler;" + ln);

        //构造函数
        sb.append("public $Proxy0(NBInvocationHandler handler)").append("{"+ln);
        sb.append("this.handler = handler;" + ln);
        sb.append("}" + ln);

        //循环遍历被代理类实现接口的每个方法,这里默认只实现了一个接口, 取下标为0第一个接口就好
        for(Method m : interfaces[0].getMethods()) {
            sb.append("public final " + m.getReturnType() + " " + m.getName());
            if (null == m.getParameterTypes()) {
                sb.append("() {" + ln);
            } else {
                sb.append("(");
                for (Class<?> clzz : m.getParameterTypes()) {
                    sb.append(clzz.getName() + " " + "param0");
                }
                sb.append(") {" + ln);
            }

           sb.append("try { " + ln);
           if (null == m.getParameterTypes()) {
               sb.append("Method m = Class.forName(\"" + interfaces[0].getName() + "\")" + ".getMethod(\"" + m.getName()+"\");" + ln);
               sb.append("this.handler.invoke(this,m,null);" + ln);
           } else {
               sb.append("Method m = Class.forName(\"" + interfaces[0].getName() + "\")" + ".getMethod(\"" + m.getName()+"\");" + ln);
               sb.append("this.handler.invoke(this,m,null);" + ln);
           }
           sb.append("} catch(Throwable e) { " + ln);
           sb.append("e.printStackTrace();" + ln);
           sb.append("}");
           sb.append("}" + ln);
        }
        sb.append("}");
        return sb.toString();
    }
}
