## redis 存储结构类型
String 字符类型、hash、list 列表类型、set、sorted set
 
## redis 的安装
1. 下载redis安装包
2. tar -zvf 安装包
3. 在redis目录下执行make 
4. 通过make test 测试编译状态
5. make install 完成安装

## 启动、停止 redis
1)启动 --> redis-server 
2)访问客户端 --> redis-cli
3)性能测试 --> redis-benchmark
4)文件进行检测 --> redis-check-aof 
5)服务器配置 --> redis-sentinel 

## 使用入门
1)获取所有键 --> keys *
2)set get
  ## String 字符类型 
  set <key> <value>
  incr key 自增
  incrby key 指定增长
  decr
  key的设计：对象id 对象属性 建议对key进行分类，同步在wiki下统一管理
  strlen key 获得key的长度
  mget key key 获取多个可以的值
  
  ## list列表类型
  lpush/rpush: 从左边或右边push数据（入栈）
  lpop/rpop：出栈（弹）
  llen len: 数组长度
  
  ## hash 散列类型 
  hash key value 比较适合存储一些对象属性
  hset key obj.field value 如：hset person age 20 
  hmget key key 获取多个可以的值
  
  ## set 集合类型
  set 和 list 不一样，set是无序的
  sadd key value[value,value] 添加数据 