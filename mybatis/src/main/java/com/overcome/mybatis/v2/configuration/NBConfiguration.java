package com.overcome.mybatis.v2.configuration;

import com.overcome.mybatis.v2.registory.MapperRegistory;
import lombok.Data;

/**
 * 让TestMapper 找到配置文件, 找到需要执行的SQl文件
 */
@Data
public class NBConfiguration {

    private String scanPath;

    private MapperRegistory mapperRegistory = new MapperRegistory();

    public NBConfiguration scanPath(String scanPath) {
        this.scanPath = scanPath;
        return this;
    }

    public void build() {
        if (null == scanPath ||scanPath.length() < 1) {
            throw new RuntimeException("scanPath can't null");
        }
    }

}
