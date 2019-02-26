package com.gupao.mode.proxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class NBClassLoader extends ClassLoader {

    /** 获取NBClassLoader 所在当前文件夹路径 */
    private File classPathFile;

    public NBClassLoader() {
        String classPath = NBClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    public Class<?> findClass(String name) {
        String className = NBClassLoader.class.getPackage().getName()+"."+name;
        if (null != classPathFile) {
            File classFile = new File(classPathFile,name.replaceAll("\\.","/") + ".class");
            if (classFile.exists()) {
                FileInputStream in = null;
                ByteArrayOutputStream out = null;

                try {
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while ((len = in.read(buff)) != -1) {
                        out.write(buff, 0, len);
                    }
                    return defineClass(className, out.toByteArray(), 0, out.size());
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (null != in) {
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (null != out) {
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return null;
    }
}
