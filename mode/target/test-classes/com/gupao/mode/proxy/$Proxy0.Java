package com.gupao.mode.proxy;
import java.lang.reflect.*;
public class $Proxy0 implements com.gupao.mode.proxy.Human{
public NBInvocationHandler handler;
public $Proxy0(NBInvocationHandler handler){
this.handler = handler;
}
public final void eat() {
try { 
Method m = Class.forName("com.gupao.mode.proxy.Human").getMethod("eat");
this.handler.invoke(this,m,null);
} catch(Throwable e) { 
e.printStackTrace();
}}
public final void work(java.lang.String param0) {
try { 
Method m = Class.forName("com.gupao.mode.proxy.Human").getMethod("work");
this.handler.invoke(this,m,null);
} catch(Throwable e) { 
e.printStackTrace();
}}
}