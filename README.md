# maven模板工程

## 使用说明
- 进入模板目录

```shell
    cd template
```

- 构建工程，执行build.sh（带上appname作为参数，例如litchi）

```shell
    ./build.sh ${appName} 
```

- 构建后，将在template下生成${appName}目录
- 拷贝工程目录到workspaces目录，用作代码目录